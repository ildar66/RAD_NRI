package com.nri.sequence.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSRemoteStatelessSequenceSession_0a0584ff
 */
public class EJSRemoteStatelessSequenceSession_0a0584ff extends EJSWrapper implements SequenceSession {
	/**
	 * EJSRemoteStatelessSequenceSession_0a0584ff
	 */
	public EJSRemoteStatelessSequenceSession_0a0584ff() throws java.rmi.RemoteException {
		super();	}
	/**
	 * getNextNumberInSequence
	 */
	public int getNextNumberInSequence(java.lang.String id) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			com.nri.sequence.ejb.SequenceSessionBean _EJS_beanRef = (com.nri.sequence.ejb.SequenceSessionBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.getNextNumberInSequence(id);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
}
