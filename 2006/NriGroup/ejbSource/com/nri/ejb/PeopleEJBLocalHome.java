package com.nri.ejb;
import java.sql.Date;
/**
 * Local Home interface for Enterprise Bean: PeopleEJB
 */
public interface PeopleEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: PeopleEJB
	 */
	public com.nri.ejb.PeopleEJBLocal create(java.lang.Integer man)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: PeopleEJB
	 */
	public com.nri.ejb.PeopleEJBLocal findByPrimaryKey(
		java.lang.Integer primaryKey)
		throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.PeopleEJBLocal create(
		java.lang.Integer man,
		String firstName,
		String lastName,
		String middleName,
		String passportSer,
		Date passportDate,
		String passportWhom,
		Boolean isActive,
		Integer tabNum)
		throws javax.ejb.CreateException;
}
