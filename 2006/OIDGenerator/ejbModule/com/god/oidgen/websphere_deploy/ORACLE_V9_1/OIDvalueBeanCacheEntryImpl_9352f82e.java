package com.god.oidgen.websphere_deploy.ORACLE_V9_1;

/**
 * OIDvalueBeanCacheEntryImpl_9352f82e
 */
public class OIDvalueBeanCacheEntryImpl_9352f82e extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.god.oidgen.websphere_deploy.OIDvalueBeanCacheEntry_9352f82e {
	/**
	 * getNextOID
	 */
	public int getNextOID() {
		return VALUE_Data;
	}
	/**
	 * setNextOID
	 */
	public void setNextOID(int data) {
		this.VALUE_Data=data;
	}
	/**
	 * setDataForVALUE
	 */
	public void setDataForVALUE(int data) {
		this.VALUE_Data=data;
	}
	private int VALUE_Data;
	/**
	 * getType
	 */
	public java.lang.String getType() {
		java.lang.String tempData_type;
		tempData_type =ID_Data;
		Object tempConvertedObject_type = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_type);
		return (tempConvertedObject_type == null) ? null : (java.lang.String) tempConvertedObject_type;
	}
	/**
	 * setType
	 */
	public void setType(java.lang.String data) {
		this.ID_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForID
	 */
	public void setDataForID(String data) {
		this.ID_Data=data;
	}
	private String ID_Data;
}
