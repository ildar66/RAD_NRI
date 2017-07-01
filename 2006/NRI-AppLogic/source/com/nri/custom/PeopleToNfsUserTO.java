/*
 * Created on 14.09.2007
 *
 * NriObject связь Физического лица и пользователя NFS.
 */
package com.nri.custom;

/**
 * @author IShaffigulin
 *
 * NriObject связь Физического лица и пользователя NFS.
 */
public class PeopleToNfsUserTO {
	private Integer personID = null; //код НФС
	private Integer idUserNRI = null; //man(People)
	private String flagMain = null; //признак главного пользователя
	private String login = null; //login НФС
	private String fullName = null; //ФИО пользователя НФС
	private String recordStatus = null;	
	/**
	 * 
	 */
	public PeopleToNfsUserTO() {
		super();
	}

	/**
	 * 
	 */
	public PeopleToNfsUserTO(Integer aPersonID, Integer aIdUserNRI) {
		super();
		setPersonID(aPersonID);
		setIdUserNRI(aIdUserNRI);
	}

	/**
	 * @return
	 */
	public String getFlagMain() {
		return flagMain;
	}

	/**
	 * @return
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return
	 */
	public Integer getIdUserNRI() {
		return idUserNRI;
	}

	/**
	 * @return
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @return
	 */
	public Integer getPersonID() {
		return personID;
	}

	/**
	 * @param string
	 */
	public void setFlagMain(String string) {
		flagMain = string;
	}

	/**
	 * @param string
	 */
	public void setFullName(String string) {
		fullName = string;
	}

	/**
	 * @param integer
	 */
	public void setIdUserNRI(Integer integer) {
		idUserNRI = integer;
	}

	/**
	 * @param string
	 */
	public void setLogin(String string) {
		login = string;
	}

	/**
	 * @param integer
	 */
	public void setPersonID(Integer integer) {
		personID = integer;
	}

	/**
	 * @return
	 */
	public String getRecordStatus() {
		return recordStatus;
	}

	/**
	 * @param string
	 */
	public void setRecordStatus(String string) {
		recordStatus = string;
	}

}
