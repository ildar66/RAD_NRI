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
import com.nri.security.forms.PeopleToNfsUserListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class PeopleToNfsUserListAction extends Action {
	public final static String ADD_LINK = "addLink";
	public final static String DELETE_LINK = "deleteLink";
	public final static String SET_MAIN_LINK = "setMainLink";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		ActionErrors errors = new ActionErrors();
		try {
			// Look at the ActionForm object
			PeopleToNfsUserListForm aForm = (PeopleToNfsUserListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			//инит. Физ.лицо:
			Integer peopleKey = aForm.getPeopleVO().getMan();
			aForm.setPeopleVO(processor.findPeopleByKey(peopleKey));

			processOperation(errors, request, aForm, processor);

			initList(request, aForm, processor);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in PeopleToNfsUserListAction.execute:" + e);
		} catch (NoSuchPeopleException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in PeopleToNfsUserListAction.execute:" + e);
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
	 * инит. Подразделения
	 * @param request
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 */
	private void initList(HttpServletRequest request, PeopleToNfsUserListForm aForm, SecurityActionProcessor processor) throws ModelException {
		ArrayList list = processor.findPeopleToNfsUserList(aForm.getPeopleVO().getMan(), aForm.getOrderBy());
		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.PEOPLE_TO_NFS_USER_LIST, list);
	}

	/**
	 * 
	 * @param request
	 * @param aForm
	 * @param processor
	 * @throws ModelException
	 * @throws MappingException
	 */
	private void processOperation(ActionErrors errors, HttpServletRequest request, PeopleToNfsUserListForm aForm, SecurityActionProcessor processor) throws ModelException {
		String operation = aForm.getOperation();
		Integer peopleKey = aForm.getPeopleVO().getMan();
		Integer nfsUserKey = aForm.getSelectedID();
		try {
			if (operation.equalsIgnoreCase(DELETE_LINK)) {
				processor.deleteLinkPeopleToNfsUser(peopleKey, nfsUserKey);
			} else if (operation.equalsIgnoreCase(ADD_LINK)) {
				processor.addLinkPeopleToNfsUser(peopleKey, nfsUserKey);
			} else if (operation.equalsIgnoreCase(SET_MAIN_LINK)) {
				processor.setMainLinkPeopleToNfsUser(peopleKey, nfsUserKey);
			}
		} catch (MappingException e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.getMessage()));
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in PeopleToNfsUserListAction.processOperation:" + e);
		}

	}
}
