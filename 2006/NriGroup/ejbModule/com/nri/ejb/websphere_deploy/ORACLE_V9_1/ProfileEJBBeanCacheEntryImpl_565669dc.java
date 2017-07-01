package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * ProfileEJBBeanCacheEntryImpl_565669dc
 */
public class ProfileEJBBeanCacheEntryImpl_565669dc extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.ProfileEJBBeanCacheEntry_565669dc {
	/**
	 * getNum_value
	 */
	public java.math.BigDecimal getNum_value() {
		return NUM_VALUE_Data;
	}
	/**
	 * setNum_value
	 */
	public void setNum_value(java.math.BigDecimal data) {
		if (data == null)
			this.NUM_VALUE_Data= null;
		else {
			this.NUM_VALUE_Data=data; }
	}
	/**
	 * setDataForNUM_VALUE
	 */
	public void setDataForNUM_VALUE(java.math.BigDecimal data) {
		this.NUM_VALUE_Data=data;
	}
	private java.math.BigDecimal NUM_VALUE_Data;
	/**
	 * getStr_value
	 */
	public java.lang.String getStr_value() {
		return STR_VALUE_Data;
	}
	/**
	 * setStr_value
	 */
	public void setStr_value(String data) {
		this.STR_VALUE_Data=data;
	}
	/**
	 * setDataForSTR_VALUE
	 */
	public void setDataForSTR_VALUE(String data) {
		this.STR_VALUE_Data=data;
	}
	private String STR_VALUE_Data;
	/**
	 * getDate_value
	 */
	public java.sql.Timestamp getDate_value() {
		return DATE_VALUE_Data;
	}
	/**
	 * setDate_value
	 */
	public void setDate_value(java.sql.Timestamp data) {
		if (data == null)
			this.DATE_VALUE_Data= null;
		else {
			this.DATE_VALUE_Data=data; }
	}
	/**
	 * setDataForDATE_VALUE
	 */
	public void setDataForDATE_VALUE(java.sql.Timestamp data) {
		this.DATE_VALUE_Data=data;
	}
	private java.sql.Timestamp DATE_VALUE_Data;
	/**
	 * getKey_type
	 */
	public java.lang.Integer getKey_type() {
		if(KEY_TYPE_IsNull)
			return null;
		else
			return new Integer(KEY_TYPE_Data);
	}
	/**
	 * setKey_type
	 */
	public void setKey_type(Integer data) {
		if (data == null)
			this.KEY_TYPE_IsNull= true;
		else {
			this.KEY_TYPE_IsNull= false;
			this.KEY_TYPE_Data=data.intValue(); }
	}
	/**
	 * setDataForKEY_TYPE
	 */
	public void setDataForKEY_TYPE(int data, boolean isNull) {
		this.KEY_TYPE_Data=data;
		this.KEY_TYPE_IsNull=isNull;
	}
	private int KEY_TYPE_Data;
	private boolean KEY_TYPE_IsNull = true;
	/**
	 * getModified
	 */
	public java.sql.Timestamp getModified() {
		return MODIFIED_Data;
	}
	/**
	 * setModified
	 */
	public void setModified(java.sql.Timestamp data) {
		if (data == null)
			this.MODIFIED_Data= null;
		else {
			this.MODIFIED_Data=data; }
	}
	/**
	 * setDataForMODIFIED
	 */
	public void setDataForMODIFIED(java.sql.Timestamp data) {
		this.MODIFIED_Data=data;
	}
	private java.sql.Timestamp MODIFIED_Data;
	/**
	 * getOperatorID
	 */
	public java.lang.Integer getOperatorID() {
		if(OPERATORID_IsNull)
			return null;
		else
			return new Integer(OPERATORID_Data);
	}
	/**
	 * setOperatorID
	 */
	public void setOperatorID(Integer data) {
		if (data == null)
			this.OPERATORID_IsNull= true;
		else {
			this.OPERATORID_IsNull= false;
			this.OPERATORID_Data=data.intValue(); }
	}
	/**
	 * setDataForOPERATORID
	 */
	public void setDataForOPERATORID(int data, boolean isNull) {
		this.OPERATORID_Data=data;
		this.OPERATORID_IsNull=isNull;
	}
	private int OPERATORID_Data;
	private boolean OPERATORID_IsNull = true;
	/**
	 * getKey
	 */
	public java.lang.String getKey() {
		return KEY_Data;
	}
	/**
	 * setKey
	 */
	public void setKey(String data) {
		this.KEY_Data=data;
	}
	/**
	 * setDataForKEY
	 */
	public void setDataForKEY(String data) {
		this.KEY_Data=data;
	}
	private String KEY_Data;
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
	 * getType
	 */
	public java.lang.Integer getType() {
		if(TYPE__IsNull)
			return null;
		else
			return new Integer(TYPE__Data);
	}
	/**
	 * setType
	 */
	public void setType(Integer data) {
		if (data == null)
			this.TYPE__IsNull= true;
		else {
			this.TYPE__IsNull= false;
			this.TYPE__Data=data.intValue(); }
	}
	/**
	 * setDataForTYPE_
	 */
	public void setDataForTYPE_(int data, boolean isNull) {
		this.TYPE__Data=data;
		this.TYPE__IsNull=isNull;
	}
	private int TYPE__Data;
	private boolean TYPE__IsNull = true;
}
