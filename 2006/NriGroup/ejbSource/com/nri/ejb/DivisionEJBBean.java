package com.nri.ejb;
/**
 * Bean implementation class for Enterprise Bean: DivisionEJB
 */
public abstract class DivisionEJBBean implements javax.ejb.EntityBean {
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
	public java.lang.Integer ejbCreate(java.lang.Integer division) throws javax.ejb.CreateException {
		setDivision(division);
		return null;
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(Integer division, String type, Integer encloser, String name, String shortName, Integer boss, Integer company, Boolean isActive) throws javax.ejb.CreateException {
		setDivision(division);
		setType(type);
		setEncloser(encloser);
		setName(name);
		setShortName(shortName);
		setBoss(boss);
		setCompany(company);
		setIsActive(isActive);
		return null;
	}	
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(Integer division, String type, Integer encloser, String name, String shortName, Integer boss, Integer company, Boolean isActive) throws javax.ejb.CreateException {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer division) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: division
	 */
	public abstract java.lang.Integer getDivision();
	/**
	 * Set accessor for persistent attribute: division
	 */
	public abstract void setDivision(java.lang.Integer newDivision);
	/**
	 * Get accessor for persistent attribute: type
	 */
	public abstract java.lang.String getType();
	/**
	 * Set accessor for persistent attribute: type
	 */
	public abstract void setType(java.lang.String newType);
	/**
	 * Get accessor for persistent attribute: encloser
	 */
	public abstract java.lang.Integer getEncloser();
	/**
	 * Set accessor for persistent attribute: encloser
	 */
	public abstract void setEncloser(java.lang.Integer newEncloser);
	/**
	 * Get accessor for persistent attribute: name
	 */
	public abstract java.lang.String getName();
	/**
	 * Set accessor for persistent attribute: name
	 */
	public abstract void setName(java.lang.String newName);
	/**
	 * Get accessor for persistent attribute: shortName
	 */
	public abstract java.lang.String getShortName();
	/**
	 * Set accessor for persistent attribute: shortName
	 */
	public abstract void setShortName(java.lang.String newShortName);
	/**
	 * Get accessor for persistent attribute: boss
	 */
	public abstract java.lang.Integer getBoss();
	/**
	 * Set accessor for persistent attribute: boss
	 */
	public abstract void setBoss(java.lang.Integer newBoss);
	/**
	 * Get accessor for persistent attribute: company
	 */
	public abstract java.lang.Integer getCompany();
	/**
	 * Set accessor for persistent attribute: company
	 */
	public abstract void setCompany(java.lang.Integer newCompany);
	/**
	 * Get accessor for persistent attribute: isActive
	 */
	public abstract java.lang.Boolean getIsActive();
	/**
	 * Set accessor for persistent attribute: isActive
	 */
	public abstract void setIsActive(java.lang.Boolean newIsActive);
}
