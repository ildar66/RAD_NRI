package com.nri.security.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Profile;
import com.nri.ejb.helper.OIDGeneratorHelper;
import com.nri.exception.NoSuchProfileException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.DialogForm;
import com.nri.security.forms.OperatorDialogForm;

/**
 * @version 	1.0
 * @author
 */
public class OperatorDialogAction extends SecurityAppAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		OperatorDialogForm operatorDialogForm = (OperatorDialogForm) form;

		try {
			addMsUsersBean(request);
			addTerrabyteServers(request);
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			String action = operatorDialogForm.getAction();
			
			if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action) || DialogForm.ACTION_VIEW.equalsIgnoreCase(action) || DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				operatorDialogForm.setVo(processor.findOperatorByKey(operatorDialogForm.getVo().getOperator()));
				//находим ФИО оператора:
				Integer peopleKey = operatorDialogForm.getVo().getMan();
				if (peopleKey != null) {
					operatorDialogForm.setPeopleVO(processor.findPeopleByKey(peopleKey));
				}
				//находим TerraByteServer из Profiles оператора:
				try {
					Profile nriObjectKey = new Profile(operatorDialogForm.getVo().getOperator(), "SYSTEM", "TERRABYTE_SERVER");
					Profile profile = processor.findProfileByKey(nriObjectKey);
					operatorDialogForm.setIdTerrabyteServer(String.valueOf(profile.getNum_value().intValue()));
				} catch (NoSuchProfileException e1) {
					operatorDialogForm.setIdTerrabyteServer(null);
					//e1.printStackTrace();
				} 
			} else if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				int id = OIDGeneratorHelper.getNextId("tables.operators");
				operatorDialogForm.getVo().setOperator(new Integer(id));
				operatorDialogForm.getVo().setIsEnabled(Boolean.TRUE);
				Integer peopleKey = operatorDialogForm.getVo().getMan();
				if(peopleKey != null){
					operatorDialogForm.setPeopleVO(processor.findPeopleByKey(peopleKey));				
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
