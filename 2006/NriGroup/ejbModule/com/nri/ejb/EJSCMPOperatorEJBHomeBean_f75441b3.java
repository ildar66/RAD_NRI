package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPOperatorEJBHomeBean_f75441b3
 */
public class EJSCMPOperatorEJBHomeBean_f75441b3 extends EJSHome {
	/**
	 * EJSCMPOperatorEJBHomeBean_f75441b3
	 */
	public EJSCMPOperatorEJBHomeBean_f75441b3() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.OperatorEJBLocal findByPrimaryKey_Local(java.lang.Integer primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.OperatorEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.OperatorEJBLocal create_Local(java.lang.Integer operator) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.OperatorEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.OperatorEJBBean bean = (com.nri.ejb.OperatorEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(operator);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.OperatorEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(operator);
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
	 * create_Local
	 */
	public com.nri.ejb.OperatorEJBLocal create_Local(java.lang.Integer operator, java.lang.Integer man, java.lang.String loginID, java.lang.String password, java.lang.Boolean isEnabled) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.OperatorEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.OperatorEJBBean bean = (com.nri.ejb.OperatorEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(operator, man, loginID, password, isEnabled);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.OperatorEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(operator, man, loginID, password, isEnabled);
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
	 * keyFromBean
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		com.nri.ejb.ConcreteOperatorEJB_f75441b3 tmpEJB = (com.nri.ejb.ConcreteOperatorEJB_f75441b3) generalEJB;
		return tmpEJB.getOperator();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.Integer keyFromFields(java.lang.Integer f0) {
		return f0;
	}
}
