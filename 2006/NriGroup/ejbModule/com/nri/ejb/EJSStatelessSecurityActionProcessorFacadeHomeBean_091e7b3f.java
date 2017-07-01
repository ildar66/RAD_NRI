package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessSecurityActionProcessorFacadeHomeBean_091e7b3f
 */
public class EJSStatelessSecurityActionProcessorFacadeHomeBean_091e7b3f extends EJSHome {
	/**
	 * EJSStatelessSecurityActionProcessorFacadeHomeBean_091e7b3f
	 */
	public EJSStatelessSecurityActionProcessorFacadeHomeBean_091e7b3f() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 */
	public com.nri.ejb.SecurityActionProcessorFacade create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.nri.ejb.SecurityActionProcessorFacade result = null;
boolean createFailed = false;
try {
	result = (com.nri.ejb.SecurityActionProcessorFacade) super.createWrapper(new BeanId(this, null));
}
catch (javax.ejb.CreateException ex) {
	createFailed = true;
	throw ex;
} catch (java.rmi.RemoteException ex) {
	createFailed = true;
	throw ex;
} catch (Throwable ex) {
	createFailed = true;
	throw new CreateFailureException(ex);
} finally {
	if (createFailed) {
		super.createFailure(beanO);
	}
}
return result;	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.SecurityActionProcessorFacadeLocal create_Local() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.nri.ejb.SecurityActionProcessorFacadeLocal result = null;
boolean createFailed = false;
boolean preCreateFlag = false;
try {
	result = (com.nri.ejb.SecurityActionProcessorFacadeLocal) super.createWrapper_Local(null);
}
catch (javax.ejb.CreateException ex) {
	createFailed = true;
	throw ex;
} catch (java.rmi.RemoteException ex) {
	createFailed = true;
	throw ex;
} catch (Throwable ex) {
	createFailed = true;
	throw new CreateFailureException(ex);
} finally {
	if (createFailed) {
		super.createFailure(beanO);
	}
}
return result;	}
}
