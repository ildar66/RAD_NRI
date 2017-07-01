package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * DivisionEJBBeanCacheEntryImpl_7c74fa89
 */
public class DivisionEJBBeanCacheEntryImpl_7c74fa89 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.DivisionEJBBeanCacheEntry_7c74fa89 {
	/**
	 * getType
	 */
	public java.lang.String getType() {
		return TYPE__Data;
	}
	/**
	 * setType
	 */
	public void setType(String data) {
		this.TYPE__Data=data;
	}
	/**
	 * setDataForTYPE_
	 */
	public void setDataForTYPE_(String data) {
		this.TYPE__Data=data;
	}
	private String TYPE__Data;
	/**
	 * getEncloser
	 */
	public java.lang.Integer getEncloser() {
		if(ENCLOSER_IsNull)
			return null;
		else
			return new Integer(ENCLOSER_Data);
	}
	/**
	 * setEncloser
	 */
	public void setEncloser(Integer data) {
		if (data == null)
			this.ENCLOSER_IsNull= true;
		else {
			this.ENCLOSER_IsNull= false;
			this.ENCLOSER_Data=data.intValue(); }
	}
	/**
	 * setDataForENCLOSER
	 */
	public void setDataForENCLOSER(int data, boolean isNull) {
		this.ENCLOSER_Data=data;
		this.ENCLOSER_IsNull=isNull;
	}
	private int ENCLOSER_Data;
	private boolean ENCLOSER_IsNull = true;
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
	 * getBoss
	 */
	public java.lang.Integer getBoss() {
		if(BOSS_IsNull)
			return null;
		else
			return new Integer(BOSS_Data);
	}
	/**
	 * setBoss
	 */
	public void setBoss(Integer data) {
		if (data == null)
			this.BOSS_IsNull= true;
		else {
			this.BOSS_IsNull= false;
			this.BOSS_Data=data.intValue(); }
	}
	/**
	 * setDataForBOSS
	 */
	public void setDataForBOSS(int data, boolean isNull) {
		this.BOSS_Data=data;
		this.BOSS_IsNull=isNull;
	}
	private int BOSS_Data;
	private boolean BOSS_IsNull = true;
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
	 * getDivision
	 */
	public java.lang.Integer getDivision() {
		if(DIVISION_IsNull)
			return null;
		else
			return new Integer(DIVISION_Data);
	}
	/**
	 * setDivision
	 */
	public void setDivision(Integer data) {
		if (data == null)
			this.DIVISION_IsNull= true;
		else {
			this.DIVISION_IsNull= false;
			this.DIVISION_Data=data.intValue(); }
	}
	/**
	 * setDataForDIVISION
	 */
	public void setDataForDIVISION(int data, boolean isNull) {
		this.DIVISION_Data=data;
		this.DIVISION_IsNull=isNull;
	}
	private int DIVISION_Data;
	private boolean DIVISION_IsNull = true;
}
