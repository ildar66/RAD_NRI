package com.nri.ejb;
/**
 * Bean implementation class for Enterprise Bean: OperatorEJB
 */
public abstract class OperatorEJBBean implements javax.ejb.EntityBean {
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
	public java.lang.Integer ejbCreate(java.lang.Integer operator) throws javax.ejb.CreateException {
		setOperator(operator);
		return null;
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(Integer operator, Integer man, String loginID, String password, Boolean isEnabled) throws javax.ejb.CreateException {
		setOperator(operator);
		setMan(man);
		setLoginID(loginID);
		setPassword(password);
		setIsEnabled(isEnabled);
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer operator) throws javax.ejb.CreateException {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(Integer operator, Integer man, String loginID, String password, Boolean isEnabled) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: operator
	 */
	public abstract java.lang.Integer getOperator();
	/**
	 * Set accessor for persistent attribute: operator
	 */
	public abstract void setOperator(java.lang.Integer newOperator);
	/**
	 * Get accessor for persistent attribute: man
	 */
	public abstract java.lang.Integer getMan();
	/**
	 * Set accessor for persistent attribute: man
	 */
	public abstract void setMan(java.lang.Integer newMan);
	/**
	 * Get accessor for persistent attribute: loginID
	 */
	public abstract java.lang.String getLoginID();
	/**
	 * Set accessor for persistent attribute: loginID
	 */
	public abstract void setLoginID(java.lang.String newLoginID);
	/**
	 * Get accessor for persistent attribute: password
	 */
	public abstract java.lang.String getPassword();
	/**
	 * Set accessor for persistent attribute: password
	 */
	public abstract void setPassword(java.lang.String newPassword);
	/**
	 * Get accessor for persistent attribute: isEnabled
	 */
	public abstract java.lang.Boolean getIsEnabled();
	/**
	 * Set accessor for persistent attribute: isEnabled
	 */
	public abstract void setIsEnabled(java.lang.Boolean newIsEnabled);
	/**
	 * Get accessor for persistent attribute: msuCode
	 */
	public abstract java.lang.Integer getMsuCode();
	/**
	 * Set accessor for persistent attribute: msuCode
	 */
	public abstract void setMsuCode(java.lang.Integer newMsuCode);
}
