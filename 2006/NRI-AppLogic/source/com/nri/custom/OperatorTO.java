/*
 * Created on 12.09.2007
 *
 * оператор NRI
 */
package com.nri.custom;

import java.io.Serializable;

/**
 * @author IShaffigulin
 *
 * оператор NRI
 */
public class OperatorTO implements Serializable {
	private Integer operator = null; //Идентификатор оператора.
	//private Integer man = null;//Физ.лицо.
	private String loginID = null; //Логин.
	private Boolean isEnabled = null; //Признак активности оператора.
	private String msUser = null; //Имя оператора MicroStrategy.
	/**
	 * 
	 */
	public OperatorTO(Integer aID) {
		super();
		setOperator(aID);
	}

	/**
	 * @return
	 */
	public Boolean getIsEnabled() {
		return isEnabled;
	}

	/**
	 * @return
	 */
	public String getLoginID() {
		return loginID;
	}

	/**
	 * @return
	 */
	public String getMsUser() {
		return msUser;
	}

	/**
	 * @return
	 */
	public Integer getOperator() {
		return operator;
	}

	/**
	 * @param boolean1
	 */
	public void setIsEnabled(Boolean boolean1) {
		isEnabled = boolean1;
	}

	/**
	 * @param string
	 */
	public void setLoginID(String string) {
		loginID = string;
	}

	/**
	 * @param string
	 */
	public void setMsUser(String string) {
		msUser = string;
	}

	/**
	 * @param integer
	 */
	public void setOperator(Integer integer) {
		operator = integer;
	}

}
