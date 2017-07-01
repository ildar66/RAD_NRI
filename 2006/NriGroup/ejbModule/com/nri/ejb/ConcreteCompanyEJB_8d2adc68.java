package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.CompanyEJBBeanCacheEntry_8d2adc68;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.CompanyEJBBeanCacheEntryImpl_8d2adc68;

/**
 * Bean implementation class for Enterprise Bean: CompanyEJB
 */
public class ConcreteCompanyEJB_8d2adc68 extends com.nri.ejb.CompanyEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private CompanyEJBBeanCacheEntry_8d2adc68 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteCompanyEJB_8d2adc68
	 */
	public ConcreteCompanyEJB_8d2adc68() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.CompanyEJBBeanInjector_8d2adc68 getInjector() {
		return (com.nri.ejb.websphere_deploy.CompanyEJBBeanInjector_8d2adc68)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.CompanyEJBBeanCacheEntry_8d2adc68) inRecord;;
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
	 * ejbFindAll_Local
	 */
	public java.util.Collection ejbFindAll_Local() throws javax.ejb.FinderException {
		return (java.util.Collection) instanceExtension.executeFind("FindAll", null);
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
	public java.lang.Integer ejbCreate(java.lang.Integer company) throws javax.ejb.CreateException {
		dataCacheEntry = new CompanyEJBBeanCacheEntryImpl_8d2adc68();
		 super.ejbCreate(company);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer company) throws javax.ejb.CreateException {
		super.ejbPostCreate(company);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer company, java.lang.String name, java.lang.String shortName) throws javax.ejb.CreateException {
		dataCacheEntry = new CompanyEJBBeanCacheEntryImpl_8d2adc68();
		 super.ejbCreate(company, name, shortName);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer company, java.lang.String name, java.lang.String shortName) throws javax.ejb.CreateException {
		super.ejbPostCreate(company, name, shortName);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getCompany();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 3;
	}
	/**
	 * Get accessor for persistent attribute: company
	 */
	public java.lang.Integer getCompany() {
		return dataCacheEntry.getCompany();
	}
	/**
	 * Set accessor for persistent attribute: company
	 */
	public void setCompany(java.lang.Integer newCompany) {
		instanceExtension.markDirty(0,getCompany(),newCompany);
		dataCacheEntry.setCompany(newCompany);
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
	 * Get accessor for persistent attribute: shortName
	 */
	public java.lang.String getShortName() {
		return dataCacheEntry.getShortName();
	}
	/**
	 * Set accessor for persistent attribute: shortName
	 */
	public void setShortName(java.lang.String newShortName) {
		instanceExtension.markDirty(2,getShortName(),newShortName);
		dataCacheEntry.setShortName(newShortName);
	}
}
