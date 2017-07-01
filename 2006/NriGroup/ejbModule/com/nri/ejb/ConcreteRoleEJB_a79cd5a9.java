package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.RoleEJBBeanCacheEntry_a79cd5a9;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.RoleEJBBeanCacheEntryImpl_a79cd5a9;

/**
 * Bean implementation class for Enterprise Bean: RoleEJB
 */
public class ConcreteRoleEJB_a79cd5a9 extends com.nri.ejb.RoleEJBBean implements javax.ejb.EntityBean, ConcreteBean {
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
		instanceExtension.setEntityContext(ctx);
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		super.unsetEntityContext();
		instanceExtension.unsetEntityContext();
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
			super.ejbActivate();
			instanceExtension.ejbActivate();
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		instanceExtension.ejbLoad();
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
		super.ejbPassivate();
		instanceExtension.ejbPassivate();
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		super.ejbRemove();
		instanceExtension.ejbRemove();
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		super.ejbStore();
		instanceExtension.ejbStore();
	}
	private ConcreteBeanInstanceExtension instanceExtension;
	private RoleEJBBeanCacheEntry_a79cd5a9 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteRoleEJB_a79cd5a9
	 */
	public ConcreteRoleEJB_a79cd5a9() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.RoleEJBBeanInjector_a79cd5a9 getInjector() {
		return (com.nri.ejb.websphere_deploy.RoleEJBBeanInjector_a79cd5a9)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.RoleEJBBeanCacheEntry_a79cd5a9) inRecord;;
		super.ejbLoad();
	}
	/**
	 * resetCMP
	 */
	public void resetCMP() {
			dataCacheEntry = null;
	}
	/**
	 * resetCMR
	 */
	public void resetCMR() {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public java.lang.String ejbFindByPrimaryKey(java.lang.String primaryKey) throws javax.ejb.FinderException {
		return (java.lang.String)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindAll_Local
	 */
	public java.util.Collection ejbFindAll_Local() throws javax.ejb.FinderException {
		return (java.util.Collection) instanceExtension.executeFind("FindAll", null);
	}
	/**
	 * ejbFindByRoleName_Local
	 */
	public java.util.Collection ejbFindByRoleName_Local(java.lang.String name) throws javax.ejb.FinderException {
		javax.resource.cci.IndexedRecord record = instanceExtension.getInputRecord("FindByRoleName");
		getInjector().ejbFindByRoleName(name, record);
		return (java.util.Collection) instanceExtension.executeFind("FindByRoleName", record);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((java.lang.String)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public java.lang.String ejbFindByPrimaryKeyForCMR_Local(java.lang.String pk) throws javax.ejb.FinderException {
		return (java.lang.String)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public java.lang.String ejbCreate(java.lang.String role) throws javax.ejb.CreateException {
		dataCacheEntry = new RoleEJBBeanCacheEntryImpl_a79cd5a9();
		 super.ejbCreate(role);
		return (java.lang.String)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String role) throws javax.ejb.CreateException {
		super.ejbPostCreate(role);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * ejbCreate
	 */
	public java.lang.String ejbCreate(java.lang.String role, java.lang.String roleName, java.lang.String comment, java.lang.Integer sortOrder, java.lang.String taskComment) throws javax.ejb.CreateException {
		dataCacheEntry = new RoleEJBBeanCacheEntryImpl_a79cd5a9();
		 super.ejbCreate(role, roleName, comment, sortOrder, taskComment);
		return (java.lang.String)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String role, java.lang.String roleName, java.lang.String comment, java.lang.Integer sortOrder, java.lang.String taskComment) throws javax.ejb.CreateException {
		super.ejbPostCreate(role, roleName, comment, sortOrder, taskComment);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getRole();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 5;
	}
	/**
	 * Get accessor for persistent attribute: role
	 */
	public java.lang.String getRole() {
		return dataCacheEntry.getRole();
	}
	/**
	 * Set accessor for persistent attribute: role
	 */
	public void setRole(java.lang.String newRole) {
		instanceExtension.markDirty(0,getRole(),newRole);
		dataCacheEntry.setRole(newRole);
	}
	/**
	 * Get accessor for persistent attribute: roleName
	 */
	public java.lang.String getRoleName() {
		return dataCacheEntry.getRoleName();
	}
	/**
	 * Set accessor for persistent attribute: roleName
	 */
	public void setRoleName(java.lang.String newRoleName) {
		instanceExtension.markDirty(1,getRoleName(),newRoleName);
		dataCacheEntry.setRoleName(newRoleName);
	}
	/**
	 * Get accessor for persistent attribute: comment
	 */
	public java.lang.String getComment() {
		return dataCacheEntry.getComment();
	}
	/**
	 * Set accessor for persistent attribute: comment
	 */
	public void setComment(java.lang.String newComment) {
		instanceExtension.markDirty(2,getComment(),newComment);
		dataCacheEntry.setComment(newComment);
	}
	/**
	 * Get accessor for persistent attribute: sortOrder
	 */
	public java.lang.Integer getSortOrder() {
		return dataCacheEntry.getSortOrder();
	}
	/**
	 * Set accessor for persistent attribute: sortOrder
	 */
	public void setSortOrder(java.lang.Integer newSortOrder) {
		instanceExtension.markDirty(3,getSortOrder(),newSortOrder);
		dataCacheEntry.setSortOrder(newSortOrder);
	}
	/**
	 * Get accessor for persistent attribute: taskComment
	 */
	public java.lang.String getTaskComment() {
		return dataCacheEntry.getTaskComment();
	}
	/**
	 * Set accessor for persistent attribute: taskComment
	 */
	public void setTaskComment(java.lang.String newTaskComment) {
		instanceExtension.markDirty(4,getTaskComment(),newTaskComment);
		dataCacheEntry.setTaskComment(newTaskComment);
	}
}
