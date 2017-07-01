package com.nri.sequence.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessSequenceSessionHomeBean_0a0584ff
 */
public class EJSStatelessSequenceSessionHomeBean_0a0584ff extends EJSHome {
	/**
	 * EJSStatelessSequenceSessionHomeBean_0a0584ff
	 */
	public EJSStatelessSequenceSessionHomeBean_0a0584ff() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 */
	public com.nri.sequence.ejb.SequenceSession create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.nri.sequence.ejb.SequenceSession result = null;
boolean createFailed = false;
try {
	result = (com.nri.sequence.ejb.SequenceSession) super.createWrapper(new BeanId(this, null));
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
	public com.nri.sequence.ejb.SequenceSessionLocal create_Local() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.nri.sequence.ejb.SequenceSessionLocal result = null;
boolean createFailed = false;
boolean preCreateFlag = false;
try {
	result = (com.nri.sequence.ejb.SequenceSessionLocal) super.createWrapper_Local(null);
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
