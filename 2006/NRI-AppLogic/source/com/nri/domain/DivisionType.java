/*
 * Created on 23.08.2007
 *
 * NriObject Подразделения Компаний.
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * NriObject Подразделения Компаний.
 */
public abstract class DivisionType extends NriObject{
	static final Direction directionSingleton = new Direction();
	static final Service serviceSingleton = new Service();
	static final Department departmentSingleton = new Department();
	static final Group groupSingleton = new Group();
	
	public final static java.util.List TYPE_LIST = new java.util.ArrayList();
	static {
		TYPE_LIST.add(directionSingleton);
		TYPE_LIST.add(serviceSingleton);
		TYPE_LIST.add(departmentSingleton);
		TYPE_LIST.add(groupSingleton);
	}
	
	/**
	 * 
	 */
	public DivisionType() {
		super();
	}

	/**
	 * 
	 * @return
	 */
	abstract public String getTypeName();

	/**
	 * 
	 * @return
	 */
	abstract public String getType();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getTypeName();
	}

	public static Direction getDirection() {
		return directionSingleton;
	}

	public static Service getService() {
		return serviceSingleton;
	}

	public static Department getDepartment() {
		return departmentSingleton;
	}

	public static Group getGroup() {
		return groupSingleton;
	}
	
	public static DivisionType factory(String aType) {
		if ("D".equals(aType)) {
			return getDirection();
		} else if("S".equals(aType)){
			return getService();
		} else if("P".equals(aType)){
			return getDepartment();
		} else if("G".equals(aType)){
			return getGroup();
		}
		return null;
	}	
}
