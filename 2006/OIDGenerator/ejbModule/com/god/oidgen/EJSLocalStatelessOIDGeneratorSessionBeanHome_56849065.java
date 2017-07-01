package com.god.oidgen;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessOIDGeneratorSessionBeanHome_56849065
 */
public class EJSLocalStatelessOIDGeneratorSessionBeanHome_56849065 extends EJSLocalWrapper implements com.god.oidgen.OIDGeneratorSessionLocalHome {
	/**
	 * EJSLocalStatelessOIDGeneratorSessionBeanHome_56849065
	 */
	public EJSLocalStatelessOIDGeneratorSessionBeanHome_56849065() {
		super();	}
	/**
	 * create
	 */
	public com.god.oidgen.OIDGeneratorSessionLocal create() throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.god.oidgen.OIDGeneratorSessionLocal _EJS_result = null;
		try {
			com.god.oidgen.EJSStatelessOIDGeneratorSessionBeanHomeBean_56849065 _EJS_beanRef = (com.god.oidgen.EJSStatelessOIDGeneratorSessionBeanHomeBean_56849065)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local();
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
	 * remove
	 */
	public void remove(java.lang.Object arg0) throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.god.oidgen.EJSStatelessOIDGeneratorSessionBeanHomeBean_56849065 _EJS_beanRef = (com.god.oidgen.EJSStatelessOIDGeneratorSessionBeanHomeBean_56849065)container.preInvoke(this, 1, _EJS_s);
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
				container.postInvoke(this, 1, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
