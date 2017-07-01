/*
 * Created on 12.10.2007
 *
 * NriObject Профиль пользователя.
 */
package com.nri.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author IShaffigulin
 *
 * NriObject Профиль пользователя.
 */
public class Profile extends NriObject {
	private Integer operatorID = null; //Код оператора
	private String key = null; //Ключ
	private String name = null; //Имя
	private Integer type = null; //Тип
	private BigDecimal num_value = null; //Числовое значение
	private String str_value = null; //Строковое значение
	private Timestamp date_value = null; //Дата(значение)
	private String clob_value = null; //Текстовое значение
	private Integer key_type = null; //Тип ключа
	private Timestamp modified = null;//modified data

	/**
	 * 
	 */
	public Profile(Integer aOperatorID, String aKey, String aName) {
		super();
		setOperatorID(aOperatorID);
		setKey(aKey);
		setName(aName);
	}

	/**
	 * 
	 */
	public Profile() {
		super();
	}

	/**
	 * @return
	 */
	public String getClob_value() {
		return clob_value;
	}

	/**
	 * @return
	 */
	public Timestamp getDate_value() {
		return date_value;
	}

	/**
	 * @return
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @return
	 */
	public Integer getKey_type() {
		return key_type;
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
	public BigDecimal getNum_value() {
		return num_value;
	}

	/**
	 * @return
	 */
	public Integer getOperatorID() {
		return operatorID;
	}

	/**
	 * @return
	 */
	public String getStr_value() {
		return str_value;
	}

	/**
	 * @return
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param string
	 */
	public void setClob_value(String string) {
		clob_value = string;
	}

	/**
	 * @param timestamp
	 */
	public void setDate_value(Timestamp timestamp) {
		date_value = timestamp;
	}

	/**
	 * @param string
	 */
	public void setKey(String string) {
		key = string;
	}

	/**
	 * @param integer
	 */
	public void setKey_type(Integer integer) {
		key_type = integer;
	}

	/**
	 * @param string
	 */
	public void setName(String string) {
		name = string;
	}

	/**
	 * @param decimal
	 */
	public void setNum_value(BigDecimal decimal) {
		num_value = decimal;
	}

	/**
	 * @param integer
	 */
	public void setOperatorID(Integer integer) {
		operatorID = integer;
	}

	/**
	 * @param string
	 */
	public void setStr_value(String string) {
		str_value = string;
	}

	/**
	 * @param integer
	 */
	public void setType(Integer integer) {
		type = integer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof Profile)) {
			return false;
		}
		Profile aProfile = (Profile) anObject;
		return (aProfile.getOperatorID().intValue() == getOperatorID().intValue()) && (aProfile.getKey().equals(getKey())) && (aProfile.getName().equals(getName()));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Profile: operatorID=" + getOperatorID());
		sb.append("; key=" + getKey() + "; name=" + getName());
		return sb.toString();
	}

	/**
	 * @return
	 */
	public Timestamp getModified() {
		return modified;
	}

	/**
	 * @param timestamp
	 */
	public void setModified(Timestamp timestamp) {
		modified = timestamp;
	}

}
