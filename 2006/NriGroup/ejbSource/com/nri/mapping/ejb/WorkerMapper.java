/*
 * Created on 30.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;

import javax.ejb.EJBLocalObject;

import com.nri.domain.NriObject;
import com.nri.domain.Worker;
import com.nri.ejb.WorkerEJBLocal;
import com.nri.ejb.WorkerEJBLocalHome;
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
public class WorkerMapper extends DomainEJBMapper implements com.nri.mapping.WorkerMapper {
	WorkerEJBLocalHome workerHome;

	/**
	 * 
	 */
	public WorkerMapper() {
		super();
		createInitialContext();
		createWorkerHome();
	}

	/**
	 * This method retrieves an instance of WorkerEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createWorkerHome() {
		try {
			workerHome = (WorkerEJBLocalHome) initContext.lookup("java:comp/env/ejb/WorkerEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createWorkerHome()");
		}

	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		WorkerEJBLocal workerEJB = null;
		try {
			Worker worker = (Worker) domainObject;
			workerEJB = workerHome.findByPrimaryKey(worker.getWorker());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in WorkerMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in WorkerMapper.findEJBObjectMatching()"));
		}
		return workerEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		WorkerEJBLocal ejb;
		try {
			ejb = (WorkerEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non WorkerEJB in WorkerMapper");
		}
		Worker worker = null;
		try {
			worker = new Worker(((Integer) ejb.getPrimaryKey()), ejb.getMan(), ejb.getWorkPosition(), ejb.getIsOur(), ejb.getIsServiceStuff());
			worker.setCompany(ejb.getCompany());
			worker.setDivision(ejb.getDivision());
			worker.setLotusAddress(ejb.getLotusAddress());
			worker.setEmail(ejb.getEmail());
			worker.setPhone1(ejb.getPhone1());
			worker.setPhone2(ejb.getPhone2());
			worker.setLocalPhone(ejb.getLocalPhone());
			worker.setFax(ejb.getFax());
			worker.setMobilePhone(ejb.getMobilePhone());
			worker.setIsActive(ejb.getIsActive());
			worker.setIsOur(ejb.getIsOur());
			worker.setOrganization(ejb.getOrganization());
			worker.setIsServiceStuff(ejb.getIsServiceStuff());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in WorkerMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in WorkerMapper.map()");
		}
		return worker;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkerMapper#findById(java.lang.Integer)
	 */
	public Worker findById(Integer id) throws MappingException {
		try {
			WorkerEJBLocal ejb = workerHome.findByPrimaryKey(id);
			return (Worker) map(ejb);
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findByMan: " + e));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkerMapper#findWorkers(com.nri.domain.Worker, java.lang.String)
	 */
	public ArrayList findWorkers(Worker query, String orderBy) throws MappingException {
		throw new MappingException("findWorkers not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkerMapper#findWorkers(java.lang.String, com.nri.domain.Worker, java.lang.String)
	 */
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws MappingException {
		throw new MappingException("findWorkers not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			Worker worker = (Worker) anObject;
			WorkerEJBLocal workerEJB = workerHome.create(worker.getWorker(), worker.getMan(), worker.getWorkPosition(), worker.getIsOur(), worker.getIsServiceStuff());
			workerEJB.setCompany(worker.getCompany());
			workerEJB.setDivision(worker.getDivision());
			workerEJB.setLotusAddress(worker.getLotusAddress());
			workerEJB.setEmail(worker.getEmail());
			workerEJB.setPhone1(worker.getPhone1());
			workerEJB.setPhone2(worker.getPhone2());
			workerEJB.setLocalPhone(worker.getLocalPhone());
			workerEJB.setFax(worker.getFax());
			workerEJB.setMobilePhone(worker.getMobilePhone());
			workerEJB.setIsActive(worker.getIsActive());
			workerEJB.setOrganization(worker.getOrganization());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in WorkerMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in WorkerMapper.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			Worker worker = (Worker) anObject;
			WorkerEJBLocal workerEJB = workerHome.findByPrimaryKey(worker.getWorker());
			workerEJB.setCompany(worker.getCompany());
			workerEJB.setMan(worker.getMan());
			workerEJB.setWorkPosition(worker.getWorkPosition());			
			workerEJB.setDivision(worker.getDivision());
			workerEJB.setLotusAddress(worker.getLotusAddress());
			workerEJB.setEmail(worker.getEmail());
			workerEJB.setPhone1(worker.getPhone1());
			workerEJB.setPhone2(worker.getPhone2());
			workerEJB.setLocalPhone(worker.getLocalPhone());
			workerEJB.setFax(worker.getFax());
			workerEJB.setMobilePhone(worker.getMobilePhone());
			workerEJB.setIsActive(worker.getIsActive());
			workerEJB.setIsOur(worker.getIsOur());
			workerEJB.setOrganization(worker.getOrganization());
			workerEJB.setIsServiceStuff(worker.getIsServiceStuff());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in WorkerMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in WorkerMapper.update()");
		}

	}

}
