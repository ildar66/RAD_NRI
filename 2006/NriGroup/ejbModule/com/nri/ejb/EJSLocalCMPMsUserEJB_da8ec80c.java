package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPMsUserEJB_da8ec80c
 */
public class EJSLocalCMPMsUserEJB_da8ec80c extends EJSLocalWrapper implements com.nri.ejb.MsUserEJBLocal {
	/**
	 * EJSLocalCMPMsUserEJB_da8ec80c
	 */
	public EJSLocalCMPMsUserEJB_da8ec80c() {
		super();	}
	/**
	 * getMsPassword
	 */
	public java.lang.String getMsPassword() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.MsUserEJBBean beanRef = (com.nri.ejb.MsUserEJBBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getMsPassword();
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
	 * getMsUser
	 */
	public java.lang.String getMsUser() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.MsUserEJBBean beanRef = (com.nri.ejb.MsUserEJBBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getMsUser();
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
		return _EJS_result;
	}
	/**
	 * setMsPassword
	 */
	public void setMsPassword(java.lang.String newMsPassword) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.MsUserEJBBean beanRef = (com.nri.ejb.MsUserEJBBean)container.preInvoke(this, 2, _EJS_s);
			beanRef.setMsPassword(newMsPassword);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setMsUser
	 */
	public void setMsUser(java.lang.String newMsUser) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.MsUserEJBBean beanRef = (com.nri.ejb.MsUserEJBBean)container.preInvoke(this, 3, _EJS_s);
			beanRef.setMsUser(newMsUser);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
