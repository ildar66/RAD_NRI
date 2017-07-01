package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPWorkPositionEJB_7199c149
 */
public class EJSLocalCMPWorkPositionEJB_7199c149 extends EJSLocalWrapper implements com.nri.ejb.WorkPositionEJBLocal {
	/**
	 * EJSLocalCMPWorkPositionEJB_7199c149
	 */
	public EJSLocalCMPWorkPositionEJB_7199c149() {
		super();	}
	/**
	 * getIsActive
	 */
	public java.lang.Boolean getIsActive() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Boolean _EJS_result = null;
		try {
			com.nri.ejb.WorkPositionEJBBean beanRef = (com.nri.ejb.WorkPositionEJBBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getIsActive();
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
	 * getName
	 */
	public java.lang.String getName() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.WorkPositionEJBBean beanRef = (com.nri.ejb.WorkPositionEJBBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getName();
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
	 * setIsActive
	 */
	public void setIsActive(java.lang.Boolean newIsActive) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkPositionEJBBean beanRef = (com.nri.ejb.WorkPositionEJBBean)container.preInvoke(this, 2, _EJS_s);
			beanRef.setIsActive(newIsActive);
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
	 * setName
	 */
	public void setName(java.lang.String newName) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkPositionEJBBean beanRef = (com.nri.ejb.WorkPositionEJBBean)container.preInvoke(this, 3, _EJS_s);
			beanRef.setName(newName);
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
