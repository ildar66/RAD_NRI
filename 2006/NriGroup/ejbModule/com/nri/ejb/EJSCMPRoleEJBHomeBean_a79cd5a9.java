package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPRoleEJBHomeBean_a79cd5a9
 */
public class EJSCMPRoleEJBHomeBean_a79cd5a9 extends EJSHome {
	/**
	 * EJSCMPRoleEJBHomeBean_a79cd5a9
	 */
	public EJSCMPRoleEJBHomeBean_a79cd5a9() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.ejb.RoleEJBLocal findByPrimaryKey_Local(java.lang.String primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.ejb.RoleEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.ejb.RoleEJBLocal create_Local(java.lang.String role, java.lang.String roleName, java.lang.String comment, java.lang.Integer sortOrder, java.lang.String taskComment) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.RoleEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.RoleEJBBean bean = (com.nri.ejb.RoleEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(role, roleName, comment, sortOrder, taskComment);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.RoleEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(role, roleName, comment, sortOrder, taskComment);
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
			com.nri.ejb.ConcreteRoleEJB_a79cd5a9 bean = (com.nri.ejb.ConcreteRoleEJB_a79cd5a9) beanO.getEnterpriseBean();
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
	 * create_Local
	 */
	public com.nri.ejb.RoleEJBLocal create_Local(java.lang.String role) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.ejb.RoleEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.ejb.RoleEJBBean bean = (com.nri.ejb.RoleEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(role);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.ejb.RoleEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(role);
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
	 * findByRoleName_Local
	 */
	public java.util.Collection findByRoleName_Local(java.lang.String name) throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			com.nri.ejb.ConcreteRoleEJB_a79cd5a9 bean = (com.nri.ejb.ConcreteRoleEJB_a79cd5a9) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindByRoleName_Local(name);
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
		com.nri.ejb.ConcreteRoleEJB_a79cd5a9 tmpEJB = (com.nri.ejb.ConcreteRoleEJB_a79cd5a9) generalEJB;
		return tmpEJB.getRole();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.String keyFromFields(java.lang.String f0) {
		return f0;
	}
}
