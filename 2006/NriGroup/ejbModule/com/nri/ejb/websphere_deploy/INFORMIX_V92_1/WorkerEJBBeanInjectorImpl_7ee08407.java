package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * WorkerEJBBeanInjectorImpl_7ee08407
 */
public class WorkerEJBBeanInjectorImpl_7ee08407 implements com.nri.ejb.websphere_deploy.WorkerEJBBeanInjector_7ee08407 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteWorkerEJB_7ee08407 concreteBean=(com.nri.ejb.ConcreteWorkerEJB_7ee08407)cb;
		record.set(0,concreteBean.getWorker());
		record.set(1,concreteBean.getCompany());
		record.set(2,concreteBean.getMan());
		record.set(3,concreteBean.getWorkPosition());
		record.set(4,concreteBean.getDivision());
		record.set(5,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getLotusAddress()));
		record.set(6,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getEmail()));
		record.set(7,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getPhone1()));
		record.set(8,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getPhone2()));
		record.set(9,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getLocalPhone()));
		record.set(10,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getFax()));
		record.set(11,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getMobilePhone()));
		record.set(12,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
		record.set(13,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsOur()));
		record.set(14,concreteBean.getOrganization());
		record.set(15,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsServiceStuff()));
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteWorkerEJB_7ee08407 concreteBean=(com.nri.ejb.ConcreteWorkerEJB_7ee08407)cb;
		record.set(0,concreteBean.getWorker());
		record.set(1,concreteBean.getCompany());
		record.set(2,concreteBean.getMan());
		record.set(3,concreteBean.getWorkPosition());
		record.set(4,concreteBean.getDivision());
		record.set(5,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getLotusAddress()));
		record.set(6,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getEmail()));
		record.set(7,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getPhone1()));
		record.set(8,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getPhone2()));
		record.set(9,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getLocalPhone()));
		record.set(10,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getFax()));
		record.set(11,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getMobilePhone()));
		record.set(12,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
		record.set(13,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsOur()));
		record.set(14,concreteBean.getOrganization());
		record.set(15,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsServiceStuff()));
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteWorkerEJB_7ee08407 concreteBean=(com.nri.ejb.ConcreteWorkerEJB_7ee08407)cb;
		record.set(0,concreteBean.getWorker());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
}
