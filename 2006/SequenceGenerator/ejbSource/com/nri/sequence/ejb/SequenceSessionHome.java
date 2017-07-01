package com.nri.sequence.ejb;
/**
 * Home interface for Enterprise Bean: SequenceSession
 */
public interface SequenceSessionHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: SequenceSession
	 */
	public com.nri.sequence.ejb.SequenceSession create() throws javax.ejb.CreateException, java.rmi.RemoteException;
}
