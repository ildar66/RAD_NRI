package com.nri.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSRemoteStatelessSecurityActionProcessorFacade_091e7b3f
 */
public class EJSRemoteStatelessSecurityActionProcessorFacade_091e7b3f extends EJSWrapper implements SecurityActionProcessorFacade {
	/**
	 * EJSRemoteStatelessSecurityActionProcessorFacade_091e7b3f
	 */
	public EJSRemoteStatelessSecurityActionProcessorFacade_091e7b3f() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findCompanyByKey
	 */
	public com.nri.domain.Company findCompanyByKey(java.lang.Integer aId) throws com.nri.exception.NoSuchCompanyException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.Company _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.findCompanyByKey(aId);
		}
		catch (com.nri.exception.NoSuchCompanyException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findDivisionByKey
	 */
	public com.nri.domain.Division findDivisionByKey(java.lang.Integer aId) throws com.nri.exception.NoSuchDivisionException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.Division _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.findDivisionByKey(aId);
		}
		catch (com.nri.exception.NoSuchDivisionException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findMsUserByKey
	 */
	public com.nri.domain.MsUser findMsUserByKey(java.lang.Integer aId) throws com.nri.exception.NoSuchMsUserException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.MsUser _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = _EJS_beanRef.findMsUserByKey(aId);
		}
		catch (com.nri.exception.NoSuchMsUserException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorByKey
	 */
	public com.nri.domain.Operator findOperatorByKey(java.lang.Integer aId) throws com.nri.exception.NoSuchOperatorException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.Operator _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = _EJS_beanRef.findOperatorByKey(aId);
		}
		catch (com.nri.exception.NoSuchOperatorException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findPeoplesByName
	 */
	public com.nri.domain.Page findPeoplesByName(java.lang.String namePeople, java.lang.Boolean isActive, int start, int count, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.Page _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = _EJS_beanRef.findPeoplesByName(namePeople, isActive, start, count, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 4, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findPeopleByKey
	 */
	public com.nri.domain.People findPeopleByKey(java.lang.Integer aId) throws com.nri.exception.NoSuchPeopleException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.People _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 5, _EJS_s);
			_EJS_result = _EJS_beanRef.findPeopleByKey(aId);
		}
		catch (com.nri.exception.NoSuchPeopleException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findProfileByKey
	 */
	public com.nri.domain.Profile findProfileByKey(com.nri.domain.Profile aId) throws com.nri.exception.NoSuchProfileException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.Profile _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 6, _EJS_s);
			_EJS_result = _EJS_beanRef.findProfileByKey(aId);
		}
		catch (com.nri.exception.NoSuchProfileException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findRoleByKey
	 */
	public com.nri.domain.Role findRoleByKey(java.lang.String aId) throws com.nri.exception.NoSuchRoleException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.Role _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 7, _EJS_s);
			_EJS_result = _EJS_beanRef.findRoleByKey(aId);
		}
		catch (com.nri.exception.NoSuchRoleException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 7, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findWorkPositionByKey
	 */
	public com.nri.domain.WorkPosition findWorkPositionByKey(java.lang.Integer aId) throws com.nri.exception.NoSuchWorkPositionException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.WorkPosition _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 8, _EJS_s);
			_EJS_result = _EJS_beanRef.findWorkPositionByKey(aId);
		}
		catch (com.nri.exception.NoSuchWorkPositionException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 8, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findWorkerByKey
	 */
	public com.nri.domain.Worker findWorkerByKey(java.lang.Integer aId) throws com.nri.exception.NoSuchWorkerException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		com.nri.domain.Worker _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 9, _EJS_s);
			_EJS_result = _EJS_beanRef.findWorkerByKey(aId);
		}
		catch (com.nri.exception.NoSuchWorkerException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 9, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAllCompanies
	 */
	public java.util.ArrayList findAllCompanies() throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 10, _EJS_s);
			_EJS_result = _EJS_beanRef.findAllCompanies();
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 10, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAllPeoples
	 */
	public java.util.ArrayList findAllPeoples() throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 11, _EJS_s);
			_EJS_result = _EJS_beanRef.findAllPeoples();
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 11, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAllRoles
	 */
	public java.util.ArrayList findAllRoles() throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 12, _EJS_s);
			_EJS_result = _EJS_beanRef.findAllRoles();
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 12, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAllTerrabyteServers
	 */
	public java.util.ArrayList findAllTerrabyteServers() throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 13, _EJS_s);
			_EJS_result = _EJS_beanRef.findAllTerrabyteServers();
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 13, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findCompanies
	 */
	public java.util.ArrayList findCompanies(java.lang.String nameCompany, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 14, _EJS_s);
			_EJS_result = _EJS_beanRef.findCompanies(nameCompany, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 14, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findDivisions
	 */
	public java.util.ArrayList findDivisions(java.lang.String nameDivision, java.lang.Integer company, java.lang.Boolean isActive, com.nri.domain.DivisionType type, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 15, _EJS_s);
			_EJS_result = _EJS_beanRef.findDivisions(nameDivision, company, isActive, type, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 15, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findDivisions
	 */
	public java.util.ArrayList findDivisions(java.lang.String nameDivision, java.lang.Integer company, java.lang.Boolean isActive, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 16, _EJS_s);
			_EJS_result = _EJS_beanRef.findDivisions(nameDivision, company, isActive, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 16, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findDivisionsHierarchy
	 */
	public java.util.ArrayList findDivisionsHierarchy(java.lang.Integer encloserKey, java.lang.Boolean isActive, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 17, _EJS_s);
			_EJS_result = _EJS_beanRef.findDivisionsHierarchy(encloserKey, isActive, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 17, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findMsUsers
	 */
	public java.util.ArrayList findMsUsers(java.lang.String nameMsUser, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 18, _EJS_s);
			_EJS_result = _EJS_beanRef.findMsUsers(nameMsUser, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 18, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findNfsUsers
	 */
	public java.util.ArrayList findNfsUsers(java.lang.String nameNfsUser, java.lang.Boolean isActive, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 19, _EJS_s);
			_EJS_result = _EJS_beanRef.findNfsUsers(nameNfsUser, isActive, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 19, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToRegionAccessList
	 */
	public java.util.ArrayList findOperatorToRegionAccessList(java.lang.Integer operatorKey, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 20, _EJS_s);
			_EJS_result = _EJS_beanRef.findOperatorToRegionAccessList(operatorKey, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 20, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToRegionList
	 */
	public java.util.ArrayList findOperatorToRegionList(java.lang.Integer operatorKey, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 21, _EJS_s);
			_EJS_result = _EJS_beanRef.findOperatorToRegionList(operatorKey, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 21, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToRoleAccessList
	 */
	public java.util.ArrayList findOperatorToRoleAccessList(java.lang.Integer operatorKey, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 22, _EJS_s);
			_EJS_result = _EJS_beanRef.findOperatorToRoleAccessList(operatorKey, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 22, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToRoleList
	 */
	public java.util.ArrayList findOperatorToRoleList(java.lang.Integer operatorKey, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 23, _EJS_s);
			_EJS_result = _EJS_beanRef.findOperatorToRoleList(operatorKey, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 23, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToSuperRegionAccessList
	 */
	public java.util.ArrayList findOperatorToSuperRegionAccessList(java.lang.Integer operatorKey, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 24, _EJS_s);
			_EJS_result = _EJS_beanRef.findOperatorToSuperRegionAccessList(operatorKey, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 24, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToSuperRegionList
	 */
	public java.util.ArrayList findOperatorToSuperRegionList(java.lang.Integer operatorKey, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 25, _EJS_s);
			_EJS_result = _EJS_beanRef.findOperatorToSuperRegionList(operatorKey, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 25, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperators
	 */
	public java.util.ArrayList findOperators(java.lang.Integer peopleKey, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 26, _EJS_s);
			_EJS_result = _EJS_beanRef.findOperators(peopleKey, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 26, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findPeopleToNfsUserList
	 */
	public java.util.ArrayList findPeopleToNfsUserList(java.lang.Integer peopleKey, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 27, _EJS_s);
			_EJS_result = _EJS_beanRef.findPeopleToNfsUserList(peopleKey, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 27, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findPeoplesByName
	 */
	public java.util.ArrayList findPeoplesByName(java.lang.String name) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 28, _EJS_s);
			_EJS_result = _EJS_beanRef.findPeoplesByName(name);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 28, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findRolesByName
	 */
	public java.util.ArrayList findRolesByName(java.lang.String nameRole) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 29, _EJS_s);
			_EJS_result = _EJS_beanRef.findRolesByName(nameRole);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 29, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findRolesByName
	 */
	public java.util.ArrayList findRolesByName(java.lang.String nameRole, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 30, _EJS_s);
			_EJS_result = _EJS_beanRef.findRolesByName(nameRole, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 30, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findWorkPositions
	 */
	public java.util.ArrayList findWorkPositions(java.lang.String nameWorkPosition, java.lang.Boolean isActive, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 31, _EJS_s);
			_EJS_result = _EJS_beanRef.findWorkPositions(nameWorkPosition, isActive, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 31, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findWorkers
	 */
	public java.util.ArrayList findWorkers(com.nri.domain.Worker query, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 32, _EJS_s);
			_EJS_result = _EJS_beanRef.findWorkers(query, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 32, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findWorkers
	 */
	public java.util.ArrayList findWorkers(java.lang.String name, com.nri.domain.Worker query, java.lang.String orderBy) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 33, _EJS_s);
			_EJS_result = _EJS_beanRef.findWorkers(name, query, orderBy);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 33, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findDivisionHierarchyForEncloser
	 */
	public java.util.List findDivisionHierarchyForEncloser(java.lang.Integer encloserKey, int depth) throws com.nri.exception.ModelException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.List _EJS_result = null;
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 34, _EJS_s);
			_EJS_result = _EJS_beanRef.findDivisionHierarchyForEncloser(encloserKey, depth);
		}
		catch (com.nri.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 34, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * addCompany
	 */
	public void addCompany(com.nri.domain.Company newCompany) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 35, _EJS_s);
			_EJS_beanRef.addCompany(newCompany);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 35, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addDivision
	 */
	public void addDivision(com.nri.domain.Division newDivision) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 36, _EJS_s);
			_EJS_beanRef.addDivision(newDivision);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 36, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkOperatorToRole
	 */
	public void addLinkOperatorToRole(java.lang.Integer operatorKey, java.lang.String roleKey) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 37, _EJS_s);
			_EJS_beanRef.addLinkOperatorToRole(operatorKey, roleKey);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 37, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkPeopleToNfsUser
	 */
	public void addLinkPeopleToNfsUser(java.lang.Integer peopleKey, java.lang.Integer nfsUserKey) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 38, _EJS_s);
			_EJS_beanRef.addLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 38, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addMsUser
	 */
	public void addMsUser(com.nri.domain.MsUser newMsUser) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 39, _EJS_s);
			_EJS_beanRef.addMsUser(newMsUser);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 39, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addOperator
	 */
	public void addOperator(com.nri.domain.Operator newOperator) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 40, _EJS_s);
			_EJS_beanRef.addOperator(newOperator);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 40, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addPeople
	 */
	public void addPeople(com.nri.domain.People newPeople) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 41, _EJS_s);
			_EJS_beanRef.addPeople(newPeople);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 41, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addProfile
	 */
	public void addProfile(com.nri.domain.Profile newProfile) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 42, _EJS_s);
			_EJS_beanRef.addProfile(newProfile);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 42, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addRole
	 */
	public void addRole(com.nri.domain.Role newRole) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 43, _EJS_s);
			_EJS_beanRef.addRole(newRole);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 43, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addWorkPosition
	 */
	public void addWorkPosition(com.nri.domain.WorkPosition newWorkPosition) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 44, _EJS_s);
			_EJS_beanRef.addWorkPosition(newWorkPosition);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 44, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addWorker
	 */
	public void addWorker(com.nri.domain.Worker newWorker) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 45, _EJS_s);
			_EJS_beanRef.addWorker(newWorker);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 45, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * clearInMemoryCaches
	 */
	public void clearInMemoryCaches() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 46, _EJS_s);
			_EJS_beanRef.clearInMemoryCaches();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 46, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkOperatorToRole
	 */
	public void deleteLinkOperatorToRole(java.lang.Integer operatorKey, java.lang.String roleKey) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 47, _EJS_s);
			_EJS_beanRef.deleteLinkOperatorToRole(operatorKey, roleKey);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 47, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkPeopleToNfsUser
	 */
	public void deleteLinkPeopleToNfsUser(java.lang.Integer peopleKey, java.lang.Integer nfsUserKey) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 48, _EJS_s);
			_EJS_beanRef.deleteLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 48, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeCompany
	 */
	public void removeCompany(java.lang.Integer aId) throws com.nri.exception.NoSuchCompanyException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 49, _EJS_s);
			_EJS_beanRef.removeCompany(aId);
		}
		catch (com.nri.exception.NoSuchCompanyException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 49, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeDivision
	 */
	public void removeDivision(java.lang.Integer aId) throws com.nri.exception.NoSuchDivisionException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 50, _EJS_s);
			_EJS_beanRef.removeDivision(aId);
		}
		catch (com.nri.exception.NoSuchDivisionException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 50, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeMsUser
	 */
	public void removeMsUser(java.lang.Integer aId) throws com.nri.exception.NoSuchMsUserException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 51, _EJS_s);
			_EJS_beanRef.removeMsUser(aId);
		}
		catch (com.nri.exception.NoSuchMsUserException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 51, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeOperator
	 */
	public void removeOperator(java.lang.Integer aId) throws com.nri.exception.NoSuchOperatorException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 52, _EJS_s);
			_EJS_beanRef.removeOperator(aId);
		}
		catch (com.nri.exception.NoSuchOperatorException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 52, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removePeople
	 */
	public void removePeople(java.lang.Integer aId) throws com.nri.exception.NoSuchPeopleException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 53, _EJS_s);
			_EJS_beanRef.removePeople(aId);
		}
		catch (com.nri.exception.NoSuchPeopleException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 53, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeProfile
	 */
	public void removeProfile(com.nri.domain.Profile aId) throws com.nri.exception.NoSuchProfileException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 54, _EJS_s);
			_EJS_beanRef.removeProfile(aId);
		}
		catch (com.nri.exception.NoSuchProfileException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 54, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeRole
	 */
	public void removeRole(java.lang.String aId) throws com.nri.exception.NoSuchRoleException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 55, _EJS_s);
			_EJS_beanRef.removeRole(aId);
		}
		catch (com.nri.exception.NoSuchRoleException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 55, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeWorkPosition
	 */
	public void removeWorkPosition(java.lang.Integer aId) throws com.nri.exception.NoSuchWorkPositionException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 56, _EJS_s);
			_EJS_beanRef.removeWorkPosition(aId);
		}
		catch (com.nri.exception.NoSuchWorkPositionException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 56, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeWorker
	 */
	public void removeWorker(java.lang.Integer aId) throws com.nri.exception.NoSuchWorkerException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 57, _EJS_s);
			_EJS_beanRef.removeWorker(aId);
		}
		catch (com.nri.exception.NoSuchWorkerException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 57, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * saveRegionAccessForOperator
	 */
	public void saveRegionAccessForOperator(java.lang.Integer operatorKey, java.util.Collection accessList) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 58, _EJS_s);
			_EJS_beanRef.saveRegionAccessForOperator(operatorKey, accessList);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 58, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * saveSuperRegionAccessForOperator
	 */
	public void saveSuperRegionAccessForOperator(java.lang.Integer operatorKey, java.util.Collection accessList) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 59, _EJS_s);
			_EJS_beanRef.saveSuperRegionAccessForOperator(operatorKey, accessList);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 59, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setMainLinkPeopleToNfsUser
	 */
	public void setMainLinkPeopleToNfsUser(java.lang.Integer peopleKey, java.lang.Integer nfsUserKey) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 60, _EJS_s);
			_EJS_beanRef.setMainLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 60, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateCompany
	 */
	public void updateCompany(com.nri.domain.Company aCompany) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 61, _EJS_s);
			_EJS_beanRef.updateCompany(aCompany);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 61, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateDivision
	 */
	public void updateDivision(com.nri.domain.Division aDivision) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 62, _EJS_s);
			_EJS_beanRef.updateDivision(aDivision);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 62, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateMsUser
	 */
	public void updateMsUser(com.nri.domain.MsUser aMsUser) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 63, _EJS_s);
			_EJS_beanRef.updateMsUser(aMsUser);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 63, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateOperator
	 */
	public void updateOperator(com.nri.domain.Operator aOperator) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 64, _EJS_s);
			_EJS_beanRef.updateOperator(aOperator);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 64, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updatePeople
	 */
	public void updatePeople(com.nri.domain.People aPeople) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 65, _EJS_s);
			_EJS_beanRef.updatePeople(aPeople);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 65, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateProfile
	 */
	public void updateProfile(com.nri.domain.Profile aProfile) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 66, _EJS_s);
			_EJS_beanRef.updateProfile(aProfile);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 66, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateRole
	 */
	public void updateRole(com.nri.domain.Role aRole) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 67, _EJS_s);
			_EJS_beanRef.updateRole(aRole);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 67, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateWorkPosition
	 */
	public void updateWorkPosition(com.nri.domain.WorkPosition aWorkPosition) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 68, _EJS_s);
			_EJS_beanRef.updateWorkPosition(aWorkPosition);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 68, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateWorker
	 */
	public void updateWorker(com.nri.domain.Worker aWorker) throws com.nri.exception.MappingException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.SecurityActionProcessorFacadeBean _EJS_beanRef = (com.nri.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 69, _EJS_s);
			_EJS_beanRef.updateWorker(aWorker);
		}
		catch (com.nri.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 69, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
