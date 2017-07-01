package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * DivisionEJBBeanInjectorImpl_7c74fa89
 */
public class DivisionEJBBeanInjectorImpl_7c74fa89 implements com.nri.ejb.websphere_deploy.DivisionEJBBeanInjector_7c74fa89 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteDivisionEJB_7c74fa89 concreteBean=(com.nri.ejb.ConcreteDivisionEJB_7c74fa89)cb;
		record.set(0,concreteBean.getType());
		record.set(1,concreteBean.getEncloser());
		record.set(2,concreteBean.getName());
		record.set(3,concreteBean.getShortName());
		record.set(4,concreteBean.getBoss());
		record.set(5,concreteBean.getCompany());
		record.set(6,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
		record.set(7,concreteBean.getDivision());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteDivisionEJB_7c74fa89 concreteBean=(com.nri.ejb.ConcreteDivisionEJB_7c74fa89)cb;
		record.set(0,concreteBean.getType());
		record.set(1,concreteBean.getEncloser());
		record.set(2,concreteBean.getName());
		record.set(3,concreteBean.getShortName());
		record.set(4,concreteBean.getBoss());
		record.set(5,concreteBean.getCompany());
		record.set(6,com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(concreteBean.getIsActive()));
		record.set(7,concreteBean.getDivision());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteDivisionEJB_7c74fa89 concreteBean=(com.nri.ejb.ConcreteDivisionEJB_7c74fa89)cb;
		record.set(7,concreteBean.getDivision());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
}
