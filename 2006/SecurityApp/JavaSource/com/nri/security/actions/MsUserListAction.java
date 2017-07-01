package com.nri.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.exception.ModelException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.MsUserListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class MsUserListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			MsUserListForm aForm = (MsUserListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			ArrayList list = processor.findMsUsers(aForm.getSearchStr(), aForm.getOrderBy());

			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.MS_USER_LIST, list);
			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in MsUserListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

}
