package com.nri.security.actions;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Division;
import com.nri.exception.ModelException;
import com.nri.exception.NoSuchCompanyException;
import com.nri.exception.NoSuchDivisionException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.DivisionHierarchyLookupListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class DivisionHierarchyLookupListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			DivisionHierarchyLookupListForm aForm = (DivisionHierarchyLookupListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

			Integer encloserKey = new Integer(aForm.getEncloser());

			initHierarchyForEncloser(request, aForm, processor, encloserKey);
			initList(request, aForm, processor, encloserKey);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in DivisionHierarchyLookupListAction.execute:" + e);
		} catch (NoSuchCompanyException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in DivisionHierarchyLookupListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

	/**
	 * инит. Подразделения
	 * @param request
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 */
	private void initList(HttpServletRequest request, DivisionHierarchyLookupListForm aForm, SecurityActionProcessor processor, Integer encloserKey) throws ModelException {
		ArrayList list = processor.findDivisionsHierarchy(encloserKey, buildIsActive(aForm), aForm.getOrderBy());
		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.DIVISION_HIERARCHY_LOOKUP_LIST, list);
	}

	/**
	 * 
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 * @throws NoSuchCompanyException
	 */
	private void initHierarchyForEncloser(HttpServletRequest request, DivisionHierarchyLookupListForm aForm, SecurityActionProcessor processor, Integer encloserKey)
		throws ModelException, NoSuchCompanyException {
		//инит иерархию:
		LinkedList hierarchyEncloser = (LinkedList)processor.findDivisionHierarchyForEncloser(encloserKey, 10);
		//инит. Компанию:			
		Division encloser = (Division)hierarchyEncloser.getLast();
		Integer companyKey = encloser.getCompany();
		if (companyKey != null) {
			aForm.setCompanyVO(processor.findCompanyByKey(companyKey));
		}
		
		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.ENCLOSER_HIERARCHY, hierarchyEncloser);
	}

	/**
	 * 
	 * @param aForm
	 * @return
	 */
	protected Boolean buildIsActive(DivisionHierarchyLookupListForm aForm) {
		Boolean isActive = null;
		if ("Y".equals(aForm.getActiveState())) {
			isActive = Boolean.TRUE;
		} else if ("N".equals(aForm.getActiveState())) {
			isActive = Boolean.FALSE;
		}
		return isActive;
	}
}
