package com.nri.sequence.ejb;
/**
 * Local Home interface for Enterprise Bean: SequenceSession
 */
public interface SequenceSessionLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates a default instance of Session Bean: SequenceSession
	 */
	public com.nri.sequence.ejb.SequenceSessionLocal create() throws javax.ejb.CreateException;
}
