package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPDivisionEJBHome_7c74fa89
 */
public class EJSLocalCMPDivisionEJBHome_7c74fa89 extends EJSLocalWrapper implements com.nri.ejb.DivisionEJBLocalHome, com.nri.ejb.websphere_deploy.DivisionEJBBeanInternalLocalHome_7c74fa89 {
	/**
	 * EJSLocalCMPDivisionEJBHome_7c74fa89
	 */
	public EJSLocalCMPDivisionEJBHome_7c74fa89() {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.DivisionEJBLocal create(java.lang.Integer division) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.DivisionEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPDivisionEJBHomeBean_7c74fa89 _EJS_beanRef = (com.nri.ejb.EJSCMPDivisionEJBHomeBean_7c74fa89)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(division);
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
	public com.nri.ejb.DivisionEJBLocal create(java.lang.Integer division, java.lang.String type, java.lang.Integer encloser, java.lang.String name, java.lang.String shortName, java.lang.Integer boss, java.lang.Integer company, java.lang.Boolean isActive) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.DivisionEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPDivisionEJBHomeBean_7c74fa89 _EJS_beanRef = (com.nri.ejb.EJSCMPDivisionEJBHomeBean_7c74fa89)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(division, type, encloser, name, shortName, boss, company, isActive);
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
	public com.nri.ejb.DivisionEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.ejb.DivisionEJBLocal _EJS_result = null;
		try {
			com.nri.ejb.EJSCMPDivisionEJBHomeBean_7c74fa89 _EJS_beanRef = (com.nri.ejb.EJSCMPDivisionEJBHomeBean_7c74fa89)container.preInvoke(this, 2, _EJS_s);
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
			com.nri.ejb.EJSCMPDivisionEJBHomeBean_7c74fa89 _EJS_beanRef = (com.nri.ejb.EJSCMPDivisionEJBHomeBean_7c74fa89)container.preInvoke(this, 3, _EJS_s);
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
