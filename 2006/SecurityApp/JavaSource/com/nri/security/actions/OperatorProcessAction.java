package com.nri.security.actions;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Profile;
import com.nri.exception.MappingException;
import com.nri.exception.ModelException;
import com.nri.exception.NoSuchProfileException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.DialogForm;
import com.nri.security.forms.OperatorDialogForm;
import com.nri.security.util.SecurityUtils;

/**
 * @version 	1.0
 * @author
 */
public class OperatorProcessAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		OperatorDialogForm operatorDialogForm = (OperatorDialogForm) form;

		try {
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			String action = operatorDialogForm.getAction();
			if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				String encryptPassword = SecurityUtils.encryptToMD5(operatorDialogForm.getVo().getPassword());
				operatorDialogForm.getVo().setPassword(encryptPassword);
				processor.addOperator(operatorDialogForm.getVo());
				addTerraByteServer(operatorDialogForm, processor);
				operatorDialogForm.setFlagOperation(true);
			} else if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action)) {
				String encryptPassword = SecurityUtils.encryptToMD5(operatorDialogForm.getVo().getPassword());
				operatorDialogForm.getVo().setPassword(encryptPassword);
				processor.updateOperator(operatorDialogForm.getVo());
				updateTerraByteServer(operatorDialogForm, processor);
				operatorDialogForm.setFlagOperation(true);
			} else if (DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				processor.removeOperator(operatorDialogForm.getVo().getOperator());
				operatorDialogForm.setFlagOperation(true);
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
			//forward = mapping.findForward("success");
			forward = mapping.findForward(operatorDialogForm.getForwardName());

		}

		// Finish with
		return (forward);

	}

	/**
	 * 
	 * @param operatorDialogForm
	 * @param processor
	 * @throws MappingException
	 */
	private void addTerraByteServer(OperatorDialogForm operatorDialogForm, SecurityActionProcessor processor) throws MappingException {
		//устанавливаем TerraByteServer в Profiles оператора:
		String IdTerrabyteServer = operatorDialogForm.getIdTerrabyteServer();
		if (IdTerrabyteServer != null && !IdTerrabyteServer.equals("")) {
			Profile profile = new Profile(operatorDialogForm.getVo().getOperator(), "SYSTEM", "TERRABYTE_SERVER");
			profile.setType(new Integer("1")); //Целое.
			profile.setKey_type(new Integer("0")); //Обычный параметр формы.
			profile.setNum_value(new BigDecimal(String.valueOf(IdTerrabyteServer)));
			processor.addProfile(profile);
		}
	}

	/**
	 * 
	 * @param operatorDialogForm
	 * @param processor
	 * @throws MappingException
	 * @throws ModelException
	 */
	private void updateTerraByteServer(OperatorDialogForm operatorDialogForm, SecurityActionProcessor processor) throws MappingException, ModelException {
		//устанавливаем TerraByteServer в Profiles оператора:
		String IdTerrabyteServer = operatorDialogForm.getIdTerrabyteServer();
		Profile nriObjectKey = new Profile(operatorDialogForm.getVo().getOperator(), "SYSTEM", "TERRABYTE_SERVER");
		if (IdTerrabyteServer != null && !IdTerrabyteServer.equals("")) {
			try {
				Profile profile = processor.findProfileByKey(nriObjectKey);
				profile.setNum_value(new BigDecimal(String.valueOf(operatorDialogForm.getIdTerrabyteServer())));
				processor.updateProfile(profile);
			} catch (NoSuchProfileException nspe) {
				Profile profile = new Profile(operatorDialogForm.getVo().getOperator(), "SYSTEM", "TERRABYTE_SERVER");
				profile.setType(new Integer("1")); //Целое.
				profile.setKey_type(new Integer("0")); //Обычный параметр формы.
				profile.setNum_value(new BigDecimal(String.valueOf(IdTerrabyteServer)));
				processor.addProfile(profile);
			}
		} else {
			try {
				processor.removeProfile(nriObjectKey);
			} catch (NoSuchProfileException nspe) {
				//nspe.printStackTrace();						
			}
		}
	}
}
