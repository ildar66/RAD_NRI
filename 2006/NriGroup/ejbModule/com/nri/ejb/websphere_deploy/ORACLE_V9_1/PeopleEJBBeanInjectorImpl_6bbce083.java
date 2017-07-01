package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * PeopleEJBBeanInjectorImpl_6bbce083
 */
public class PeopleEJBBeanInjectorImpl_6bbce083 implements com.nri.ejb.websphere_deploy.PeopleEJBBeanInjector_6bbce083 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcretePeopleEJB_6bbce083 concreteBean=(com.nri.ejb.ConcretePeopleEJB_6bbce083)cb;
		record.set(0,concreteBean.getFirstName());
		record.set(1,concreteBean.getLastName());
		record.set(2,concreteBean.getMiddleName());
		record.set(3,concreteBean.getPassportSer());
		record.set(4,concreteBean.getPassportDate());
		record.set(5,concreteBean.getPassportWhom());
		record.set(6,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
		record.set(7,concreteBean.getTabNum());
		record.set(8,concreteBean.getMan());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcretePeopleEJB_6bbce083 concreteBean=(com.nri.ejb.ConcretePeopleEJB_6bbce083)cb;
		record.set(0,concreteBean.getFirstName());
		record.set(1,concreteBean.getLastName());
		record.set(2,concreteBean.getMiddleName());
		record.set(3,concreteBean.getPassportSer());
		record.set(4,concreteBean.getPassportDate());
		record.set(5,concreteBean.getPassportWhom());
		record.set(6,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
		record.set(7,concreteBean.getTabNum());
		record.set(8,concreteBean.getMan());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcretePeopleEJB_6bbce083 concreteBean=(com.nri.ejb.ConcretePeopleEJB_6bbce083)cb;
		record.set(8,concreteBean.getMan());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
}
