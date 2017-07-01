package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPCompanyEJBHomeBean_8d2adc68
 */
public class EJSCMPCompanyEJBHomeBean_8d2adc68 extends EJSHome {
	/**
	 * EJSCMPCompanyEJBHomeBean_8d2adc68
	 */
	public EJSCMPCompanyEJBHomeBean_8d2adc68() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.CompanyEJBLocal findByPrimaryKey_Local(java.lang.Integer primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.CompanyEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.CompanyEJBLocal create_Local(java.lang.Integer company) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.CompanyEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.CompanyEJBBean bean = (com.nri.ejb.CompanyEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(company);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.CompanyEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(company);
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
	public com.nri.ejb.CompanyEJBLocal create_Local(java.lang.Integer company, java.lang.String name, java.lang.String shortName) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.CompanyEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.CompanyEJBBean bean = (com.nri.ejb.CompanyEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(company, name, shortName);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.CompanyEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(company, name, shortName);
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
	 * findAll_Local
	 */
	public java.util.Collection findAll_Local() throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			com.nri.ejb.ConcreteCompanyEJB_8d2adc68 bean = (com.nri.ejb.ConcreteCompanyEJB_8d2adc68) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAll_Local();
			result = super.getCMP20Collection_Local(pKeys);
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
		}
		catch (javax.ejb.FinderException finderEx) {
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
			throw finderEx;
		}
		finally {
			if (beanO != null )
				super.discardFinderEntityBeanO(beanO);
		}
		return result;
	}
	/**
	 * keyFromBean
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		com.nri.ejb.ConcreteCompanyEJB_8d2adc68 tmpEJB = (com.nri.ejb.ConcreteCompanyEJB_8d2adc68) generalEJB;
		return tmpEJB.getCompany();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.Integer keyFromFields(java.lang.Integer f0) {
		return f0;
	}
}
