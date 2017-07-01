package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPProfileEJB_565669dc
 */
public class EJSLocalCMPProfileEJB_565669dc extends EJSLocalWrapper implements com.nri.ejb.ProfileEJBLocal {
	/**
	 * EJSLocalCMPProfileEJB_565669dc
	 */
	public EJSLocalCMPProfileEJB_565669dc() {
		super();	}
	/**
	 * getKey_type
	 */
	public java.lang.Integer getKey_type() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getKey_type();
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
	 * getType
	 */
	public java.lang.Integer getType() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getType();
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
	 * getStr_value
	 */
	public java.lang.String getStr_value() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.getStr_value();
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
	 * getNum_value
	 */
	public java.math.BigDecimal getNum_value() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.math.BigDecimal _EJS_result = null;
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = beanRef.getNum_value();
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
	 * getDate_value
	 */
	public java.sql.Timestamp getDate_value() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.sql.Timestamp _EJS_result = null;
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = beanRef.getDate_value();
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
	 * getModified
	 */
	public java.sql.Timestamp getModified() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.sql.Timestamp _EJS_result = null;
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 5, _EJS_s);
			_EJS_result = beanRef.getModified();
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
		return _EJS_result;
	}
	/**
	 * setDate_value
	 */
	public void setDate_value(java.sql.Timestamp newDate_value) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 6, _EJS_s);
			beanRef.setDate_value(newDate_value);
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
	 * setKey_type
	 */
	public void setKey_type(java.lang.Integer newKey_type) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 7, _EJS_s);
			beanRef.setKey_type(newKey_type);
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
	 * setModified
	 */
	public void setModified(java.sql.Timestamp newModified) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 8, _EJS_s);
			beanRef.setModified(newModified);
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
	 * setNum_value
	 */
	public void setNum_value(java.math.BigDecimal newNum_value) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 9, _EJS_s);
			beanRef.setNum_value(newNum_value);
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
	/**
	 * setStr_value
	 */
	public void setStr_value(java.lang.String newStr_value) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 10, _EJS_s);
			beanRef.setStr_value(newStr_value);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 10, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setType
	 */
	public void setType(java.lang.Integer newType) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.ProfileEJBBean beanRef = (com.nri.ejb.ProfileEJBBean)container.preInvoke(this, 11, _EJS_s);
			beanRef.setType(newType);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 11, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
