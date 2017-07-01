package com.nri.sequence.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPSequenceHomeBean_61331c68
 */
public class EJSCMPSequenceHomeBean_61331c68 extends EJSHome {
	/**
	 * EJSCMPSequenceHomeBean_61331c68
	 */
	public EJSCMPSequenceHomeBean_61331c68() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.nri.sequence.ejb.SequenceLocal findByPrimaryKey_Local(java.lang.String primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.nri.sequence.ejb.SequenceLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.nri.sequence.ejb.SequenceLocal create_Local(java.lang.String id) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.nri.sequence.ejb.SequenceLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.nri.sequence.ejb.SequenceBean bean = (com.nri.sequence.ejb.SequenceBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(id);
			Object ejsKey = keyFromBean(bean);
			result = (com.nri.sequence.ejb.SequenceLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(id);
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
		com.nri.sequence.ejb.ConcreteSequence_61331c68 tmpEJB = (com.nri.sequence.ejb.ConcreteSequence_61331c68) generalEJB;
		return tmpEJB.getId();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.String keyFromFields(java.lang.String f0) {
		return f0;
	}
}
