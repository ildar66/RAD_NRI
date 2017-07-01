package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * CompanyEJBBeanCacheEntryImpl_8d2adc68
 */
public class CompanyEJBBeanCacheEntryImpl_8d2adc68 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.CompanyEJBBeanCacheEntry_8d2adc68 {
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
}
