package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPMsUserEJBHomeBean_da8ec80c
 */
public class EJSCMPMsUserEJBHomeBean_da8ec80c extends EJSHome {
	/**
	 * EJSCMPMsUserEJBHomeBean_da8ec80c
	 */
	public EJSCMPMsUserEJBHomeBean_da8ec80c() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.MsUserEJBLocal findByPrimaryKey_Local(java.lang.Integer primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.MsUserEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.MsUserEJBLocal create_Local(java.lang.Integer msuCode) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.MsUserEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.MsUserEJBBean bean = (com.nri.ejb.MsUserEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(msuCode);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.MsUserEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(msuCode);
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
	public com.nri.ejb.MsUserEJBLocal create_Local(java.lang.Integer msuCode, java.lang.String msUser, java.lang.String msPassword) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.MsUserEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.MsUserEJBBean bean = (com.nri.ejb.MsUserEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(msuCode, msUser, msPassword);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.MsUserEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(msuCode, msUser, msPassword);
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
		com.nri.ejb.ConcreteMsUserEJB_da8ec80c tmpEJB = (com.nri.ejb.ConcreteMsUserEJB_da8ec80c) generalEJB;
		return tmpEJB.getMsuCode();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.Integer keyFromFields(java.lang.Integer f0) {
		return f0;
	}
}
