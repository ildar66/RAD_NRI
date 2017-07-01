/*
 * Created on 01.08.2007
 *
 * MapperImp Должность.
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;

import javax.ejb.EJBLocalObject;

import com.nri.domain.NriObject;
import com.nri.domain.WorkPosition;
import com.nri.ejb.WorkPositionEJBLocal;
import com.nri.ejb.WorkPositionEJBLocalHome;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * MapperImp Должность.
 */
public class WorkPositionMapper extends DomainEJBMapper implements com.nri.mapping.WorkPositionMapper {
	WorkPositionEJBLocalHome workPositionHome;
	/**
	 * 
	 */
	public WorkPositionMapper() {
		super();
		createInitialContext();
		createWorkPositionHome();
	}

	/**
	 * This method retrieves an instance of WorkPositionEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createWorkPositionHome() {
		try {
			workPositionHome = (WorkPositionEJBLocalHome) initContext.lookup("java:comp/env/ejb/WorkPositionEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createWorkPositionHome()");
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		WorkPositionEJBLocal workPositionEJB = null;
		try {
			WorkPosition workPosition = (WorkPosition) domainObject;
			workPositionEJB = workPositionHome.findByPrimaryKey(workPosition.getWorkPosition());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in WorkPositionMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in WorkPositionMapper.findEJBObjectMatching()"));
		}
		return workPositionEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		WorkPositionEJBLocal ejb;
		try {
			ejb = (WorkPositionEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non WorkPositionEJB in WorkPositionMapper");
		}
		WorkPosition workPosition = null;
		try {
			workPosition = new WorkPosition(((Integer) ejb.getPrimaryKey()));
			workPosition.setName(ejb.getName());
			workPosition.setIsActive(ejb.getIsActive());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in WorkPositionMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in WorkPositionMapper.map()");
		}
		return workPosition;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkPositionMapper#findById(java.lang.Integer)
	 */
	public WorkPosition findById(Integer id) throws MappingException {
		try {
			WorkPositionEJBLocal ejb = workPositionHome.findByPrimaryKey(id);
			return (WorkPosition) map(ejb);
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findByMan: " + e));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkPositionMapper#findByName(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findByName(String name, Boolean isActive, String orderBy) throws MappingException {
		throw new MappingException("findByName not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			WorkPosition workPosition = (WorkPosition) anObject;
			WorkPositionEJBLocal workPositionEJB = workPositionHome.create(workPosition.getWorkPosition(), workPosition.getName(), workPosition.getIsActive());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in WorkPositionMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in WorkPositionMapper.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			WorkPosition workPosition = (WorkPosition) anObject;
			WorkPositionEJBLocal workPositionEJB = workPositionHome.findByPrimaryKey(workPosition.getWorkPosition());
			workPositionEJB.setName(workPosition.getName());
			workPositionEJB.setIsActive(workPosition.getIsActive());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in WorkPositionMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in WorkPositionMapper.update()");
		}
	}

}
