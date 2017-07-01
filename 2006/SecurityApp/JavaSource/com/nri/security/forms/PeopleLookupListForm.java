package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class PeopleLookupListForm extends LookupListForm {
	private String name = new String();
	private String orderBy = "firstName";
	private String activeState = "Y";

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset field values here.

	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
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
	public String getName() {
		return name;
	}

	/**
	 * @param string
	 */
	public void setName(String string) {
		name = string;
	}

	/**
	 * @return
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * @param string
	 */
	public void setOrderBy(String string) {
		orderBy = string;
	}

	/**
	 * @return
	 */
	public String getActiveState() {
		return activeState;
	}

	/**
	 * @param string
	 */
	public void setActiveState(String string) {
		activeState = string;
	}

}
