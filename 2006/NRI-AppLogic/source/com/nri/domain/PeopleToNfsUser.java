/*
 * Created on 14.09.2007
 *
 * NriObject связь Физического лица и пользователя NFS.
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * NriObject связь Физического лица и пользователя NFS.
 */
public class PeopleToNfsUser extends NriObject {
	private Integer personID = null; //код НФС
	private Integer idUserNRI = null; //man(People)
	private String flagMain = null; //признак главного пользователя
	/**
	 * 
	 */
	public PeopleToNfsUser(Integer personID, Integer idUserNRI) {
		super();
		setPersonID(personID);
		setIdUserNRI(idUserNRI);
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
	public Integer getIdUserNRI() {
		return idUserNRI;
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
	 * @param integer
	 */
	public void setIdUserNRI(Integer integer) {
		idUserNRI = integer;
	}

	/**
	 * @param integer
	 */
	public void setPersonID(Integer integer) {
		personID = integer;
	}

}
