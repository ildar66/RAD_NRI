package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPPeopleEJBHome_6bbce083
 */
public class EJSLocalCMPPeopleEJBHome_6bbce083 extends EJSLocalWrapper implements com.nri.ejb.PeopleEJBLocalHome, com.nri.ejb.websphere_deploy.PeopleEJBBeanInternalLocalHome_6bbce083 {
	/**
	 * EJSLocalCMPPeopleEJBHome_6bbce083
	 */
	public EJSLocalCMPPeopleEJBHome_6bbce083() {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.PeopleEJBLocal create(java.lang.Integer man) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.PeopleEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPPeopleEJBHomeBean_6bbce083 _EJS_beanRef = (com.nri.ejb.EJSCMPPeopleEJBHomeBean_6bbce083)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(man);
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
	 * create
	 */
	public com.nri.ejb.PeopleEJBLocal create(java.lang.Integer man, java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, java.lang.String passportSer, java.sql.Date passportDate, java.lang.String passportWhom, java.lang.Boolean isActive, java.lang.Integer tabNum) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.PeopleEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPPeopleEJBHomeBean_6bbce083 _EJS_beanRef = (com.nri.ejb.EJSCMPPeopleEJBHomeBean_6bbce083)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(man, firstName, lastName, middleName, passportSer, passportDate, passportWhom, isActive, tabNum);
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
	 * findByPrimaryKey
	 */
	public com.nri.ejb.PeopleEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.PeopleEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPPeopleEJBHomeBean_6bbce083 _EJS_beanRef = (com.nri.ejb.EJSCMPPeopleEJBHomeBean_6bbce083)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
		}
		catch (javax.ejb.FinderException ex) {
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
	 * remove
	 */
	public void remove(java.lang.Object arg0) throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.EJSCMPPeopleEJBHomeBean_6bbce083 _EJS_beanRef = (com.nri.ejb.EJSCMPPeopleEJBHomeBean_6bbce083)container.preInvoke(this, 3, _EJS_s);
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
