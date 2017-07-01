package com.nri.ejb;
/**
 * Local Home interface for Enterprise Bean: CompanyEJB
 */
public interface CompanyEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: CompanyEJB
	 */
	public com.nri.ejb.CompanyEJBLocal create(java.lang.Integer company) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: CompanyEJB
	 */
	public com.nri.ejb.CompanyEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.CompanyEJBLocal create(Integer company, String name, String shortName) throws javax.ejb.CreateException;
	public java.util.Collection findAll() throws javax.ejb.FinderException;
}
