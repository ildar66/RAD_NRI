package com.god.oidgen;
/**
 * Bean implementation class for Enterprise Bean: OIDvalue
 */
public abstract class OIDvalueBean implements javax.ejb.EntityBean {

	private javax.ejb.EntityContext myEntityCtx;
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
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
	public java.lang.String ejbCreate(java.lang.String type)
		throws javax.ejb.CreateException {
		setType(type);
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String type)
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
	public int increment() {
		int nextOID = getNextOID() + 1;
		setNextOID(nextOID);
		return nextOID;
	}
	/**
	 * Get accessor for persistent attribute: type
	 */
	public abstract java.lang.String getType();
	/**
	 * Set accessor for persistent attribute: type
	 */
	public abstract void setType(java.lang.String newType);
	/**
	 * Get accessor for persistent attribute: nextOID
	 */
	public abstract int getNextOID();
	/**
	 * Set accessor for persistent attribute: nextOID
	 */
	public abstract void setNextOID(int newNextOID);
}
