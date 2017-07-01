/*
 * Created on 15.09.2007
 *
 * Пользователь системы NFS (NriObject).
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * Пользователь системы NFS (NriObject).
 */
public class NfsUser extends NriObject {
	private Integer personID = null; //код НФС
	private Integer idUserNFS = null;
	private String login = null; //login НФС
	private String fullName = null; //ФИО пользователя НФС
	private String flagWorkNRI = null;
	private String recordStatus = null;

	/**
	 * 
	 */
	public NfsUser() {
		super();
	}

	/**
	 * 
	 */
	public NfsUser(Integer aPersonID) {
		super();
		setPersonID(aPersonID);
	}

	/**
	 * @return
	 */
	public String getFlagWorkNRI() {
		return flagWorkNRI;
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
	public Integer getIdUserNFS() {
		return idUserNFS;
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
	 * @return
	 */
	public String getRecordStatus() {
		return recordStatus;
	}

	/**
	 * @param string
	 */
	public void setFlagWorkNRI(String string) {
		flagWorkNRI = string;
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
	public void setIdUserNFS(Integer integer) {
		idUserNFS = integer;
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
	 * @param string
	 */
	public void setRecordStatus(String string) {
		recordStatus = string;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof NfsUser)) {
			return false;
		}
		NfsUser anNfsUser = (NfsUser) anObject;
		return anNfsUser.getPersonID().equals(getPersonID());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("NfsUser: ");
		sb.append(getPersonID() + "(" + getLogin() + ")");
		//sb.append('\n');
		//sb.append(" IsActive: ");
		//sb.append(getIsActive());

		return sb.toString();
	}

}
