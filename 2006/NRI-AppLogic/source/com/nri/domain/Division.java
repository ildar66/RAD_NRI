/*
 * Created on 22.08.2007
 *
 * NriObject ������������� �����������.
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * NriObject ������������� �����������.
 */
public class Division extends NriObject {
	private Integer division = null; //������������� �������������
	private DivisionType type = null; //��� �������������
	private Integer encloser = null; //������ �� ����������� �������������
	private String name = null; //������������ �������������
	private String shortName = null; //�������� �������� �������������
	private Integer boss = null; //������ �� ���������_������������ �������������
	private Integer company = null; //������ �� �����������
	private Boolean isActive = null; //������� ���������� �������������
	/**
	 * 
	 */
	public Division() {
		super();
	}
	/**
	 * 
	 * @param aDivision
	 */
	public Division(Integer aDivision) {
		super();
		setDivision(aDivision);
	}		
	/**
	 * 
	 */
	public Division(Integer aDivision, DivisionType aType, String aName, Boolean aIsActive) {
		super();
		setDivision(aDivision);
		setType(aType);
		setName(aName);
		setIsActive(aIsActive);
	}	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof Division)) {
			return false;
		}
		Division aDivision = (Division) anObject;
		return aDivision.getDivision().intValue() == getDivision().intValue();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Division: ");
		sb.append(getDivision() + "(" + getName() + ")");
		//sb.append('\n');
		//sb.append(" IsActive: ");
		//sb.append(getIsActive());

		return sb.toString();
	}

	/**
	 * @return
	 */
	public Integer getBoss() {
		return boss;
	}

	/**
	 * @return
	 */
	public Integer getCompany() {
		return company;
	}

	/**
	 * @return
	 */
	public Integer getDivision() {
		return division;
	}

	/**
	 * @return
	 */
	public Integer getEncloser() {
		return encloser;
	}

	/**
	 * @return
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @return
	 */
	public DivisionType getType() {
		return type;
	}

	/**
	 * @param integer
	 */
	public void setBoss(Integer integer) {
		boss = integer;
	}

	/**
	 * @param integer
	 */
	public void setCompany(Integer integer) {
		company = integer;
	}

	/**
	 * @param integer
	 */
	public void setDivision(Integer integer) {
		division = integer;
	}

	/**
	 * @param integer
	 */
	public void setEncloser(Integer integer) {
		encloser = integer;
	}

	/**
	 * @param boolean1
	 */
	public void setIsActive(Boolean boolean1) {
		isActive = boolean1;
	}

	/**
	 * @param string
	 */
	public void setName(String string) {
		name = string;
	}

	/**
	 * @param string
	 */
	public void setShortName(String string) {
		shortName = string;
	}

	/**
	 * @param string
	 */
	public void setType(DivisionType aType) {
		type = aType;
	}

}
