package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * PeopleEJBBeanInjectorImpl_6bbce083
 */
public class PeopleEJBBeanInjectorImpl_6bbce083 implements com.nri.ejb.websphere_deploy.PeopleEJBBeanInjector_6bbce083 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcretePeopleEJB_6bbce083 concreteBean=(com.nri.ejb.ConcretePeopleEJB_6bbce083)cb;
		record.set(0,concreteBean.getMan());
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getFirstName()));
		record.set(2,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getLastName()));
		record.set(3,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getMiddleName()));
		record.set(4,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getPassportSer()));
		record.set(5,concreteBean.getPassportDate());
		record.set(6,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getPassportWhom()));
		record.set(7,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
		record.set(8,concreteBean.getTabNum());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcretePeopleEJB_6bbce083 concreteBean=(com.nri.ejb.ConcretePeopleEJB_6bbce083)cb;
		record.set(0,concreteBean.getMan());
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getFirstName()));
		record.set(2,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getLastName()));
		record.set(3,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getMiddleName()));
		record.set(4,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getPassportSer()));
		record.set(5,concreteBean.getPassportDate());
		record.set(6,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getPassportWhom()));
		record.set(7,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
		record.set(8,concreteBean.getTabNum());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcretePeopleEJB_6bbce083 concreteBean=(com.nri.ejb.ConcretePeopleEJB_6bbce083)cb;
		record.set(0,concreteBean.getMan());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
}
