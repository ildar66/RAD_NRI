package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPPeopleEJBHomeBean_6bbce083
 */
public class EJSCMPPeopleEJBHomeBean_6bbce083 extends EJSHome {
	/**
	 * EJSCMPPeopleEJBHomeBean_6bbce083
	 */
	public EJSCMPPeopleEJBHomeBean_6bbce083() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.PeopleEJBLocal findByPrimaryKey_Local(java.lang.Integer primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.PeopleEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.PeopleEJBLocal create_Local(java.lang.Integer man) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.PeopleEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.PeopleEJBBean bean = (com.nri.ejb.PeopleEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(man);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.PeopleEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(man);
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
	public com.nri.ejb.PeopleEJBLocal create_Local(java.lang.Integer man, java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, java.lang.String passportSer, java.sql.Date passportDate, java.lang.String passportWhom, java.lang.Boolean isActive, java.lang.Integer tabNum) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.PeopleEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.PeopleEJBBean bean = (com.nri.ejb.PeopleEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(man, firstName, lastName, middleName, passportSer, passportDate, passportWhom, isActive, tabNum);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.PeopleEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(man, firstName, lastName, middleName, passportSer, passportDate, passportWhom, isActive, tabNum);
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
		com.nri.ejb.ConcretePeopleEJB_6bbce083 tmpEJB = (com.nri.ejb.ConcretePeopleEJB_6bbce083) generalEJB;
		return tmpEJB.getMan();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.Integer keyFromFields(java.lang.Integer f0) {
		return f0;
	}
}
