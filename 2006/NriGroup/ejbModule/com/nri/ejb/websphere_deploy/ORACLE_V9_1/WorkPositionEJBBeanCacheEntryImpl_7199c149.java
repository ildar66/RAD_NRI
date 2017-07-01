package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * WorkPositionEJBBeanCacheEntryImpl_7199c149
 */
public class WorkPositionEJBBeanCacheEntryImpl_7199c149 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.WorkPositionEJBBeanCacheEntry_7199c149 {
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
	 * getWorkPosition
	 */
	public java.lang.Integer getWorkPosition() {
		if(WORKPOSITION_IsNull)
			return null;
		else
			return new Integer(WORKPOSITION_Data);
	}
	/**
	 * setWorkPosition
	 */
	public void setWorkPosition(Integer data) {
		if (data == null)
			this.WORKPOSITION_IsNull= true;
		else {
			this.WORKPOSITION_IsNull= false;
			this.WORKPOSITION_Data=data.intValue(); }
	}
	/**
	 * setDataForWORKPOSITION
	 */
	public void setDataForWORKPOSITION(int data, boolean isNull) {
		this.WORKPOSITION_Data=data;
		this.WORKPOSITION_IsNull=isNull;
	}
	private int WORKPOSITION_Data;
	private boolean WORKPOSITION_IsNull = true;
}
