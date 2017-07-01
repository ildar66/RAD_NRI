package com.god.oidgen.websphere_deploy.ORACLE_V9_1;

/**
 * OIDvalueBeanInjectorImpl_9352f82e
 */
public class OIDvalueBeanInjectorImpl_9352f82e implements com.god.oidgen.websphere_deploy.OIDvalueBeanInjector_9352f82e {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e concreteBean=(com.god.oidgen.ConcreteOIDvalue_9352f82e)cb;
		record.set(0,new Integer(concreteBean.getNextOID()));
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getType()));
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e concreteBean=(com.god.oidgen.ConcreteOIDvalue_9352f82e)cb;
		record.set(0,new Integer(concreteBean.getNextOID()));
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getType()));
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e concreteBean=(com.god.oidgen.ConcreteOIDvalue_9352f82e)cb;
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getType()));
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.String pkey=(java.lang.String)pkeyObject;
		record.set(0,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(pkey));
	}
}
