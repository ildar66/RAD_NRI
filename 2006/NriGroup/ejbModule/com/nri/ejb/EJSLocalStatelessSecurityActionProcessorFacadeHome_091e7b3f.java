package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessSecurityActionProcessorFacadeHome_091e7b3f
 */
public class EJSLocalStatelessSecurityActionProcessorFacadeHome_091e7b3f extends EJSLocalWrapper implements com.nri.ejb.SecurityActionProcessorFacadeLocalHome {
	/**
	 * EJSLocalStatelessSecurityActionProcessorFacadeHome_091e7b3f
	 */
	public EJSLocalStatelessSecurityActionProcessorFacadeHome_091e7b3f() {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.SecurityActionProcessorFacadeLocal create() throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.SecurityActionProcessorFacadeLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSStatelessSecurityActionProcessorFacadeHomeBean_091e7b3f _EJS_beanRef = (com.nri.ejb.EJSStatelessSecurityActionProcessorFacadeHomeBean_091e7b3f)container.preInvoke(this, 0, _EJS_s);
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
			com.nri.ejb.EJSStatelessSecurityActionProcessorFacadeHomeBean_091e7b3f _EJS_beanRef = (com.nri.ejb.EJSStatelessSecurityActionProcessorFacadeHomeBean_091e7b3f)container.preInvoke(this, 1, _EJS_s);
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
