package com.nri.ejb;
/**
 * Local Home interface for Enterprise Bean: WorkerEJB
 */
public interface WorkerEJBLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: WorkerEJB
	 */
	public com.nri.ejb.WorkerEJBLocal create(java.lang.Integer worker) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: WorkerEJB
	 */
	public com.nri.ejb.WorkerEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.WorkerEJBLocal create(Integer worker, Integer man, Integer workPosition, Boolean isOur, Boolean isServiceStuff) throws javax.ejb.CreateException;
}
