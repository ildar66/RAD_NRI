package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * PeopleEJBBeanCacheEntryImpl_6bbce083
 */
public class PeopleEJBBeanCacheEntryImpl_6bbce083 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.PeopleEJBBeanCacheEntry_6bbce083 {
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
	 * getFirstName
	 */
	public java.lang.String getFirstName() {
		java.lang.String tempData_firstName;
		tempData_firstName =firstname_Data;
		Object tempConvertedObject_firstName = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_firstName);
		return (tempConvertedObject_firstName == null) ? null : (java.lang.String) tempConvertedObject_firstName;
	}
	/**
	 * setFirstName
	 */
	public void setFirstName(java.lang.String data) {
		this.firstname_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForfirstname
	 */
	public void setDataForfirstname(String data) {
		this.firstname_Data=data;
	}
	private String firstname_Data;
	/**
	 * getLastName
	 */
	public java.lang.String getLastName() {
		java.lang.String tempData_lastName;
		tempData_lastName =lastname_Data;
		Object tempConvertedObject_lastName = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_lastName);
		return (tempConvertedObject_lastName == null) ? null : (java.lang.String) tempConvertedObject_lastName;
	}
	/**
	 * setLastName
	 */
	public void setLastName(java.lang.String data) {
		this.lastname_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForlastname
	 */
	public void setDataForlastname(String data) {
		this.lastname_Data=data;
	}
	private String lastname_Data;
	/**
	 * getMiddleName
	 */
	public java.lang.String getMiddleName() {
		java.lang.String tempData_middleName;
		tempData_middleName =middlename_Data;
		Object tempConvertedObject_middleName = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_middleName);
		return (tempConvertedObject_middleName == null) ? null : (java.lang.String) tempConvertedObject_middleName;
	}
	/**
	 * setMiddleName
	 */
	public void setMiddleName(java.lang.String data) {
		this.middlename_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataFormiddlename
	 */
	public void setDataFormiddlename(String data) {
		this.middlename_Data=data;
	}
	private String middlename_Data;
	/**
	 * getPassportSer
	 */
	public java.lang.String getPassportSer() {
		java.lang.String tempData_passportSer;
		tempData_passportSer =passportser_Data;
		Object tempConvertedObject_passportSer = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_passportSer);
		return (tempConvertedObject_passportSer == null) ? null : (java.lang.String) tempConvertedObject_passportSer;
	}
	/**
	 * setPassportSer
	 */
	public void setPassportSer(java.lang.String data) {
		this.passportser_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForpassportser
	 */
	public void setDataForpassportser(String data) {
		this.passportser_Data=data;
	}
	private String passportser_Data;
	/**
	 * getPassportDate
	 */
	public java.sql.Date getPassportDate() {
		return passportdate_Data;
	}
	/**
	 * setPassportDate
	 */
	public void setPassportDate(java.sql.Date data) {
		if (data == null)
			this.passportdate_Data= null;
		else {
			this.passportdate_Data=data; }
	}
	/**
	 * setDataForpassportdate
	 */
	public void setDataForpassportdate(java.sql.Date data) {
		this.passportdate_Data=data;
	}
	private java.sql.Date passportdate_Data;
	/**
	 * getPassportWhom
	 */
	public java.lang.String getPassportWhom() {
		java.lang.String tempData_passportWhom;
		tempData_passportWhom =passportwhom_Data;
		Object tempConvertedObject_passportWhom = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_passportWhom);
		return (tempConvertedObject_passportWhom == null) ? null : (java.lang.String) tempConvertedObject_passportWhom;
	}
	/**
	 * setPassportWhom
	 */
	public void setPassportWhom(java.lang.String data) {
		this.passportwhom_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForpassportwhom
	 */
	public void setDataForpassportwhom(String data) {
		this.passportwhom_Data=data;
	}
	private String passportwhom_Data;
	/**
	 * getIsActive
	 */
	public java.lang.Boolean getIsActive() {
		java.lang.String tempData_isActive;
		tempData_isActive =isactive_Data;
		Object tempConvertedObject_isActive = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isActive);
		return (tempConvertedObject_isActive == null) ? null : (java.lang.Boolean) tempConvertedObject_isActive;
	}
	/**
	 * setIsActive
	 */
	public void setIsActive(java.lang.Boolean data) {
		this.isactive_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForisactive
	 */
	public void setDataForisactive(String data) {
		this.isactive_Data=data;
	}
	private String isactive_Data;
	/**
	 * getTabNum
	 */
	public java.lang.Integer getTabNum() {
		if(tabnum_IsNull)
			return null;
		else
			return new Integer(tabnum_Data);
	}
	/**
	 * setTabNum
	 */
	public void setTabNum(Integer data) {
		if (data == null)
			this.tabnum_IsNull= true;
		else {
			this.tabnum_IsNull= false;
			this.tabnum_Data=data.intValue(); }
	}
	/**
	 * setDataFortabnum
	 */
	public void setDataFortabnum(int data, boolean isNull) {
		this.tabnum_Data=data;
		this.tabnum_IsNull=isNull;
	}
	private int tabnum_Data;
	private boolean tabnum_IsNull = true;
}
