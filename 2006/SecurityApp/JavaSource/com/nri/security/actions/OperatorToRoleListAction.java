package com.nri.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.exception.MappingException;
import com.nri.exception.ModelException;
import com.nri.exception.NoSuchPeopleException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.OperatorToRoleListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class OperatorToRoleListAction extends Action {
	public final static String ADD_LINK = "addLink";
	public final static String DELETE_LINK = "deleteLink";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		ActionErrors errors = new ActionErrors();
		try {
			// Look at the ActionForm object
			OperatorToRoleListForm aForm = (OperatorToRoleListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

			//инит. оператор:
			Integer operatorKey = aForm.getOperator();
			aForm.setOperatorVO(processor.findOperatorByKey(operatorKey));
			//инит. Физ.лицо:
			Integer peopleKey = aForm.getOperatorVO().getMan();
			if (peopleKey != null) {
				aForm.setPeopleVO(processor.findPeopleByKey(peopleKey));
			}
			//processOperation:
			processOperation(errors, request, aForm, processor);
			//инит. лист ролей для оператора:
			initList(request, aForm, processor);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OperatorToRoleListAction.execute:" + e);
		} catch (NoSuchPeopleException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OperatorToRoleListAction.execute:" + e);
		}
		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.
		if (!errors.isEmpty()) {
			saveErrors(request, errors);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

	/**
	 * инит. Операторов
	 * @param request
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 */
	private void initList(HttpServletRequest request, OperatorToRoleListForm aForm, SecurityActionProcessor processor) throws ModelException {
		ArrayList list = processor.findOperatorToRoleList(aForm.getOperator(), aForm.getOrderBy());
		request.setAttribute(BeanKeys.OPERATOR_TO_ROLE_LIST, list);
		list = processor.findOperatorToRoleAccessList(aForm.getOperator(), aForm.getOrderBy());
		request.setAttribute(BeanKeys.OPERATOR_TO_ROLE_ACCESS_LIST, list);
	}

	/**
	 * 
	 * @param errors
	 * @param request
	 * @param aForm
	 * @param processor
	 * @throws ModelException
	 */
	private void processOperation(ActionErrors errors, HttpServletRequest request, OperatorToRoleListForm aForm, SecurityActionProcessor processor) throws ModelException {
		String operation = aForm.getOperation();
		Integer operatorKey = aForm.getOperator();
		String roleKey = aForm.getSelectedID();
		try {
			if (DELETE_LINK.equalsIgnoreCase(operation)) {
				processor.deleteLinkOperatorToRole(operatorKey, roleKey);
			} else if (ADD_LINK.equalsIgnoreCase(operation)) {
				processor.addLinkOperatorToRole(operatorKey, roleKey);
			}
		} catch (MappingException e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.getMessage()));
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OperatorToRoleListAction.processOperation:" + e);
		}
	}
}
