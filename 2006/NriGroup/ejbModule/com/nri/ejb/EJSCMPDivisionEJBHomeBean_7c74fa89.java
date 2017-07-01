package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPDivisionEJBHomeBean_7c74fa89
 */
public class EJSCMPDivisionEJBHomeBean_7c74fa89 extends EJSHome {
	/**
	 * EJSCMPDivisionEJBHomeBean_7c74fa89
	 */
	public EJSCMPDivisionEJBHomeBean_7c74fa89() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.DivisionEJBLocal findByPrimaryKey_Local(java.lang.Integer primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.DivisionEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.DivisionEJBLocal create_Local(java.lang.Integer division) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.DivisionEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.DivisionEJBBean bean = (com.nri.ejb.DivisionEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(division);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.DivisionEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(division);
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
	public com.nri.ejb.DivisionEJBLocal create_Local(java.lang.Integer division, java.lang.String type, java.lang.Integer encloser, java.lang.String name, java.lang.String shortName, java.lang.Integer boss, java.lang.Integer company, java.lang.Boolean isActive) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.DivisionEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.DivisionEJBBean bean = (com.nri.ejb.DivisionEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(division, type, encloser, name, shortName, boss, company, isActive);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.DivisionEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(division, type, encloser, name, shortName, boss, company, isActive);
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
		com.nri.ejb.ConcreteDivisionEJB_7c74fa89 tmpEJB = (com.nri.ejb.ConcreteDivisionEJB_7c74fa89) generalEJB;
		return tmpEJB.getDivision();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.Integer keyFromFields(java.lang.Integer f0) {
		return f0;
	}
}
