/*
 * Created on 02.08.2007
 *
 * MapperImp Компании NRI.
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.EJBLocalObject;

import com.nri.domain.Company;
import com.nri.domain.NriObject;
import com.nri.ejb.CompanyEJBLocal;
import com.nri.ejb.CompanyEJBLocalHome;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * MapperImp Компании NRI.
 */
public class CompanyMapper extends DomainEJBMapper implements com.nri.mapping.CompanyMapper {
	CompanyEJBLocalHome companyHome;
	/**
	 * 
	 */
	public CompanyMapper() {
		super();
		createInitialContext();
		createCompanyHome();
	}

	/**
	 * This method retrieves an instance of CompanyEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createCompanyHome() {
		try {
			companyHome = (CompanyEJBLocalHome) initContext.lookup("java:comp/env/ejb/CompanyEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createCompanyHome()");
		}
	}
	
	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		CompanyEJBLocal companyEJB = null;
		try {
			Company company = (Company) domainObject;
			companyEJB = companyHome.findByPrimaryKey(company.getCompany());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in CompanyMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in CompanyMapper.findEJBObjectMatching()"));
		}
		return companyEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		CompanyEJBLocal ejb;
		try {
			ejb = (CompanyEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non CompanyEJB in CompanyMapper");
		}
		Company company = null;
		try {
			company = new Company(((Integer) ejb.getPrimaryKey()));
			company.setName(ejb.getName());
			company.setShortName(ejb.getShortName());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in CompanyMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in CompanyMapper.map()");
		}
		return company;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.CompanyMapper#findById(java.lang.Integer)
	 */
	public Company findById(Integer id) throws MappingException {
		try {
			CompanyEJBLocal ejb = companyHome.findByPrimaryKey(id);
			return (Company) map(ejb);
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findById: " + e));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.CompanyMapper#findByName(java.lang.String, java.lang.String)
	 */
	public ArrayList findByName(String name, String orderBy) throws MappingException {
		throw new MappingException("findByName not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			Company company = (Company) anObject;
			CompanyEJBLocal companyEJB = companyHome.create(company.getCompany(), company.getName(), company.getShortName());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in CompanyMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in CompanyMapper.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			Company company = (Company) anObject;
			CompanyEJBLocal companyEJB = companyHome.findByPrimaryKey(company.getCompany());
			companyEJB.setName(company.getName());
			companyEJB.setShortName(company.getShortName());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in CompanyMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in CompanyMapper.update()");
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findAllEJBs()
	 */
	protected Collection findAllEJBs() throws MappingException {
		try {
			return companyHome.findAll();
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findAllEJBs : " + e));
		}
	}

}
