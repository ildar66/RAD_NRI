package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.MsUserEJBBeanCacheEntry_da8ec80c;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.MsUserEJBBeanCacheEntryImpl_da8ec80c;

/**
 * Bean implementation class for Enterprise Bean: MsUserEJB
 */
public class ConcreteMsUserEJB_da8ec80c extends com.nri.ejb.MsUserEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private MsUserEJBBeanCacheEntry_da8ec80c dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteMsUserEJB_da8ec80c
	 */
	public ConcreteMsUserEJB_da8ec80c() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.MsUserEJBBeanInjector_da8ec80c getInjector() {
		return (com.nri.ejb.websphere_deploy.MsUserEJBBeanInjector_da8ec80c)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.MsUserEJBBeanCacheEntry_da8ec80c) inRecord;;
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
	public java.lang.Integer ejbCreate(java.lang.Integer msuCode) throws javax.ejb.CreateException {
		dataCacheEntry = new MsUserEJBBeanCacheEntryImpl_da8ec80c();
		 super.ejbCreate(msuCode);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer msuCode) throws javax.ejb.CreateException {
		super.ejbPostCreate(msuCode);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer msuCode, java.lang.String msUser, java.lang.String msPassword) throws javax.ejb.CreateException {
		dataCacheEntry = new MsUserEJBBeanCacheEntryImpl_da8ec80c();
		 super.ejbCreate(msuCode, msUser, msPassword);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer msuCode, java.lang.String msUser, java.lang.String msPassword) throws javax.ejb.CreateException {
		super.ejbPostCreate(msuCode, msUser, msPassword);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getMsuCode();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 3;
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
		instanceExtension.markDirty(0,getMsuCode(),newMsuCode);
		dataCacheEntry.setMsuCode(newMsuCode);
	}
	/**
	 * Get accessor for persistent attribute: msUser
	 */
	public java.lang.String getMsUser() {
		return dataCacheEntry.getMsUser();
	}
	/**
	 * Set accessor for persistent attribute: msUser
	 */
	public void setMsUser(java.lang.String newMsUser) {
		instanceExtension.markDirty(1,getMsUser(),newMsUser);
		dataCacheEntry.setMsUser(newMsUser);
	}
	/**
	 * Get accessor for persistent attribute: msPassword
	 */
	public java.lang.String getMsPassword() {
		return dataCacheEntry.getMsPassword();
	}
	/**
	 * Set accessor for persistent attribute: msPassword
	 */
	public void setMsPassword(java.lang.String newMsPassword) {
		instanceExtension.markDirty(2,getMsPassword(),newMsPassword);
		dataCacheEntry.setMsPassword(newMsPassword);
	}
}
