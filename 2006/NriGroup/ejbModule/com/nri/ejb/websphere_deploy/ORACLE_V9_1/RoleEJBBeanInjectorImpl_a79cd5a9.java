package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * RoleEJBBeanInjectorImpl_a79cd5a9
 */
public class RoleEJBBeanInjectorImpl_a79cd5a9 implements com.nri.ejb.websphere_deploy.RoleEJBBeanInjector_a79cd5a9 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteRoleEJB_a79cd5a9 concreteBean=(com.nri.ejb.ConcreteRoleEJB_a79cd5a9)cb;
		record.set(0,concreteBean.getRoleName());
		record.set(1,concreteBean.getComment());
		record.set(2,concreteBean.getSortOrder());
		record.set(3,concreteBean.getTaskComment());
		record.set(4,concreteBean.getRole());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteRoleEJB_a79cd5a9 concreteBean=(com.nri.ejb.ConcreteRoleEJB_a79cd5a9)cb;
		record.set(0,concreteBean.getRoleName());
		record.set(1,concreteBean.getComment());
		record.set(2,concreteBean.getSortOrder());
		record.set(3,concreteBean.getTaskComment());
		record.set(4,concreteBean.getRole());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteRoleEJB_a79cd5a9 concreteBean=(com.nri.ejb.ConcreteRoleEJB_a79cd5a9)cb;
		record.set(4,concreteBean.getRole());
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
		record.set(0,pkey);
	}
}
