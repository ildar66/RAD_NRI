package com.nri.ejb;
/**
 * Local Home interface for Enterprise Bean: MsUserEJB
 */
public interface MsUserEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: MsUserEJB
	 */
	public com.nri.ejb.MsUserEJBLocal create(java.lang.Integer msuCode) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: MsUserEJB
	 */
	public com.nri.ejb.MsUserEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.MsUserEJBLocal create(Integer msuCode, String msUser, String msPassword) throws javax.ejb.CreateException;
}
