package com.nri.ejb;
/**
 * Local interface for Enterprise Bean: RoleEJB
 */
public interface RoleEJBLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Get accessor for persistent attribute: roleName
	 */
	public java.lang.String getRoleName();
	/**
	 * Set accessor for persistent attribute: roleName
	 */
	public void setRoleName(java.lang.String newRoleName);
	/**
	 * Get accessor for persistent attribute: comment
	 */
	public java.lang.String getComment();
	/**
	 * Set accessor for persistent attribute: comment
	 */
	public void setComment(java.lang.String newComment);
	/**
	 * Get accessor for persistent attribute: sortOrder
	 */
	public java.lang.Integer getSortOrder();
	/**
	 * Set accessor for persistent attribute: sortOrder
	 */
	public void setSortOrder(java.lang.Integer newSortOrder);
	/**
	 * Get accessor for persistent attribute: taskComment
	 */
	public java.lang.String getTaskComment();
	/**
	 * Set accessor for persistent attribute: taskComment
	 */
	public void setTaskComment(java.lang.String newTaskComment);
}
