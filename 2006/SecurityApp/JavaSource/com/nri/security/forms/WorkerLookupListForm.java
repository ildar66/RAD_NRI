package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Company;
import com.nri.domain.Division;
import com.nri.domain.Worker;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class WorkerLookupListForm extends LookupListForm {
	private String searchStr = new String("À*");
	private Worker query  = new Worker();
	private String orderBy = "fullName";
	private Company companyVO = new Company();
	private Division divisionVO = new Division();
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		query  = new Worker();
		query.setIsActive(Boolean.TRUE);
		companyVO = new Company();
		divisionVO = new Division();
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
	public Worker getQuery() {
		return query;
	}

	/**
	 * @param division
	 */
	public void setQuery(Worker worker) {
		query = worker;
	}

	/**
	 * @param string
	 */
	public void setDivision(String divisionStr) {
		Integer division = null;
		try {
			division = new Integer(divisionStr);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		getQuery().setDivision(division);
	}
	
	/**
	 * @return
	 */
	public String getDivision() {
		if(getQuery().getDivision() != null){
			return getQuery().getDivision().toString();
		}else{
			return "";
		}
	}	
	
	/**
	 * @return
	 */
	public String getCompany() {
		if(getQuery().getCompany() != null){
			return getQuery().getCompany().toString();
		}else{
			return "";
		}
	}	
	/**
	 * @param string
	 */
	public void setCompany(String companyStr) {
		Integer company = null;
		try {
			company = new Integer(companyStr);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		getQuery().setCompany(company);
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
	public Division getDivisionVO() {
		return divisionVO;
	}

	/**
	 * @param division
	 */
	public void setDivisionVO(Division division) {
		divisionVO = division;
	}

}
