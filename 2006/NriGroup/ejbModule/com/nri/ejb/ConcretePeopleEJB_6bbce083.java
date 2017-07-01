package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.PeopleEJBBeanCacheEntry_6bbce083;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.PeopleEJBBeanCacheEntryImpl_6bbce083;

/**
 * Bean implementation class for Enterprise Bean: PeopleEJB
 */
public class ConcretePeopleEJB_6bbce083 extends com.nri.ejb.PeopleEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private PeopleEJBBeanCacheEntry_6bbce083 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcretePeopleEJB_6bbce083
	 */
	public ConcretePeopleEJB_6bbce083() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.PeopleEJBBeanInjector_6bbce083 getInjector() {
		return (com.nri.ejb.websphere_deploy.PeopleEJBBeanInjector_6bbce083)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.PeopleEJBBeanCacheEntry_6bbce083) inRecord;;
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
	public java.lang.Integer ejbCreate(java.lang.Integer man) throws javax.ejb.CreateException {
		dataCacheEntry = new PeopleEJBBeanCacheEntryImpl_6bbce083();
		 super.ejbCreate(man);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer man) throws javax.ejb.CreateException {
		super.ejbPostCreate(man);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer man, java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, java.lang.String passportSer, java.sql.Date passportDate, java.lang.String passportWhom, java.lang.Boolean isActive, java.lang.Integer tabNum) throws javax.ejb.CreateException {
		dataCacheEntry = new PeopleEJBBeanCacheEntryImpl_6bbce083();
		 super.ejbCreate(man, firstName, lastName, middleName, passportSer, passportDate, passportWhom, isActive, tabNum);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer man, java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, java.lang.String passportSer, java.sql.Date passportDate, java.lang.String passportWhom, java.lang.Boolean isActive, java.lang.Integer tabNum) throws javax.ejb.CreateException {
		super.ejbPostCreate(man, firstName, lastName, middleName, passportSer, passportDate, passportWhom, isActive, tabNum);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getMan();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 9;
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
		instanceExtension.markDirty(0,getMan(),newMan);
		dataCacheEntry.setMan(newMan);
	}
	/**
	 * Get accessor for persistent attribute: firstName
	 */
	public java.lang.String getFirstName() {
		return dataCacheEntry.getFirstName();
	}
	/**
	 * Set accessor for persistent attribute: firstName
	 */
	public void setFirstName(java.lang.String newFirstName) {
		instanceExtension.markDirty(1,getFirstName(),newFirstName);
		dataCacheEntry.setFirstName(newFirstName);
	}
	/**
	 * Get accessor for persistent attribute: lastName
	 */
	public java.lang.String getLastName() {
		return dataCacheEntry.getLastName();
	}
	/**
	 * Set accessor for persistent attribute: lastName
	 */
	public void setLastName(java.lang.String newLastName) {
		instanceExtension.markDirty(2,getLastName(),newLastName);
		dataCacheEntry.setLastName(newLastName);
	}
	/**
	 * Get accessor for persistent attribute: middleName
	 */
	public java.lang.String getMiddleName() {
		return dataCacheEntry.getMiddleName();
	}
	/**
	 * Set accessor for persistent attribute: middleName
	 */
	public void setMiddleName(java.lang.String newMiddleName) {
		instanceExtension.markDirty(3,getMiddleName(),newMiddleName);
		dataCacheEntry.setMiddleName(newMiddleName);
	}
	/**
	 * Get accessor for persistent attribute: passportSer
	 */
	public java.lang.String getPassportSer() {
		return dataCacheEntry.getPassportSer();
	}
	/**
	 * Set accessor for persistent attribute: passportSer
	 */
	public void setPassportSer(java.lang.String newPassportSer) {
		instanceExtension.markDirty(4,getPassportSer(),newPassportSer);
		dataCacheEntry.setPassportSer(newPassportSer);
	}
	/**
	 * Get accessor for persistent attribute: passportDate
	 */
	public java.sql.Date getPassportDate() {
		return dataCacheEntry.getPassportDate();
	}
	/**
	 * Set accessor for persistent attribute: passportDate
	 */
	public void setPassportDate(java.sql.Date newPassportDate) {
		instanceExtension.markDirty(5,getPassportDate(),newPassportDate);
		dataCacheEntry.setPassportDate(newPassportDate);
	}
	/**
	 * Get accessor for persistent attribute: passportWhom
	 */
	public java.lang.String getPassportWhom() {
		return dataCacheEntry.getPassportWhom();
	}
	/**
	 * Set accessor for persistent attribute: passportWhom
	 */
	public void setPassportWhom(java.lang.String newPassportWhom) {
		instanceExtension.markDirty(6,getPassportWhom(),newPassportWhom);
		dataCacheEntry.setPassportWhom(newPassportWhom);
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
	/**
	 * Get accessor for persistent attribute: tabNum
	 */
	public java.lang.Integer getTabNum() {
		return dataCacheEntry.getTabNum();
	}
	/**
	 * Set accessor for persistent attribute: tabNum
	 */
	public void setTabNum(java.lang.Integer newTabNum) {
		instanceExtension.markDirty(8,getTabNum(),newTabNum);
		dataCacheEntry.setTabNum(newTabNum);
	}
}
