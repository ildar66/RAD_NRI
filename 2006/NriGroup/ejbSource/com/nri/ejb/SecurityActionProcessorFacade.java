package com.nri.ejb;

import com.nri.domain.People;
import com.nri.exception.MappingException;
import com.nri.exception.ModelException;
import com.nri.exception.NoSuchPeopleException;

import java.util.ArrayList;
import com.nri.exception.NoSuchRoleException;
import com.nri.domain.Role;
import com.nri.exception.NoSuchWorkPositionException;
import com.nri.domain.WorkPosition;
import com.nri.exception.NoSuchMsUserException;
import com.nri.domain.MsUser;
import com.nri.exception.NoSuchCompanyException;
import com.nri.domain.Company;
import com.nri.exception.NoSuchDivisionException;
import com.nri.domain.Division;
import com.nri.domain.DivisionType;
import com.nri.domain.Worker;
import java.util.List;
import com.nri.exception.NoSuchWorkerException;
import com.nri.domain.Page;
import com.nri.exception.NoSuchOperatorException;
import com.nri.domain.Operator;
import java.util.Collection;
import com.nri.domain.Profile;
import com.nri.exception.NoSuchProfileException;
/**
 * Remote interface for Enterprise Bean: SecurityActionProcessorFacade
 */
public interface SecurityActionProcessorFacade extends javax.ejb.EJBObject {

	/**
	 * @see SecurityActionProcessor#removePeople(String)
	 */
	public void removePeople(Integer aId) throws NoSuchPeopleException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addPeople(People)
	 */
	public void addPeople(People newPeople) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addPeople(People)
	 */
	public void updatePeople(People aPeople) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findAllPeoples()
	 */
	public ArrayList findAllPeoples() throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findPeopleByKey(Integer)
	 */
	public People findPeopleByKey(Integer aId) throws NoSuchPeopleException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findPeoplesByName(String)
	 */
	public ArrayList findPeoplesByName(String name) throws ModelException, java.rmi.RemoteException;
	
