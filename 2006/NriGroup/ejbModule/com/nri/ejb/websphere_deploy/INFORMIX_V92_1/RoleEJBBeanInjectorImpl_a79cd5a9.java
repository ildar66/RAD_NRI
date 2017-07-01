package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * RoleEJBBeanInjectorImpl_a79cd5a9
 */
public class RoleEJBBeanInjectorImpl_a79cd5a9 implements com.nri.ejb.websphere_deploy.RoleEJBBeanInjector_a79cd5a9 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteRoleEJB_a79cd5a9 concreteBean=(com.nri.ejb.ConcreteRoleEJB_a79cd5a9)cb;
		record.set(0,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getRole()));
		record.set(1,concreteBean.getRoleName());
		record.set(2,concreteBean.getComment());
		record.set(3,concreteBean.getSortOrder());
		record.set(4,concreteBean.getTaskComment());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteRoleEJB_a79cd5a9 concreteBean=(com.nri.ejb.ConcreteRoleEJB_a79cd5a9)cb;
		record.set(0,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getRole()));
		record.set(1,concreteBean.getRoleName());
		record.set(2,concreteBean.getComment());
		record.set(3,concreteBean.getSortOrder());
		record.set(4,concreteBean.getTaskComment());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteRoleEJB_a79cd5a9 concreteBean=(com.nri.ejb.ConcreteRoleEJB_a79cd5a9)cb;
		record.set(0,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getRole()));
	}
	/**
	 * ejbFindByRoleName
	 */
	public void ejbFindByRoleName(java.lang.String name, javax.resource.cci.IndexedRecord record) {
		record.set(0,name);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.String pkey=(java.lang.String)pkeyObject;
		record.set(0,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(pkey));
	}
}
