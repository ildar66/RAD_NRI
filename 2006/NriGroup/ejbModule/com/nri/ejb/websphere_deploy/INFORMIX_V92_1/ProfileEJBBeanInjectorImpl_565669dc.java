package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * ProfileEJBBeanInjectorImpl_565669dc
 */
public class ProfileEJBBeanInjectorImpl_565669dc implements com.nri.ejb.websphere_deploy.ProfileEJBBeanInjector_565669dc {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteProfileEJB_565669dc concreteBean=(com.nri.ejb.ConcreteProfileEJB_565669dc)cb;
		record.set(0,concreteBean.getOperatorID());
		record.set(1,concreteBean.getKey());
		record.set(2,concreteBean.getName());
		record.set(3,concreteBean.getType());
		record.set(4,concreteBean.getNum_value());
		record.set(5,concreteBean.getStr_value());
		record.set(6,concreteBean.getDate_value());
		record.set(7,concreteBean.getKey_type());
		record.set(8,concreteBean.getModified());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteProfileEJB_565669dc concreteBean=(com.nri.ejb.ConcreteProfileEJB_565669dc)cb;
		record.set(0,concreteBean.getOperatorID());
		record.set(1,concreteBean.getKey());
		record.set(2,concreteBean.getName());
		record.set(3,concreteBean.getType());
		record.set(4,concreteBean.getNum_value());
		record.set(5,concreteBean.getStr_value());
		record.set(6,concreteBean.getDate_value());
		record.set(7,concreteBean.getKey_type());
		record.set(8,concreteBean.getModified());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.nri.ejb.ConcreteProfileEJB_565669dc concreteBean=(com.nri.ejb.ConcreteProfileEJB_565669dc)cb;
		record.set(0,concreteBean.getOperatorID());
		record.set(1,concreteBean.getKey());
		record.set(2,concreteBean.getName());
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
