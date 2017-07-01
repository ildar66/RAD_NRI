/*
 * Created on 25.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.custom;

import java.io.Serializable;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class WorkerTO implements Serializable {
	private Integer worker = null; //Идентификатор работника
	private Boolean isActive = null; //Признак активности работника
	private Boolean isServiceStuff = null; //Признак выездной/не_выездной
	private String fullNamePeople = null;
	private String workPositionsName = null;
	/**
	 * 
	 * @param aWorker
	 */
	public WorkerTO(Integer aWorker) {
		super();
		setWorker(aWorker);
	}

	/**
	 * 
	 *
	 */
	public WorkerTO() {
		super();
	}

	/**
	 * @return
	 */
	public Integer getWorker() {
		return worker;
	}

	/**
	 * @param integer
	 */
	public void setWorker(Integer integer) {
		worker = integer;
	}

	/**
	 * @return
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param boolean1
	 */
	public void setIsActive(Boolean boolean1) {
		isActive = boolean1;
	}

	/**
	 * @return
	 */
	public String getFullNamePeople() {
		return fullNamePeople;
	}

	/**
	 * @param string
	 */
	public void setFullNamePeople(String string) {
		fullNamePeople = string;
	}

	/**
	 * @return
	 */
	public String getWorkPositionsName() {
		return workPositionsName;
	}

	/**
	 * @param string
	 */
	public void setWorkPositionsName(String string) {
		workPositionsName = string;
	}

	/**
	 * @return
	 */
	public Boolean getIsServiceStuff() {
		return isServiceStuff;
	}

	/**
	 * @param boolean1
	 */
	public void setIsServiceStuff(Boolean boolean1) {
		isServiceStuff = boolean1;
	}

}
