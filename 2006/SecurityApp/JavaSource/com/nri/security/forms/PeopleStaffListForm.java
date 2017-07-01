package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.People;
import com.nri.domain.Worker;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class PeopleStaffListForm extends ActionForm {
	private Worker query  = new Worker();
	private String orderBy = "fullName";
	private People peopleVO = new People();

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		query  = new Worker();
		query.setIsActive(Boolean.TRUE);
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
	 * @return
	 */
	public Worker getQuery() {
		return query;
	}

	/**
	 * @param division
	 */
	public void setQuery(Worker aQuery) {
		query = aQuery;
	}

	/**
	 * @param string
	 */
	public void setMan(Integer man) {
		getQuery().setMan(man);
	}
	
	/**
	 * @return
	 */
	public String getActiveState() {
		Boolean isActive = getQuery().getIsActive();
		if (isActive == Boolean.TRUE) {
			return "Y";
		} else if (isActive == Boolean.FALSE) {
			return "N";
		}
		return "ALL";
	}

	/**
	 * @param string
	 */
	public void setActiveState(String activeStateStr) {
		Boolean isActive = null;
		if ("Y".equals(activeStateStr)) {
			isActive = Boolean.TRUE;
		} else if ("N".equals(activeStateStr)) {
			isActive = Boolean.FALSE;
		}
		getQuery().setIsActive(isActive);		
	}	
}
