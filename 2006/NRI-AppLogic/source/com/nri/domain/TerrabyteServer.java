/*
 * Created on 11.10.2007
 *
 * NriObject Файловый сервер.
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * NriObject Файловый сервер.
 */
public class TerrabyteServer extends NriObject {
	private Integer id = null; //Идентификатор
	private String location = null; //Место расположения
	private String description = null; //Описание
	private String host = null; //Имя хоста или ip
	private Integer port = null; //Порт

	/**
	 * 
	 */
	public TerrabyteServer() {
		super();
	}

	/**
	 * 
	 */
	public TerrabyteServer(Integer aID) {
		super();
		setId(aID);
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * @param string
	 */
	public void setDescription(String string) {
		description = string;
	}

	/**
	 * @param string
	 */
	public void setHost(String string) {
		host = string;
	}

	/**
	 * @param integer
	 */
	public void setId(Integer integer) {
		id = integer;
	}

	/**
	 * @param string
	 */
	public void setLocation(String string) {
		location = string;
	}

	/**
	 * @param integer
	 */
	public void setPort(Integer integer) {
		port = integer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof TerrabyteServer)) {
			return false;
		}
		TerrabyteServer anTerrabyteServer = (TerrabyteServer) anObject;
		return anTerrabyteServer.getId().equals(getId());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("TerrabyteServer: " + getId() + "; ");
		sb.append(getLocation() + "; " + getHost());
		//sb.append('\n');
		//sb.append(" IsActive: ");
		//sb.append(getIsActive());

		return sb.toString();
	}

}
