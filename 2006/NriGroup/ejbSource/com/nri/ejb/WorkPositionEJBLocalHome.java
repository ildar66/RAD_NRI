package com.nri.ejb;
/**
 * Local Home interface for Enterprise Bean: WorkPositionEJB
 */
public interface WorkPositionEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: WorkPositionEJB
	 */
	public com.nri.ejb.WorkPositionEJBLocal create(java.lang.Integer workPosition) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: WorkPositionEJB
	 */
	public com.nri.ejb.WorkPositionEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.WorkPositionEJBLocal create(Integer workPosition, String workPositionName, Boolean isActive) throws javax.ejb.CreateException;
}
