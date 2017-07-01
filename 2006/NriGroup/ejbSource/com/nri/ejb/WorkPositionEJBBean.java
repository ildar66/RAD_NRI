package com.nri.ejb;
/**
 * Bean implementation class for Enterprise Bean: WorkPositionEJB
 */
public abstract class WorkPositionEJBBean implements javax.ejb.EntityBean {
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
	public java.lang.Integer ejbCreate(java.lang.Integer workPosition) throws javax.ejb.CreateException {
		setWorkPosition(workPosition);
		return null;
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(Integer workPosition, String workPositionName, Boolean isActive) throws javax.ejb.CreateException {
		setWorkPosition(workPosition);
		setName(workPositionName);
		setIsActive(isActive);
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer workPosition) throws javax.ejb.CreateException {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(Integer workPosition, String workPositionName, Boolean isActive) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: workPosition
	 */
	public abstract java.lang.Integer getWorkPosition();
	/**
	 * Set accessor for persistent attribute: workPosition
	 */
	public abstract void setWorkPosition(java.lang.Integer newWorkPosition);
	/**
	 * Get accessor for persistent attribute: name
	 */
	public abstract java.lang.String getName();
	/**
	 * Set accessor for persistent attribute: name
	 */
	public abstract void setName(java.lang.String newName);
	/**
	 * Get accessor for persistent attribute: isActive
	 */
	public abstract java.lang.Boolean getIsActive();
	/**
	 * Set accessor for persistent attribute: isActive
	 */
	public abstract void setIsActive(java.lang.Boolean newIsActive);
}
