package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * DivisionEJBBeanCacheEntryImpl_7c74fa89
 */
public class DivisionEJBBeanCacheEntryImpl_7c74fa89 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.DivisionEJBBeanCacheEntry_7c74fa89 {
	/**
	 * getDivision
	 */
	public java.lang.Integer getDivision() {
		if(division_IsNull)
			return null;
		else
			return new Integer(division_Data);
	}
	/**
	 * setDivision
	 */
	public void setDivision(Integer data) {
		if (data == null)
			this.division_IsNull= true;
		else {
			this.division_IsNull= false;
			this.division_Data=data.intValue(); }
	}
	/**
	 * setDataFordivision
	 */
	public void setDataFordivision(int data, boolean isNull) {
		this.division_Data=data;
		this.division_IsNull=isNull;
	}
	private int division_Data;
	private boolean division_IsNull = true;
	/**
	 * getType
	 */
	public java.lang.String getType() {
		return type_Data;
	}
	/**
	 * setType
	 */
	public void setType(String data) {
		this.type_Data=data;
	}
	/**
	 * setDataFortype
	 */
	public void setDataFortype(String data) {
		this.type_Data=data;
	}
	private String type_Data;
	/**
	 * getEncloser
	 */
	public java.lang.Integer getEncloser() {
		if(encloser_IsNull)
			return null;
		else
			return new Integer(encloser_Data);
	}
	/**
	 * setEncloser
	 */
	public void setEncloser(Integer data) {
		if (data == null)
			this.encloser_IsNull= true;
		else {
			this.encloser_IsNull= false;
			this.encloser_Data=data.intValue(); }
	}
	/**
	 * setDataForencloser
	 */
	public void setDataForencloser(int data, boolean isNull) {
		this.encloser_Data=data;
		this.encloser_IsNull=isNull;
	}
	private int encloser_Data;
	private boolean encloser_IsNull = true;
	/**
	 * getName
	 */
	public java.lang.String getName() {
		java.lang.String tempData_name;
		tempData_name =name_Data;
		Object tempConvertedObject_name = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_name);
		return (tempConvertedObject_name == null) ? null : (java.lang.String) tempConvertedObject_name;
	}
	/**
	 * setName
	 */
	public void setName(java.lang.String data) {
		this.name_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForname
	 */
	public void setDataForname(String data) {
		this.name_Data=data;
	}
	private String name_Data;
	/**
	 * getShortName
	 */
	public java.lang.String getShortName() {
		java.lang.String tempData_shortName;
		tempData_shortName =shortname_Data;
		Object tempConvertedObject_shortName = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_shortName);
		return (tempConvertedObject_shortName == null) ? null : (java.lang.String) tempConvertedObject_shortName;
	}
	/**
	 * setShortName
	 */
	public void setShortName(java.lang.String data) {
		this.shortname_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForshortname
	 */
	public void setDataForshortname(String data) {
		this.shortname_Data=data;
	}
	private String shortname_Data;
	/**
	 * getBoss
	 */
	public java.lang.Integer getBoss() {
		if(boss_IsNull)
			return null;
		else
			return new Integer(boss_Data);
	}
	/**
	 * setBoss
	 */
	public void setBoss(Integer data) {
		if (data == null)
			this.boss_IsNull= true;
		else {
			this.boss_IsNull= false;
			this.boss_Data=data.intValue(); }
	}
	/**
	 * setDataForboss
	 */
	public void setDataForboss(int data, boolean isNull) {
		this.boss_Data=data;
		this.boss_IsNull=isNull;
	}
	private int boss_Data;
	private boolean boss_IsNull = true;
	/**
	 * getCompany
	 */
	public java.lang.Integer getCompany() {
		if(company_IsNull)
			return null;
		else
			return new Integer(company_Data);
	}
	/**
	 * setCompany
	 */
	public void setCompany(Integer data) {
		if (data == null)
			this.company_IsNull= true;
		else {
			this.company_IsNull= false;
			this.company_Data=data.intValue(); }
	}
	/**
	 * setDataForcompany
	 */
	public void setDataForcompany(int data, boolean isNull) {
		this.company_Data=data;
		this.company_IsNull=isNull;
	}
	private int company_Data;
	private boolean company_IsNull = true;
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
}
