/*
 * Created on 24.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.EJBLocalObject;

import com.nri.domain.NriObject;
import com.nri.domain.Role;
import com.nri.ejb.RoleEJBLocal;
import com.nri.ejb.RoleEJBLocalHome;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.exception.NoSuchRoleException;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class RoleMapper extends DomainEJBMapper implements com.nri.mapping.RoleMapper {
	RoleEJBLocalHome roleHome;
	/**
	 * 
	 */
	public RoleMapper() {
		super();
		createInitialContext();
		createRoleHome();
	}

	/**
	 * This method retrieves an instance of RoleEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createRoleHome() {
		try {
			roleHome = (RoleEJBLocalHome) initContext.lookup("java:comp/env/ejb/RoleEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createRoleHome()");
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		RoleEJBLocal roleEJB = null;
		try {
			Role role = (Role) domainObject;
			roleEJB = roleHome.findByPrimaryKey(role.getRole());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in RoleMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in RoleMapper.findEJBObjectMatching()"));
		}
		return roleEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		RoleEJBLocal ejb;
		try {
			ejb = (RoleEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non RoleEJB in RoleMapper");
		}
		Role role = null;
		try {
			role = new Role(((String) ejb.getPrimaryKey()));
			role.setRoleName(ejb.getRoleName().trim());
			role.setComment(ejb.getComment());
			role.setSortOrder(ejb.getSortOrder());
			role.setTaskComment(ejb.getTaskComment());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in RoleMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in RoleMapper.map()");
		}
		return role;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RoleMapper#findById(java.lang.String)
	 */
	public Role findById(String roleId) throws NoSuchRoleException {
		try {
			RoleEJBLocal ejb = roleHome.findByPrimaryKey(roleId);
			return (Role) map(ejb);
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in findById()");
			throw new NoSuchRoleException(e, ("Wrapped Exception " + e + " caught in findById()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			Role role = (Role) anObject;
			RoleEJBLocal roleEJB = roleHome.create(role.getRole(), role.getRoleName(), role.getComment(), role.getSortOrder(), role.getTaskComment());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in RoleMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in RoleMapper.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			Role role = (Role) anObject;
			RoleEJBLocal roleEJB = roleHome.findByPrimaryKey(role.getRole());
			roleEJB.setRoleName(role.getRoleName());
			roleEJB.setComment(role.getComment());
			roleEJB.setSortOrder(role.getSortOrder());
			roleEJB.setTaskComment(role.getTaskComment());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in RoleMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in RoleMapper.update()");
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findAllEJBs()
	 */
	protected Collection findAllEJBs() throws MappingException {
		try {
			return roleHome.findAll();
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findAllEJBs : " + e));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RoleMapper#findByName(java.lang.String)
	 */
	public ArrayList findByName(String roleName) throws MappingException {
		ArrayList list = new ArrayList();
		try {
			java.util.Iterator aEJBs = roleHome.findByRoleName(roleName).iterator();
			while (aEJBs.hasNext()) {
				Object next = aEJBs.next();
				Object mapped = map((EJBLocalObject) next);
				list.add(mapped);
			}
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findByName : " + e));
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RoleMapper#findByName(java.lang.String, java.lang.String)
	 */
	public ArrayList findByName(String roleName, String orderBy) throws MappingException {
		throw new MappingException("findByName(java.lang.String, java.lang.String) not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RoleMapper#findOperatorToRoleAccessList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToRoleAccessList(Integer operatorKey, String orderBy) throws MappingException {
		throw new MappingException("findOperatorToRoleAccessList(Integer operatorKey, String orderBy) not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RoleMapper#findOperatorToRoleList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToRoleList(Integer operatorKey, String orderBy) throws MappingException {
		throw new MappingException("findOperatorToRoleList(Integer operatorKey, String orderBy) not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RoleMapper#addLinkOperatorToRole(java.lang.Integer, String)
	 */
	public void addLinkOperatorToRole(Integer operatorKey, String roleKey) throws MappingException {
		throw new MappingException("addLinkOperatorToRole(Integer operatorKey, Integer roleKey) not valid for this type");
	}
	
	/* (non-Javadoc)
	 * @see com.nri.mapping.RoleMapper#deleteLinkOperatorToRole(java.lang.Integer, String)
	 */
	public void deleteLinkOperatorToRole(Integer operatorKey, String roleKey) throws MappingException {
		throw new MappingException("deleteLinkOperatorToRole(Integer operatorKey, Integer roleKey) not valid for this type");
	}

}
