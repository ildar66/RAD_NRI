package com.god.oidgen;
/**
 * Local interface for Enterprise Bean: OIDGeneratorSession
 */
public interface OIDGeneratorSessionLocal extends javax.ejb.EJBLocalObject {
	/**
	 * getNextOID
	 */
	public int getNextOID(java.lang.String type);
}
