package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPProfileEJBHomeBean_565669dc
 */
public class EJSCMPProfileEJBHomeBean_565669dc extends EJSHome {
	/**
	 * EJSCMPProfileEJBHomeBean_565669dc
	 */
	public EJSCMPProfileEJBHomeBean_565669dc() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.ProfileEJBLocal create_Local(java.lang.Integer operatorID, java.lang.String key, java.lang.String name, java.lang.Integer type, java.lang.Integer key_type) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.ProfileEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.ProfileEJBBean bean = (com.nri.ejb.ProfileEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(operatorID, key, name, type, key_type);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.ProfileEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(operatorID, key, name, type, key_type);
			super.afterPostCreate(beanO, ejsKey);
		}
		catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if(preCreateFlag && !createFailed)
				super.afterPostCreateCompletion(beanO);
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.ProfileEJBLocal findByPrimaryKey_Local(com.nri.ejb.ProfileEJBKey primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.ProfileEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * keyFromBean
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		com.nri.ejb.ConcreteProfileEJB_565669dc tmpEJB = (com.nri.ejb.ConcreteProfileEJB_565669dc) generalEJB;
		com.nri.ejb.ProfileEJBKey keyClass = new com.nri.ejb.ProfileEJBKey();
		keyClass.operatorID = tmpEJB.getOperatorID();
		keyClass.key = tmpEJB.getKey();
		keyClass.name = tmpEJB.getName();
		return keyClass;
	}
	/**
	 * keyFromFields
	 */
	public com.nri.ejb.ProfileEJBKey keyFromFields(java.lang.Integer f0, java.lang.String f1, java.lang.String f2) {
		com.nri.ejb.ProfileEJBKey keyClass = new com.nri.ejb.ProfileEJBKey();
		keyClass.operatorID = f0;
		keyClass.key = f1;
		keyClass.name = f2;
		return keyClass;
	}
}
