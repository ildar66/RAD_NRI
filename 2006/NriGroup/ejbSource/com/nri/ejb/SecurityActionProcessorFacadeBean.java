package com.nri.ejb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nri.domain.Company;
import com.nri.domain.Division;
import com.nri.domain.DivisionType;
import com.nri.domain.MsUser;
import com.nri.domain.NfsUser;
import com.nri.domain.Operator;
import com.nri.domain.Page;
import com.nri.domain.People;
import com.nri.domain.PeopleToNfsUser;
import com.nri.domain.Profile;
import com.nri.domain.RegionAccess;
import com.nri.domain.Role;
import com.nri.domain.SuperRegionAccess;
import com.nri.domain.TerrabyteServer;
import com.nri.domain.WorkPosition;
import com.nri.domain.Worker;
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
import com.nri.mapping.CompanyMapper;
import com.nri.mapping.DivisionMapper;
import com.nri.mapping.Mapper;
import com.nri.mapping.MapperFactory;
import com.nri.mapping.MsUserMapper;
import com.nri.mapping.NfsUserMapper;
import com.nri.mapping.OperatorMapper;
import com.nri.mapping.PeopleMapper;
import com.nri.mapping.PeopleToNfsUserMapper;
import com.nri.mapping.RegionAccessMapper;
import com.nri.mapping.RoleMapper;
import com.nri.mapping.SuperRegionAccessMapper;
import com.nri.mapping.WorkPositionMapper;
import com.nri.mapping.WorkerMapper;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * Bean implementation class for Enterprise Bean: SecurityActionProcessorFacade
 */
