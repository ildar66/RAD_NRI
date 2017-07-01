package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * OperatorEJBBeanCacheEntryImpl_f75441b3
 */
public class OperatorEJBBeanCacheEntryImpl_f75441b3 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.OperatorEJBBeanCacheEntry_f75441b3 {
	/**
	 * getMan
	 */
	public java.lang.Integer getMan() {
		if(MAN_IsNull)
			return null;
		else
			return new Integer(MAN_Data);
	}
	/**
	 * setMan
	 */
	public void setMan(Integer data) {
		if (data == null)
			this.MAN_IsNull= true;
		else {
			this.MAN_IsNull= false;
			this.MAN_Data=data.intValue(); }
	}
	/**
	 * setDataForMAN
	 */
	public void setDataForMAN(int data, boolean isNull) {
		this.MAN_Data=data;
		this.MAN_IsNull=isNull;
	}
	private int MAN_Data;
	private boolean MAN_IsNull = true;
	/**
	 * getPassword
	 */
	public java.lang.String getPassword() {
		return PASSWORD_Data;
	}
	/**
	 * setPassword
	 */
	public void setPassword(String data) {
		this.PASSWORD_Data=data;
	}
	/**
	 * setDataForPASSWORD
	 */
	public void setDataForPASSWORD(String data) {
		this.PASSWORD_Data=data;
	}
	private String PASSWORD_Data;
	/**
	 * getIsEnabled
	 */
	public java.lang.Boolean getIsEnabled() {
		java.lang.String tempData_isEnabled;
		tempData_isEnabled =ISENABLED_Data;
		Object tempConvertedObject_isEnabled = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isEnabled);
		return (tempConvertedObject_isEnabled == null) ? null : (java.lang.Boolean) tempConvertedObject_isEnabled;
	}
	/**
	 * setIsEnabled
	 */
	public void setIsEnabled(java.lang.Boolean data) {
		this.ISENABLED_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForISENABLED
	 */
	public void setDataForISENABLED(String data) {
		this.ISENABLED_Data=data;
	}
	private String ISENABLED_Data;
	/**
	 * getMsuCode
	 */
	public java.lang.Integer getMsuCode() {
		if(MSUCODE_IsNull)
			return null;
		else
			return new Integer(MSUCODE_Data);
	}
	/**
	 * setMsuCode
	 */
	public void setMsuCode(Integer data) {
		if (data == null)
			this.MSUCODE_IsNull= true;
		else {
			this.MSUCODE_IsNull= false;
			this.MSUCODE_Data=data.intValue(); }
	}
	/**
	 * setDataForMSUCODE
	 */
	public void setDataForMSUCODE(int data, boolean isNull) {
		this.MSUCODE_Data=data;
		this.MSUCODE_IsNull=isNull;
	}
	private int MSUCODE_Data;
	private boolean MSUCODE_IsNull = true;
	/**
	 * getLoginID
	 */
	public java.lang.String getLoginID() {
		return LOIGINID_Data;
	}
	/**
	 * setLoginID
	 */
	public void setLoginID(String data) {
		this.LOIGINID_Data=data;
	}
	/**
	 * setDataForLOIGINID
	 */
	public void setDataForLOIGINID(String data) {
		this.LOIGINID_Data=data;
	}
	private String LOIGINID_Data;
	/**
	 * getOperator
	 */
	public java.lang.Integer getOperator() {
		if(OPERATOR__IsNull)
			return null;
		else
			return new Integer(OPERATOR__Data);
	}
	/**
	 * setOperator
	 */
	public void setOperator(Integer data) {
		if (data == null)
			this.OPERATOR__IsNull= true;
		else {
			this.OPERATOR__IsNull= false;
			this.OPERATOR__Data=data.intValue(); }
	}
	/**
	 * setDataForOPERATOR_
	 */
	public void setDataForOPERATOR_(int data, boolean isNull) {
		this.OPERATOR__Data=data;
		this.OPERATOR__IsNull=isNull;
	}
	private int OPERATOR__Data;
	private boolean OPERATOR__IsNull = true;
}
