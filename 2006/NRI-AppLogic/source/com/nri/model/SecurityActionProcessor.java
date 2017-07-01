/*
 * Created on 18.07.2007
 *
 * Application Model interface for Security manipulation services.
 */
package com.nri.model;

import java.util.ArrayList;
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

/**
 * @author IShaffigulin
 *
 * Application Model interface for Security manipulation services.
 */
public interface SecurityActionProcessor {
	/**
	 * Retrieve the People object with supplied People Id.
	 * @param manId the Integer People Id
	 * @return the located People, or null if no such People exists
	 */
	public People findPeopleByKey(Integer manId) throws NoSuchPeopleException;

	/** 
	 * Removes an People from the system.
	 * @param manId People to be removed.
	 */
	public void removePeople(Integer manId) throws NoSuchPeopleException;

	/**
	 * Add a new persistent People to the system.
	 * @param People to add to the persistent store.
	 */
	public void addPeople(People newPeople) throws MappingException;

	/**
	 * Update a persistent People to the system.
	 * @param People to update to the persistent store.
	 * @return the updated People 
	 */
	public void updatePeople(People aPeople) throws NoSuchPeopleException, MappingException, ModelException;

	/**
	 * Locate all Peoples.
	 * @returns a List of all Peoples
	 */
	public ArrayList findAllPeoples() throws ModelException;

	/**
	 * Locate all Peoples like by name.
	 * @returns a List of all Peoples like by name
	 */
	public ArrayList findPeoplesByName(String name) throws ModelException;

	/**
	 * Locate all Peoples like by name.
	 * @returns a List of all Peoples like by name
	 */
	public Page findPeoplesByName(String name, Boolean isActive, int start, int count, String orderBy) throws ModelException;

	/**
	 * Locate Role by is Id.
	 * @returns the requested Role
	 * @param roleId the String identifying the Role to be returned.
	 */
	public Role findRoleByKey(String roleId) throws NoSuchRoleException;

	/** 
	 * Delete a Role from system
	 * @param roleId the id of the Role to be removed.
	 */
	public void removeRole(String roleId) throws NoSuchRoleException;

	/**
	 * Insert a new Role into the NRI system
	 * @param newRole the Role to be added.
	 */
	public void addRole(Role newRole) throws MappingException;

	/**
	 * Update a persistent Role to the system.
	 * @param Role to update to the persistent store.
	 * @return the updated Role 
	 */
	public void updateRole(Role aRole) throws NoSuchRoleException, MappingException, ModelException;

	/**
	 * Locate all Roles.
	 * @returns a List of all Roles
	 */
	public ArrayList findAllRoles() throws ModelException;

	/**
	 * Locate all Roles like by name.
	 * @returns a List of all Roles like by name
	 */
	public ArrayList findRolesByName(String name) throws ModelException;

	/**
	 * Locate all Roles like by name.
	 * @returns a List of all Roles like by name
	 */
	public ArrayList findRolesByName(String name, String orderBy) throws ModelException;

	/**
	 * Locate WorkPosition by is Id.
	 * @returns the requested WorkPosition
	 * @param aId the Integer identifying the WorkPosition to be returned.
	 */
	public WorkPosition findWorkPositionByKey(Integer aId) throws NoSuchWorkPositionException;

	/** 
	 * Delete a WorkPosition from system
	 * @param aId the id of the WorkPosition to be removed.
	 */
	public void removeWorkPosition(Integer aId) throws NoSuchWorkPositionException;

	/**
	 * Insert a new WorkPosition into the NRI system
	 * @param newWorkPosition the WorkPosition to be added.
	 */
	public void addWorkPosition(WorkPosition newWorkPosition) throws MappingException;

	/**
	 * Update a persistent WorkPosition to the system.
	 * @param WorkPosition to update to the persistent store.
	 * @return the updated WorkPosition 
	 */
	public void updateWorkPosition(WorkPosition aWorkPosition) throws NoSuchWorkPositionException, MappingException, ModelException;

	/**
	 * Locate all WorkPositions like by name.
	 * @returns a List of all WorkPositions like by name
	 */
	public ArrayList findWorkPositions(String name, Boolean isActive, String orderBy) throws ModelException;

	/**
	 * This is a testing method designed to allow you to clear the caches for the
	 * In-Memory Simulated Data Access Objects when neecessary.
	 */
	public void clearInMemoryCaches();

	/**
	 * Locate MsUser by is Id.
	 * @returns the requested MsUser
	 * @param aId the Integer identifying the MsUser to be returned.
	 */
	public MsUser findMsUserByKey(Integer aId) throws NoSuchMsUserException;

