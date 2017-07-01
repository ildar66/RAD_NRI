/*
 * Created on 17.07.2007
 *
 * This class defines a PeopleFactory for creating/retrieving Peoples
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;

import javax.ejb.EJBLocalObject;

import com.nri.domain.NriObject;
import com.nri.domain.Page;
import com.nri.domain.People;
import com.nri.ejb.PeopleEJBLocal;
import com.nri.ejb.PeopleEJBLocalHome;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class PeopleMapper extends DomainEJBMapper implements com.nri.mapping.PeopleMapper {
	PeopleEJBLocalHome peopleHome;
	/**
	 * 
	 */
	public PeopleMapper() {
		super();
		createInitialContext();
		createPeopleHome();
	}

	/**
	 * This method retrieves an instance of PeopleEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createPeopleHome() {
		try {
			peopleHome = (PeopleEJBLocalHome) initContext.lookup("java:comp/env/ejb/PeopleEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createPeopleHome()");
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		PeopleEJBLocal peopleEJB = null;
		try {
			People proj = (People) domainObject;
			peopleEJB = peopleHome.findByPrimaryKey(proj.getMan());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in PeopleFactory.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in PeopleFactory.findEJBObjectMatching()"));
		}
		return peopleEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		PeopleEJBLocal ejb;
		try {
			ejb = (PeopleEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non PeopleEJBLocal in PeopleFactory");
		}
		People people = null;
		try {
			people = new People((Integer) ejb.getPrimaryKey());
			people.setFirstName(ejb.getFirstName());
			people.setLastName(ejb.getLastName());
			people.setMiddleName(ejb.getMiddleName());
			people.setIsActive(ejb.getIsActive());
			people.setPassportDate(ejb.getPassportDate());
			people.setPassportSer(ejb.getPassportSer());
			people.setPassportWhom(ejb.getPassportWhom());
			people.setTabNum(ejb.getTabNum());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in PeopleFactory.map()");
			throw new MappingException(e, "Wrapped Exception caught in PeopleFactory.map()");
		}
		return people;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.PeopleMapper#findByMan(java.lang.Integer)
	 */
	public People findByMan(Integer man) throws MappingException {
		try {
			PeopleEJBLocal ejb = peopleHome.findByPrimaryKey(man);
			return (People) map(ejb);
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findByMan: " + e));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			People people = (People) anObject;
			PeopleEJBLocal peopleEJB = peopleHome.create(people.getMan(), people.getFirstName(), people.getLastName(), people.getMiddleName(), people.getPassportSer(), people.getPassportDate(), people.getPassportWhom(), people.getIsActive(), people.getTabNum());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL,"Exception " + e + " caught in PeopleFactory.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in PeopleFactory.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			People people = (People) anObject;
			PeopleEJBLocal peopleEJB = peopleHome.findByPrimaryKey(people.getMan());
			peopleEJB.setFirstName(people.getFirstName());
			peopleEJB.setLastName(people.getLastName());
			peopleEJB.setMiddleName(people.getMiddleName());
			peopleEJB.setIsActive(people.getIsActive());
			peopleEJB.setPassportDate(people.getPassportDate());
			peopleEJB.setPassportSer(people.getPassportSer());
			peopleEJB.setPassportWhom(people.getPassportWhom());
			peopleEJB.setTabNum(people.getTabNum());			
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in PeopleFactory.update()");
			throw new MappingException(e, "Wrapped Exception caught in PeopleFactory.update()");
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.PeopleMapper#findByName(java.lang.String)
	 */
	public ArrayList findByName(String name) throws MappingException {
		throw new MappingException("findByName not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.PeopleMapper#findByName(java.lang.String, int, int)
	 */
	public Page findByName(String name, Boolean isActive, int start, int count, String orderBy) throws MappingException {
		throw new MappingException("findByName not valid for this type");
	}

}
