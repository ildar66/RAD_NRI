/*
 * Created on 02.08.2007
 *
 * This class is the "in-memory" Mapper for WorkPositions.
 * It creates the default collection of WorkPositions.
 */
package com.nri.mapping.memory;

import java.util.ArrayList;
import java.util.ListIterator;

import com.nri.custom.WorkerTO;
import com.nri.domain.NriObject;
import com.nri.domain.Worker;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.exception.NoSuchWorkerException;

/**
 * @author IShaffigulin
 *
 * This class is the "in-memory" Mapper for Workers.
 * It creates the default collection of Workers.
 */
public class WorkerMapper extends ObjectMapper implements com.nri.mapping.WorkerMapper {
	protected static ArrayList cache = null;
	/**
	 * 
	 */
	public WorkerMapper() {
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
		Worker p = new Worker(new Integer(1));
		p.setIsActive(Boolean.TRUE);
		//p.setName("Development at ABC Corp.");
		v.add(p);
		p = new Worker(new Integer(2));
		p.setIsActive(Boolean.FALSE);
		//p.setName("Worker work at XYZ Corp.");
		v.add(p);
		p = new Worker(new Integer(3));
		p.setIsActive(Boolean.TRUE);
		//p.setName("Worker work at PRG Corp.");
		v.add(p);
		return v;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#findByPrimaryKey(com.nri.domain.NriObject)
	 */
	public NriObject findByPrimaryKey(NriObject anObject) throws NoSuchObjectException {
		Worker workPosition = (Worker) anObject;
		return findById(workPosition.getWorker());
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkerMapper#findById(java.lang.Integer)
	 */
	public Worker findById(Integer id) throws NoSuchWorkerException {
		ArrayList workPositions = getCache();
		ListIterator iter = workPositions.listIterator();
		Worker current = null;
		while (iter.hasNext()) {
			current = (Worker) iter.next();
			if (current.getWorker().equals(id))
				return current;
		}
		throw new NoSuchWorkerException("No workPosition matching " + id + " found");

	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkerMapper#findByName(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findByName(String name, Boolean isActive, String orderBy) throws MappingException {
		// TODO конфликт !!!WorkerTO и Worker
		ArrayList workPositions = findAll();
		if("*".equals(name) || "%".equals(name)){
			return workPositions;
		}		
		ListIterator iter = workPositions.listIterator();
		WorkerTO current = null;
		while (iter.hasNext()) {
			current = (WorkerTO) iter.next();
			if (!current.getFullNamePeople().equals(name)) {
				iter.remove();
			}
			if(isActive != null && !current.getIsActive().equals(isActive)){
				iter.remove();
			}
		}
		return workPositions;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkerMapper#findWorkers(com.nri.domain.Worker, java.lang.String)
	 */
	public ArrayList findWorkers(Worker query, String orderBy) throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkerMapper#findWorkers(java.lang.String, com.nri.domain.Worker, java.lang.String)
	 */
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
