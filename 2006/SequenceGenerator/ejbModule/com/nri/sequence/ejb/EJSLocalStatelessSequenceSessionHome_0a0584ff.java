package com.nri.sequence.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessSequenceSessionHome_0a0584ff
 */
public class EJSLocalStatelessSequenceSessionHome_0a0584ff extends EJSLocalWrapper implements com.nri.sequence.ejb.SequenceSessionLocalHome {
	/**
	 * EJSLocalStatelessSequenceSessionHome_0a0584ff
	 */
	public EJSLocalStatelessSequenceSessionHome_0a0584ff() {
		super();	}
	/**
	 * create
	 */
	public com.nri.sequence.ejb.SequenceSessionLocal create() throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.sequence.ejb.SequenceSessionLocal _EJS_result = null;
		try {
			com.nri.sequence.ejb.EJSStatelessSequenceSessionHomeBean_0a0584ff _EJS_beanRef = (com.nri.sequence.ejb.EJSStatelessSequenceSessionHomeBean_0a0584ff)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local();
		}
		catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	/**
	 * remove
	 */
	public void remove(java.lang.Object arg0) throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.sequence.ejb.EJSStatelessSequenceSessionHomeBean_0a0584ff _EJS_beanRef = (com.nri.sequence.ejb.EJSStatelessSequenceSessionHomeBean_0a0584ff)container.preInvoke(this, 1, _EJS_s);
			_EJS_beanRef.remove(arg0);
		}
		catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (javax.ejb.EJBException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
