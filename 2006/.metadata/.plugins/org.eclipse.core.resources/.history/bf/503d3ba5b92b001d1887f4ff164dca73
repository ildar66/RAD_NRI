package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPMsUserEJBHome_da8ec80c
 */
public class EJSLocalCMPMsUserEJBHome_da8ec80c extends EJSLocalWrapper implements com.nri.ejb.MsUserEJBLocalHome, com.nri.ejb.websphere_deploy.MsUserEJBBeanInternalLocalHome_da8ec80c {
	/**
	 * EJSLocalCMPMsUserEJBHome_da8ec80c
	 */
	public EJSLocalCMPMsUserEJBHome_da8ec80c() {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.MsUserEJBLocal create(java.lang.Integer msuCode) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.MsUserEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPMsUserEJBHomeBean_da8ec80c _EJS_beanRef = (com.nri.ejb.EJSCMPMsUserEJBHomeBean_da8ec80c)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(msuCode);
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
	public com.nri.ejb.MsUserEJBLocal create(java.lang.Integer msuCode, java.lang.String msUser, java.lang.String msPassword) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.MsUserEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPMsUserEJBHomeBean_da8ec80c _EJS_beanRef = (com.nri.ejb.EJSCMPMsUserEJBHomeBean_da8ec80c)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(msuCode, msUser, msPassword);
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
	public com.nri.ejb.MsUserEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.MsUserEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPMsUserEJBHomeBean_da8ec80c _EJS_beanRef = (com.nri.ejb.EJSCMPMsUserEJBHomeBean_da8ec80c)container.preInvoke(this, 2, _EJS_s);
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
			com.nri.ejb.EJSCMPMsUserEJBHomeBean_da8ec80c _EJS_beanRef = (com.nri.ejb.EJSCMPMsUserEJBHomeBean_da8ec80c)container.preInvoke(this, 3, _EJS_s);
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
