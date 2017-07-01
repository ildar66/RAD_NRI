package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.WorkPosition;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>workPosition - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class WorkPositionDialogForm extends DialogForm {

	private WorkPosition vo = new WorkPosition();

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
	public WorkPosition getVo() {
		return vo;
	}

	/**
	 * @param workPosition
	 */
	public void setVo(WorkPosition workPosition) {
		vo = workPosition;
	}

	/**
	 * @param string
	 */
	public void setWorkPosition(Integer workPositionStr) {
		getVo().setWorkPosition(workPositionStr);
	}

}
