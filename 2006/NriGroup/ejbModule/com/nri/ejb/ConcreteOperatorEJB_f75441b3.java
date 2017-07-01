package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.OperatorEJBBeanCacheEntry_f75441b3;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.OperatorEJBBeanCacheEntryImpl_f75441b3;

/**
 * Bean implementation class for Enterprise Bean: OperatorEJB
 */
public class ConcreteOperatorEJB_f75441b3 extends com.nri.ejb.OperatorEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private OperatorEJBBeanCacheEntry_f75441b3 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteOperatorEJB_f75441b3
	 */
	public ConcreteOperatorEJB_f75441b3() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.OperatorEJBBeanInjector_f75441b3 getInjector() {
		return (com.nri.ejb.websphere_deploy.OperatorEJBBeanInjector_f75441b3)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.OperatorEJBBeanCacheEntry_f75441b3) inRecord;;
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
	public java.lang.Integer ejbCreate(java.lang.Integer operator) throws javax.ejb.CreateException {
		dataCacheEntry = new OperatorEJBBeanCacheEntryImpl_f75441b3();
		 super.ejbCreate(operator);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer operator) throws javax.ejb.CreateException {
		super.ejbPostCreate(operator);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer operator, java.lang.Integer man, java.lang.String loginID, java.lang.String password, java.lang.Boolean isEnabled) throws javax.ejb.CreateException {
		dataCacheEntry = new OperatorEJBBeanCacheEntryImpl_f75441b3();
		 super.ejbCreate(operator, man, loginID, password, isEnabled);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer operator, java.lang.Integer man, java.lang.String loginID, java.lang.String password, java.lang.Boolean isEnabled) throws javax.ejb.CreateException {
		super.ejbPostCreate(operator, man, loginID, password, isEnabled);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getOperator();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 6;
	}
	/**
	 * Get accessor for persistent attribute: operator
	 */
	public java.lang.Integer getOperator() {
		return dataCacheEntry.getOperator();
	}
	/**
	 * Set accessor for persistent attribute: operator
	 */
	public void setOperator(java.lang.Integer newOperator) {
		instanceExtension.markDirty(0,getOperator(),newOperator);
		dataCacheEntry.setOperator(newOperator);
	}
	/**
	 * Get accessor for persistent attribute: man
	 */
	public java.lang.Integer getMan() {
		return dataCacheEntry.getMan();
	}
	/**
	 * Set accessor for persistent attribute: man
	 */
	public void setMan(java.lang.Integer newMan) {
		instanceExtension.markDirty(1,getMan(),newMan);
		dataCacheEntry.setMan(newMan);
	}
	/**
	 * Get accessor for persistent attribute: loginID
	 */
	public java.lang.String getLoginID() {
		return dataCacheEntry.getLoginID();
	}
	/**
	 * Set accessor for persistent attribute: loginID
	 */
	public void setLoginID(java.lang.String newLoginID) {
		instanceExtension.markDirty(2,getLoginID(),newLoginID);
		dataCacheEntry.setLoginID(newLoginID);
	}
	/**
	 * Get accessor for persistent attribute: password
	 */
	public java.lang.String getPassword() {
		return dataCacheEntry.getPassword();
	}
	/**
	 * Set accessor for persistent attribute: password
	 */
	public void setPassword(java.lang.String newPassword) {
		instanceExtension.markDirty(3,getPassword(),newPassword);
		dataCacheEntry.setPassword(newPassword);
	}
	/**
	 * Get accessor for persistent attribute: isEnabled
	 */
	public java.lang.Boolean getIsEnabled() {
		return dataCacheEntry.getIsEnabled();
	}
	/**
	 * Set accessor for persistent attribute: isEnabled
	 */
	public void setIsEnabled(java.lang.Boolean newIsEnabled) {
		instanceExtension.markDirty(4,getIsEnabled(),newIsEnabled);
		dataCacheEntry.setIsEnabled(newIsEnabled);
	}
	/**
	 * Get accessor for persistent attribute: msuCode
	 */
	public java.lang.Integer getMsuCode() {
		return dataCacheEntry.getMsuCode();
	}
	/**
	 * Set accessor for persistent attribute: msuCode
	 */
	public void setMsuCode(java.lang.Integer newMsuCode) {
		instanceExtension.markDirty(5,getMsuCode(),newMsuCode);
		dataCacheEntry.setMsuCode(newMsuCode);
	}
}
