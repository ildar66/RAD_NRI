package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPWorkerEJBHomeBean_7ee08407
 */
public class EJSCMPWorkerEJBHomeBean_7ee08407 extends EJSHome {
	/**
	 * EJSCMPWorkerEJBHomeBean_7ee08407
	 */
	public EJSCMPWorkerEJBHomeBean_7ee08407() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.WorkerEJBLocal findByPrimaryKey_Local(java.lang.Integer primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.WorkerEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.WorkerEJBLocal create_Local(java.lang.Integer worker) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.WorkerEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.WorkerEJBBean bean = (com.nri.ejb.WorkerEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(worker);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.WorkerEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(worker);
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
	public com.nri.ejb.WorkerEJBLocal create_Local(java.lang.Integer worker, java.lang.Integer man, java.lang.Integer workPosition, java.lang.Boolean isOur, java.lang.Boolean isServiceStuff) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.WorkerEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.WorkerEJBBean bean = (com.nri.ejb.WorkerEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(worker, man, workPosition, isOur, isServiceStuff);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.WorkerEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(worker, man, workPosition, isOur, isServiceStuff);
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
		com.nri.ejb.ConcreteWorkerEJB_7ee08407 tmpEJB = (com.nri.ejb.ConcreteWorkerEJB_7ee08407) generalEJB;
		return tmpEJB.getWorker();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.Integer keyFromFields(java.lang.Integer f0) {
		return f0;
	}
}
