package com.nri.sequence.ejb;
/**
 * Local interface for Enterprise Bean: Sequence
 */
public interface SequenceLocal extends javax.ejb.EJBLocalObject {
	/**
	 * 
	 * @param blockSize
	 * @return
	 */
	public int getNextKeyAfterIncrementingBy(int blockSize);
}
