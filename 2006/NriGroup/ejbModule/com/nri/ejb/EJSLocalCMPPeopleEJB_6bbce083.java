package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPPeopleEJB_6bbce083
 */
public class EJSLocalCMPPeopleEJB_6bbce083 extends EJSLocalWrapper implements com.nri.ejb.PeopleEJBLocal {
	/**
	 * EJSLocalCMPPeopleEJB_6bbce083
	 */
	public EJSLocalCMPPeopleEJB_6bbce083() {
		super();	}
	/**
	 * getIsActive
	 */
	public java.lang.Boolean getIsActive() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Boolean _EJS_result = null;
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 0, _EJS_s);
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
	 * getTabNum
	 */
	public java.lang.Integer getTabNum() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getTabNum();
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
	 * getFirstName
	 */
	public java.lang.String getFirstName() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.getFirstName();
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
	 * getLastName
	 */
	public java.lang.String getLastName() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = beanRef.getLastName();
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
	 * getMiddleName
	 */
	public java.lang.String getMiddleName() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = beanRef.getMiddleName();
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
	 * getPassportSer
	 */
	public java.lang.String getPassportSer() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 5, _EJS_s);
			_EJS_result = beanRef.getPassportSer();
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
	 * getPassportWhom
	 */
	public java.lang.String getPassportWhom() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 6, _EJS_s);
			_EJS_result = beanRef.getPassportWhom();
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
		return _EJS_result;
	}
	/**
	 * getPassportDate
	 */
	public java.sql.Date getPassportDate() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.sql.Date _EJS_result = null;
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 7, _EJS_s);
			_EJS_result = beanRef.getPassportDate();
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
		return _EJS_result;
	}
	/**
	 * setFirstName
	 */
	public void setFirstName(java.lang.String newFirstName) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 8, _EJS_s);
			beanRef.setFirstName(newFirstName);
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
	 * setIsActive
	 */
	public void setIsActive(java.lang.Boolean newIsActive) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 9, _EJS_s);
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
	 * setLastName
	 */
	public void setLastName(java.lang.String newLastName) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 10, _EJS_s);
			beanRef.setLastName(newLastName);
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
	 * setMiddleName
	 */
	public void setMiddleName(java.lang.String newMiddleName) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 11, _EJS_s);
			beanRef.setMiddleName(newMiddleName);
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
	/**
	 * setPassportDate
	 */
	public void setPassportDate(java.sql.Date newPassportDate) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 12, _EJS_s);
			beanRef.setPassportDate(newPassportDate);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 12, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setPassportSer
	 */
	public void setPassportSer(java.lang.String newPassportSer) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 13, _EJS_s);
			beanRef.setPassportSer(newPassportSer);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 13, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setPassportWhom
	 */
	public void setPassportWhom(java.lang.String newPassportWhom) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 14, _EJS_s);
			beanRef.setPassportWhom(newPassportWhom);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 14, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setTabNum
	 */
	public void setTabNum(java.lang.Integer newTabNum) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.PeopleEJBBean beanRef = (com.nri.ejb.PeopleEJBBean)container.preInvoke(this, 15, _EJS_s);
			beanRef.setTabNum(newTabNum);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 15, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
