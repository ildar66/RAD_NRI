package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * ProfileEJBBeanCacheEntryImpl_565669dc
 */
public class ProfileEJBBeanCacheEntryImpl_565669dc extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.ProfileEJBBeanCacheEntry_565669dc {
	/**
	 * getOperatorID
	 */
	public java.lang.Integer getOperatorID() {
		if(operatorid_IsNull)
			return null;
		else
			return new Integer(operatorid_Data);
	}
	/**
	 * setOperatorID
	 */
	public void setOperatorID(Integer data) {
		if (data == null)
			this.operatorid_IsNull= true;
		else {
			this.operatorid_IsNull= false;
			this.operatorid_Data=data.intValue(); }
	}
	/**
	 * setDataForoperatorid
	 */
	public void setDataForoperatorid(int data, boolean isNull) {
		this.operatorid_Data=data;
		this.operatorid_IsNull=isNull;
	}
	private int operatorid_Data;
	private boolean operatorid_IsNull = true;
	/**
	 * getKey
	 */
	public java.lang.String getKey() {
		return key_Data;
	}
	/**
	 * setKey
	 */
	public void setKey(String data) {
		this.key_Data=data;
	}
	/**
	 * setDataForkey
	 */
	public void setDataForkey(String data) {
		this.key_Data=data;
	}
	private String key_Data;
	/**
	 * getName
	 */
	public java.lang.String getName() {
		return name_Data;
	}
	/**
	 * setName
	 */
	public void setName(String data) {
		this.name_Data=data;
	}
	/**
	 * setDataForname
	 */
	public void setDataForname(String data) {
		this.name_Data=data;
	}
	private String name_Data;
	/**
	 * getType
	 */
	public java.lang.Integer getType() {
		if(type_IsNull)
			return null;
		else
			return new Integer(type_Data);
	}
	/**
	 * setType
	 */
	public void setType(Integer data) {
		if (data == null)
			this.type_IsNull= true;
		else {
			this.type_IsNull= false;
			this.type_Data=data.intValue(); }
	}
	/**
	 * setDataFortype
	 */
	public void setDataFortype(int data, boolean isNull) {
		this.type_Data=data;
		this.type_IsNull=isNull;
	}
	private int type_Data;
	private boolean type_IsNull = true;
	/**
	 * getNum_value
	 */
	public java.math.BigDecimal getNum_value() {
		return num_value_Data;
	}
	/**
	 * setNum_value
	 */
	public void setNum_value(java.math.BigDecimal data) {
		if (data == null)
			this.num_value_Data= null;
		else {
			this.num_value_Data=data; }
	}
	/**
	 * setDataFornum_value
	 */
	public void setDataFornum_value(java.math.BigDecimal data) {
		this.num_value_Data=data;
	}
	private java.math.BigDecimal num_value_Data;
	/**
	 * getStr_value
	 */
	public java.lang.String getStr_value() {
		return str_value_Data;
	}
	/**
	 * setStr_value
	 */
	public void setStr_value(String data) {
		this.str_value_Data=data;
	}
	/**
	 * setDataForstr_value
	 */
	public void setDataForstr_value(String data) {
		this.str_value_Data=data;
	}
	private String str_value_Data;
	/**
	 * getDate_value
	 */
	public java.sql.Timestamp getDate_value() {
		return date_value_Data;
	}
	/**
	 * setDate_value
	 */
	public void setDate_value(java.sql.Timestamp data) {
		if (data == null)
			this.date_value_Data= null;
		else {
			this.date_value_Data=data; }
	}
	/**
	 * setDataFordate_value
	 */
	public void setDataFordate_value(java.sql.Timestamp data) {
		this.date_value_Data=data;
	}
	private java.sql.Timestamp date_value_Data;
	/**
	 * getKey_type
	 */
	public java.lang.Integer getKey_type() {
		if(key_type_IsNull)
			return null;
		else
			return new Integer(key_type_Data);
	}
	/**
	 * setKey_type
	 */
	public void setKey_type(Integer data) {
		if (data == null)
			this.key_type_IsNull= true;
		else {
			this.key_type_IsNull= false;
			this.key_type_Data=data.intValue(); }
	}
	/**
	 * setDataForkey_type
	 */
	public void setDataForkey_type(int data, boolean isNull) {
		this.key_type_Data=data;
		this.key_type_IsNull=isNull;
	}
	private int key_type_Data;
	private boolean key_type_IsNull = true;
	/**
	 * getModified
	 */
	public java.sql.Timestamp getModified() {
		return modified_Data;
	}
	/**
	 * setModified
	 */
	public void setModified(java.sql.Timestamp data) {
		if (data == null)
			this.modified_Data= null;
		else {
			this.modified_Data=data; }
	}
	/**
	 * setDataFormodified
	 */
	public void setDataFormodified(java.sql.Timestamp data) {
		this.modified_Data=data;
	}
	private java.sql.Timestamp modified_Data;
}