	/** 
	 * Delete a MsUser from system
	 * @param aId the id of the MsUser to be removed.
	 */
	public void removeMsUser(Integer aId) throws NoSuchMsUserException;

	/**
	 * Insert a new MsUser into the NRI system
	 * @param newMsUser the MsUser to be added.
	 */
	public void addMsUser(MsUser newMsUser) throws MappingException;

	/**
	 * Update a persistent MsUser to the system.
	 * @param MsUser to update to the persistent store.
	 * @return the updated MsUser 
	 */
	public void updateMsUser(MsUser aMsUser) throws NoSuchMsUserException, MappingException, ModelException;

	/**
	 * Locate all MsUsers like by name.
	 * @returns a List of all MsUsers like by name
	 */
	public ArrayList findMsUsers(String name, String orderBy) throws ModelException;

	/**
	 * Locate Company by is Id.
	 * @returns the requested Company
	 * @param aId the Integer identifying the Company to be returned.
	 */
	public Company findCompanyByKey(Integer aId) throws NoSuchCompanyException;

	/** 
	 * Delete a Company from system
	 * @param aId the id of the Company to be removed.
	 */
	public void removeCompany(Integer aId) throws NoSuchCompanyException;

	/**
	 * Insert a new Company into the NRI system
	 * @param newCompany the Company to be added.
	 */
	public void addCompany(Company newCompany) throws MappingException;

	/**
	 * Update a persistent Company to the system.
	 * @param Company to update to the persistent store.
	 * @return the updated Company 
	 */
	public void updateCompany(Company aCompany) throws NoSuchCompanyException, MappingException, ModelException;

	/**
	 * Locate all Companys like by name.
	 * @returns a List of all Companys like by name
	 */
	public ArrayList findCompanies(String name, String orderBy) throws ModelException;

	/**
	 * Locate all Roles.
	 * @returns a List of all Roles
	 */
	public ArrayList findAllCompanies() throws ModelException;

	/**
	 * Locate Division by is Id.
	 * @returns the requested Division
	 * @param aId the Integer identifying the Division to be returned.
	 */
	public Division findDivisionByKey(Integer aId) throws NoSuchDivisionException;

	/** 
	 * Delete a Division from system
	 * @param aId the id of the Division to be removed.
	 */
	public void removeDivision(Integer aId) throws NoSuchDivisionException;

	/**
	 * Insert a new Division into the NRI system
	 * @param newDivision the Division to be added.
	 */
	public void addDivision(Division newDivision) throws MappingException;

	/**
	 * Update a persistent Division to the system.
	 * @param Division to update to the persistent store.
	 * @return the updated Division 
	 */
	public void updateDivision(Division aDivision) throws NoSuchDivisionException, MappingException, ModelException;

	/**
	 * Locate all Divisions like by name.
	 * @returns a List of all Divisions like by name
	 */
	public ArrayList findDivisions(String name, Integer company, Boolean isActive, String orderBy) throws ModelException;

	/**
	 * Locate all Divisions by encloserKey Hierarchy.
	 * @returns a List of all Divisions by encloserKey Hierarchy
	 */
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws ModelException;

	/**
	 * Locate all Divisions like by name.
	 * @returns a List of all Divisions like by name
	 */
	public ArrayList findDivisions(String name, Integer company, Boolean isActive, DivisionType type, String orderBy) throws ModelException;

	/**
	 * Locate Hierarchy Divisions for Encloser.
	 * @returns a List Divisions
	 */
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws ModelException;

	/**
	 * Locate all Workers like by.
	 * @returns a List of all Workers like by
	 */
	public ArrayList findWorkers(Worker query, String orderBy) throws ModelException;

	/**
	 * Locate all Workers like by.
	 * @returns a List of all Workers like by
	 */
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws ModelException;

	/**
	 * Locate Worker by is Id.
	 * @returns the requested Worker
	 * @param aId the Integer identifying the Worker to be returned.
	 */
	public Worker findWorkerByKey(Integer aId) throws NoSuchWorkerException;

	/** 
	 * Delete a Worker from system
	 * @param aId the id of the Worker to be removed.
	 */
	public void removeWorker(Integer aId) throws NoSuchWorkerException;

	/**
	 * Insert a new Worker into the NRI system
	 * @param newWorker the Worker to be added.
	 */
	public void addWorker(Worker newWorker) throws MappingException;

	/**
	 * Update a persistent Worker to the system.
	 * @param Worker to update to the persistent store.
	 * @return the updated Worker 
	 */
	public void updateWorker(Worker aWorker) throws NoSuchWorkerException, MappingException, ModelException;

	/**
	 * Locate all Operators by peopleKey.
	 * @returns a List of all Operators by peopleKey.
	 */
	public ArrayList findOperators(Integer peopleKey, String orderBy) throws ModelException;

