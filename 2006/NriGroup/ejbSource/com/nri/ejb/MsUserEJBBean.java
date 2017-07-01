package com.nri.ejb;
/**
 * Bean implementation class for Enterprise Bean: MsUserEJB
 */
public abstract class MsUserEJBBean implements javax.ejb.EntityBean {
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
	public java.lang.Integer ejbCreate(java.lang.Integer msuCode) throws javax.ejb.CreateException {
		setMsuCode(msuCode);
		return null;
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(Integer msuCode, String msUser, String msPassword) throws javax.ejb.CreateException {
		setMsuCode(msuCode);
		setMsUser(msUser);
		setMsPassword(msPassword);
		return null;
	}	
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer msuCode) throws javax.ejb.CreateException {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(Integer msuCode, String msUser, String msPassword) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: msuCode
	 */
	public abstract java.lang.Integer getMsuCode();
	/**
	 * Set accessor for persistent attribute: msuCode
	 */
	public abstract void setMsuCode(java.lang.Integer newMsuCode);
	/**
	 * Get accessor for persistent attribute: msUser
	 */
	public abstract java.lang.String getMsUser();
	/**
	 * Set accessor for persistent attribute: msUser
	 */
	public abstract void setMsUser(java.lang.String newMsUser);
	/**
	 * Get accessor for persistent attribute: msPassword
	 */
	public abstract java.lang.String getMsPassword();
	/**
	 * Set accessor for persistent attribute: msPassword
	 */
	public abstract void setMsPassword(java.lang.String newMsPassword);
}
