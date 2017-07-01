package com.nri.ejb;
/**
 * Bean implementation class for Enterprise Bean: RoleEJB
 */
public abstract class RoleEJBBean implements javax.ejb.EntityBean {
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
	public java.lang.String ejbCreate(java.lang.String role) throws javax.ejb.CreateException {
		setRole(role);
		return null;
	}
	/**
	 * ejbCreate
	 */
	public java.lang.String ejbCreate(String role, String roleName, String comment, Integer sortOrder, String taskComment) throws javax.ejb.CreateException {
		setRole(role);
		setRoleName(roleName);
		setComment(comment);
		setSortOrder(sortOrder);
		setTaskComment(taskComment);
		return null;
	}	
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String role) throws javax.ejb.CreateException {
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(String role, String roleName, String comment, Integer sortOrder, String taskComment) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: role
	 */
	public abstract java.lang.String getRole();
	/**
	 * Set accessor for persistent attribute: role
	 */
	public abstract void setRole(java.lang.String newRole);
	/**
	 * Get accessor for persistent attribute: roleName
	 */
	public abstract java.lang.String getRoleName();
	/**
	 * Set accessor for persistent attribute: roleName
	 */
	public abstract void setRoleName(java.lang.String newRoleName);
	/**
	 * Get accessor for persistent attribute: comment
	 */
	public abstract java.lang.String getComment();
	/**
	 * Set accessor for persistent attribute: comment
	 */
	public abstract void setComment(java.lang.String newComment);
	/**
	 * Get accessor for persistent attribute: sortOrder
	 */
	public abstract java.lang.Integer getSortOrder();
	/**
	 * Set accessor for persistent attribute: sortOrder
	 */
	public abstract void setSortOrder(java.lang.Integer newSortOrder);
	/**
	 * Get accessor for persistent attribute: taskComment
	 */
	public abstract java.lang.String getTaskComment();
	/**
	 * Set accessor for persistent attribute: taskComment
	 */
	public abstract void setTaskComment(java.lang.String newTaskComment);
}