public class SecurityActionProcessorFacadeBean implements javax.ejb.SessionBean {
	private javax.ejb.SessionContext mySessionCtx;
	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}
	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}
	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}

	/**
	 * @see SecurityActionProcessor#findPeopleByKey(String)
	 */
	public People findPeopleByKey(Integer aId) throws NoSuchPeopleException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(People.class);
			return (People) mapper.findByPrimaryKey(new People(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for People: Exception caught in SystemMapper findPeopleByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(People.class);
				return (People) mapper.findByPrimaryKey(new People(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchPeopleException)
					throw (NoSuchPeopleException) nsoe;
				else
					throw new NoSuchPeopleException(nsoe, ("Exception caught in findPeopleByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removePeople(String)
	 */
	public void removePeople(Integer aId) throws NoSuchPeopleException {
		Mapper mapper = null;
		People emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(People.class);
			emp = (People) mapper.findByPrimaryKey(new People(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for People: Exception caught in SystemMapper removePeople " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(People.class);
				emp = (People) mapper.findByPrimaryKey(new People(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchPeopleException)
					throw (NoSuchPeopleException) nsoe;
				else
					throw new NoSuchPeopleException(nsoe, ("Exception caught in removePeople" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addPeople(People)
	 */
	public void addPeople(People newPeople) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(People.class);
			mapper.insert(newPeople);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for People: Exception caught in SystemMapper addPeople " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(People.class);
			mapper.insert(newPeople);
		}
	}

	/**
	 * @see SecurityActionProcessor#updatePeople(People)
	 */
	public void updatePeople(People aPeople) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(People.class);
			mapper.update(aPeople);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for People: Exception caught in SystemMapper updatePeople " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(People.class);
			mapper.update(aPeople);
		}
	}

	/**
	 * @see SecurityActionProcessor#findAllPeoples()
	 */
	public ArrayList findAllPeoples() throws ModelException {
		ArrayList list = null;
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(People.class);
			list = mapper.findAll();
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for People: Exception caught in SystemMapper findAllPeoples " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(People.class);
				list = mapper.findAll();
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findAllPeoples " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findPeoplesByName(String)
	 */
	public ArrayList findPeoplesByName(String namePeople) throws ModelException {
		ArrayList list = null;
		PeopleMapper mapper = null;
		try {
			mapper = (PeopleMapper) MapperFactory.getSystemMapperFactory().getMapper(People.class);
			list = mapper.findByName(namePeople);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for People: Exception caught in SystemMapper findPeoplesByName " + e);
			try {
				mapper = (PeopleMapper) MapperFactory.getReserveMapperFactory().getMapper(People.class);
				list = mapper.findByName(namePeople);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findPeoplesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findPeoplesByName(String)
	 */
	public Page findPeoplesByName(String namePeople, Boolean isActive, int start, int count, String orderBy) throws ModelException {
		Page page = null;
		PeopleMapper mapper = null;
		try {
			mapper = (PeopleMapper) MapperFactory.getSystemMapperFactory().getMapper(People.class);
			page = mapper.findByName(namePeople, isActive, start, count, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for People: Exception caught in SystemMapper findPeoplesByName " + e);
			try {
				mapper = (PeopleMapper) MapperFactory.getReserveMapperFactory().getMapper(People.class);
				page = mapper.findByName(namePeople, isActive, start, count, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findPeoplesByName " + eReserve));
			}
		}
		return page;
	}

	/**
	 * @see SecurityActionProcessor#findRoleByKey(String)
	 */
	public Role findRoleByKey(String aId) throws NoSuchRoleException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			return (Role) mapper.findByPrimaryKey(new Role(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper findRoleByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Role.class);
				return (Role) mapper.findByPrimaryKey(new Role(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchRoleException)
					throw (NoSuchRoleException) nsoe;
				else
					throw new NoSuchRoleException(nsoe, ("Exception caught in findRoleByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removeRole(String)
	 */
	public void removeRole(String aId) throws NoSuchRoleException {
		Mapper mapper = null;
		Role emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			emp = (Role) mapper.findByPrimaryKey(new Role(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper removeRole " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Role.class);
				emp = (Role) mapper.findByPrimaryKey(new Role(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchRoleException)
					throw (NoSuchRoleException) nsoe;
				else
					throw new NoSuchRoleException(nsoe, ("Exception caught in removeRole" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addRole(Role)
	 */
	public void addRole(Role newRole) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			mapper.insert(newRole);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper addRole " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Role.class);
			mapper.insert(newRole);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateRole(Role)
	 */
	public void updateRole(Role aRole) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			mapper.update(aRole);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper updateRole " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Role.class);
			mapper.update(aRole);
		}
	}

	/**
	 * @see SecurityActionProcessor#findAllRoles()
	 */
	public ArrayList findAllRoles() throws ModelException {
		ArrayList list = null;
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			list = mapper.findAll();
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper findAllRoles " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Role.class);
				list = mapper.findAll();
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findAllRoles " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findRolesByName(String)
	 */
	public ArrayList findRolesByName(String nameRole) throws ModelException {
		ArrayList list = null;
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			list = mapper.findByName(nameRole);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper findRolesByName " + e);
			try {
				mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
				list = mapper.findByName(nameRole);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findRolesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findRolesByName(String nameRole, String orderBy)
	 */
	public ArrayList findRolesByName(String nameRole, String orderBy) throws ModelException {
		ArrayList list = null;
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			list = mapper.findByName(nameRole, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper findRolesByName " + e);
			try {
				mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
				list = mapper.findByName(nameRole, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findRolesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findWorkPositionByKey(String)
	 */
	public WorkPosition findWorkPositionByKey(Integer aId) throws NoSuchWorkPositionException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(WorkPosition.class);
			return (WorkPosition) mapper.findByPrimaryKey(new WorkPosition(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for WorkPosition: Exception caught in SystemMapper findWorkPositionByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(WorkPosition.class);
				return (WorkPosition) mapper.findByPrimaryKey(new WorkPosition(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchWorkPositionException)
					throw (NoSuchWorkPositionException) nsoe;
				else
					throw new NoSuchWorkPositionException(nsoe, ("Exception caught in findWorkPositionByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removeWorkPosition(String)
	 */
	public void removeWorkPosition(Integer aId) throws NoSuchWorkPositionException {
		Mapper mapper = null;
		WorkPosition emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(WorkPosition.class);
			emp = (WorkPosition) mapper.findByPrimaryKey(new WorkPosition(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for WorkPosition: Exception caught in SystemMapper removeWorkPosition " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(WorkPosition.class);
				emp = (WorkPosition) mapper.findByPrimaryKey(new WorkPosition(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchWorkPositionException)
					throw (NoSuchWorkPositionException) nsoe;
				else
					throw new NoSuchWorkPositionException(nsoe, ("Exception caught in removeWorkPosition" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addWorkPosition(WorkPosition)
	 */
	public void addWorkPosition(WorkPosition newWorkPosition) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(WorkPosition.class);
			mapper.insert(newWorkPosition);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for WorkPosition: Exception caught in SystemMapper addWorkPosition " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(WorkPosition.class);
			mapper.insert(newWorkPosition);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateWorkPosition(WorkPosition)
	 */
	public void updateWorkPosition(WorkPosition aWorkPosition) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(WorkPosition.class);
			mapper.update(aWorkPosition);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for WorkPosition: Exception caught in SystemMapper updateWorkPosition " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(WorkPosition.class);
			mapper.update(aWorkPosition);
		}
	}

	/**
	 * @see SecurityActionProcessor#findWorkPositions(String nameWorkPosition, String orderBy)
	 */
	public ArrayList findWorkPositions(String nameWorkPosition, Boolean isActive, String orderBy) throws ModelException {
		ArrayList list = null;
		WorkPositionMapper mapper = null;
		try {
			mapper = (WorkPositionMapper) MapperFactory.getSystemMapperFactory().getMapper(WorkPosition.class);
			list = mapper.findByName(nameWorkPosition, isActive, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for WorkPosition: Exception caught in SystemMapper findWorkPositionsByName " + e);
			try {
				mapper = (WorkPositionMapper) MapperFactory.getReserveMapperFactory().getMapper(WorkPosition.class);
				list = mapper.findByName(nameWorkPosition, isActive, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findWorkPositionsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#clearInMemoryCaches()
	 */
	public void clearInMemoryCaches() {
		// This could/should be done in a helper object but this is fine since it's a test method.
		com.nri.mapping.memory.PeopleMapper peopleMap = (com.nri.mapping.memory.PeopleMapper) (new People()).getMapper();
		peopleMap.clearCache();
		com.nri.mapping.memory.RoleMapper roleMap = (com.nri.mapping.memory.RoleMapper) (new Role()).getMapper();
		roleMap.clearCache();
		com.nri.mapping.memory.WorkPositionMapper wpMap = (com.nri.mapping.memory.WorkPositionMapper) (new WorkPosition()).getMapper();
		wpMap.clearCache();
	}

	/**
	 * @see SecurityActionProcessor#findMsUserByKey(String)
	 */
	public MsUser findMsUserByKey(Integer aId) throws NoSuchMsUserException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(MsUser.class);
			return (MsUser) mapper.findByPrimaryKey(new MsUser(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MsUser: Exception caught in SystemMapper findMsUserByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(MsUser.class);
				return (MsUser) mapper.findByPrimaryKey(new MsUser(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchMsUserException)
					throw (NoSuchMsUserException) nsoe;
				else
					throw new NoSuchMsUserException(nsoe, ("Exception caught in findMsUserByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removeMsUser(String)
	 */
	public void removeMsUser(Integer aId) throws NoSuchMsUserException {
		Mapper mapper = null;
		MsUser emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(MsUser.class);
			emp = (MsUser) mapper.findByPrimaryKey(new MsUser(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MsUser: Exception caught in SystemMapper removeMsUser " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(MsUser.class);
				emp = (MsUser) mapper.findByPrimaryKey(new MsUser(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchMsUserException)
					throw (NoSuchMsUserException) nsoe;
				else
					throw new NoSuchMsUserException(nsoe, ("Exception caught in removeMsUser" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addMsUser(MsUser)
	 */
	public void addMsUser(MsUser newMsUser) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(MsUser.class);
			mapper.insert(newMsUser);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MsUser: Exception caught in SystemMapper addMsUser " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(MsUser.class);
			mapper.insert(newMsUser);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateMsUser(MsUser)
	 */
	public void updateMsUser(MsUser aMsUser) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(MsUser.class);
			mapper.update(aMsUser);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MsUser: Exception caught in SystemMapper updateMsUser " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(MsUser.class);
			mapper.update(aMsUser);
		}
	}

	/**
	 * @see SecurityActionProcessor#findMsUsers(String nameMsUser, String orderBy)
	 */
	public ArrayList findMsUsers(String nameMsUser, String orderBy) throws ModelException {
		ArrayList list = null;
		MsUserMapper mapper = null;
		try {
			mapper = (MsUserMapper) MapperFactory.getSystemMapperFactory().getMapper(MsUser.class);
			list = mapper.findByName(nameMsUser, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MsUser: Exception caught in SystemMapper findMsUsersByName " + e);
			try {
				mapper = (MsUserMapper) MapperFactory.getReserveMapperFactory().getMapper(MsUser.class);
				list = mapper.findByName(nameMsUser, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findMsUsersByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findCompanyByKey(String)
	 */
	public Company findCompanyByKey(Integer aId) throws NoSuchCompanyException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Company.class);
			return (Company) mapper.findByPrimaryKey(new Company(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Company: Exception caught in SystemMapper findCompanyByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Company.class);
				return (Company) mapper.findByPrimaryKey(new Company(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchCompanyException)
					throw (NoSuchCompanyException) nsoe;
				else
					throw new NoSuchCompanyException(nsoe, ("Exception caught in findCompanyByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removeCompany(String)
	 */
	public void removeCompany(Integer aId) throws NoSuchCompanyException {
		Mapper mapper = null;
		Company emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Company.class);
			emp = (Company) mapper.findByPrimaryKey(new Company(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Company: Exception caught in SystemMapper removeCompany " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Company.class);
				emp = (Company) mapper.findByPrimaryKey(new Company(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchCompanyException)
					throw (NoSuchCompanyException) nsoe;
				else
					throw new NoSuchCompanyException(nsoe, ("Exception caught in removeCompany" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addCompany(Company)
	 */
	public void addCompany(Company newCompany) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Company.class);
			mapper.insert(newCompany);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Company: Exception caught in SystemMapper addCompany " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Company.class);
			mapper.insert(newCompany);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateCompany(Company)
	 */
	public void updateCompany(Company aCompany) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Company.class);
			mapper.update(aCompany);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Company: Exception caught in SystemMapper updateCompany " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Company.class);
			mapper.update(aCompany);
		}
	}

	/**
	 * @see SecurityActionProcessor#findCompanies(String nameCompany, String orderBy)
	 */
	public ArrayList findCompanies(String nameCompany, String orderBy) throws ModelException {
		ArrayList list = null;
		CompanyMapper mapper = null;
		try {
			mapper = (CompanyMapper) MapperFactory.getSystemMapperFactory().getMapper(Company.class);
			list = mapper.findByName(nameCompany, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Company: Exception caught in SystemMapper findCompanysByName " + e);
			try {
				mapper = (CompanyMapper) MapperFactory.getReserveMapperFactory().getMapper(Company.class);
				list = mapper.findByName(nameCompany, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findCompanysByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findAllCompanies()
	 */
	public ArrayList findAllCompanies() throws ModelException {
		ArrayList list = null;
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Company.class);
			list = mapper.findAll();
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Company: Exception caught in SystemMapper findAllCompanies " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Company.class);
				list = mapper.findAll();
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findAllCompanies " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findDivisionByKey(String)
	 */
	public Division findDivisionByKey(Integer aId) throws NoSuchDivisionException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Division.class);
			return (Division) mapper.findByPrimaryKey(new Division(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Division: Exception caught in SystemMapper findDivisionByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Division.class);
				return (Division) mapper.findByPrimaryKey(new Division(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchDivisionException)
					throw (NoSuchDivisionException) nsoe;
				else
					throw new NoSuchDivisionException(nsoe, ("Exception caught in findDivisionByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removeDivision(String)
	 */
	public void removeDivision(Integer aId) throws NoSuchDivisionException {
		Mapper mapper = null;
		Division emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Division.class);
			emp = (Division) mapper.findByPrimaryKey(new Division(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Division: Exception caught in SystemMapper removeDivision " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Division.class);
				emp = (Division) mapper.findByPrimaryKey(new Division(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchDivisionException)
					throw (NoSuchDivisionException) nsoe;
				else
					throw new NoSuchDivisionException(nsoe, ("Exception caught in removeDivision" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addDivision(Division)
	 */
	public void addDivision(Division newDivision) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Division.class);
			mapper.insert(newDivision);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Division: Exception caught in SystemMapper addDivision " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Division.class);
			mapper.insert(newDivision);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateDivision(Division)
	 */
	public void updateDivision(Division aDivision) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Division.class);
			mapper.update(aDivision);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Division: Exception caught in SystemMapper updateDivision " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Division.class);
			mapper.update(aDivision);
		}
	}

	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisions(String nameDivision, Integer company, Boolean isActive, String orderBy) throws ModelException {
		ArrayList list = null;
		DivisionMapper mapper = null;
		try {
			mapper = (DivisionMapper) MapperFactory.getSystemMapperFactory().getMapper(Division.class);
			list = mapper.findByName(nameDivision, company, isActive, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Division: Exception caught in SystemMapper findDivisionsByName " + e);
			try {
				mapper = (DivisionMapper) MapperFactory.getReserveMapperFactory().getMapper(Division.class);
				list = mapper.findByName(nameDivision, company, isActive, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findDivisionsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisions(String nameDivision, Integer company, Boolean isActive, DivisionType type, String orderBy) throws ModelException {
		ArrayList list = null;
		DivisionMapper mapper = null;
		try {
			mapper = (DivisionMapper) MapperFactory.getSystemMapperFactory().getMapper(Division.class);
			list = mapper.findByName(nameDivision, company, isActive, type, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Division: Exception caught in SystemMapper findDivisionsByName " + e);
			try {
				mapper = (DivisionMapper) MapperFactory.getReserveMapperFactory().getMapper(Division.class);
				list = mapper.findByName(nameDivision, company, isActive, type, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findDivisionsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws ModelException {
		ArrayList list = null;
		DivisionMapper mapper = null;
		try {
			mapper = (DivisionMapper) MapperFactory.getSystemMapperFactory().getMapper(Division.class);
			list = mapper.findDivisionsHierarchy(encloserKey, isActive, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Division: Exception caught in SystemMapper findDivisionsByName " + e);
			try {
				mapper = (DivisionMapper) MapperFactory.getReserveMapperFactory().getMapper(Division.class);
				list = mapper.findDivisionsHierarchy(encloserKey, isActive, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findDivisionsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findWorkers(Worker query, String orderBy)
	 */
	public ArrayList findWorkers(Worker query, String orderBy) throws ModelException {
		ArrayList list = null;
		WorkerMapper mapper = null;
		try {
			mapper = (WorkerMapper) MapperFactory.getSystemMapperFactory().getMapper(Worker.class);
			list = mapper.findWorkers(query, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Worker: Exception caught in SystemMapper findWorkers " + e);
			try {
				mapper = (WorkerMapper) MapperFactory.getReserveMapperFactory().getMapper(Worker.class);
				list = mapper.findWorkers(query, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findWorkers " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findDivisionHierarchyForEncloser(Integer encloserKey, int depth)
	 */
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws ModelException {
		List list = null;
		DivisionMapper mapper = null;
		try {
			mapper = (DivisionMapper) MapperFactory.getSystemMapperFactory().getMapper(Division.class);
			list = mapper.findDivisionHierarchyForEncloser(encloserKey, depth);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Division: Exception caught in SystemMapper findDivisionsByName " + e);
			try {
				mapper = (DivisionMapper) MapperFactory.getReserveMapperFactory().getMapper(Division.class);
				list = mapper.findDivisionHierarchyForEncloser(encloserKey, depth);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findDivisionsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findWorkers(String name, Worker query, String orderBy)
	 */
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws ModelException {
		ArrayList list = null;
		WorkerMapper mapper = null;
		try {
			mapper = (WorkerMapper) MapperFactory.getSystemMapperFactory().getMapper(Worker.class);
			list = mapper.findWorkers(name, query, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Worker: Exception caught in SystemMapper findWorkers " + e);
			try {
				mapper = (WorkerMapper) MapperFactory.getReserveMapperFactory().getMapper(Worker.class);
				list = mapper.findWorkers(name, query, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findWorkers " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findWorkerByKey(Integer)
	 */
	public Worker findWorkerByKey(Integer aId) throws NoSuchWorkerException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Worker.class);
			return (Worker) mapper.findByPrimaryKey(new Worker(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Worker: Exception caught in SystemMapper findWorkerByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Worker.class);
				return (Worker) mapper.findByPrimaryKey(new Worker(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchWorkerException)
					throw (NoSuchWorkerException) nsoe;
				else
					throw new NoSuchWorkerException(nsoe, ("Exception caught in findWorkerByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removeWorker(Integer)
	 */
	public void removeWorker(Integer aId) throws NoSuchWorkerException {
		Mapper mapper = null;
		Worker emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Worker.class);
			emp = (Worker) mapper.findByPrimaryKey(new Worker(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Worker: Exception caught in SystemMapper removeWorker " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Worker.class);
				emp = (Worker) mapper.findByPrimaryKey(new Worker(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchWorkerException)
					throw (NoSuchWorkerException) nsoe;
				else
					throw new NoSuchWorkerException(nsoe, ("Exception caught in removeWorker" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addWorker(Worker)
	 */
	public void addWorker(Worker newWorker) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Worker.class);
			mapper.insert(newWorker);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Worker: Exception caught in SystemMapper addWorker " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Worker.class);
			mapper.insert(newWorker);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateWorker(Worker)
	 */
	public void updateWorker(Worker aWorker) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Worker.class);
			mapper.update(aWorker);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Worker: Exception caught in SystemMapper updateWorker " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Worker.class);
			mapper.update(aWorker);
		}
	}

	/**
	 * @see SecurityActionProcessor#findOperators(java.lang.Integer, String orderBy)
	 */
	public ArrayList findOperators(Integer peopleKey, String orderBy) throws ModelException {
		ArrayList list = null;
		OperatorMapper mapper = null;
		try {
			mapper = (OperatorMapper) MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			list = mapper.findOperators(peopleKey, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper findOperators " + e);
			try {
				mapper = (OperatorMapper) MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
				list = mapper.findOperators(peopleKey, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOperators " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findOperatorByKey(Integer)
	 */
	public Operator findOperatorByKey(Integer aId) throws NoSuchOperatorException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			return (Operator) mapper.findByPrimaryKey(new Operator(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper findOperatorByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
				return (Operator) mapper.findByPrimaryKey(new Operator(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOperatorException)
					throw (NoSuchOperatorException) nsoe;
				else
					throw new NoSuchOperatorException(nsoe, ("Exception caught in findOperatorByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removeOperator(Integer)
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException {
		Mapper mapper = null;
		Operator obj = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			obj = (Operator) mapper.findByPrimaryKey(new Operator(aId));
			mapper.remove(obj);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper removeOperator " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
				obj = (Operator) mapper.findByPrimaryKey(new Operator(aId));
				mapper.remove(obj);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOperatorException)
					throw (NoSuchOperatorException) nsoe;
				else
					throw new NoSuchOperatorException(nsoe, ("Exception caught in removeOperator" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addOperator(Operator)
	 */
	public void addOperator(Operator newOperator) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			mapper.insert(newOperator);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper addOperator " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
			mapper.insert(newOperator);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateOperator(Operator)
	 */
	public void updateOperator(Operator aOperator) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			mapper.update(aOperator);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper updateOperator " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
			mapper.update(aOperator);
		}
	}

	/**
	 * @see SecurityActionProcessor#findPeopleToNfsUserList(java.lang.Integer, String orderBy)
	 */
	public ArrayList findPeopleToNfsUserList(Integer peopleKey, String orderBy) throws ModelException {
		ArrayList list = null;
		PeopleToNfsUserMapper mapper = null;
		try {
			mapper = (PeopleToNfsUserMapper) MapperFactory.getSystemMapperFactory().getMapper(PeopleToNfsUser.class);
			list = mapper.findPeopleToNfsUsers(peopleKey, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for PeopleToNfsUser: Exception caught in SystemMapper findPeopleToNfsUsers " + e);
			try {
				mapper = (PeopleToNfsUserMapper) MapperFactory.getReserveMapperFactory().getMapper(PeopleToNfsUser.class);
				list = mapper.findPeopleToNfsUsers(peopleKey, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findPeopleToNfsUsers " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findNfsUsers(String nameNfsUser, String orderBy)
	 */
	public ArrayList findNfsUsers(String nameNfsUser, Boolean isActive, String orderBy) throws ModelException {
		ArrayList list = null;
		NfsUserMapper mapper = null;
		try {
			mapper = (NfsUserMapper) MapperFactory.getSystemMapperFactory().getMapper(NfsUser.class);
			list = mapper.findByName(nameNfsUser, isActive, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for NfsUser: Exception caught in SystemMapper findNfsUsersByName " + e);
			try {
				mapper = (NfsUserMapper) MapperFactory.getReserveMapperFactory().getMapper(NfsUser.class);
				list = mapper.findByName(nameNfsUser, isActive, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findNfsUsersByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#addLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void addLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException {
		PeopleToNfsUserMapper mapper = null;
		try {
			mapper = (PeopleToNfsUserMapper) MapperFactory.getSystemMapperFactory().getMapper(PeopleToNfsUser.class);
			mapper.addLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for PeopleToNfsUser: Exception caught in SystemMapper addLinkPeopleToNfsUser " + e);
			mapper = (PeopleToNfsUserMapper) MapperFactory.getReserveMapperFactory().getMapper(PeopleToNfsUser.class);
			mapper.addLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		}
	}

	/**
	 * @see SecurityActionProcessor#deleteLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void deleteLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException {
		PeopleToNfsUserMapper mapper = null;
		try {
			mapper = (PeopleToNfsUserMapper) MapperFactory.getSystemMapperFactory().getMapper(PeopleToNfsUser.class);
			mapper.deleteLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for PeopleToNfsUser: Exception caught in SystemMapper deleteLinkPeopleToNfsUser " + e);
			mapper = (PeopleToNfsUserMapper) MapperFactory.getReserveMapperFactory().getMapper(PeopleToNfsUser.class);
			mapper.deleteLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		}
	}

	/**
	 * @see SecurityActionProcessor#setMainLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void setMainLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException {
		PeopleToNfsUserMapper mapper = null;
		try {
			mapper = (PeopleToNfsUserMapper) MapperFactory.getSystemMapperFactory().getMapper(PeopleToNfsUser.class);
			mapper.setMainLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for PeopleToNfsUser: Exception caught in SystemMapper setMainLinkPeopleToNfsUser " + e);
			mapper = (PeopleToNfsUserMapper) MapperFactory.getReserveMapperFactory().getMapper(PeopleToNfsUser.class);
			mapper.setMainLinkPeopleToNfsUser(peopleKey, nfsUserKey);
		}
	}

	/**
	 * @see SecurityActionProcessor#findOperatorToRoleAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRoleAccessList(Integer operatorKey, String orderBy) throws ModelException {
		ArrayList list = null;
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			list = mapper.findOperatorToRoleAccessList(operatorKey, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper findOperatorToRoleAccessList " + e);
			try {
				mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
				list = mapper.findOperatorToRoleAccessList(operatorKey, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOperatorToRoleAccessList " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findOperatorToRoleList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRoleList(Integer operatorKey, String orderBy) throws ModelException {
		ArrayList list = null;
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			list = mapper.findOperatorToRoleList(operatorKey, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper findOperatorToRoleList " + e);
			try {
				mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
				list = mapper.findOperatorToRoleList(operatorKey, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOperatorToRoleList " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#addLinkOperatorToRole(operatorKey, roleKey)
	 */
	public void addLinkOperatorToRole(Integer operatorKey, String roleKey) throws MappingException {
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			mapper.addLinkOperatorToRole(operatorKey, roleKey);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper addLinkOperatorToRole " + e);
			mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
			mapper.addLinkOperatorToRole(operatorKey, roleKey);
		}
	}

	/**
	 * @see SecurityActionProcessor#deleteLinkOperatorToRole(operatorKey, roleKey)
	 */
	public void deleteLinkOperatorToRole(Integer operatorKey, String roleKey) throws MappingException {
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			mapper.deleteLinkOperatorToRole(operatorKey, roleKey);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper deleteLinkOperatorToRole " + e);
			mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
			mapper.deleteLinkOperatorToRole(operatorKey, roleKey);
		}
	}

	/**
	 * @see SecurityActionProcessor#findOperatorToRegionAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRegionAccessList(Integer operatorKey, String orderBy) throws ModelException {
		ArrayList list = null;
		RegionAccessMapper mapper = null;
		try {
			mapper = (RegionAccessMapper) MapperFactory.getSystemMapperFactory().getMapper(RegionAccess.class);
			list = mapper.findOperatorToRegionAccessList(operatorKey, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for RegionAccess: Exception caught in SystemMapper findOperatorToRegionAccessList " + e);
			try {
				mapper = (RegionAccessMapper) MapperFactory.getReserveMapperFactory().getMapper(RegionAccess.class);
				list = mapper.findOperatorToRegionAccessList(operatorKey, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOperatorToRegionAccessList " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findOperatorToRegionList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRegionList(Integer operatorKey, String orderBy) throws ModelException {
		ArrayList list = null;
		RegionAccessMapper mapper = null;
		try {
			mapper = (RegionAccessMapper) MapperFactory.getSystemMapperFactory().getMapper(RegionAccess.class);
			list = mapper.findOperatorToRegionList(operatorKey, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for RegionAccess: Exception caught in SystemMapper findOperatorToRegionList " + e);
			try {
				mapper = (RegionAccessMapper) MapperFactory.getReserveMapperFactory().getMapper(RegionAccess.class);
				list = mapper.findOperatorToRegionList(operatorKey, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOperatorToRegionList " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#saveRegionAccessForOperator(operatorKey, accessList)
	 */
	public void saveRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException {
		RegionAccessMapper mapper = null;
		try {
			mapper = (RegionAccessMapper) MapperFactory.getSystemMapperFactory().getMapper(RegionAccess.class);
			mapper.saveRegionAccessForOperator(operatorKey, accessList);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for RegionAccess: Exception caught in SystemMapper saveRegionAccessForOperator " + e);
			mapper = (RegionAccessMapper) MapperFactory.getReserveMapperFactory().getMapper(RegionAccess.class);
			mapper.saveRegionAccessForOperator(operatorKey, accessList);
		}
	}

	/**
	 * @see SecurityActionProcessor#findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy) throws ModelException {
		ArrayList list = null;
		SuperRegionAccessMapper mapper = null;
		try {
			mapper = (SuperRegionAccessMapper) MapperFactory.getSystemMapperFactory().getMapper(SuperRegionAccess.class);
			list = mapper.findOperatorToSuperRegionAccessList(operatorKey, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for SuperRegionAccess: Exception caught in SystemMapper findOperatorToSuperRegionAccessList " + e);
			try {
				mapper = (SuperRegionAccessMapper) MapperFactory.getReserveMapperFactory().getMapper(SuperRegionAccess.class);
				list = mapper.findOperatorToSuperRegionAccessList(operatorKey, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOperatorToRegionAccessList " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findOperatorToSuperRegionList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToSuperRegionList(Integer operatorKey, String orderBy) throws ModelException {
		ArrayList list = null;
		SuperRegionAccessMapper mapper = null;
		try {
			mapper = (SuperRegionAccessMapper) MapperFactory.getSystemMapperFactory().getMapper(SuperRegionAccess.class);
			list = mapper.findOperatorToSuperRegionList(operatorKey, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for SuperRegionAccess: Exception caught in SystemMapper findOperatorToSuperRegionList " + e);
			try {
				mapper = (SuperRegionAccessMapper) MapperFactory.getReserveMapperFactory().getMapper(SuperRegionAccess.class);
				list = mapper.findOperatorToSuperRegionList(operatorKey, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOperatorToRegionList " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#saveSuperRegionAccessForOperator(operatorKey, accessList)
	 */
	public void saveSuperRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException {
		SuperRegionAccessMapper mapper = null;
		try {
			mapper = (SuperRegionAccessMapper) MapperFactory.getSystemMapperFactory().getMapper(SuperRegionAccess.class);
			mapper.saveSuperRegionAccessForOperator(operatorKey, accessList);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for SuperRegionAccess: Exception caught in SystemMapper saveSuperRegionAccessForOperator " + e);
			mapper = (SuperRegionAccessMapper) MapperFactory.getReserveMapperFactory().getMapper(SuperRegionAccess.class);
			mapper.saveSuperRegionAccessForOperator(operatorKey, accessList);
		}
	}

	/**
	 * @see SecurityActionProcessor#findAllTerrabyteServers()
	 */
	public ArrayList findAllTerrabyteServers() throws ModelException {
		ArrayList list = null;
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(TerrabyteServer.class);
			list = mapper.findAll();
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for TerrabyteServer: Exception caught in SystemMapper findAllTerrabyteServers " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(TerrabyteServer.class);
				list = mapper.findAll();
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findAllTerrabyteServers " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findProfileByKey(Profile)
	 */
	public Profile findProfileByKey(Profile aId) throws NoSuchProfileException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Profile.class);
			return (Profile) mapper.findByPrimaryKey(aId);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Profile: Exception caught in SystemMapper findProfileByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Profile.class);
				return (Profile) mapper.findByPrimaryKey(aId);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchProfileException)
					throw (NoSuchProfileException) nsoe;
				else
					throw new NoSuchProfileException(nsoe, ("Exception caught in findProfileByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#removeProfile(Profile)
	 */
	public void removeProfile(Profile aId) throws NoSuchProfileException {
		Mapper mapper = null;
		Profile obj = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Profile.class);
			obj = (Profile) mapper.findByPrimaryKey(aId);
			mapper.remove(obj);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Profile: Exception caught in SystemMapper removeProfile " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Profile.class);
				obj = (Profile) mapper.findByPrimaryKey(aId);
				mapper.remove(obj);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchProfileException)
					throw (NoSuchProfileException) nsoe;
				else
					throw new NoSuchProfileException(nsoe, ("Exception caught in removeProfile" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addProfile(Profile)
	 */
	public void addProfile(Profile newProfile) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Profile.class);
			mapper.insert(newProfile);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Profile: Exception caught in SystemMapper addProfile " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Profile.class);
			mapper.insert(newProfile);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateProfile(Profile)
	 */
	public void updateProfile(Profile aProfile) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Profile.class);
			mapper.update(aProfile);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Profile: Exception caught in SystemMapper updateProfile " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Profile.class);
			mapper.update(aProfile);
		}
	}
}
