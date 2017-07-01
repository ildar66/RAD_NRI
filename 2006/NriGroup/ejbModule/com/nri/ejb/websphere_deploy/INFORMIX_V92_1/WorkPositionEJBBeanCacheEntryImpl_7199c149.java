package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * WorkPositionEJBBeanCacheEntryImpl_7199c149
 */
public class WorkPositionEJBBeanCacheEntryImpl_7199c149 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.WorkPositionEJBBeanCacheEntry_7199c149 {
	/**
	 * getWorkPosition
	 */
	public java.lang.Integer getWorkPosition() {
		if(workposition_IsNull)
			return null;
		else
			return new Integer(workposition_Data);
	}
	/**
	 * setWorkPosition
	 */
	public void setWorkPosition(Integer data) {
		if (data == null)
			this.workposition_IsNull= true;
		else {
			this.workposition_IsNull= false;
			this.workposition_Data=data.intValue(); }
	}
	/**
	 * setDataForworkposition
	 */
	public void setDataForworkposition(int data, boolean isNull) {
		this.workposition_Data=data;
		this.workposition_IsNull=isNull;
	}
	private int workposition_Data;
	private boolean workposition_IsNull = true;
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
