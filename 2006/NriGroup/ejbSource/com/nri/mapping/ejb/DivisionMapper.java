/*
 * Created on 01.08.2007
 *
 * MapperImp подразделений предприятия.
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.EJBLocalObject;

import com.nri.domain.Division;
import com.nri.domain.DivisionType;
import com.nri.domain.NriObject;
import com.nri.ejb.DivisionEJBLocal;
import com.nri.ejb.DivisionEJBLocalHome;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * MapperImp подразделений предприятия.
 */
public class DivisionMapper extends DomainEJBMapper implements com.nri.mapping.DivisionMapper {
	DivisionEJBLocalHome divisionHome;
	/**
	 * 
	 */
	public DivisionMapper() {
		super();
		createInitialContext();
		createDivisionHome();
	}

	/**
	 * This method retrieves an instance of DivisionEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createDivisionHome() {
		try {
			divisionHome = (DivisionEJBLocalHome) initContext.lookup("java:comp/env/ejb/DivisionEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createDivisionHome()");
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		DivisionEJBLocal divisionEJB = null;
		try {
			Division division = (Division) domainObject;
			divisionEJB = divisionHome.findByPrimaryKey(division.getDivision());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in DivisionMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in DivisionMapper.findEJBObjectMatching()"));
		}
		return divisionEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		DivisionEJBLocal ejb;
		try {
			ejb = (DivisionEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non DivisionEJB in DivisionMapper");
		}
		Division division = null;
		try {
			division = new Division(((Integer) ejb.getPrimaryKey()), DivisionType.factory(ejb.getType()), ejb.getName(), ejb.getIsActive());
			division.setEncloser(ejb.getEncloser());
			division.setShortName(ejb.getShortName());
			division.setBoss(ejb.getBoss());
			division.setCompany(ejb.getCompany());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in DivisionMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in DivisionMapper.map()");
		}
		return division;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findById(java.lang.Integer)
	 */
	public Division findById(Integer id) throws MappingException {
		try {
			DivisionEJBLocal ejb = divisionHome.findByPrimaryKey(id);
			return (Division) map(ejb);
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findByMan: " + e));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findByName(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findByName(String name, Integer company, Boolean isActive, String orderBy) throws MappingException {
		throw new MappingException("findByName not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			Division division = (Division) anObject;
			DivisionEJBLocal divisionEJB =
				divisionHome.create(
					division.getDivision(),
					division.getType().getType(),
					division.getEncloser(),
					division.getName(),
					division.getShortName(),
					division.getBoss(),
					division.getCompany(),
					division.getIsActive());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in DivisionMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in DivisionMapper.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			Division division = (Division) anObject;
			DivisionEJBLocal divisionEJB = divisionHome.findByPrimaryKey(division.getDivision());
			divisionEJB.setType(division.getType().getType());
			divisionEJB.setName(division.getName());
			divisionEJB.setShortName(division.getShortName());
			divisionEJB.setBoss(division.getBoss());
			divisionEJB.setIsActive(division.getIsActive());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in DivisionMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in DivisionMapper.update()");
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findDivisionsHierarchy(java.lang.Integer, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws MappingException {
		throw new MappingException("findDivisionsHierarchy not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findByName(java.lang.String, java.lang.Integer, java.lang.Boolean, com.nri.domain.DivisionType, java.lang.String)
	 */
	public ArrayList findByName(String name, Integer company, Boolean isActive, DivisionType type, String orderBy) throws MappingException {
		throw new MappingException("findByName not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findDivisionHierarchyForEncloser(java.lang.Integer, int)
	 */
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws MappingException {
		//инит. Родителя и его иерархию:
		Division encloser = findById(encloserKey);
		//инит иерархию:
		LinkedList hierarchyEncloser = new LinkedList();
		hierarchyEncloser.add(encloser);
		while (encloser.getEncloser() != null && depth > 0) {
			encloserKey = encloser.getEncloser();
			encloser = findById(encloserKey);
			hierarchyEncloser.addFirst(encloser);
			depth--;
		}
		return hierarchyEncloser;
	}

}
