package com.nri.ejb;

import java.sql.Timestamp;

/**
 * Bean implementation class for Enterprise Bean: ProfileEJB
 */
public abstract class ProfileEJBBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext myEntityCtx;
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		myEntityCtx = null;
	}
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.ProfileEJBKey ejbCreate(Integer operatorID, String key, String name, Integer type, Integer key_type) throws javax.ejb.CreateException {
		setOperatorID(operatorID);
		setKey(key);
		setName(name);
		setType(type);
		setKey_type(key_type);
		setModified(new Timestamp(System.currentTimeMillis()));
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(Integer operatorID, String key, String name, Integer type, Integer key_type) throws javax.ejb.CreateException {
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
	}
	/**
	 * Get accessor for persistent attribute: operatorID
	 */
	public abstract java.lang.Integer getOperatorID();
	/**
	 * Set accessor for persistent attribute: operatorID
	 */
	public abstract void setOperatorID(java.lang.Integer newOperatorID);
	/**
	 * Get accessor for persistent attribute: key
	 */
	public abstract java.lang.String getKey();
	/**
	 * Set accessor for persistent attribute: key
	 */
	public abstract void setKey(java.lang.String newKey);
	/**
	 * Get accessor for persistent attribute: name
	 */
	public abstract java.lang.String getName();
	/**
	 * Set accessor for persistent attribute: name
	 */
	public abstract void setName(java.lang.String newName);
	/**
	 * Get accessor for persistent attribute: type
	 */
	public abstract java.lang.Integer getType();
	/**
	 * Set accessor for persistent attribute: type
	 */
	public abstract void setType(java.lang.Integer newType);
	/**
	 * Get accessor for persistent attribute: num_value
	 */
	public abstract java.math.BigDecimal getNum_value();
	/**
	 * Set accessor for persistent attribute: num_value
	 */
	public abstract void setNum_value(java.math.BigDecimal newNum_value);
	/**
	 * Get accessor for persistent attribute: str_value
	 */
	public abstract java.lang.String getStr_value();
	/**
	 * Set accessor for persistent attribute: str_value
	 */
	public abstract void setStr_value(java.lang.String newStr_value);
	/**
	 * Get accessor for persistent attribute: date_value
	 */
	public abstract java.sql.Timestamp getDate_value();
	/**
	 * Set accessor for persistent attribute: date_value
	 */
	public abstract void setDate_value(java.sql.Timestamp newDate_value);
	/**
	 * Get accessor for persistent attribute: key_type
	 */
	public abstract java.lang.Integer getKey_type();
	/**
	 * Set accessor for persistent attribute: key_type
	 */
	public abstract void setKey_type(java.lang.Integer newKey_type);
	/**
	 * Get accessor for persistent attribute: modified
	 */
	public abstract java.sql.Timestamp getModified();
	/**
	 * Set accessor for persistent attribute: modified
	 */
	public abstract void setModified(java.sql.Timestamp newModified);
}
