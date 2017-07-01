package com.nri.sequence.ejb;
/**
 * Remote interface for Enterprise Bean: SequenceSession
 */
public interface SequenceSession extends javax.ejb.EJBObject {
	public int getNextNumberInSequence(String id) throws java.rmi.RemoteException;
}
