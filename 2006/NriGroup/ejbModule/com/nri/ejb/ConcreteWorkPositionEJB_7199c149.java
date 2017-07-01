package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.WorkPositionEJBBeanCacheEntry_7199c149;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.WorkPositionEJBBeanCacheEntryImpl_7199c149;

/**
 * Bean implementation class for Enterprise Bean: WorkPositionEJB
 */
public class ConcreteWorkPositionEJB_7199c149 extends com.nri.ejb.WorkPositionEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private WorkPositionEJBBeanCacheEntry_7199c149 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteWorkPositionEJB_7199c149
	 */
	public ConcreteWorkPositionEJB_7199c149() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.WorkPositionEJBBeanInjector_7199c149 getInjector() {
		return (com.nri.ejb.websphere_deploy.WorkPositionEJBBeanInjector_7199c149)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.WorkPositionEJBBeanCacheEntry_7199c149) inRecord;;
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
	public java.lang.Integer ejbFindByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException {
		return (java.lang.Integer)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((java.lang.Integer)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public java.lang.Integer ejbFindByPrimaryKeyForCMR_Local(java.lang.Integer pk) throws javax.ejb.FinderException {
		return (java.lang.Integer)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer workPosition) throws javax.ejb.CreateException {
		dataCacheEntry = new WorkPositionEJBBeanCacheEntryImpl_7199c149();
		 super.ejbCreate(workPosition);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer workPosition) throws javax.ejb.CreateException {
		super.ejbPostCreate(workPosition);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer workPosition, java.lang.String workPositionName, java.lang.Boolean isActive) throws javax.ejb.CreateException {
		dataCacheEntry = new WorkPositionEJBBeanCacheEntryImpl_7199c149();
		 super.ejbCreate(workPosition, workPositionName, isActive);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer workPosition, java.lang.String workPositionName, java.lang.Boolean isActive) throws javax.ejb.CreateException {
		super.ejbPostCreate(workPosition, workPositionName, isActive);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getWorkPosition();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 3;
	}
	/**
	 * Get accessor for persistent attribute: workPosition
	 */
	public java.lang.Integer getWorkPosition() {
		return dataCacheEntry.getWorkPosition();
	}
	/**
	 * Set accessor for persistent attribute: workPosition
	 */
	public void setWorkPosition(java.lang.Integer newWorkPosition) {
		instanceExtension.markDirty(0,getWorkPosition(),newWorkPosition);
		dataCacheEntry.setWorkPosition(newWorkPosition);
	}
	/**
	 * Get accessor for persistent attribute: name
	 */
	public java.lang.String getName() {
		return dataCacheEntry.getName();
	}
	/**
	 * Set accessor for persistent attribute: name
	 */
	public void setName(java.lang.String newName) {
		instanceExtension.markDirty(1,getName(),newName);
		dataCacheEntry.setName(newName);
	}
	/**
	 * Get accessor for persistent attribute: isActive
	 */
	public java.lang.Boolean getIsActive() {
		return dataCacheEntry.getIsActive();
	}
	/**
	 * Set accessor for persistent attribute: isActive
	 */
	public void setIsActive(java.lang.Boolean newIsActive) {
		instanceExtension.markDirty(2,getIsActive(),newIsActive);
		dataCacheEntry.setIsActive(newIsActive);
	}
}
