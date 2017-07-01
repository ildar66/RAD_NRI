package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.WorkerEJBBeanCacheEntry_7ee08407;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.WorkerEJBBeanCacheEntryImpl_7ee08407;

/**
 * Bean implementation class for Enterprise Bean: WorkerEJB
 */
public class ConcreteWorkerEJB_7ee08407 extends com.nri.ejb.WorkerEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private WorkerEJBBeanCacheEntry_7ee08407 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteWorkerEJB_7ee08407
	 */
	public ConcreteWorkerEJB_7ee08407() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.WorkerEJBBeanInjector_7ee08407 getInjector() {
		return (com.nri.ejb.websphere_deploy.WorkerEJBBeanInjector_7ee08407)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.WorkerEJBBeanCacheEntry_7ee08407) inRecord;;
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
	public java.lang.Integer ejbCreate(java.lang.Integer worker) throws javax.ejb.CreateException {
		dataCacheEntry = new WorkerEJBBeanCacheEntryImpl_7ee08407();
		 super.ejbCreate(worker);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer worker) throws javax.ejb.CreateException {
		super.ejbPostCreate(worker);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer worker, java.lang.Integer man, java.lang.Integer workPosition, java.lang.Boolean isOur, java.lang.Boolean isServiceStuff) throws javax.ejb.CreateException {
		dataCacheEntry = new WorkerEJBBeanCacheEntryImpl_7ee08407();
		 super.ejbCreate(worker, man, workPosition, isOur, isServiceStuff);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer worker, java.lang.Integer man, java.lang.Integer workPosition, java.lang.Boolean isOur, java.lang.Boolean isServiceStuff) throws javax.ejb.CreateException {
		super.ejbPostCreate(worker, man, workPosition, isOur, isServiceStuff);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getWorker();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 16;
	}
	/**
	 * Get accessor for persistent attribute: worker
	 */
	public java.lang.Integer getWorker() {
		return dataCacheEntry.getWorker();
	}
	/**
	 * Set accessor for persistent attribute: worker
	 */
	public void setWorker(java.lang.Integer newWorker) {
		instanceExtension.markDirty(0,getWorker(),newWorker);
		dataCacheEntry.setWorker(newWorker);
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
		instanceExtension.markDirty(1,getCompany(),newCompany);
		dataCacheEntry.setCompany(newCompany);
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
		instanceExtension.markDirty(2,getMan(),newMan);
		dataCacheEntry.setMan(newMan);
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
		instanceExtension.markDirty(3,getWorkPosition(),newWorkPosition);
		dataCacheEntry.setWorkPosition(newWorkPosition);
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
		instanceExtension.markDirty(4,getDivision(),newDivision);
		dataCacheEntry.setDivision(newDivision);
	}
	/**
	 * Get accessor for persistent attribute: lotusAddress
	 */
	public java.lang.String getLotusAddress() {
		return dataCacheEntry.getLotusAddress();
	}
	/**
	 * Set accessor for persistent attribute: lotusAddress
	 */
	public void setLotusAddress(java.lang.String newLotusAddress) {
		instanceExtension.markDirty(5,getLotusAddress(),newLotusAddress);
		dataCacheEntry.setLotusAddress(newLotusAddress);
	}
	/**
	 * Get accessor for persistent attribute: email
	 */
	public java.lang.String getEmail() {
		return dataCacheEntry.getEmail();
	}
	/**
	 * Set accessor for persistent attribute: email
	 */
	public void setEmail(java.lang.String newEmail) {
		instanceExtension.markDirty(6,getEmail(),newEmail);
		dataCacheEntry.setEmail(newEmail);
	}
	/**
	 * Get accessor for persistent attribute: phone1
	 */
	public java.lang.String getPhone1() {
		return dataCacheEntry.getPhone1();
	}
	/**
	 * Set accessor for persistent attribute: phone1
	 */
	public void setPhone1(java.lang.String newPhone1) {
		instanceExtension.markDirty(7,getPhone1(),newPhone1);
		dataCacheEntry.setPhone1(newPhone1);
	}
	/**
	 * Get accessor for persistent attribute: phone2
	 */
	public java.lang.String getPhone2() {
		return dataCacheEntry.getPhone2();
	}
	/**
	 * Set accessor for persistent attribute: phone2
	 */
	public void setPhone2(java.lang.String newPhone2) {
		instanceExtension.markDirty(8,getPhone2(),newPhone2);
		dataCacheEntry.setPhone2(newPhone2);
	}
	/**
	 * Get accessor for persistent attribute: localPhone
	 */
	public java.lang.String getLocalPhone() {
		return dataCacheEntry.getLocalPhone();
	}
	/**
	 * Set accessor for persistent attribute: localPhone
	 */
	public void setLocalPhone(java.lang.String newLocalPhone) {
		instanceExtension.markDirty(9,getLocalPhone(),newLocalPhone);
		dataCacheEntry.setLocalPhone(newLocalPhone);
	}
	/**
	 * Get accessor for persistent attribute: fax
	 */
	public java.lang.String getFax() {
		return dataCacheEntry.getFax();
	}
	/**
	 * Set accessor for persistent attribute: fax
	 */
	public void setFax(java.lang.String newFax) {
		instanceExtension.markDirty(10,getFax(),newFax);
		dataCacheEntry.setFax(newFax);
	}
	/**
	 * Get accessor for persistent attribute: mobilePhone
	 */
	public java.lang.String getMobilePhone() {
		return dataCacheEntry.getMobilePhone();
	}
	/**
	 * Set accessor for persistent attribute: mobilePhone
	 */
	public void setMobilePhone(java.lang.String newMobilePhone) {
		instanceExtension.markDirty(11,getMobilePhone(),newMobilePhone);
		dataCacheEntry.setMobilePhone(newMobilePhone);
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
		instanceExtension.markDirty(12,getIsActive(),newIsActive);
		dataCacheEntry.setIsActive(newIsActive);
	}
	/**
	 * Get accessor for persistent attribute: isOur
	 */
	public java.lang.Boolean getIsOur() {
		return dataCacheEntry.getIsOur();
	}
	/**
	 * Set accessor for persistent attribute: isOur
	 */
	public void setIsOur(java.lang.Boolean newIsOur) {
		instanceExtension.markDirty(13,getIsOur(),newIsOur);
		dataCacheEntry.setIsOur(newIsOur);
	}
	/**
	 * Get accessor for persistent attribute: organization
	 */
	public java.lang.Integer getOrganization() {
		return dataCacheEntry.getOrganization();
	}
	/**
	 * Set accessor for persistent attribute: organization
	 */
	public void setOrganization(java.lang.Integer newOrganization) {
		instanceExtension.markDirty(14,getOrganization(),newOrganization);
		dataCacheEntry.setOrganization(newOrganization);
	}
	/**
	 * Get accessor for persistent attribute: isServiceStuff
	 */
	public java.lang.Boolean getIsServiceStuff() {
		return dataCacheEntry.getIsServiceStuff();
	}
	/**
	 * Set accessor for persistent attribute: isServiceStuff
	 */
	public void setIsServiceStuff(java.lang.Boolean newIsServiceStuff) {
		instanceExtension.markDirty(15,getIsServiceStuff(),newIsServiceStuff);
		dataCacheEntry.setIsServiceStuff(newIsServiceStuff);
	}
}
