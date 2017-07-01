package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.People;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class OperatorListForm extends ActionForm {
	private String orderBy = "loginID";
	private People peopleVO = new People();

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		peopleVO = new People();
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
	public People getPeopleVO() {
		return peopleVO;
	}

	/**
	 * @param people
	 */
	public void setPeopleVO(People people) {
		peopleVO = people;
	}

	/**
	 * @param string
	 */
	public void setMan(Integer man) {
		getPeopleVO().setMan(man);
	}
	
	/**
	 * @return Integer
	 */
	public Integer getMan() {
		return getPeopleVO().getMan();
	}	
	
}
