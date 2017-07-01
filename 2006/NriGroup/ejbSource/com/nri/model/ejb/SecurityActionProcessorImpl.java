/*
 * Created on 18.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.model.ejb;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nri.domain.Company;
import com.nri.domain.Division;
import com.nri.domain.DivisionType;
import com.nri.domain.MsUser;
import com.nri.domain.Operator;
import com.nri.domain.Page;
import com.nri.domain.People;
import com.nri.domain.Profile;
import com.nri.domain.Role;
import com.nri.domain.WorkPosition;
import com.nri.domain.Worker;
import com.nri.ejb.SecurityActionProcessorFacade;
import com.nri.ejb.SecurityActionProcessorFacadeHome;
import com.nri.exception.MappingException;
import com.nri.exception.ModelException;
import com.nri.exception.NoSuchCompanyException;
import com.nri.exception.NoSuchDivisionException;
import com.nri.exception.NoSuchMsUserException;
import com.nri.exception.NoSuchOperatorException;
import com.nri.exception.NoSuchPeopleException;
import com.nri.exception.NoSuchProfileException;
import com.nri.exception.NoSuchRoleException;
import com.nri.exception.NoSuchWorkPositionException;
import com.nri.exception.NoSuchWorkerException;
import com.nri.model.SecurityActionProcessor;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.util.EJBClientHelper;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SecurityActionProcessorImpl implements SecurityActionProcessor {

	/**
	 * Access (create) an instance of the SecurityActionProcessorFacade
	 * @returns a new Security session facade bean
	 */
	protected SecurityActionProcessorFacade getSecurityFacade() {
		try {
			return ((SecurityActionProcessorFacadeHome) EJBClientHelper.getHome("SecurityActionProcessor", SecurityActionProcessorFacadeHome.class)).create();
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught " + e);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findPeopleByKey(java.lang.Integer)
	 */
	public People findPeopleByKey(Integer manId) throws NoSuchPeopleException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findPeopleByKey(manId);
			else
				throw new NoSuchPeopleException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchPeopleException(re, "Remote Exception caught in findPeopleByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removePeople(java.lang.Integer)
	 */
	public void removePeople(Integer manId) throws NoSuchPeopleException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removePeople(manId);
			else
				throw new NoSuchPeopleException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchPeopleException(re, "Remote Exception caught in removePeople");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addPeople(com.nri.domain.People)
	 */
	public void addPeople(People newPeople) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addPeople(newPeople);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addPeople:" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updatePeople(com.nri.domain.People)
	 */
	public void updatePeople(People aPeople) throws NoSuchPeopleException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updatePeople(aPeople);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updatePeople");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findAllPeoples()
	 */
	public ArrayList findAllPeoples() throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findAllPeoples();
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findPeoplesByName(java.lang.String)
	 */
	public ArrayList findPeoplesByName(String name) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findPeoplesByName(name);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addRole(com.nri.domain.Role)
	 */
	public void addRole(Role newRole) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addRole(newRole);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addRole:" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findAllRoles()
	 */
	public ArrayList findAllRoles() throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findAllRoles();
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findRoleByKey(java.lang.String)
	 */
	public Role findRoleByKey(String roleId) throws NoSuchRoleException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findRoleByKey(roleId);
			else
				throw new NoSuchRoleException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchRoleException(re, "Remote Exception caught in findRoleByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findRolesByName(java.lang.String)
	 */
	public ArrayList findRolesByName(String name) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findRolesByName(name);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removeRole(java.lang.String)
	 */
	public void removeRole(String roleId) throws NoSuchRoleException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeRole(roleId);
			else
				throw new NoSuchRoleException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchRoleException(re, "Remote Exception caught in removeRole");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updateRole(com.nri.domain.Role)
	 */
	public void updateRole(Role aRole) throws NoSuchRoleException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateRole(aRole);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updateRole");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findRolesByName(java.lang.String, java.lang.String)
	 */
	public ArrayList findRolesByName(String name, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findRolesByName(name, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addWorkPosition(com.nri.domain.WorkPosition)
	 */
	public void addWorkPosition(WorkPosition newWorkPosition) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addWorkPosition(newWorkPosition);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addWorkPosition:" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findWorkPositions(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findWorkPositions(String name, Boolean isActive, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findWorkPositions(name, isActive, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removeWorkPosition(java.lang.String)
	 */
	public void removeWorkPosition(Integer roleId) throws NoSuchWorkPositionException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeWorkPosition(roleId);
			else
				throw new NoSuchWorkPositionException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchWorkPositionException(re, "Remote Exception caught in removeWorkPosition");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updateWorkPosition(com.nri.domain.WorkPosition)
	 */
	public void updateWorkPosition(WorkPosition aWorkPosition) throws NoSuchWorkPositionException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateWorkPosition(aWorkPosition);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updateWorkPosition");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findWorkPositionByKey(java.lang.String)
	 */
	public WorkPosition findWorkPositionByKey(Integer roleId) throws NoSuchWorkPositionException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findWorkPositionByKey(roleId);
			else
				throw new NoSuchWorkPositionException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchWorkPositionException(re, "Remote Exception caught in findWorkPositionByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#clearInMemoryCaches()
	 */
	public void clearInMemoryCaches() {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.clearInMemoryCaches();
		} catch (RemoteException re) {
			// Do something here besides logging
			AppService.log(TraceCapable.ERROR_LEVEL, "Remote exception caught in clearInMemoryCaches: " + re);
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addMsUser(com.nri.domain.MsUser)
	 */
	public void addMsUser(MsUser newMsUser) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addMsUser(newMsUser);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addMsUser:" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findMsUserByKey(java.lang.Integer)
	 */
	public MsUser findMsUserByKey(Integer aId) throws NoSuchMsUserException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findMsUserByKey(aId);
			else
				throw new NoSuchMsUserException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchMsUserException(re, "Remote Exception caught in findMsUserByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findMsUsers(java.lang.String, java.lang.String)
	 */
	public ArrayList findMsUsers(String name, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findMsUsers(name, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removeMsUser(java.lang.Integer)
	 */
	public void removeMsUser(Integer aId) throws NoSuchMsUserException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeMsUser(aId);
			else
				throw new NoSuchMsUserException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchMsUserException(re, "Remote Exception caught in removeMsUser");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updateMsUser(com.nri.domain.MsUser)
	 */
	public void updateMsUser(MsUser aMsUser) throws NoSuchMsUserException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateMsUser(aMsUser);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updateMsUser");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addCompany(com.nri.domain.Company)
	 */
	public void addCompany(Company newCompany) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addCompany(newCompany);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade:" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findCompanies(java.lang.String, java.lang.String)
	 */
	public ArrayList findCompanies(String name, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findCompanies(name, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findCompanyByKey(java.lang.Integer)
	 */
	public Company findCompanyByKey(Integer aId) throws NoSuchCompanyException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findCompanyByKey(aId);
			else
				throw new NoSuchCompanyException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchCompanyException(re, "Remote Exception caught in findCompanyByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removeCompany(java.lang.Integer)
	 */
	public void removeCompany(Integer aId) throws NoSuchCompanyException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeCompany(aId);
			else
				throw new NoSuchCompanyException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchCompanyException(re, "Remote Exception caught in removeCompany");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updateCompany(com.nri.domain.Company)
	 */
	public void updateCompany(Company aCompany) throws NoSuchCompanyException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateCompany(aCompany);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updateCompany");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findAllCompanies()
	 */
	public ArrayList findAllCompanies() throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findAllCompanies();
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addDivision(com.nri.domain.Division)
	 */
	public void addDivision(Division newDivision) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addDivision(newDivision);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade:" + e);
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findDivisionByKey(java.lang.Integer)
	 */
	public Division findDivisionByKey(Integer aId) throws NoSuchDivisionException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findDivisionByKey(aId);
			else
				throw new NoSuchDivisionException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchDivisionException(re, "Remote Exception caught in findDivisionByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findDivisions(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findDivisions(String name, Integer company, Boolean isActive, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findDivisions(name, company, isActive, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removeDivision(java.lang.Integer)
	 */
	public void removeDivision(Integer aId) throws NoSuchDivisionException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeDivision(aId);
			else
				throw new NoSuchDivisionException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchDivisionException(re, "Remote Exception caught in removeDivision");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updateDivision(com.nri.domain.Division)
	 */
	public void updateDivision(Division aDivision) throws NoSuchDivisionException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateDivision(aDivision);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updateDivision");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findDivisionsHierarchy(java.lang.Integer, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findDivisionsHierarchy(encloserKey, isActive, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findDivisions(java.lang.String, java.lang.Integer, java.lang.Boolean, com.nri.domain.DivisionType, java.lang.String)
	 */
	public ArrayList findDivisions(String name, Integer company, Boolean isActive, DivisionType type, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findDivisions(name, company, isActive, type, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findWorkers(com.nri.domain.Worker, java.lang.String)
	 */
	public ArrayList findWorkers(Worker query, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findWorkers(query, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findDivisionHierarchyForEncloser(java.lang.Integer, int)
	 */
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findDivisionHierarchyForEncloser(encloserKey, depth);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}
	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findWorkers(java.lang.String, com.nri.domain.Worker, java.lang.String)
	 */
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findWorkers(name, query, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addWorker(com.nri.domain.Worker)
	 */
	public void addWorker(Worker newWorker) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addWorker(newWorker);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade:" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findWorkerByKey(java.lang.Integer)
	 */
	public Worker findWorkerByKey(Integer aId) throws NoSuchWorkerException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findWorkerByKey(aId);
			else
				throw new NoSuchWorkerException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchWorkerException(re, "Remote Exception caught in findWorkerByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removeWorker(java.lang.Integer)
	 */
	public void removeWorker(Integer aId) throws NoSuchWorkerException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeWorker(aId);
			else
				throw new NoSuchWorkerException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchWorkerException(re, "Remote Exception caught in removeWorker");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updateWorker(com.nri.domain.Worker)
	 */
	public void updateWorker(Worker aWorker) throws NoSuchWorkerException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateWorker(aWorker);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updateWorker");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findPeoplesByName(java.lang.String, int, int, java.lang.String)
	 */
	public Page findPeoplesByName(String name, Boolean isActive, int start, int count, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findPeoplesByName(name, isActive, start, count, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findOperators(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperators(Integer peopleKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperators(peopleKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addOperator(com.nri.domain.Operator)
	 */
	public void addOperator(Operator newOperator) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addOperator(newOperator);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade:" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findOperatorByKey(java.lang.Integer)
	 */
	public Operator findOperatorByKey(Integer aId) throws NoSuchOperatorException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorByKey(aId);
			else
				throw new NoSuchOperatorException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchOperatorException(re, "Remote Exception caught in findOperatorByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removeOperator(java.lang.Integer)
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeOperator(aId);
			else
				throw new NoSuchOperatorException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchOperatorException(re, "Remote Exception caught in removeOperator");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updateOperator(com.nri.domain.Operator)
	 */
	public void updateOperator(Operator aOperator) throws NoSuchOperatorException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateOperator(aOperator);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updateOperator");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findPeopleToNfsUserList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findPeopleToNfsUserList(Integer peopleKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findPeopleToNfsUserList(peopleKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findNfsUsers(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findNfsUsers(String name, Boolean isActive, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findNfsUsers(name, isActive, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addLinkPeopleToNfsUser(java.lang.Integer, java.lang.Integer)
	 */
	public void addLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws ModelException, MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkPeopleToNfsUser(peopleKey, nfsUserKey);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#deleteLinkPeopleToNfsUser(java.lang.Integer, java.lang.Integer)
	 */
	public void deleteLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws ModelException, MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkPeopleToNfsUser(peopleKey, nfsUserKey);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#setMainLinkPeopleToNfsUser(java.lang.Integer, java.lang.Integer)
	 */
	public void setMainLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws ModelException, MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.setMainLinkPeopleToNfsUser(peopleKey, nfsUserKey);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findOperatorToRoleAccessList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToRoleAccessList(Integer operatorKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToRoleAccessList(operatorKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findOperatorToRoleList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToRoleList(Integer operatorKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToRoleList(operatorKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addLinkOperatorToRole(java.lang.Integer, java.lang.Integer)
	 */
	public void addLinkOperatorToRole(Integer operatorKey, String roleKey) throws ModelException, MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkOperatorToRole(operatorKey, roleKey);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#deleteLinkOperatorToRole(java.lang.Integer, java.lang.Integer)
	 */
	public void deleteLinkOperatorToRole(Integer operatorKey, String roleKey) throws ModelException, MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkOperatorToRole(operatorKey, roleKey);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findOperatorToRegionAccessList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToRegionAccessList(Integer operatorKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToRegionAccessList(operatorKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findOperatorToRegionList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToRegionList(Integer operatorKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToRegionList(operatorKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#saveRegionAccessForOperator(java.lang.Integer, java.util.Collection)
	 */
	public void saveRegionAccessForOperator(Integer operatorKey, Collection accessList) throws ModelException, MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.saveRegionAccessForOperator(operatorKey, accessList);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findOperatorToSuperRegionAccessList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToSuperRegionAccessList(operatorKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findOperatorToSuperRegionList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToSuperRegionList(Integer operatorKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToSuperRegionList(operatorKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#saveSuperRegionAccessForOperator(java.lang.Integer, java.util.Collection)
	 */
	public void saveSuperRegionAccessForOperator(Integer operatorKey, Collection accessList) throws ModelException, MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.saveSuperRegionAccessForOperator(operatorKey, accessList);
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findAllTerrabyteServers()
	 */
	public ArrayList findAllTerrabyteServers() throws ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findAllTerrabyteServers();
			else
				throw new ModelException("Could not create Facade");
		} catch (RemoteException re) {
			throw new ModelException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#addProfile(com.nri.domain.Profile)
	 */
	public void addProfile(Profile newProfile) throws MappingException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addProfile(newProfile);
			else
				throw new MappingException("No Facade found");
		} catch (RemoteException re) {
			throw new MappingException(re, "Remote Exception caught");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade:" + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#findProfileByKey(java.lang.Integer)
	 */
	public Profile findProfileByKey(Profile aProfile) throws NoSuchProfileException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findProfileByKey(aProfile);
			else
				throw new NoSuchProfileException("No Facade Found");
		} catch (RemoteException re) {
			throw new NoSuchProfileException(re, "Remote Exception caught in findProfileByKey");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#updateProfile(com.nri.domain.Profile)
	 */
	public void updateProfile(Profile aProfile) throws NoSuchProfileException, MappingException, ModelException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateProfile(aProfile);
			else
				throw new MappingException("No Facade Found");
		} catch (RemoteException e) {
			throw new ModelException(e, "Remote Exception caught in updateProfile");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.model.SecurityActionProcessor#removeProfile(java.lang.Integer)
	 */
	public void removeProfile(Profile aProfile) throws NoSuchProfileException {
		SecurityActionProcessorFacade modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeProfile(aProfile);
			else
				throw new NoSuchProfileException("No Facade found");
		} catch (RemoteException re) {
			throw new NoSuchProfileException(re, "Remote Exception caught in removeProfile");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}
}
