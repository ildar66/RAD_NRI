package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPOperatorEJBHome_f75441b3
 */
public class EJSLocalCMPOperatorEJBHome_f75441b3 extends EJSLocalWrapper implements com.nri.ejb.OperatorEJBLocalHome, com.nri.ejb.websphere_deploy.OperatorEJBBeanInternalLocalHome_f75441b3 {
	/**
	 * EJSLocalCMPOperatorEJBHome_f75441b3
	 */
	public EJSLocalCMPOperatorEJBHome_f75441b3() {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.OperatorEJBLocal create(java.lang.Integer operator) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.OperatorEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPOperatorEJBHomeBean_f75441b3 _EJS_beanRef = (com.nri.ejb.EJSCMPOperatorEJBHomeBean_f75441b3)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(operator);
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
	public com.nri.ejb.OperatorEJBLocal create(java.lang.Integer operator, java.lang.Integer man, java.lang.String loginID, java.lang.String password, java.lang.Boolean isEnabled) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.OperatorEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPOperatorEJBHomeBean_f75441b3 _EJS_beanRef = (com.nri.ejb.EJSCMPOperatorEJBHomeBean_f75441b3)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(operator, man, loginID, password, isEnabled);
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
	public com.nri.ejb.OperatorEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.OperatorEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPOperatorEJBHomeBean_f75441b3 _EJS_beanRef = (com.nri.ejb.EJSCMPOperatorEJBHomeBean_f75441b3)container.preInvoke(this, 2, _EJS_s);
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
			com.nri.ejb.EJSCMPOperatorEJBHomeBean_f75441b3 _EJS_beanRef = (com.nri.ejb.EJSCMPOperatorEJBHomeBean_f75441b3)container.preInvoke(this, 3, _EJS_s);
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
