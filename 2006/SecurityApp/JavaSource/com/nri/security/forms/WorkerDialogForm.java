package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Company;
import com.nri.domain.Division;
import com.nri.domain.People;
import com.nri.domain.WorkPosition;
import com.nri.domain.Worker;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>worker - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class WorkerDialogForm extends DialogForm {

	private Worker vo = new Worker();
	private String forwardName = "success";
	private Company companyVO = new Company();
	private Division divisionVO = new Division();
	private People peopleVO = new People();
	private WorkPosition workPositionVO = new WorkPosition();
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset values are provided as samples only. Change as appropriate.
		super.reset(mapping, request);
		companyVO = new Company();
		divisionVO = new Division();
		peopleVO = new People();
		workPositionVO = new WorkPosition();
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
	public Worker getVo() {
		return vo;
	}

	/**
	 * @param worker
	 */
	public void setVo(Worker worker) {
		vo = worker;
	}

	/**
	 * @param string
	 */
	public void setWorker(Integer workerStr) {
		getVo().setWorker(workerStr);
	}

	/**
	 *
	 */	
	public String getCompany(){
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
	 *
	 */	
	public String getMan(){
		if(getVo().getMan() != null){
			return getVo().getMan().toString();
		}else{
			return "";
		}		
	}
	
	/**
	 * @param string
	 */
	public void setMan(String manStr) {
		Integer man = null;
		try {
			man = new Integer(manStr);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		getVo().setMan(man);		
	}	
	
	/**
	 *
	 */	
	public String getDivision(){
		if(getVo().getDivision() != null){
			return getVo().getDivision().toString();
		}else{
			return "";
		}		
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
		getVo().setDivision(division);
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
	public Division getDivisionVO() {
		return divisionVO;
	}

	/**
	 * @return
	 */
	public People getPeopleVO() {
		return peopleVO;
	}

	/**
	 * @return
	 */
	public WorkPosition getWorkPositionVO() {
		return workPositionVO;
	}

	/**
	 * @param division
	 */
	public void setDivisionVO(Division division) {
		divisionVO = division;
	}

	/**
	 * @param people
	 */
	public void setPeopleVO(People people) {
		peopleVO = people;
	}

	/**
	 * @param position
	 */
	public void setWorkPositionVO(WorkPosition position) {
		workPositionVO = position;
	}

}
