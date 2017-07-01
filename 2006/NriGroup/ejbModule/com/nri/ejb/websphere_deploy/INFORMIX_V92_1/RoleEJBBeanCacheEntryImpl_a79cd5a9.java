package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * RoleEJBBeanCacheEntryImpl_a79cd5a9
 */
public class RoleEJBBeanCacheEntryImpl_a79cd5a9 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.RoleEJBBeanCacheEntry_a79cd5a9 {
	/**
	 * getRole
	 */
	public java.lang.String getRole() {
		java.lang.String tempData_role;
		tempData_role =role_Data;
		Object tempConvertedObject_role = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_role);
		return (tempConvertedObject_role == null) ? null : (java.lang.String) tempConvertedObject_role;
	}
	/**
	 * setRole
	 */
	public void setRole(java.lang.String data) {
		this.role_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForrole
	 */
	public void setDataForrole(String data) {
		this.role_Data=data;
	}
	private String role_Data;
	/**
	 * getRoleName
	 */
	public java.lang.String getRoleName() {
		return rolename_Data;
	}
	/**
	 * setRoleName
	 */
	public void setRoleName(String data) {
		this.rolename_Data=data;
	}
	/**
	 * setDataForrolename
	 */
	public void setDataForrolename(String data) {
		this.rolename_Data=data;
	}
	private String rolename_Data;
	/**
	 * getComment
	 */
	public java.lang.String getComment() {
		return comment_Data;
	}
	/**
	 * setComment
	 */
	public void setComment(String data) {
		this.comment_Data=data;
	}
	/**
	 * setDataForcomment
	 */
	public void setDataForcomment(String data) {
		this.comment_Data=data;
	}
	private String comment_Data;
	/**
	 * getSortOrder
	 */
	public java.lang.Integer getSortOrder() {
		if(sortorder_IsNull)
			return null;
		else
			return new Integer(sortorder_Data);
	}
	/**
	 * setSortOrder
	 */
	public void setSortOrder(Integer data) {
		if (data == null)
			this.sortorder_IsNull= true;
		else {
			this.sortorder_IsNull= false;
			this.sortorder_Data=data.intValue(); }
	}
	/**
	 * setDataForsortorder
	 */
	public void setDataForsortorder(int data, boolean isNull) {
		this.sortorder_Data=data;
		this.sortorder_IsNull=isNull;
	}
	private int sortorder_Data;
	private boolean sortorder_IsNull = true;
	/**
	 * getTaskComment
	 */
	public java.lang.String getTaskComment() {
		return taskcomment_Data;
	}
	/**
	 * setTaskComment
	 */
	public void setTaskComment(String data) {
		this.taskcomment_Data=data;
	}
	/**
	 * setDataFortaskcomment
	 */
	public void setDataFortaskcomment(String data) {
		this.taskcomment_Data=data;
	}
	private String taskcomment_Data;
}
