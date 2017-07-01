package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * ProfileEJBBeanInjectorImpl_565669dc
 */
public class ProfileEJBBeanInjectorImpl_565669dc implements com.nri.ejb.websphere_deploy.ProfileEJBBeanInjector_565669dc {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteProfileEJB_565669dc concreteBean=(com.nri.ejb.ConcreteProfileEJB_565669dc)cb;
		record.set(0,concreteBean.getNum_value());
		record.set(1,concreteBean.getStr_value());
		record.set(2,concreteBean.getDate_value());
		record.set(3,concreteBean.getKey_type());
		record.set(4,concreteBean.getModified());
		record.set(5,concreteBean.getOperatorID());
		record.set(6,concreteBean.getKey());
		record.set(7,concreteBean.getName());
		record.set(8,concreteBean.getType());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteProfileEJB_565669dc concreteBean=(com.nri.ejb.ConcreteProfileEJB_565669dc)cb;
		record.set(0,concreteBean.getNum_value());
		record.set(1,concreteBean.getStr_value());
		record.set(2,concreteBean.getDate_value());
		record.set(3,concreteBean.getKey_type());
		record.set(4,concreteBean.getModified());
		record.set(5,concreteBean.getOperatorID());
		record.set(6,concreteBean.getKey());
		record.set(7,concreteBean.getName());
		record.set(8,concreteBean.getType());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteProfileEJB_565669dc concreteBean=(com.nri.ejb.ConcreteProfileEJB_565669dc)cb;
		record.set(5,concreteBean.getOperatorID());
		record.set(6,concreteBean.getKey());
		record.set(7,concreteBean.getName());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ProfileEJBKey pkey=(com.nri.ejb.ProfileEJBKey)pkeyObject;
		record.set(0,pkey.operatorID);
		record.set(1,pkey.key);
		record.set(2,pkey.name);
	}
}
