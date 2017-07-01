package com.nri.sequence.ejb;
/**
 * Local Home interface for Enterprise Bean: Sequence
 */
public interface SequenceLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Sequence
	 */
	public com.nri.sequence.ejb.SequenceLocal create(java.lang.String id) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Sequence
	 */
	public com.nri.sequence.ejb.SequenceLocal findByPrimaryKey(java.lang.String primaryKey) throws javax.ejb.FinderException;
}
