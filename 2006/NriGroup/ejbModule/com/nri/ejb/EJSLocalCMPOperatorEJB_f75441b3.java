package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPOperatorEJB_f75441b3
 */
public class EJSLocalCMPOperatorEJB_f75441b3 extends EJSLocalWrapper implements com.nri.ejb.OperatorEJBLocal {
	/**
	 * EJSLocalCMPOperatorEJB_f75441b3
	 */
	public EJSLocalCMPOperatorEJB_f75441b3() {
		super();	}
	/**
	 * getIsEnabled
	 */
	public java.lang.Boolean getIsEnabled() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Boolean _EJS_result = null;
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getIsEnabled();
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
	 * getMan
	 */
	public java.lang.Integer getMan() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getMan();
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
	 * getMsuCode
	 */
	public java.lang.Integer getMsuCode() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.getMsuCode();
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
		return _EJS_result;
	}
	/**
	 * getLoginID
	 */
	public java.lang.String getLoginID() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = beanRef.getLoginID();
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
		return _EJS_result;
	}
	/**
	 * getPassword
	 */
	public java.lang.String getPassword() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = beanRef.getPassword();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 4, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * setIsEnabled
	 */
	public void setIsEnabled(java.lang.Boolean newIsEnabled) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 5, _EJS_s);
			beanRef.setIsEnabled(newIsEnabled);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setLoginID
	 */
	public void setLoginID(java.lang.String newLoginID) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 6, _EJS_s);
			beanRef.setLoginID(newLoginID);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setMan
	 */
	public void setMan(java.lang.Integer newMan) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 7, _EJS_s);
			beanRef.setMan(newMan);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 7, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setMsuCode
	 */
	public void setMsuCode(java.lang.Integer newMsuCode) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 8, _EJS_s);
			beanRef.setMsuCode(newMsuCode);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 8, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setPassword
	 */
	public void setPassword(java.lang.String newPassword) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.OperatorEJBBean beanRef = (com.nri.ejb.OperatorEJBBean)container.preInvoke(this, 9, _EJS_s);
			beanRef.setPassword(newPassword);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 9, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
