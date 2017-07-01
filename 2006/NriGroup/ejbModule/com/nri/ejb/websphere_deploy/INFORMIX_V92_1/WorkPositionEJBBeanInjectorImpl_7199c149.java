package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * WorkPositionEJBBeanInjectorImpl_7199c149
 */
public class WorkPositionEJBBeanInjectorImpl_7199c149 implements com.nri.ejb.websphere_deploy.WorkPositionEJBBeanInjector_7199c149 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteWorkPositionEJB_7199c149 concreteBean=(com.nri.ejb.ConcreteWorkPositionEJB_7199c149)cb;
		record.set(0,concreteBean.getWorkPosition());
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getName()));
		record.set(2,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteWorkPositionEJB_7199c149 concreteBean=(com.nri.ejb.ConcreteWorkPositionEJB_7199c149)cb;
		record.set(0,concreteBean.getWorkPosition());
		record.set(1,com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(concreteBean.getName()));
		record.set(2,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteWorkPositionEJB_7199c149 concreteBean=(com.nri.ejb.ConcreteWorkPositionEJB_7199c149)cb;
		record.set(0,concreteBean.getWorkPosition());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
}
