/*
 * Created on 25.08.2007
 *
 *  NriObject работника предприятия.
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 *  NriObject работника предприятия.
 */
public class Worker extends NriObject {
	private Integer worker = null; //Идентификатор работника
	private Integer company = null; //Ссылка на предприятие
	private Integer man = null; //Физлицо
	private Integer workPosition = null; //Ссылка на должность
	private Integer division = null; //Ссылка на подразделение
	private String lotusAddress = null; //Адрес lotus
	private String email = null; //Адрес электронной почты
	private String phone1 = null; //Телефон1
	private String phone2 = null; //Телефон2
	private String localPhone = null; //Местный телефон
	private String fax = null; //Факс
	private String mobilePhone = null; //Мобильный телефон
	private Boolean isActive = null; //Признак активности работника
	private Boolean isOur = null; //Признак свой_чужой
	private Integer organization = null; //Ссылка на организацию
	private Boolean isServiceStuff = null; //Признак выездной/не_выездной

	/**
	 * 
	 */
	public Worker() {
		super();
	}

	/**
	 * 
	 * @param aWorker
	 */
	public Worker(Integer aWorker) {
		super();
		setWorker(aWorker);
	}

	/**
	 * 
	 * @param aWorker
	 * @param aMan
	 * @param aWorkPosition
	 * @param aIsOur
	 * @param aIsServiceStuff
	 */
	public Worker(Integer aWorker, Integer aMan, Integer aWorkPosition, Boolean aIsOur, Boolean aIsServiceStuff) {
		setWorker(aWorker);
		setMan(aMan);
		setWorkPosition(aWorkPosition);
		setIsOur(aIsOur);
		setIsServiceStuff(aIsServiceStuff);
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
	public String getEmail() {
		return email;
	}

	/**
	 * @return
	 */
	public String getFax() {
		return fax;
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
	public Boolean getIsOur() {
		return isOur;
	}

	/**
	 * @return
	 */
	public Boolean getIsServiceStuff() {
		return isServiceStuff;
	}

	/**
	 * @return
	 */
	public String getLocalPhone() {
		return localPhone;
	}

	/**
	 * @return
	 */
	public String getLotusAddress() {
		return lotusAddress;
	}

	/**
	 * @return
	 */
	public Integer getMan() {
		return man;
	}

	/**
	 * @return
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * @return
	 */
	public Integer getOrganization() {
		return organization;
	}

	/**
	 * @return
	 */
	public String getPhone1() {
		return phone1;
	}

	/**
	 * @return
	 */
	public String getPhone2() {
		return phone2;
	}

	/**
	 * @return
	 */
	public Integer getWorker() {
		return worker;
	}

	/**
	 * @return
	 */
	public Integer getWorkPosition() {
		return workPosition;
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
	 * @param string
	 */
	public void setEmail(String string) {
		email = string;
	}

	/**
	 * @param string
	 */
	public void setFax(String string) {
		fax = string;
	}

	/**
	 * @param boolean1
	 */
	public void setIsActive(Boolean boolean1) {
		isActive = boolean1;
	}

	/**
	 * @param boolean1
	 */
	public void setIsOur(Boolean boolean1) {
		isOur = boolean1;
	}

	/**
	 * @param boolean1
	 */
	public void setIsServiceStuff(Boolean boolean1) {
		isServiceStuff = boolean1;
	}

	/**
	 * @param string
	 */
	public void setLocalPhone(String string) {
		localPhone = string;
	}

	/**
	 * @param string
	 */
	public void setLotusAddress(String string) {
		lotusAddress = string;
	}

	/**
	 * @param integer
	 */
	public void setMan(Integer integer) {
		man = integer;
	}

	/**
	 * @param string
	 */
	public void setMobilePhone(String string) {
		mobilePhone = string;
	}

	/**
	 * @param integer
	 */
	public void setOrganization(Integer integer) {
		organization = integer;
	}

	/**
	 * @param string
	 */
	public void setPhone1(String string) {
		phone1 = string;
	}

	/**
	 * @param string
	 */
	public void setPhone2(String string) {
		phone2 = string;
	}

	/**
	 * @param integer
	 */
	public void setWorker(Integer integer) {
		worker = integer;
	}

	/**
	 * @param integer
	 */
	public void setWorkPosition(Integer integer) {
		workPosition = integer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof Worker)) {
			return false;
		}
		Worker aWorker = (Worker) anObject;
		return aWorker.getWorker().intValue() == getWorker().intValue();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Worker: ");
		sb.append(getWorker() + "(man=" + getMan() + ")");
		//sb.append('\n');
		//sb.append(" IsActive: ");
		//sb.append(getIsActive());

		return sb.toString();
	}

}
