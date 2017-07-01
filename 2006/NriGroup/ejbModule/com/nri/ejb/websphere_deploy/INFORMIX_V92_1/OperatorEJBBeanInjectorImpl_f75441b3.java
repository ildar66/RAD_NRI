package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * OperatorEJBBeanInjectorImpl_f75441b3
 */
public class OperatorEJBBeanInjectorImpl_f75441b3 implements com.nri.ejb.websphere_deploy.OperatorEJBBeanInjector_f75441b3 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteOperatorEJB_f75441b3 concreteBean=(com.nri.ejb.ConcreteOperatorEJB_f75441b3)cb;
		record.set(0,concreteBean.getOperator());
		record.set(1,concreteBean.getMan());
		record.set(2,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getLoginID()));
		record.set(3,concreteBean.getPassword());
		record.set(4,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsEnabled()));
		record.set(5,concreteBean.getMsuCode());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteOperatorEJB_f75441b3 concreteBean=(com.nri.ejb.ConcreteOperatorEJB_f75441b3)cb;
		record.set(0,concreteBean.getOperator());
		record.set(1,concreteBean.getMan());
		record.set(2,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getLoginID()));
		record.set(3,concreteBean.getPassword());
		record.set(4,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsEnabled()));
		record.set(5,concreteBean.getMsuCode());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteOperatorEJB_f75441b3 concreteBean=(com.nri.ejb.ConcreteOperatorEJB_f75441b3)cb;
		record.set(0,concreteBean.getOperator());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
}
