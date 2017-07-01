package com.nri.ejb;
/**
 * Local interface for Enterprise Bean: PeopleEJB
 */
public interface PeopleEJBLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Get accessor for persistent attribute: firstName
	 */
	public java.lang.String getFirstName();
	/**
	 * Set accessor for persistent attribute: firstName
	 */
	public void setFirstName(java.lang.String newFirstName);
	/**
	 * Get accessor for persistent attribute: lastName
	 */
	public java.lang.String getLastName();
	/**
	 * Set accessor for persistent attribute: lastName
	 */
	public void setLastName(java.lang.String newLastName);
	/**
	 * Get accessor for persistent attribute: middleName
	 */
	public java.lang.String getMiddleName();
	/**
	 * Set accessor for persistent attribute: middleName
	 */
	public void setMiddleName(java.lang.String newMiddleName);
	/**
	 * Get accessor for persistent attribute: passportSer
	 */
	public java.lang.String getPassportSer();
	/**
	 * Set accessor for persistent attribute: passportSer
	 */
	public void setPassportSer(java.lang.String newPassportSer);
	/**
	 * Get accessor for persistent attribute: passportWhom
	 */
	public java.lang.String getPassportWhom();
	/**
	 * Set accessor for persistent attribute: passportWhom
	 */
	public void setPassportWhom(java.lang.String newPassportWhom);
	/**
	 * Get accessor for persistent attribute: isActive
	 */
	public java.lang.Boolean getIsActive();
	/**
	 * Set accessor for persistent attribute: isActive
	 */
	public void setIsActive(java.lang.Boolean newIsActive);
	/**
	 * Get accessor for persistent attribute: tabNum
	 */
	public java.lang.Integer getTabNum();
	/**
	 * Set accessor for persistent attribute: tabNum
	 */
	public void setTabNum(java.lang.Integer newTabNum);
	/**
	 * Get accessor for persistent attribute: passportDate
	 */
	public java.sql.Date getPassportDate();
	/**
	 * Set accessor for persistent attribute: passportDate
	 */
	public void setPassportDate(java.sql.Date newPassportDate);
}
