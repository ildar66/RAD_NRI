/*
 * Created on 12.09.2007
 *
 * NriObject оператора NRI.
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * NriObject оператора NRI.
 */
public class Operator extends NriObject {
	private Integer operator = null; //Идентификатор оператора
	private Integer man = null; //ссылка на Физ. лицо
	private String loginID = null; //Логин.
	private String password = null; //Пароль
	private Boolean isEnabled = null; //Признак активности оператора.
	private Integer msuCode = null; //Код оператора MicroStrategy.

	/**
	 * 
	 */
	public Operator() {
		super();
	}

	/**
	 * 
	 */
	public Operator(Integer aOperator) {
		super();
		setOperator(aOperator);
	}
	
	/**
	 * 
	 */
	public Operator(Integer aOperator, Integer aMan, String aLoginID, String aPassword, Boolean aIsEnabled) {
		super();
		setOperator(aOperator);
		setMan(aMan);
		setLoginID(aLoginID);
		setPassword(aPassword);
		setIsEnabled(aIsEnabled);
	}	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof Operator)) {
			return false;
		}
		Operator aOperator = (Operator) anObject;
		return aOperator.getOperator().intValue() == getOperator().intValue();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Operator: ");
		sb.append(getOperator() + "(man=" + getMan() + ")");
		//sb.append('\n');
		//sb.append(" IsActive: ");
		//sb.append(getIsActive());

		return sb.toString();
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
	public Integer getMan() {
		return man;
	}

	/**
	 * @return
	 */
	public Integer getOperator() {
		return operator;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
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
	 * @param integer
	 */
	public void setMan(Integer integer) {
		man = integer;
	}

	/**
	 * @param integer
	 */
	public void setOperator(Integer integer) {
		operator = integer;
	}

	/**
	 * @param string
	 */
	public void setPassword(String string) {
		password = string;
	}

	/**
	 * @return
	 */
	public Integer getMsuCode() {
		return msuCode;
	}

	/**
	 * @param integer
	 */
	public void setMsuCode(Integer integer) {
		msuCode = integer;
	}

}
