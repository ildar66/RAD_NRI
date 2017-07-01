package com.nri.sequence.ejb.websphere_deploy.INFORMIX_V94_1;

/**
 * SequenceBeanCacheEntryImpl_61331c68
 */
public class SequenceBeanCacheEntryImpl_61331c68 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.sequence.ejb.websphere_deploy.SequenceBeanCacheEntry_61331c68 {
	/**
	 * getId
	 */
	public java.lang.String getId() {
		return id_Data;
	}
	/**
	 * setId
	 */
	public void setId(String data) {
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
	 * getValue
	 */
	public int getValue() {
		return value_Data;
	}
	/**
	 * setValue
	 */
	public void setValue(int data) {
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
