package com.nri.ejb;
/**
 * Local Home interface for Enterprise Bean: OperatorEJB
 */
public interface OperatorEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: OperatorEJB
	 */
	public com.nri.ejb.OperatorEJBLocal create(java.lang.Integer operator) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: OperatorEJB
	 */
	public com.nri.ejb.OperatorEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.OperatorEJBLocal create(Integer operator, Integer man, String loginID, String password, Boolean isEnabled) throws javax.ejb.CreateException;
}
