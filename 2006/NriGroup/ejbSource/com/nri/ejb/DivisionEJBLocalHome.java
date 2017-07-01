package com.nri.ejb;
/**
 * Local Home interface for Enterprise Bean: DivisionEJB
 */
public interface DivisionEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: DivisionEJB
	 */
	public com.nri.ejb.DivisionEJBLocal create(java.lang.Integer division) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: DivisionEJB
	 */
	public com.nri.ejb.DivisionEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.DivisionEJBLocal create(Integer division, String type, Integer encloser, String name, String shortName, Integer boss, Integer company, Boolean isActive)
		throws javax.ejb.CreateException;
}
