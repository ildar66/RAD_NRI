package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Company;
import com.nri.domain.Division;
import com.nri.domain.DivisionType;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>division - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class DivisionDialogForm extends DialogForm {

	private Division vo = new Division();
	private Company companyVO = new Company();
	private String bossName = "";
	private String forwardName = "success";

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset values are provided as samples only. Change as appropriate.
		super.reset(mapping, request);
		companyVO = new Company();
		bossName = "";
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
	public Division getVo() {
		return vo;
	}

	/**
	 * @param division
	 */
	public void setVo(Division division) {
		vo = division;
	}

	/**
	 * @param string
	 */
	public void setDivision(Integer division) {
		getVo().setDivision(division);
	}
	
	/**
	 * @param string
	 */
	public void setType(String typeStr) {
		getVo().setType(DivisionType.factory(typeStr));
	}
	
	/**
	 * @return
	 */
	public String getType() {
		return getVo().getType().getType();
	}

	/**
	 * @return
	 */
	public String getCompany() {
		if(getVo().getCompany() != null){
			return getVo().getCompany().toString();
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
		getVo().setCompany(company);
	}
	
	/**
	 * @return
	 */
	public String getEncloser() {
		if(getVo().getEncloser() != null){
			return getVo().getEncloser().toString();
		}else{
			return "";
		}
	}	
	
	/**
	 * @param string
	 */
	public void setEncloser(String encloserStr) {
		Integer encloser = null;
		try {
			encloser = new Integer(encloserStr);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		getVo().setEncloser(encloser);
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
	public String getBossName() {
		return bossName;
	}

	/**
	 * @param string
	 */
	public void setBossName(String string) {
		bossName = string;
	}

	/**
	 * @return
	 */
	public String getBoss() {
		if(getVo().getBoss() != null){
			return getVo().getBoss().toString();
		}else{
			return "";
		}
	}

	/**
	 * @param string
	 */
	public void setBoss(String bossStr) {
		Integer boss = null;
		try {
			boss = new Integer(bossStr);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		getVo().setBoss(boss);
	}
	/**
	 * @return
	 */
	public String getForwardName() {
		return forwardName;
	}

	/**
	 * @param string
	 */
	public void setForwardName(String string) {
		forwardName = string;
	}

}
