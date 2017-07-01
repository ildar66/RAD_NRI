package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Company;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class DivisionLookupListForm extends LookupListForm {
	private String searchStr = new String();
	private String orderBy = "name";
	private String activeState = "Y";
	private int company = -1;
	private Company companyVO = new Company();
	private String type = "ALL"; //Тип подразделения

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		//company = -1;
		companyVO = new Company();
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
	public String getSearchStr() {
		return searchStr;
	}

	/**
	 * @param string
	 */
	public void setSearchStr(String string) {
		searchStr = string;
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

	/**
	 * @return
	 */
	public Company getCompanyVO() {
		return companyVO;
	}

	/**
	 * @param company
	 */
	public void setCompanyVO(Company company) {
		companyVO = company;
	}

	/**
	 * @return
	 */
	public int getCompany() {
		return company;
	}

	/**
	 * @param i
	 */
	public void setCompany(int i) {
		company = i;
	}

	/**
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param string
	 */
	public void setType(String string) {
		type = string;
	}

}
