package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * CompanyEJBBeanInjectorImpl_8d2adc68
 */
public class CompanyEJBBeanInjectorImpl_8d2adc68 implements com.nri.ejb.websphere_deploy.CompanyEJBBeanInjector_8d2adc68 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteCompanyEJB_8d2adc68 concreteBean=(com.nri.ejb.ConcreteCompanyEJB_8d2adc68)cb;
		record.set(0,concreteBean.getCompany());
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getName()));
		record.set(2,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getShortName()));
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteCompanyEJB_8d2adc68 concreteBean=(com.nri.ejb.ConcreteCompanyEJB_8d2adc68)cb;
		record.set(0,concreteBean.getCompany());
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getName()));
		record.set(2,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getShortName()));
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteCompanyEJB_8d2adc68 concreteBean=(com.nri.ejb.ConcreteCompanyEJB_8d2adc68)cb;
		record.set(0,concreteBean.getCompany());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
}
