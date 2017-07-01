package com.nri.security.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Division;
import com.nri.ejb.helper.OIDGeneratorHelper;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.DialogForm;
import com.nri.security.forms.WorkerDialogForm;

/**
 * @version 	1.0
 * @author
 */
public class WorkerDialogAction extends SecurityAppAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		WorkerDialogForm workerDialogForm = (WorkerDialogForm) form;

		try {
			addCompanysBean(request);
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			String action = workerDialogForm.getAction();
			if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action) || DialogForm.ACTION_VIEW.equalsIgnoreCase(action) || DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				workerDialogForm.setVo(processor.findWorkerByKey(workerDialogForm.getVo().getWorker()));
				Integer companyKey = workerDialogForm.getVo().getCompany();
				if (companyKey != null) {
					workerDialogForm.setCompanyVO(processor.findCompanyByKey(companyKey));
				}
				Integer divisionKey = workerDialogForm.getVo().getDivision();
				if (divisionKey != null) {
					workerDialogForm.setDivisionVO(processor.findDivisionByKey(divisionKey));
				}
				Integer peopleKey = workerDialogForm.getVo().getMan();
				if (peopleKey != null) {
					workerDialogForm.setPeopleVO(processor.findPeopleByKey(peopleKey));
				}
				Integer workPositionKey = workerDialogForm.getVo().getWorkPosition();
				if (workPositionKey != null) {
					workerDialogForm.setWorkPositionVO(processor.findWorkPositionByKey(workPositionKey));
				}				
			} else if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				int id = OIDGeneratorHelper.getNextId("tables.workers");
				workerDialogForm.getVo().setWorker(new Integer(id));
				workerDialogForm.getVo().setIsOur(Boolean.TRUE);
				workerDialogForm.getVo().setIsActive(Boolean.TRUE);
				if (workerDialogForm.getVo().getCompany() == null && workerDialogForm.getVo().getDivision() != null) {
					Division vo = processor.findDivisionByKey(workerDialogForm.getVo().getDivision());
					workerDialogForm.getVo().setCompany(vo.getCompany());
				}
				Integer peopleKey = workerDialogForm.getVo().getMan();
				if(peopleKey != null){
					workerDialogForm.setPeopleVO(processor.findPeopleByKey(peopleKey));				
				}
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
}
