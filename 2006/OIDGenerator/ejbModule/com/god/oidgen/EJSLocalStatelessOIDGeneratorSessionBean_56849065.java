package com.god.oidgen;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessOIDGeneratorSessionBean_56849065
 */
public class EJSLocalStatelessOIDGeneratorSessionBean_56849065 extends EJSLocalWrapper implements com.god.oidgen.OIDGeneratorSessionLocal {
	/**
	 * EJSLocalStatelessOIDGeneratorSessionBean_56849065
	 */
	public EJSLocalStatelessOIDGeneratorSessionBean_56849065() {
		super();	}
	/**
	 * getNextOID
	 */
	public int getNextOID(java.lang.String type) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			com.god.oidgen.OIDGeneratorSessionBean beanRef = (com.god.oidgen.OIDGeneratorSessionBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getNextOID(type);
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
}
