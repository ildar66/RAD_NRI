package com.nri.ejb;
/**
 * Bean implementation class for Enterprise Bean: WorkerEJB
 */
public abstract class WorkerEJBBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext myEntityCtx;
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		myEntityCtx = null;
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer worker) throws javax.ejb.CreateException {
		setWorker(worker);
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer worker) throws javax.ejb.CreateException {
	}
	
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(Integer worker, Integer man, Integer workPosition, Boolean isOur, Boolean isServiceStuff) throws javax.ejb.CreateException {
		setWorker(worker);
		setMan(man);
		setWorkPosition(workPosition);
		setIsOur(isOur);
		setIsServiceStuff(isServiceStuff);
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(Integer worker, Integer man, Integer workPosition, Boolean isOur, Boolean isServiceStuff) throws javax.ejb.CreateException {
	}	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
	}
	/**
	 * Get accessor for persistent attribute: worker
	 */
	public abstract java.lang.Integer getWorker();
	/**
	 * Set accessor for persistent attribute: worker
	 */
	public abstract void setWorker(java.lang.Integer newWorker);
	/**
	 * Get accessor for persistent attribute: company
	 */
	public abstract java.lang.Integer getCompany();
	/**
	 * Set accessor for persistent attribute: company
	 */
	public abstract void setCompany(java.lang.Integer newCompany);
	/**
	 * Get accessor for persistent attribute: man
	 */
	public abstract java.lang.Integer getMan();
	/**
	 * Set accessor for persistent attribute: man
	 */
	public abstract void setMan(java.lang.Integer newMan);
	/**
	 * Get accessor for persistent attribute: workPosition
	 */
	public abstract java.lang.Integer getWorkPosition();
	/**
	 * Set accessor for persistent attribute: workPosition
	 */
	public abstract void setWorkPosition(java.lang.Integer newWorkPosition);
	/**
	 * Get accessor for persistent attribute: division
	 */
	public abstract java.lang.Integer getDivision();
	/**
	 * Set accessor for persistent attribute: division
	 */
	public abstract void setDivision(java.lang.Integer newDivision);
	/**
	 * Get accessor for persistent attribute: lotusAddress
	 */
	public abstract java.lang.String getLotusAddress();
	/**
	 * Set accessor for persistent attribute: lotusAddress
	 */
	public abstract void setLotusAddress(java.lang.String newLotusAddress);
	/**
	 * Get accessor for persistent attribute: email
	 */
	public abstract java.lang.String getEmail();
	/**
	 * Set accessor for persistent attribute: email
	 */
	public abstract void setEmail(java.lang.String newEmail);
	/**
	 * Get accessor for persistent attribute: phone1
	 */
	public abstract java.lang.String getPhone1();
	/**
	 * Set accessor for persistent attribute: phone1
	 */
	public abstract void setPhone1(java.lang.String newPhone1);
	/**
	 * Get accessor for persistent attribute: phone2
	 */
	public abstract java.lang.String getPhone2();
	/**
	 * Set accessor for persistent attribute: phone2
	 */
	public abstract void setPhone2(java.lang.String newPhone2);
	/**
	 * Get accessor for persistent attribute: localPhone
	 */
	public abstract java.lang.String getLocalPhone();
	/**
	 * Set accessor for persistent attribute: localPhone
	 */
	public abstract void setLocalPhone(java.lang.String newLocalPhone);
	/**
	 * Get accessor for persistent attribute: fax
	 */
	public abstract java.lang.String getFax();
	/**
	 * Set accessor for persistent attribute: fax
	 */
	public abstract void setFax(java.lang.String newFax);
	/**
	 * Get accessor for persistent attribute: mobilePhone
	 */
	public abstract java.lang.String getMobilePhone();
	/**
	 * Set accessor for persistent attribute: mobilePhone
	 */
	public abstract void setMobilePhone(java.lang.String newMobilePhone);
	/**
	 * Get accessor for persistent attribute: isActive
	 */
	public abstract java.lang.Boolean getIsActive();
	/**
	 * Set accessor for persistent attribute: isActive
	 */
	public abstract void setIsActive(java.lang.Boolean newIsActive);
	/**
	 * Get accessor for persistent attribute: isOur
	 */
	public abstract java.lang.Boolean getIsOur();
	/**
	 * Set accessor for persistent attribute: isOur
	 */
	public abstract void setIsOur(java.lang.Boolean newIsOur);
	/**
	 * Get accessor for persistent attribute: organization
	 */
	public abstract java.lang.Integer getOrganization();
	/**
	 * Set accessor for persistent attribute: organization
	 */
	public abstract void setOrganization(java.lang.Integer newOrganization);
	/**
	 * Get accessor for persistent attribute: isServiceStuff
	 */
	public abstract java.lang.Boolean getIsServiceStuff();
	/**
	 * Set accessor for persistent attribute: isServiceStuff
	 */
	public abstract void setIsServiceStuff(java.lang.Boolean newIsServiceStuff);
}
