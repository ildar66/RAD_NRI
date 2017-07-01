/*
 * Created on 02.08.2007
 *
 * This class is the "in-memory" Mapper for WorkPositions.
 * It creates the default collection of WorkPositions.
 */
package com.nri.mapping.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.nri.domain.Division;
import com.nri.domain.DivisionType;
import com.nri.domain.NriObject;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchDivisionException;
import com.nri.exception.NoSuchObjectException;

/**
 * @author IShaffigulin
 *
 * This class is the "in-memory" Mapper for Divisions.
 * It creates the default collection of Divisions.
 */
public class DivisionMapper extends ObjectMapper implements com.nri.mapping.DivisionMapper {
	protected static ArrayList cache = null;
	/**
	 * 
	 */
	public DivisionMapper() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.memory.ObjectMapper#getCache()
	 */
	protected ArrayList getCache() {
		if (cache == null) {
			cache = initialLoad();
		}

		return cache;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.memory.ObjectMapper#clearCache()
	 */
	public void clearCache() {
		cache = new ArrayList();
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.memory.ObjectMapper#initialLoad()
	 */
	ArrayList initialLoad() {
		ArrayList v = new ArrayList();
		Division p = new Division(new Integer(1), DivisionType.getService(), "Service", Boolean.TRUE);
		v.add(p);
		p = new Division(new Integer(2), DivisionType.getDepartment(), "Depatment", Boolean.FALSE);
		v.add(p);
		p = new Division(new Integer(2), DivisionType.getDirection(), "Direction", Boolean.TRUE);
		v.add(p);
		return v;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#findByPrimaryKey(com.nri.domain.NriObject)
	 */
	public NriObject findByPrimaryKey(NriObject anObject) throws NoSuchObjectException {
		Division division = (Division) anObject;
		return findById(division.getDivision());
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findById(java.lang.Integer)
	 */
	public Division findById(Integer id) throws NoSuchDivisionException {
		ArrayList divisions = getCache();
		ListIterator iter = divisions.listIterator();
		Division current = null;
		while (iter.hasNext()) {
			current = (Division) iter.next();
			if (current.getDivision().equals(id))
				return current;
		}
		throw new NoSuchDivisionException("No division matching " + id + " found");

	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findByName(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findByName(String name, Integer company, Boolean isActive, String orderBy) throws MappingException {
		ArrayList divisions = findAll();
		if("*".equals(name) || "%".equals(name)){
			return divisions;
		}		
		ListIterator iter = divisions.listIterator();
		Division current = null;
		while (iter.hasNext()) {
			current = (Division) iter.next();
			if (!current.getName().equals(name)) {
				iter.remove();
			}
			if(isActive != null && !current.getIsActive().equals(isActive)){
				iter.remove();
			}
			if(company != null && !current.getCompany().equals(company)){
				iter.remove();
			}			
		}
		return divisions;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findDivisionsHierarchy(java.lang.Integer, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws MappingException {
		ArrayList divisions = findAll();
		ListIterator iter = divisions.listIterator();
		Division current = null;
		while (iter.hasNext()) {
			current = (Division) iter.next();
			if(isActive != null && !current.getIsActive().equals(isActive)){
				iter.remove();
			}
			if(encloserKey != null && !current.getEncloser().equals(encloserKey)){
				iter.remove();
			}			
		}
		return divisions;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findByName(java.lang.String, java.lang.Integer, java.lang.Boolean, com.nri.domain.DivisionType, java.lang.String)
	 */
	public ArrayList findByName(String name, Integer company, Boolean isActive, DivisionType type, String orderBy) throws MappingException {
		ArrayList divisions = findAll();
		if("*".equals(name) || "%".equals(name)){
			return divisions;
		}		
		ListIterator iter = divisions.listIterator();
		Division current = null;
		while (iter.hasNext()) {
			current = (Division) iter.next();
			if (!current.getName().equals(name)) {
				iter.remove();
			}
			if(isActive != null && !current.getIsActive().equals(isActive)){
				iter.remove();
			}
			if(company != null && !current.getCompany().equals(company)){
				iter.remove();
			}
			if(type != null && !current.getType().equals(type)){
				iter.remove();
			}
		}
		return divisions;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findDivisionHierarchyForEncloser(java.lang.Integer, int)
	 */
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
