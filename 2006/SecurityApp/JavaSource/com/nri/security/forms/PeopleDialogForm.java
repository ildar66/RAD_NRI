package com.nri.security.forms;

import java.sql.Date;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.People;
import com.nri.util.Formatter;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>people - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class PeopleDialogForm extends DialogForm {

	private People vo = new People();

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
	public People getVo() {
		return vo;
	}

	/**
	 * @param people
	 */
	public void setVo(People people) {
		vo = people;
	}

	/**
	 * @param string
	 */
	public void setMan(Integer man) {
		getVo().setMan(man);
	}

	/**
	 * @return
	 */
	public String getPassportDateStr() {
		return Formatter.sqlDateFormat(getVo().getPassportDate());
	}

	/**
	 * @param string
	 */
	public void setPassportDateStr(String dateStr) {
		getVo().setPassportDate(Formatter.convertToSqlDate(dateStr));
	}

}