	/**
	 * Locate Operator by is Id.
	 * @returns the requested Operator
	 * @param aId the Integer identifying the Operator to be returned.
	 */
	public Operator findOperatorByKey(Integer aId) throws NoSuchOperatorException;

	/** 
	 * Delete a Operator from system
	 * @param aId the id of the Operator to be removed.
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException;

	/**
	 * Insert a new Operator into the NRI system
	 * @param newOperator the Operator to be added.
	 */
	public void addOperator(Operator newOperator) throws MappingException;

	/**
	 * Update a persistent Operator to the system.
	 * @param Operator to update to the persistent store.
	 * @return the updated Operator 
	 */
	public void updateOperator(Operator aOperator) throws NoSuchOperatorException, MappingException, ModelException;

	/**
	 * Locate all PeopleToNfsUserList by peopleKey.
	 * @returns a List of all PeopleToNfsUserList by peopleKey.
	 */
	public ArrayList findPeopleToNfsUserList(Integer peopleKey, String orderBy) throws ModelException;

	/**
	 * Locate all NfsUsers like by name.
	 * @returns a List of all NfsUsers like by name
	 */
	public ArrayList findNfsUsers(String name, Boolean isActive, String orderBy) throws ModelException;

	/**
	 * Add Link People to NfsUser.
	 */
	public void addLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws ModelException, MappingException;

	/**
	 * delete Link People to NfsUser.
	 */
	public void deleteLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws ModelException, MappingException;

	/**
	 * setMainLink Link People to NfsUser.
	 */
	public void setMainLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws ModelException, MappingException;

	/**
	 * Locate all RoleList by operatorKey.
	 * @returns a List of all RoleList by operatorKey.
	 */
	public ArrayList findOperatorToRoleList(Integer operatorKey, String orderBy) throws ModelException;

	/**
	 * Locate access RoleList by operatorKey.
	 * @returns access RoleList by operatorKey.
	 */
	public ArrayList findOperatorToRoleAccessList(Integer operatorKey, String orderBy) throws ModelException;

	/**
	 * Delete Link Operator to Role.
	 */
	public void deleteLinkOperatorToRole(Integer operatorKey, String roleKey) throws ModelException, MappingException;

	/**
	 * Add Link Operator to Role.
	 */
	public void addLinkOperatorToRole(Integer operatorKey, String roleKey) throws ModelException, MappingException;

	/**
	 * Locate all RegionList by operatorKey.
	 * @returns a List of all Regions by operatorKey.
	 */
	public ArrayList findOperatorToRegionList(Integer operatorKey, String orderBy) throws ModelException;

	/**
	 * Locate access RegionList by operatorKey.
	 * @returns access Regions by operatorKey.
	 */
	public ArrayList findOperatorToRegionAccessList(Integer operatorKey, String orderBy) throws ModelException;

	/**
	 * Add RegionAccessList For Operator.
	 */
	public void saveRegionAccessForOperator(Integer operatorKey, java.util.Collection accessList) throws ModelException, MappingException;
	/**
	 * Locate all SuperRegionList by operatorKey.
	 * @returns a List of all SuperRegions by operatorKey.
	 */
	public ArrayList findOperatorToSuperRegionList(Integer operatorKey, String orderBy) throws ModelException;

	/**
	 * Locate access SuperRegionList by operatorKey.
	 * @returns access SuperRegions by operatorKey.
	 */
	public ArrayList findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy) throws ModelException;

	/**
	 * Add SuperRegionAccessList For Operator.
	 */
	public void saveSuperRegionAccessForOperator(Integer operatorKey, java.util.Collection accessList) throws ModelException, MappingException;
	
	/**
	 * Locate all TerrabyteServers.
	 * @returns a List of all TerrabyteServers
	 */
	public ArrayList findAllTerrabyteServers() throws ModelException;
	
	/**
	 * Locate Profile by is Id.
	 * @returns the requested Profile
	 * @param aProfile the key identifying the Profile to be returned.
	 */
	public Profile findProfileByKey(Profile aProfile) throws NoSuchProfileException;

	/** 
	 * Delete a Profile from system
	 * @param aProfile the id of the Profile to be removed.
	 */
	public void removeProfile(Profile aProfile) throws NoSuchProfileException;

	/**
	 * Insert a new Profile into the NRI system
	 * @param newProfile the Profile to be added.
	 */
	public void addProfile(Profile newProfile) throws MappingException;

	/**
	 * Update a persistent Profile to the system.
	 * @param aProfile to update to the persistent store.
	 * @return the updated Profile 
	 */
	public void updateProfile(Profile aProfile) throws NoSuchProfileException, MappingException, ModelException;

}
