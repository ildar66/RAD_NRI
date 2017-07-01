package com.nri.sequence.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessSequenceSession_0a0584ff
 */
public class EJSLocalStatelessSequenceSession_0a0584ff extends EJSLocalWrapper implements com.nri.sequence.ejb.SequenceSessionLocal {
	/**
	 * EJSLocalStatelessSequenceSession_0a0584ff
	 */
	public EJSLocalStatelessSequenceSession_0a0584ff() {
		super();	}
	/**
	 * getNextNumberInSequence
	 */
	public int getNextNumberInSequence(java.lang.String id) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			com.nri.sequence.ejb.SequenceSessionBean beanRef = (com.nri.sequence.ejb.SequenceSessionBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getNextNumberInSequence(id);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
}
