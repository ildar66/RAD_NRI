package com.nri.sequence.ejb.websphere_deploy.INFORMIX_V94_1;

/**
 * SequenceBeanInjectorImpl_61331c68
 */
public class SequenceBeanInjectorImpl_61331c68 implements com.nri.sequence.ejb.websphere_deploy.SequenceBeanInjector_61331c68 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.sequence.ejb.ConcreteSequence_61331c68 concreteBean=(com.nri.sequence.ejb.ConcreteSequence_61331c68)cb;
		record.set(0,concreteBean.getId());
		record.set(1,new Integer(concreteBean.getValue()));
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.sequence.ejb.ConcreteSequence_61331c68 concreteBean=(com.nri.sequence.ejb.ConcreteSequence_61331c68)cb;
		record.set(0,concreteBean.getId());
		record.set(1,new Integer(concreteBean.getValue()));
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.sequence.ejb.ConcreteSequence_61331c68 concreteBean=(com.nri.sequence.ejb.ConcreteSequence_61331c68)cb;
		record.set(0,concreteBean.getId());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.String pkey=(java.lang.String)pkeyObject;
		record.set(0,pkey);
	}
}
