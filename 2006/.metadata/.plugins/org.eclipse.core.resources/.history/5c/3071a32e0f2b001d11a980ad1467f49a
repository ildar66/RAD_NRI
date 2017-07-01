package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * CompanyEJBBeanInjectorImpl_8d2adc68
 */
public class CompanyEJBBeanInjectorImpl_8d2adc68 implements com.nri.ejb.websphere_deploy.CompanyEJBBeanInjector_8d2adc68 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteCompanyEJB_8d2adc68 concreteBean=(com.nri.ejb.ConcreteCompanyEJB_8d2adc68)cb;
		record.set(0,concreteBean.getName());
		record.set(1,concreteBean.getShortName());
		record.set(2,concreteBean.getCompany());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteCompanyEJB_8d2adc68 concreteBean=(com.nri.ejb.ConcreteCompanyEJB_8d2adc68)cb;
		record.set(0,concreteBean.getName());
		record.set(1,concreteBean.getShortName());
		record.set(2,concreteBean.getCompany());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteCompanyEJB_8d2adc68 concreteBean=(com.nri.ejb.ConcreteCompanyEJB_8d2adc68)cb;
		record.set(2,concreteBean.getCompany());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
}
