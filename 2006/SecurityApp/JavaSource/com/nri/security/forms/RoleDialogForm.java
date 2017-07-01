package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Role;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>role - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class RoleDialogForm extends DialogForm {

	private Role vo = new Role();

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset values are provided as samples only. Change as appropriate.
		super.reset(mapping, request);
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = super.validate(mapping, request);
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new org.apache.struts.action.ActionError("error.field.required"));
		// }
		return errors;

	}
	/**
	 * @return
	 */
	public Role getVo() {
		return vo;
	}

	/**
	 * @param role
	 */
	public void setVo(Role role) {
		vo = role;
	}

	/**
	 * @param string
	 */
	public void setRole(String roleStr) {
		getVo().setRole(roleStr);
	}

}
