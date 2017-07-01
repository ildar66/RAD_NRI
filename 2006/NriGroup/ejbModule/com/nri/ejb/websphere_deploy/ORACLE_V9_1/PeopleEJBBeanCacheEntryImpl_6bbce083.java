package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * PeopleEJBBeanCacheEntryImpl_6bbce083
 */
public class PeopleEJBBeanCacheEntryImpl_6bbce083 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.PeopleEJBBeanCacheEntry_6bbce083 {
	/**
	 * getFirstName
	 */
	public java.lang.String getFirstName() {
		return FIRSTNAME_Data;
	}
	/**
	 * setFirstName
	 */
	public void setFirstName(String data) {
		this.FIRSTNAME_Data=data;
	}
	/**
	 * setDataForFIRSTNAME
	 */
	public void setDataForFIRSTNAME(String data) {
		this.FIRSTNAME_Data=data;
	}
	private String FIRSTNAME_Data;
	/**
	 * getLastName
	 */
	public java.lang.String getLastName() {
		return LASTNAME_Data;
	}
	/**
	 * setLastName
	 */
	public void setLastName(String data) {
		this.LASTNAME_Data=data;
	}
	/**
	 * setDataForLASTNAME
	 */
	public void setDataForLASTNAME(String data) {
		this.LASTNAME_Data=data;
	}
	private String LASTNAME_Data;
	/**
	 * getMiddleName
	 */
	public java.lang.String getMiddleName() {
		return MIDDLENAME_Data;
	}
	/**
	 * setMiddleName
	 */
	public void setMiddleName(String data) {
		this.MIDDLENAME_Data=data;
	}
	/**
	 * setDataForMIDDLENAME
	 */
	public void setDataForMIDDLENAME(String data) {
		this.MIDDLENAME_Data=data;
	}
	private String MIDDLENAME_Data;
	/**
	 * getPassportSer
	 */
	public java.lang.String getPassportSer() {
		return PASSPORTSER_Data;
	}
	/**
	 * setPassportSer
	 */
	public void setPassportSer(String data) {
		this.PASSPORTSER_Data=data;
	}
	/**
	 * setDataForPASSPORTSER
	 */
	public void setDataForPASSPORTSER(String data) {
		this.PASSPORTSER_Data=data;
	}
	private String PASSPORTSER_Data;
	/**
	 * getPassportDate
	 */
	public java.sql.Date getPassportDate() {
		return (PASSPORTDATE_Data == null) ? null : new java.sql.Date(PASSPORTDATE_Data.getTime());
	}
	/**
	 * setPassportDate
	 */
	public void setPassportDate(java.sql.Date data) {
		if (data == null)
			this.PASSPORTDATE_Data= null;
		else {
			this.PASSPORTDATE_Data=new java.sql.Timestamp(data.getTime()); }
	}
	/**
	 * setDataForPASSPORTDATE
	 */
	public void setDataForPASSPORTDATE(java.sql.Timestamp data) {
		this.PASSPORTDATE_Data=data;
	}
	private java.sql.Timestamp PASSPORTDATE_Data;
	/**
	 * getPassportWhom
	 */
	public java.lang.String getPassportWhom() {
		return PASSPORTWHOM_Data;
	}
	/**
	 * setPassportWhom
	 */
	public void setPassportWhom(String data) {
		this.PASSPORTWHOM_Data=data;
	}
	/**
	 * setDataForPASSPORTWHOM
	 */
	public void setDataForPASSPORTWHOM(String data) {
		this.PASSPORTWHOM_Data=data;
	}
	private String PASSPORTWHOM_Data;
	/**
	 * getIsActive
	 */
	public java.lang.Boolean getIsActive() {
		java.lang.String tempData_isActive;
		tempData_isActive =ISACTIVE_Data;
		Object tempConvertedObject_isActive = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isActive);
		return (tempConvertedObject_isActive == null) ? null : (java.lang.Boolean) tempConvertedObject_isActive;
	}
	/**
	 * setIsActive
	 */
	public void setIsActive(java.lang.Boolean data) {
		this.ISACTIVE_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForISACTIVE
	 */
	public void setDataForISACTIVE(String data) {
		this.ISACTIVE_Data=data;
	}
	private String ISACTIVE_Data;
	/**
	 * getTabNum
	 */
	public java.lang.Integer getTabNum() {
		if(TABNUM_IsNull)
			return null;
		else
			return new Integer(TABNUM_Data);
	}
	/**
	 * setTabNum
	 */
	public void setTabNum(Integer data) {
		if (data == null)
			this.TABNUM_IsNull= true;
		else {
			this.TABNUM_IsNull= false;
			this.TABNUM_Data=data.intValue(); }
	}
	/**
	 * setDataForTABNUM
	 */
	public void setDataForTABNUM(int data, boolean isNull) {
		this.TABNUM_Data=data;
		this.TABNUM_IsNull=isNull;
	}
	private int TABNUM_Data;
	private boolean TABNUM_IsNull = true;
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
}
