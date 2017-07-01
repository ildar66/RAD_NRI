package com.nri.security.console.core.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.security.console.core.form.LogonForm;
import com.nri.security.console.core.item.MenuBarItem;
import com.nri.security.console.core.item.NavigatorItem;

/**
 * @version 	1.0
 * @author
 */
public class LogonAction extends ConsoleAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		try {
			// do something here
			LogonForm logonForm = (LogonForm) form;
			createUser(request);
			createUserPreference(request);
			createMenuBarItems(request);
			createNavigatorList(request);
		} catch (Exception e) {

			// Report the error using the appropriate name and ID.
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.toString()));

		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			forward = mapping.findForward("logonError");

		} else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			forward = mapping.findForward("success");

		}

		// Finish with
		return (forward);

	}

}
