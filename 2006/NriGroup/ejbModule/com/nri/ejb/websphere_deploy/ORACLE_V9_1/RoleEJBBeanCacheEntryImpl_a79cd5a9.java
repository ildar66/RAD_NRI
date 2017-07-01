package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * RoleEJBBeanCacheEntryImpl_a79cd5a9
 */
public class RoleEJBBeanCacheEntryImpl_a79cd5a9 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.RoleEJBBeanCacheEntry_a79cd5a9 {
	/**
	 * getRoleName
	 */
	public java.lang.String getRoleName() {
		return ROLENAME_Data;
	}
	/**
	 * setRoleName
	 */
	public void setRoleName(String data) {
		this.ROLENAME_Data=data;
	}
	/**
	 * setDataForROLENAME
	 */
	public void setDataForROLENAME(String data) {
		this.ROLENAME_Data=data;
	}
	private String ROLENAME_Data;
	/**
	 * getComment
	 */
	public java.lang.String getComment() {
		return COMMENT__Data;
	}
	/**
	 * setComment
	 */
	public void setComment(String data) {
		this.COMMENT__Data=data;
	}
	/**
	 * setDataForCOMMENT_
	 */
	public void setDataForCOMMENT_(String data) {
		this.COMMENT__Data=data;
	}
	private String COMMENT__Data;
	/**
	 * getSortOrder
	 */
	public java.lang.Integer getSortOrder() {
		if(SORTORDER_IsNull)
			return null;
		else
			return new Integer(SORTORDER_Data);
	}
	/**
	 * setSortOrder
	 */
	public void setSortOrder(Integer data) {
		if (data == null)
			this.SORTORDER_IsNull= true;
		else {
			this.SORTORDER_IsNull= false;
			this.SORTORDER_Data=data.intValue(); }
	}
	/**
	 * setDataForSORTORDER
	 */
	public void setDataForSORTORDER(int data, boolean isNull) {
		this.SORTORDER_Data=data;
		this.SORTORDER_IsNull=isNull;
	}
	private int SORTORDER_Data;
	private boolean SORTORDER_IsNull = true;
	/**
	 * getTaskComment
	 */
	public java.lang.String getTaskComment() {
		return TASKCOMMENT_Data;
	}
	/**
	 * setTaskComment
	 */
	public void setTaskComment(String data) {
		this.TASKCOMMENT_Data=data;
	}
	/**
	 * setDataForTASKCOMMENT
	 */
	public void setDataForTASKCOMMENT(String data) {
		this.TASKCOMMENT_Data=data;
	}
	private String TASKCOMMENT_Data;
	/**
	 * getRole
	 */
	public java.lang.String getRole() {
		return ROLE_Data;
	}
	/**
	 * setRole
	 */
	public void setRole(String data) {
		this.ROLE_Data=data;
	}
	/**
	 * setDataForROLE
	 */
	public void setDataForROLE(String data) {
		this.ROLE_Data=data;
	}
	private String ROLE_Data;
}
