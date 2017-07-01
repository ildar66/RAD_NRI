/*
 * Created on 02.08.2007
 *
 * MapperImp Профиль пользователя NRI.
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.EJBLocalObject;

import com.nri.domain.Profile;
import com.nri.domain.NriObject;
import com.nri.ejb.ProfileEJBKey;
import com.nri.ejb.ProfileEJBLocal;
import com.nri.ejb.ProfileEJBLocalHome;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * MapperImp Профиль пользователя NRI.
 */
public class ProfileMapper extends DomainEJBMapper implements com.nri.mapping.ProfileMapper {
	ProfileEJBLocalHome profileHome;
	/**
	 * 
	 */
	public ProfileMapper() {
		super();
		createInitialContext();
		createProfileHome();
	}

	/**
	 * This method retrieves an instance of ProfileEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createProfileHome() {
		try {
			profileHome = (ProfileEJBLocalHome) initContext.lookup("java:comp/env/ejb/ProfileEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createProfileHome()");
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		ProfileEJBLocal profileEJB = null;
		try {
			Profile profile = (Profile) domainObject;
			profileEJB = profileHome.findByPrimaryKey(new ProfileEJBKey(profile.getOperatorID(), profile.getKey(), profile.getName()));
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in ProfileMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in ProfileMapper.findEJBObjectMatching()"));
		}
		return profileEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		ProfileEJBLocal ejb;
		try {
			ejb = (ProfileEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non ProfileEJB in ProfileMapper");
		}
		Profile profile = null;
		try {
			ProfileEJBKey keyEJB = (ProfileEJBKey) ejb.getPrimaryKey();
			profile = new Profile(keyEJB.operatorID, keyEJB.key, keyEJB.name);
			profile.setType(ejb.getType());
			profile.setNum_value(ejb.getNum_value());
			profile.setStr_value(ejb.getStr_value());
			profile.setDate_value(ejb.getDate_value());
			profile.setKey_type(ejb.getKey_type());
			profile.setModified(ejb.getModified());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in ProfileMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in ProfileMapper.map()");
		}
		return profile;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			Profile profile = (Profile) anObject;
			ProfileEJBLocal profileEJB = profileHome.create(profile.getOperatorID(), profile.getKey(), profile.getName(), profile.getType(), profile.getKey_type());
			profileEJB.setNum_value(profile.getNum_value());
			profileEJB.setStr_value(profile.getStr_value());
			profileEJB.setDate_value(profile.getDate_value());
			//profileEJB.set(profile.get());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in ProfileMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in ProfileMapper.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			Profile profile = (Profile) anObject;
			ProfileEJBLocal profileEJB = profileHome.findByPrimaryKey(new ProfileEJBKey(profile.getOperatorID(), profile.getKey(), profile.getName()));
			profileEJB.setType(profile.getType());
			profileEJB.setNum_value(profile.getNum_value());
			profileEJB.setStr_value(profile.getStr_value());
			profileEJB.setDate_value(profile.getDate_value());
			profileEJB.setKey_type(profile.getKey_type());
			profileEJB.setModified(new java.sql.Timestamp(System.currentTimeMillis()));
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in ProfileMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in ProfileMapper.update()");
		}
	}

}