	/**
	 * @see SecurityActionProcessor#findRoleByKey(String)
	 */
	public Role findRoleByKey(String aId) throws NoSuchRoleException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#removeRole(String)
	 */
	public void removeRole(String aId) throws NoSuchRoleException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findRolesByName(String)
	 */
	public ArrayList findRolesByName(String nameRole) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addRole(Role)
	 */
	public void addRole(Role newRole) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findAllRoles()
	 */
	public ArrayList findAllRoles() throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#updateRole(Role)
	 */
	public void updateRole(Role aRole) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findRolesByName(String nameRole, String orderBy)
	 */
	public ArrayList findRolesByName(String nameRole, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findWorkPositionByKey(String)
	 */
	public WorkPosition findWorkPositionByKey(Integer aId) throws NoSuchWorkPositionException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#removeWorkPosition(String)
	 */
	public void removeWorkPosition(Integer aId) throws NoSuchWorkPositionException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addWorkPosition(WorkPosition)
	 */
	public void addWorkPosition(WorkPosition newWorkPosition) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#updateWorkPosition(WorkPosition)
	 */
	public void updateWorkPosition(WorkPosition aWorkPosition) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findWorkPositions(String nameWorkPosition, String orderBy)
	 */
	public ArrayList findWorkPositions(String nameWorkPosition, Boolean isActive, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#clearInMemoryCaches()
	 */
	public void clearInMemoryCaches() throws java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findMsUserByKey(String)
	 */
	public MsUser findMsUserByKey(Integer aId) throws NoSuchMsUserException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#removeMsUser(String)
	 */
	public void removeMsUser(Integer aId) throws NoSuchMsUserException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addMsUser(MsUser)
	 */
	public void addMsUser(MsUser newMsUser) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#updateMsUser(MsUser)
	 */
	public void updateMsUser(MsUser aMsUser) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findMsUsers(String nameMsUser, String orderBy)
	 */
	public ArrayList findMsUsers(String nameMsUser, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findCompanyByKey(String)
	 */
	public Company findCompanyByKey(Integer aId) throws NoSuchCompanyException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#removeCompany(String)
	 */
	public void removeCompany(Integer aId) throws NoSuchCompanyException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#updateCompany(Company)
	 */
	public void updateCompany(Company aCompany) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addCompany(Company)
	 */
	public void addCompany(Company newCompany) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findCompanies(String nameCompany, String orderBy)
	 */
	public ArrayList findCompanies(String nameCompany, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findAllCompanies()
	 */
	public ArrayList findAllCompanies() throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findDivisionByKey(String)
	 */
	public Division findDivisionByKey(Integer aId) throws NoSuchDivisionException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#updateDivision(Division)
	 */
	public void updateDivision(Division aDivision) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#removeDivision(String)
	 */
	public void removeDivision(Integer aId) throws NoSuchDivisionException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addDivision(Division)
	 */
	public void addDivision(Division newDivision) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisions(String nameDivision, Integer company, Boolean isActive, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisions(String nameDivision, Integer company, Boolean isActive, DivisionType type, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findWorkers(Worker query, String orderBy)
	 */
	public ArrayList findWorkers(Worker query, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findDivisionHierarchyForEncloser(Integer encloserKey, int depth)
	 */
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findWorkers(String name, Worker query, String orderBy)
	 */
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findWorkerByKey(Integer)
	 */
	public Worker findWorkerByKey(Integer aId) throws NoSuchWorkerException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#removeWorker(Integer)
	 */
	public void removeWorker(Integer aId) throws NoSuchWorkerException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addWorker(Worker)
	 */
	public void addWorker(Worker newWorker) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#updateWorker(Worker)
	 */
	public void updateWorker(Worker aWorker) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findPeoplesByName(String)
	 */
	public Page findPeoplesByName(String namePeople, Boolean isActive, int start, int count, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findOperators(java.lang.Integer, String orderBy)
	 */
	public ArrayList findOperators(Integer peopleKey, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findOperatorByKey(Integer)
	 */
	public Operator findOperatorByKey(Integer aId) throws NoSuchOperatorException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#removeOperator(Integer)
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addOperator(Operator)
	 */
	public void addOperator(Operator newOperator) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#updateOperator(Operator)
	 */
	public void updateOperator(Operator aOperator) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findPeopleToNfsUserList(java.lang.Integer, String orderBy)
	 */
	public ArrayList findPeopleToNfsUserList(Integer peopleKey, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findNfsUsers(String nameNfsUser, String orderBy)
	 */
	public ArrayList findNfsUsers(String nameNfsUser, Boolean isActive, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void addLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#deleteLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void deleteLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#setMainLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void setMainLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findOperatorToRoleAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRoleAccessList(Integer operatorKey, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findOperatorToRoleList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRoleList(Integer operatorKey, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addLinkOperatorToRole(operatorKey, roleKey)
	 */
	public void addLinkOperatorToRole(Integer operatorKey, String roleKey) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#deleteLinkOperatorToRole(operatorKey, roleKey)
	 */
	public void deleteLinkOperatorToRole(Integer operatorKey, String roleKey) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findOperatorToRegionAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRegionAccessList(Integer operatorKey, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findOperatorToRegionList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRegionList(Integer operatorKey, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#saveRegionAccessForOperator(operatorKey, accessList)
	 */
	public void saveRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findOperatorToSuperRegionList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToSuperRegionList(Integer operatorKey, String orderBy) throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#saveSuperRegionAccessForOperator(operatorKey, accessList)
	 */
	public void saveSuperRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findAllTerrabyteServers()
	 */
	public ArrayList findAllTerrabyteServers() throws ModelException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#findProfileByKey(Profile)
	 */
	public Profile findProfileByKey(Profile aId) throws NoSuchProfileException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#removeProfile(Profile)
	 */
	public void removeProfile(Profile aId) throws NoSuchProfileException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#addProfile(Profile)
	 */
	public void addProfile(Profile newProfile) throws MappingException, java.rmi.RemoteException;
	/**
	 * @see SecurityActionProcessor#updateProfile(Profile)
	 */
	public void updateProfile(Profile aProfile) throws MappingException, java.rmi.RemoteException;
}
