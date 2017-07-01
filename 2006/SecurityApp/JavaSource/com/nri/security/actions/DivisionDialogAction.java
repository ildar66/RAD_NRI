package com.nri.security.actions;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Division;
import com.nri.domain.DivisionType;
import com.nri.domain.Worker;
import com.nri.ejb.helper.OIDGeneratorHelper;
import com.nri.exception.ModelException;
import com.nri.exception.NoSuchCompanyException;
import com.nri.exception.NoSuchDivisionException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.DialogForm;
import com.nri.security.forms.DivisionDialogForm;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class DivisionDialogAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		DivisionDialogForm divisionDialogForm = (DivisionDialogForm) form;

		try {
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			String action = divisionDialogForm.getAction();
			if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action) || DialogForm.ACTION_VIEW.equalsIgnoreCase(action) || DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				Division vo = processor.findDivisionByKey(divisionDialogForm.getVo().getDivision());
				divisionDialogForm.setVo(vo);
				if(vo.getBoss() != null){
					Worker boss = processor.findWorkerByKey(vo.getBoss());
					divisionDialogForm.setBossName(processor.findPeopleByKey(boss.getMan()).getLastName());
				}
				initHierarchyForDivision(request, divisionDialogForm, processor, vo.getDivision());
			} else if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				int id = OIDGeneratorHelper.getNextId("tables.divisions");
				divisionDialogForm.getVo().setDivision(new Integer(id));
				divisionDialogForm.getVo().setIsActive(Boolean.TRUE);
				divisionDialogForm.getVo().setType(DivisionType.getDirection());
				if (divisionDialogForm.getVo().getCompany() == null) {
					Division vo = processor.findDivisionByKey(divisionDialogForm.getVo().getEncloser());
					divisionDialogForm.getVo().setCompany(vo.getCompany());
				}
				divisionDialogForm.setCompanyVO(processor.findCompanyByKey(divisionDialogForm.getVo().getCompany()));
			}
		} catch (Exception e) {
			// Report the error using the appropriate name and ID.
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.toString()));
		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			forward = mapping.findForward("error");

		} else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			forward = mapping.findForward("success");

		}

		// Finish with
		return (forward);

	}

	/**
	 * 
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 * @throws NoSuchCompanyException
	 */
	private void initHierarchyForDivision(HttpServletRequest request, DivisionDialogForm aForm, SecurityActionProcessor processor, Integer encloserKey) throws ModelException, NoSuchCompanyException {
		//инит иерархию:
		LinkedList hierarchyEncloser = (LinkedList) processor.findDivisionHierarchyForEncloser(encloserKey, 10);
		//инит. Компанию:			
		Division encloser = (Division) hierarchyEncloser.getLast();
		Integer companyKey = encloser.getCompany();
		if (companyKey != null) {
			aForm.setCompanyVO(processor.findCompanyByKey(companyKey));
		}

		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.ENCLOSER_HIERARCHY, hierarchyEncloser);
	}
}
