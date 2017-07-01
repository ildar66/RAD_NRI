package com.nri.ejb;
/**
 * Bean implementation class for Enterprise Bean: CompanyEJB
 */
public abstract class CompanyEJBBean implements javax.ejb.EntityBean {
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
	public java.lang.Integer ejbCreate(java.lang.Integer company) throws javax.ejb.CreateException {
		setCompany(company);
		return null;
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(Integer company, String name, String shortName) throws javax.ejb.CreateException {
		setCompany(company);
		setName(name);
		setShortName(shortName);
		return null;
	}	
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer company) throws javax.ejb.CreateException {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(Integer company, String name, String shortName) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: company
	 */
	public abstract java.lang.Integer getCompany();
	/**
	 * Set accessor for persistent attribute: company
	 */
	public abstract void setCompany(java.lang.Integer newCompany);
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
}
