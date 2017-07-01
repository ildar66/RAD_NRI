package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPWorkPositionEJBHomeBean_7199c149
 */
public class EJSCMPWorkPositionEJBHomeBean_7199c149 extends EJSHome {
	/**
	 * EJSCMPWorkPositionEJBHomeBean_7199c149
	 */
	public EJSCMPWorkPositionEJBHomeBean_7199c149() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.WorkPositionEJBLocal findByPrimaryKey_Local(java.lang.Integer primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.WorkPositionEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.WorkPositionEJBLocal create_Local(java.lang.Integer workPosition) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.WorkPositionEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.WorkPositionEJBBean bean = (com.nri.ejb.WorkPositionEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(workPosition);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.WorkPositionEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(workPosition);
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
	public com.nri.ejb.WorkPositionEJBLocal create_Local(java.lang.Integer workPosition, java.lang.String workPositionName, java.lang.Boolean isActive) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.WorkPositionEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.WorkPositionEJBBean bean = (com.nri.ejb.WorkPositionEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(workPosition, workPositionName, isActive);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.WorkPositionEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(workPosition, workPositionName, isActive);
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
		com.nri.ejb.ConcreteWorkPositionEJB_7199c149 tmpEJB = (com.nri.ejb.ConcreteWorkPositionEJB_7199c149) generalEJB;
		return tmpEJB.getWorkPosition();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.Integer keyFromFields(java.lang.Integer f0) {
		return f0;
	}
}
