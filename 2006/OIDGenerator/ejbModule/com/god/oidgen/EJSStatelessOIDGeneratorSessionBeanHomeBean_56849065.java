package com.god.oidgen;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessOIDGeneratorSessionBeanHomeBean_56849065
 */
public class EJSStatelessOIDGeneratorSessionBeanHomeBean_56849065 extends EJSHome {
	/**
	 * EJSStatelessOIDGeneratorSessionBeanHomeBean_56849065
	 */
	public EJSStatelessOIDGeneratorSessionBeanHomeBean_56849065() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create_Local
	 */
	public com.god.oidgen.OIDGeneratorSessionLocal create_Local() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.god.oidgen.OIDGeneratorSessionLocal result = null;
boolean createFailed = false;
boolean preCreateFlag = false;
try {
	result = (com.god.oidgen.OIDGeneratorSessionLocal) super.createWrapper_Local(null);
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
