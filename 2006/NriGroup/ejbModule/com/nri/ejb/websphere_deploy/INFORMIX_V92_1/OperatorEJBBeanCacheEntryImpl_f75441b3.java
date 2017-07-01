package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * OperatorEJBBeanCacheEntryImpl_f75441b3
 */
public class OperatorEJBBeanCacheEntryImpl_f75441b3 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.OperatorEJBBeanCacheEntry_f75441b3 {
	/**
	 * getOperator
	 */
	public java.lang.Integer getOperator() {
		if(operator_IsNull)
			return null;
		else
			return new Integer(operator_Data);
	}
	/**
	 * setOperator
	 */
	public void setOperator(Integer data) {
		if (data == null)
			this.operator_IsNull= true;
		else {
			this.operator_IsNull= false;
			this.operator_Data=data.intValue(); }
	}
	/**
	 * setDataForoperator
	 */
	public void setDataForoperator(int data, boolean isNull) {
		this.operator_Data=data;
		this.operator_IsNull=isNull;
	}
	private int operator_Data;
	private boolean operator_IsNull = true;
	/**
	 * getMan
	 */
	public java.lang.Integer getMan() {
		if(man_IsNull)
			return null;
		else
			return new Integer(man_Data);
	}
	/**
	 * setMan
	 */
	public void setMan(Integer data) {
		if (data == null)
			this.man_IsNull= true;
		else {
			this.man_IsNull= false;
			this.man_Data=data.intValue(); }
	}
	/**
	 * setDataForman
	 */
	public void setDataForman(int data, boolean isNull) {
		this.man_Data=data;
		this.man_IsNull=isNull;
	}
	private int man_Data;
	private boolean man_IsNull = true;
	/**
	 * getLoginID
	 */
	public java.lang.String getLoginID() {
		java.lang.String tempData_loginID;
		tempData_loginID =loiginid_Data;
		Object tempConvertedObject_loginID = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_loginID);
		return (tempConvertedObject_loginID == null) ? null : (java.lang.String) tempConvertedObject_loginID;
	}
	/**
	 * setLoginID
	 */
	public void setLoginID(java.lang.String data) {
		this.loiginid_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForloiginid
	 */
	public void setDataForloiginid(String data) {
		this.loiginid_Data=data;
	}
	private String loiginid_Data;
	/**
	 * getPassword
	 */
	public java.lang.String getPassword() {
		return password_Data;
	}
	/**
	 * setPassword
	 */
	public void setPassword(String data) {
		this.password_Data=data;
	}
	/**
	 * setDataForpassword
	 */
	public void setDataForpassword(String data) {
		this.password_Data=data;
	}
	private String password_Data;
	/**
	 * getIsEnabled
	 */
	public java.lang.Boolean getIsEnabled() {
		java.lang.String tempData_isEnabled;
		tempData_isEnabled =isenabled_Data;
		Object tempConvertedObject_isEnabled = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isEnabled);
		return (tempConvertedObject_isEnabled == null) ? null : (java.lang.Boolean) tempConvertedObject_isEnabled;
	}
	/**
	 * setIsEnabled
	 */
	public void setIsEnabled(java.lang.Boolean data) {
		this.isenabled_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForisenabled
	 */
	public void setDataForisenabled(String data) {
		this.isenabled_Data=data;
	}
	private String isenabled_Data;
	/**
	 * getMsuCode
	 */
	public java.lang.Integer getMsuCode() {
		if(msucode_IsNull)
			return null;
		else
			return new Integer(msucode_Data);
	}
	/**
	 * setMsuCode
	 */
	public void setMsuCode(Integer data) {
		if (data == null)
			this.msucode_IsNull= true;
		else {
			this.msucode_IsNull= false;
			this.msucode_Data=data.intValue(); }
	}
	/**
	 * setDataFormsucode
	 */
	public void setDataFormsucode(int data, boolean isNull) {
		this.msucode_Data=data;
		this.msucode_IsNull=isNull;
	}
	private int msucode_Data;
	private boolean msucode_IsNull = true;
}
