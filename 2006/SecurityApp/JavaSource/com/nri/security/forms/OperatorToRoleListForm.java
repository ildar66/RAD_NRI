package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Operator;
import com.nri.domain.People;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class OperatorToRoleListForm extends ActionForm {
	private Operator operatorVO = new Operator();
	private String orderBy = "roleName";
	private People peopleVO = new People();
	private java.lang.String operation = "";
	private String selectedID = null;	

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		peopleVO = new People();
		operation = "";
		selectedID = null;
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
	public void setOperator(Integer operator) {
		getOperatorVO().setOperator(operator);
	}

	/**
	 * @return Integer
	 */
	public Integer getOperator() {
		return getOperatorVO().getOperator();
	}

	/**
	 * @return
	 */
	public Operator getOperatorVO() {
		return operatorVO;
	}

	/**
	 * @param operator
	 */
	public void setOperatorVO(Operator operator) {
		operatorVO = operator;
	}

	/**
	 * @return
	 */
	public java.lang.String getOperation() {
		return operation;
	}

	/**
	 * @return
	 */
	public String getSelectedID() {
		return selectedID;
	}

	/**
	 * @param string
	 */
	public void setOperation(java.lang.String string) {
		operation = string;
	}

	/**
	 * @param integer
	 */
	public void setSelectedID(String idStr) {
		selectedID = idStr;
	}

}
