package com.nri.ejb.helper;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.god.oidgen.OIDGeneratorSessionLocal;
import com.god.oidgen.OIDGeneratorSessionLocalHome;

/**
 * @author DABERG
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class OIDGeneratorHelper {
	protected static final String OIDGEN_JNDINAME = "java:comp/env/ejb/OIDGenerator";
	private static Context context;
	private static OIDGeneratorSessionLocalHome oidHome;
	private static OIDGeneratorSessionLocal oidGenerator;
	
	private static OIDGeneratorSessionLocalHome getOIDGenHome() throws NamingException {
		if (oidHome == null) {
			if (context == null)
				context = new InitialContext();
			oidHome = (OIDGeneratorSessionLocalHome) context.lookup(OIDGEN_JNDINAME);
		}
		return oidHome;
	}
	
	private static OIDGeneratorSessionLocal getOIDGenerator() throws CreateException, NamingException {
		if (oidGenerator == null)
			oidGenerator = getOIDGenHome().create();
		return oidGenerator;
	} 
	
	public static int getNextId(String type) {
		try {
			return getOIDGenerator().getNextOID(type);
		} catch (Exception e) {
			throw new EJBException("Failed to get the next oid.", e);
		}
	}

}
