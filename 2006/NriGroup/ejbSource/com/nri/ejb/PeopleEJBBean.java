package com.nri.ejb;

import java.sql.Date;

/**
 * Bean implementation class for Enterprise Bean: PeopleEJB
 */
public abstract class PeopleEJBBean implements javax.ejb.EntityBean {
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
	public java.lang.Integer ejbCreate(java.lang.Integer man)
		throws javax.ejb.CreateException {
		setMan(man);
		return null;
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer man, String firstName, String lastName, String middleName, String passportSer, Date passportDate, String passportWhom, Boolean isActive, Integer tabNum)
		throws javax.ejb.CreateException {
		setMan(man);
		setFirstName(firstName);
		setLastName(lastName);
		setMiddleName(middleName);
		setIsActive(isActive);
		setPassportDate(passportDate);
		setPassportSer(passportSer);
		setPassportWhom(passportWhom);
		setTabNum(tabNum);
		return null;
	}	
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer man)
		throws javax.ejb.CreateException {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer man, String firstName, String lastName, String middleName, String passportSer, Date passportDate, String passportWhom, Boolean isActive, Integer tabNum)
		throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: man
	 */
	public abstract java.lang.Integer getMan();
	/**
	 * Set accessor for persistent attribute: man
	 */
	public abstract void setMan(java.lang.Integer newMan);
	/**
	 * Get accessor for persistent attribute: firstName
	 */
	public abstract java.lang.String getFirstName();
	/**
	 * Set accessor for persistent attribute: firstName
	 */
	public abstract void setFirstName(java.lang.String newFirstName);
	/**
	 * Get accessor for persistent attribute: lastName
	 */
	public abstract java.lang.String getLastName();
	/**
	 * Set accessor for persistent attribute: lastName
	 */
	public abstract void setLastName(java.lang.String newLastName);
	/**
	 * Get accessor for persistent attribute: middleName
	 */
	public abstract java.lang.String getMiddleName();
	/**
	 * Set accessor for persistent attribute: middleName
	 */
	public abstract void setMiddleName(java.lang.String newMiddleName);
	/**
	 * Get accessor for persistent attribute: passportSer
	 */
	public abstract java.lang.String getPassportSer();
	/**
	 * Set accessor for persistent attribute: passportSer
	 */
	public abstract void setPassportSer(java.lang.String newPassportSer);
	/**
	 * Get accessor for persistent attribute: passportWhom
	 */
	public abstract java.lang.String getPassportWhom();
	/**
	 * Set accessor for persistent attribute: passportWhom
	 */
	public abstract void setPassportWhom(java.lang.String newPassportWhom);
	/**
	 * Get accessor for persistent attribute: isActive
	 */
	public abstract java.lang.Boolean getIsActive();
	/**
	 * Set accessor for persistent attribute: isActive
	 */
	public abstract void setIsActive(java.lang.Boolean newIsActive);
	/**
	 * Get accessor for persistent attribute: tabNum
	 */
	public abstract java.lang.Integer getTabNum();
	/**
	 * Set accessor for persistent attribute: tabNum
	 */
	public abstract void setTabNum(java.lang.Integer newTabNum);
	/**
	 * Get accessor for persistent attribute: passportDate
	 */
	public abstract java.sql.Date getPassportDate();
	/**
	 * Set accessor for persistent attribute: passportDate
	 */
	public abstract void setPassportDate(java.sql.Date newPassportDate);
}
