package com.nri.sequence.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPSequenceHome_61331c68
 */
public class EJSLocalCMPSequenceHome_61331c68 extends EJSLocalWrapper implements com.nri.sequence.ejb.SequenceLocalHome, com.nri.sequence.ejb.websphere_deploy.SequenceBeanInternalLocalHome_61331c68 {
	/**
	 * EJSLocalCMPSequenceHome_61331c68
	 */
	public EJSLocalCMPSequenceHome_61331c68() {
		super();	}
	/**
	 * create
	 */
	public com.nri.sequence.ejb.SequenceLocal create(java.lang.String id) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.sequence.ejb.SequenceLocal _EJS_result = null;
		try {
			com.nri.sequence.ejb.EJSCMPSequenceHomeBean_61331c68 _EJS_beanRef = (com.nri.sequence.ejb.EJSCMPSequenceHomeBean_61331c68)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(id);
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
	public com.nri.sequence.ejb.SequenceLocal findByPrimaryKey(java.lang.String primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.sequence.ejb.SequenceLocal _EJS_result = null;
		try {
			com.nri.sequence.ejb.EJSCMPSequenceHomeBean_61331c68 _EJS_beanRef = (com.nri.sequence.ejb.EJSCMPSequenceHomeBean_61331c68)container.preInvoke(this, 1, _EJS_s);
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
			com.nri.sequence.ejb.EJSCMPSequenceHomeBean_61331c68 _EJS_beanRef = (com.nri.sequence.ejb.EJSCMPSequenceHomeBean_61331c68)container.preInvoke(this, 2, _EJS_s);
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
