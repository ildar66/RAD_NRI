package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPRoleEJBHome_a79cd5a9
 */
public class EJSLocalCMPRoleEJBHome_a79cd5a9 extends EJSLocalWrapper implements com.nri.ejb.RoleEJBLocalHome, com.nri.ejb.websphere_deploy.RoleEJBBeanInternalLocalHome_a79cd5a9 {
	/**
	 * EJSLocalCMPRoleEJBHome_a79cd5a9
	 */
	public EJSLocalCMPRoleEJBHome_a79cd5a9() {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.RoleEJBLocal create(java.lang.String role) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.RoleEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9 _EJS_beanRef = (com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(role);
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
	public com.nri.ejb.RoleEJBLocal create(java.lang.String role, java.lang.String roleName, java.lang.String comment, java.lang.Integer sortOrder, java.lang.String taskComment) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.RoleEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9 _EJS_beanRef = (com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(role, roleName, comment, sortOrder, taskComment);
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
	public com.nri.ejb.RoleEJBLocal findByPrimaryKey(java.lang.String primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.RoleEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9 _EJS_beanRef = (com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9)container.preInvoke(this, 2, _EJS_s);
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
	 * findAll
	 */
	public java.util.Collection findAll() throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9 _EJS_beanRef = (com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = _EJS_beanRef.findAll_Local();
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
	 * findByRoleName
	 */
	public java.util.Collection findByRoleName(java.lang.String name) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9 _EJS_beanRef = (com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = _EJS_beanRef.findByRoleName_Local(name);
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
	 * remove
	 */
	public void remove(java.lang.Object arg0) throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9 _EJS_beanRef = (com.nri.ejb.EJSCMPRoleEJBHomeBean_a79cd5a9)container.preInvoke(this, 5, _EJS_s);
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
				container.postInvoke(this, 5, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
