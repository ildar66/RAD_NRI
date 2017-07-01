package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * CompanyEJBBeanCacheEntryImpl_8d2adc68
 */
public class CompanyEJBBeanCacheEntryImpl_8d2adc68 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.CompanyEJBBeanCacheEntry_8d2adc68 {
	/**
	 * getName
	 */
	public java.lang.String getName() {
		return NAME_Data;
	}
	/**
	 * setName
	 */
	public void setName(String data) {
		this.NAME_Data=data;
	}
	/**
	 * setDataForNAME
	 */
	public void setDataForNAME(String data) {
		this.NAME_Data=data;
	}
	private String NAME_Data;
	/**
	 * getShortName
	 */
	public java.lang.String getShortName() {
		return SHORTNAME_Data;
	}
	/**
	 * setShortName
	 */
	public void setShortName(String data) {
		this.SHORTNAME_Data=data;
	}
	/**
	 * setDataForSHORTNAME
	 */
	public void setDataForSHORTNAME(String data) {
		this.SHORTNAME_Data=data;
	}
	private String SHORTNAME_Data;
	/**
	 * getCompany
	 */
	public java.lang.Integer getCompany() {
		if(COMPANY_IsNull)
			return null;
		else
			return new Integer(COMPANY_Data);
	}
	/**
	 * setCompany
	 */
	public void setCompany(Integer data) {
		if (data == null)
			this.COMPANY_IsNull= true;
		else {
			this.COMPANY_IsNull= false;
			this.COMPANY_Data=data.intValue(); }
	}
	/**
	 * setDataForCOMPANY
	 */
	public void setDataForCOMPANY(int data, boolean isNull) {
		this.COMPANY_Data=data;
		this.COMPANY_IsNull=isNull;
	}
	private int COMPANY_Data;
	private boolean COMPANY_IsNull = true;
}
