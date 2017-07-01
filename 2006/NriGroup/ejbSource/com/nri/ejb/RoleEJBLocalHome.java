package com.nri.ejb;
/**
 * Local Home interface for Enterprise Bean: RoleEJB
 */
public interface RoleEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: RoleEJB
	 */
	public com.nri.ejb.RoleEJBLocal create(java.lang.String role) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: RoleEJB
	 */
	public com.nri.ejb.RoleEJBLocal findByPrimaryKey(java.lang.String primaryKey) throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.RoleEJBLocal create(String role, String roleName, String comment, Integer sortOrder, String taskComment) throws javax.ejb.CreateException;
	public java.util.Collection findAll() throws javax.ejb.FinderException;
	public java.util.Collection findByRoleName(java.lang.String name) throws javax.ejb.FinderException;
}
