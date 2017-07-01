/*
 * Created on 04.09.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.security.forms;

import org.apache.struts.action.ActionForm;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class LookupListForm extends ActionForm {

	/**
	 * 
	 */
	public LookupListForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected java.lang.String formName = "";

	protected java.lang.String fieldNames = "";

	/**
		 * @return
		 */
	public java.lang.String getFieldNames() {
		return fieldNames;
	}

	/**
		 * @return
		 */
	public java.lang.String getFormName() {
		return formName;
	}

	/**
		 * @param string
		 */
	public void setFieldNames(java.lang.String string) {
		fieldNames = string;
	}

	/**
		 * @param string
		 */
	public void setFormName(java.lang.String string) {
		formName = string;
	}

}
