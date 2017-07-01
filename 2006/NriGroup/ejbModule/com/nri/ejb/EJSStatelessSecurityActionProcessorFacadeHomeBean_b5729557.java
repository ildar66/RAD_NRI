package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessSecurityActionProcessorFacadeHomeBean_b5729557
 */
public class EJSStatelessSecurityActionProcessorFacadeHomeBean_b5729557 extends EJSHome {
	/**
	 * EJSStatelessSecurityActionProcessorFacadeHomeBean_b5729557
	 */
	public EJSStatelessSecurityActionProcessorFacadeHomeBean_b5729557() throws java.rmi.RemoteException {
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
}
