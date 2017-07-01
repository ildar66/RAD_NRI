package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.DivisionEJBBeanCacheEntry_7c74fa89;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanCacheEntryImpl_7c74fa89;

/**
 * Bean implementation class for Enterprise Bean: DivisionEJB
 */
public class ConcreteDivisionEJB_7c74fa89 extends com.nri.ejb.DivisionEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private DivisionEJBBeanCacheEntry_7c74fa89 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteDivisionEJB_7c74fa89
	 */
	public ConcreteDivisionEJB_7c74fa89() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.DivisionEJBBeanInjector_7c74fa89 getInjector() {
		return (com.nri.ejb.websphere_deploy.DivisionEJBBeanInjector_7c74fa89)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.DivisionEJBBeanCacheEntry_7c74fa89) inRecord;;
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
	public java.lang.Integer ejbCreate(java.lang.Integer division) throws javax.ejb.CreateException {
		dataCacheEntry = new DivisionEJBBeanCacheEntryImpl_7c74fa89();
		 super.ejbCreate(division);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer division) throws javax.ejb.CreateException {
		super.ejbPostCreate(division);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer division, java.lang.String type, java.lang.Integer encloser, java.lang.String name, java.lang.String shortName, java.lang.Integer boss, java.lang.Integer company, java.lang.Boolean isActive) throws javax.ejb.CreateException {
		dataCacheEntry = new DivisionEJBBeanCacheEntryImpl_7c74fa89();
		 super.ejbCreate(division, type, encloser, name, shortName, boss, company, isActive);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer division, java.lang.String type, java.lang.Integer encloser, java.lang.String name, java.lang.String shortName, java.lang.Integer boss, java.lang.Integer company, java.lang.Boolean isActive) throws javax.ejb.CreateException {
		super.ejbPostCreate(division, type, encloser, name, shortName, boss, company, isActive);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getDivision();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 8;
	}
	/**
	 * Get accessor for persistent attribute: division
	 */
	public java.lang.Integer getDivision() {
		return dataCacheEntry.getDivision();
	}
	/**
	 * Set accessor for persistent attribute: division
	 */
	public void setDivision(java.lang.Integer newDivision) {
		instanceExtension.markDirty(0,getDivision(),newDivision);
		dataCacheEntry.setDivision(newDivision);
	}
	/**
	 * Get accessor for persistent attribute: type
	 */
	public java.lang.String getType() {
		return dataCacheEntry.getType();
	}
	/**
	 * Set accessor for persistent attribute: type
	 */
	public void setType(java.lang.String newType) {
		instanceExtension.markDirty(1,getType(),newType);
		dataCacheEntry.setType(newType);
	}
	/**
	 * Get accessor for persistent attribute: encloser
	 */
	public java.lang.Integer getEncloser() {
		return dataCacheEntry.getEncloser();
	}
	/**
	 * Set accessor for persistent attribute: encloser
	 */
	public void setEncloser(java.lang.Integer newEncloser) {
		instanceExtension.markDirty(2,getEncloser(),newEncloser);
		dataCacheEntry.setEncloser(newEncloser);
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
		instanceExtension.markDirty(3,getName(),newName);
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
		instanceExtension.markDirty(4,getShortName(),newShortName);
		dataCacheEntry.setShortName(newShortName);
	}
	/**
	 * Get accessor for persistent attribute: boss
	 */
	public java.lang.Integer getBoss() {
		return dataCacheEntry.getBoss();
	}
	/**
	 * Set accessor for persistent attribute: boss
	 */
	public void setBoss(java.lang.Integer newBoss) {
		instanceExtension.markDirty(5,getBoss(),newBoss);
		dataCacheEntry.setBoss(newBoss);
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
		instanceExtension.markDirty(6,getCompany(),newCompany);
		dataCacheEntry.setCompany(newCompany);
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
		instanceExtension.markDirty(7,getIsActive(),newIsActive);
		dataCacheEntry.setIsActive(newIsActive);
	}
}
