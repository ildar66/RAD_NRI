package com.nri.ejb;
import com.nri.exception.NoSuchWorkPositionException;
import com.nri.domain.WorkPosition;
import com.nri.exception.MappingException;
import com.nri.exception.ModelException;
import java.util.ArrayList;
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
 * Local interface for Enterprise Bean: SecurityActionProcessorFacade
 */
public interface SecurityActionProcessorFacadeLocal extends javax.ejb.EJBLocalObject {
	/**
	 * removePeople
	 */
	public void removePeople(java.lang.Integer aId) throws com.nri.exception.NoSuchPeopleException;
	/**
	 * addPeople
	 */
	public void addPeople(com.nri.domain.People newPeople) throws com.nri.exception.MappingException;
	/**
	 * updatePeople
	 */
	public void updatePeople(com.nri.domain.People aPeople) throws com.nri.exception.MappingException;
	/**
	 * findAllPeoples
	 */
	public java.util.ArrayList findAllPeoples() throws com.nri.exception.ModelException;
	/**
	 * findPeopleByKey
	 */
	public com.nri.domain.People findPeopleByKey(java.lang.Integer aId) throws com.nri.exception.NoSuchPeopleException;
	/**
	 * findPeoplesByName
	 */
	public java.util.ArrayList findPeoplesByName(java.lang.String name) throws com.nri.exception.ModelException;
	/**
	 * findRoleByKey
	 */
	public com.nri.domain.Role findRoleByKey(java.lang.String aId) throws com.nri.exception.NoSuchRoleException;
	/**
	 * removeRole
	 */
	public void removeRole(java.lang.String aId) throws com.nri.exception.NoSuchRoleException;
	/**
	 * findRolesByName
	 */
	public java.util.ArrayList findRolesByName(java.lang.String nameRole) throws com.nri.exception.ModelException;
	/**
	 * addRole
	 */
	public void addRole(com.nri.domain.Role newRole) throws com.nri.exception.MappingException;
	/**
	 * findAllRoles
	 */
	public java.util.ArrayList findAllRoles() throws com.nri.exception.ModelException;
	/**
	 * updateRole
	 */
	public void updateRole(com.nri.domain.Role aRole) throws com.nri.exception.MappingException;
	/**
	 * findRolesByName
	 */
	public java.util.ArrayList findRolesByName(java.lang.String nameRole, java.lang.String orderBy) throws com.nri.exception.ModelException;
	/**
	 * @see SecurityActionProcessor#findWorkPositionByKey(String)
	 */
	public WorkPosition findWorkPositionByKey(Integer aId) throws NoSuchWorkPositionException;
	/**
	 * @see SecurityActionProcessor#removeWorkPosition(String)
	 */
	public void removeWorkPosition(Integer aId) throws NoSuchWorkPositionException;
	/**
	 * @see SecurityActionProcessor#addWorkPosition(WorkPosition)
	 */
	public void addWorkPosition(WorkPosition newWorkPosition) throws MappingException;
	/**
	 * @see SecurityActionProcessor#updateWorkPosition(WorkPosition)
	 */
	public void updateWorkPosition(WorkPosition aWorkPosition) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findWorkPositions(String nameWorkPosition, String orderBy)
	 */
	public ArrayList findWorkPositions(String nameWorkPosition, Boolean isActive, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findMsUserByKey(String)
	 */
	public MsUser findMsUserByKey(Integer aId) throws NoSuchMsUserException;
	/**
	 * @see SecurityActionProcessor#removeMsUser(String)
	 */
	public void removeMsUser(Integer aId) throws NoSuchMsUserException;
	/**
	 * @see SecurityActionProcessor#addMsUser(MsUser)
	 */
	public void addMsUser(MsUser newMsUser) throws MappingException;
	/**
	 * @see SecurityActionProcessor#updateMsUser(MsUser)
	 */
	public void updateMsUser(MsUser aMsUser) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findMsUsers(String nameMsUser, String orderBy)
	 */
	public ArrayList findMsUsers(String nameMsUser, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findCompanyByKey(String)
	 */
	public Company findCompanyByKey(Integer aId) throws NoSuchCompanyException;
	/**
	 * @see SecurityActionProcessor#removeCompany(String)
	 */
	public void removeCompany(Integer aId) throws NoSuchCompanyException;
	/**
	 * @see SecurityActionProcessor#updateCompany(Company)
	 */
	public void updateCompany(Company aCompany) throws MappingException;
	/**
	 * @see SecurityActionProcessor#addCompany(Company)
	 */
	public void addCompany(Company newCompany) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findCompanies(String nameCompany, String orderBy)
	 */
	public ArrayList findCompanies(String nameCompany, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findAllCompanies()
	 */
	public ArrayList findAllCompanies() throws ModelException;
	/**
	 * @see SecurityActionProcessor#findDivisionByKey(String)
	 */
	public Division findDivisionByKey(Integer aId) throws NoSuchDivisionException;
	/**
	 * @see SecurityActionProcessor#updateDivision(Division)
	 */
	public void updateDivision(Division aDivision) throws MappingException;
	/**
	 * @see SecurityActionProcessor#removeDivision(String)
	 */
	public void removeDivision(Integer aId) throws NoSuchDivisionException;
	/**
	 * @see SecurityActionProcessor#addDivision(Division)
	 */
	public void addDivision(Division newDivision) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisions(String nameDivision, Integer company, Boolean isActive, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findDivisions(String nameDivision, String orderBy)
	 */
	public ArrayList findDivisions(String nameDivision, Integer company, Boolean isActive, DivisionType type, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findWorkers(Worker query, String orderBy)
	 */
	public ArrayList findWorkers(Worker query, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findDivisionHierarchyForEncloser(Integer encloserKey, int depth)
	 */
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findWorkers(String name, Worker query, String orderBy)
	 */
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findWorkerByKey(Integer)
	 */
	public Worker findWorkerByKey(Integer aId) throws NoSuchWorkerException;
	/**
	 * @see SecurityActionProcessor#removeWorker(Integer)
	 */
	public void removeWorker(Integer aId) throws NoSuchWorkerException;
	/**
	 * @see SecurityActionProcessor#addWorker(Worker)
	 */
	public void addWorker(Worker newWorker) throws MappingException;
	/**
	 * @see SecurityActionProcessor#updateWorker(Worker)
	 */
	public void updateWorker(Worker aWorker) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findPeoplesByName(String)
	 */
	public Page findPeoplesByName(String namePeople, Boolean isActive, int start, int count, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findOperators(java.lang.Integer, String orderBy)
	 */
	public ArrayList findOperators(Integer peopleKey, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findOperatorByKey(Integer)
	 */
	public Operator findOperatorByKey(Integer aId) throws NoSuchOperatorException;
	/**
	 * @see SecurityActionProcessor#removeOperator(Integer)
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException;
	/**
	 * @see SecurityActionProcessor#addOperator(Operator)
	 */
	public void addOperator(Operator newOperator) throws MappingException;
	/**
	 * @see SecurityActionProcessor#updateOperator(Operator)
	 */
	public void updateOperator(Operator aOperator) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findPeopleToNfsUserList(java.lang.Integer, String orderBy)
	 */
	public ArrayList findPeopleToNfsUserList(Integer peopleKey, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findNfsUsers(String nameNfsUser, String orderBy)
	 */
	public ArrayList findNfsUsers(String nameNfsUser, Boolean isActive, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#addLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void addLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException;
	/**
	 * @see SecurityActionProcessor#deleteLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void deleteLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException;
	/**
	 * @see SecurityActionProcessor#setMainLinkPeopleToNfsUser(peopleKey, nfsUserKey)
	 */
	public void setMainLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findOperatorToRoleAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRoleAccessList(Integer operatorKey, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findOperatorToRoleList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRoleList(Integer operatorKey, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#addLinkOperatorToRole(operatorKey, roleKey)
	 */
	public void addLinkOperatorToRole(Integer operatorKey, String roleKey) throws MappingException;
	/**
	 * @see SecurityActionProcessor#deleteLinkOperatorToRole(operatorKey, roleKey)
	 */
	public void deleteLinkOperatorToRole(Integer operatorKey, String roleKey) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findOperatorToRegionAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRegionAccessList(Integer operatorKey, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findOperatorToRegionList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRegionList(Integer operatorKey, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#saveRegionAccessForOperator(operatorKey, accessList)
	 */
	public void saveRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#findOperatorToSuperRegionList(Integer operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToSuperRegionList(Integer operatorKey, String orderBy) throws ModelException;
	/**
	 * @see SecurityActionProcessor#saveSuperRegionAccessForOperator(operatorKey, accessList)
	 */
	public void saveSuperRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException;
	/**
	 * @see SecurityActionProcessor#findAllTerrabyteServers()
	 */
	public ArrayList findAllTerrabyteServers() throws ModelException;
	/**
	 * @see SecurityActionProcessor#findProfileByKey(Profile)
	 */
	public Profile findProfileByKey(Profile aId) throws NoSuchProfileException;
	/**
	 * @see SecurityActionProcessor#removeProfile(Profile)
	 */
	public void removeProfile(Profile aId) throws NoSuchProfileException;
	/**
	 * @see SecurityActionProcessor#addProfile(Profile)
	 */
	public void addProfile(Profile newProfile) throws MappingException;
	/**
	 * @see SecurityActionProcessor#updateProfile(Profile)
	 */
	public void updateProfile(Profile aProfile) throws MappingException;
}
