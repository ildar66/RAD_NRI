package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPWorkerEJBHome_7ee08407
 */
public class EJSLocalCMPWorkerEJBHome_7ee08407 extends EJSLocalWrapper implements com.nri.ejb.WorkerEJBLocalHome, com.nri.ejb.websphere_deploy.WorkerEJBBeanInternalLocalHome_7ee08407 {
	/**
	 * EJSLocalCMPWorkerEJBHome_7ee08407
	 */
	public EJSLocalCMPWorkerEJBHome_7ee08407() {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.WorkerEJBLocal create(java.lang.Integer worker) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.WorkerEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPWorkerEJBHomeBean_7ee08407 _EJS_beanRef = (com.nri.ejb.EJSCMPWorkerEJBHomeBean_7ee08407)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(worker);
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
	public com.nri.ejb.WorkerEJBLocal create(java.lang.Integer worker, java.lang.Integer man, java.lang.Integer workPosition, java.lang.Boolean isOur, java.lang.Boolean isServiceStuff) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.WorkerEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPWorkerEJBHomeBean_7ee08407 _EJS_beanRef = (com.nri.ejb.EJSCMPWorkerEJBHomeBean_7ee08407)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(worker, man, workPosition, isOur, isServiceStuff);
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
	public com.nri.ejb.WorkerEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.WorkerEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPWorkerEJBHomeBean_7ee08407 _EJS_beanRef = (com.nri.ejb.EJSCMPWorkerEJBHomeBean_7ee08407)container.preInvoke(this, 2, _EJS_s);
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
			com.nri.ejb.EJSCMPWorkerEJBHomeBean_7ee08407 _EJS_beanRef = (com.nri.ejb.EJSCMPWorkerEJBHomeBean_7ee08407)container.preInvoke(this, 3, _EJS_s);
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
