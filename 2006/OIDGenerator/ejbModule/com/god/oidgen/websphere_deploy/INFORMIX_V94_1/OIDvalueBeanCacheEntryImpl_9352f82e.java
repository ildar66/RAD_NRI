package com.god.oidgen.websphere_deploy.INFORMIX_V94_1;

/**
 * OIDvalueBeanCacheEntryImpl_9352f82e
 */
public class OIDvalueBeanCacheEntryImpl_9352f82e extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.god.oidgen.websphere_deploy.OIDvalueBeanCacheEntry_9352f82e {
	/**
	 * getType
	 */
	public java.lang.String getType() {
		return id_Data;
	}
	/**
	 * setType
	 */
	public void setType(String data) {
		this.id_Data=data;
	}
	/**
	 * setDataForid
	 */
	public void setDataForid(String data) {
		this.id_Data=data;
	}
	private String id_Data;
	/**
	 * getNextOID
	 */
	public int getNextOID() {
		return value_Data;
	}
	/**
	 * setNextOID
	 */
	public void setNextOID(int data) {
		this.value_Data=data;
	}
	/**
	 * setDataForvalue
	 */
	public void setDataForvalue(int data) {
		this.value_Data=data;
	}
	private int value_Data;
}
