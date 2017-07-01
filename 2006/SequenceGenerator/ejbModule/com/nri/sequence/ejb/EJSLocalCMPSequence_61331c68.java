package com.nri.sequence.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPSequence_61331c68
 */
public class EJSLocalCMPSequence_61331c68 extends EJSLocalWrapper implements com.nri.sequence.ejb.SequenceLocal {
	/**
	 * EJSLocalCMPSequence_61331c68
	 */
	public EJSLocalCMPSequence_61331c68() {
		super();	}
	/**
	 * getNextKeyAfterIncrementingBy
	 */
	public int getNextKeyAfterIncrementingBy(int blockSize) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			com.nri.sequence.ejb.SequenceBean beanRef = (com.nri.sequence.ejb.SequenceBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getNextKeyAfterIncrementingBy(blockSize);
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
