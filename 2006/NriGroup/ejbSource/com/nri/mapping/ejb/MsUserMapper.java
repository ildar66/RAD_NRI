/*
 * Created on 02.08.2007
 *
 * MapperImp Пользователи MicroStrategy.
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;

import javax.ejb.EJBLocalObject;

import com.nri.domain.MsUser;
import com.nri.domain.NriObject;
import com.nri.ejb.MsUserEJBLocal;
import com.nri.ejb.MsUserEJBLocalHome;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * MapperImp Пользователи MicroStrategy.
 */
public class MsUserMapper extends DomainEJBMapper implements com.nri.mapping.MsUserMapper {
	MsUserEJBLocalHome msUserHome;
	/**
	 * 
	 */
	public MsUserMapper() {
		super();
		createInitialContext();
		createMsUserHome();
	}

	/**
	 * This method retrieves an instance of MsUserEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createMsUserHome() {
		try {
			msUserHome = (MsUserEJBLocalHome) initContext.lookup("java:comp/env/ejb/MsUserEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createMsUserHome()");
		}
	}
	
	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		MsUserEJBLocal msUserEJB = null;
		try {
			MsUser msUser = (MsUser) domainObject;
			msUserEJB = msUserHome.findByPrimaryKey(msUser.getMsuCode());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in MsUserMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in MsUserMapper.findEJBObjectMatching()"));
		}
		return msUserEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		MsUserEJBLocal ejb;
		try {
			ejb = (MsUserEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non MsUserEJB in MsUserMapper");
		}
		MsUser msUser = null;
		try {
			msUser = new MsUser(((Integer) ejb.getPrimaryKey()));
			msUser.setMsUser(ejb.getMsUser());
			msUser.setMsPassword(ejb.getMsPassword());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in MsUserMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in MsUserMapper.map()");
		}
		return msUser;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.MsUserMapper#findById(java.lang.Integer)
	 */
	public MsUser findById(Integer id) throws MappingException {
		try {
			MsUserEJBLocal ejb = msUserHome.findByPrimaryKey(id);
			return (MsUser) map(ejb);
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findById: " + e));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.MsUserMapper#findByName(java.lang.String, java.lang.String)
	 */
	public ArrayList findByName(String name, String orderBy) throws MappingException {
		throw new MappingException("findByName not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			MsUser msUser = (MsUser) anObject;
			MsUserEJBLocal msUserEJB = msUserHome.create(msUser.getMsuCode(), msUser.getMsUser(), msUser.getMsPassword());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in MsUserMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in MsUserMapper.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			MsUser msUser = (MsUser) anObject;
			MsUserEJBLocal msUserEJB = msUserHome.findByPrimaryKey(msUser.getMsuCode());
			msUserEJB.setMsUser(msUser.getMsUser());
			msUserEJB.setMsPassword(msUser.getMsPassword());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in MsUserMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in MsUserMapper.update()");
		}
	}

}
