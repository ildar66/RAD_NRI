package com.nri.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Operator;
import com.nri.domain.People;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>operator - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class OperatorDialogForm extends DialogForm {

	private Operator vo = new Operator();
	private String forwardName = "error";
	private People peopleVO = new People();
	private String idTerrabyteServer = "";
	/**
	 * 
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset values are provided as samples only. Change as appropriate.
		super.reset(mapping, request);
		peopleVO = new People();
		idTerrabyteServer = "";
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
	public Operator getVo() {
		return vo;
	}

	/**
	 * @param operator
	 */
	public void setVo(Operator operator) {
		vo = operator;
	}

	/**
	 * @param string
	 */
	public void setOperator(Integer operatorKey) {
		getVo().setOperator(operatorKey);
	}

	/**
	 *
	 */
	public Integer getMan() {
		return getVo().getMan();
	}

	/**
	 * @param Integer
	 */
	public void setMan(Integer manKey) {
		getVo().setMan(manKey);
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
	public String getMsuCode() {
		if (getVo().getMsuCode() != null) {
			return getVo().getMsuCode().toString();
		} else {
			return "";
		}
	}

	/**
	 * @param string
	 */
	public void setMsuCode(String msuCodeStr) {
		Integer msuCode = null;
		try {
			msuCode = new Integer(msuCodeStr);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
		}
		getVo().setMsuCode(msuCode);	
	}

	/**
	 * @return
	 */
	public String getIdTerrabyteServer() {
		return idTerrabyteServer;
	}

	/**
	 * @param integer
	 */
	public void setIdTerrabyteServer(String str) {
		idTerrabyteServer = str;
	}

}
