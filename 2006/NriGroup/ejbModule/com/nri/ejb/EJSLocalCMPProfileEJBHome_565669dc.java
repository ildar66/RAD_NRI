package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPProfileEJBHome_565669dc
 */
public class EJSLocalCMPProfileEJBHome_565669dc extends EJSLocalWrapper implements com.nri.ejb.ProfileEJBLocalHome, com.nri.ejb.websphere_deploy.ProfileEJBBeanInternalLocalHome_565669dc {
	/**
	 * EJSLocalCMPProfileEJBHome_565669dc
	 */
	public EJSLocalCMPProfileEJBHome_565669dc() {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.ProfileEJBLocal create(java.lang.Integer operatorID, java.lang.String key, java.lang.String name, java.lang.Integer type, java.lang.Integer key_type) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.ProfileEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPProfileEJBHomeBean_565669dc _EJS_beanRef = (com.nri.ejb.EJSCMPProfileEJBHomeBean_565669dc)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(operatorID, key, name, type, key_type);
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
	 * findByPrimaryKey
	 */
	public com.nri.ejb.ProfileEJBLocal findByPrimaryKey(com.nri.ejb.ProfileEJBKey primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.ProfileEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPProfileEJBHomeBean_565669dc _EJS_beanRef = (com.nri.ejb.EJSCMPProfileEJBHomeBean_565669dc)container.preInvoke(this, 1, _EJS_s);
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
	 * remove
	 */
	public void remove(java.lang.Object arg0) throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.EJSCMPProfileEJBHomeBean_565669dc _EJS_beanRef = (com.nri.ejb.EJSCMPProfileEJBHomeBean_565669dc)container.preInvoke(this, 2, _EJS_s);
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
				container.postInvoke(this, 2, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
