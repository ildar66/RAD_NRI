package com.nri.ejb;
/**
 * Local Home interface for Enterprise Bean: ProfileEJB
 */
public interface ProfileEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Finds an instance using a key for Entity Bean: ProfileEJB
	 */
	public com.nri.ejb.ProfileEJBLocal findByPrimaryKey(com.nri.ejb.ProfileEJBKey primaryKey) throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.ProfileEJBLocal create(Integer operatorID, String key, String name, Integer type, Integer key_type) throws javax.ejb.CreateException;
}
