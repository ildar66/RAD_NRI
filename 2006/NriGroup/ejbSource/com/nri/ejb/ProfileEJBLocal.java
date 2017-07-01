package com.nri.ejb;
/**
 * Local interface for Enterprise Bean: ProfileEJB
 */
public interface ProfileEJBLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Get accessor for persistent attribute: type
	 */
	public java.lang.Integer getType();
	/**
	 * Set accessor for persistent attribute: type
	 */
	public void setType(java.lang.Integer newType);
	/**
	 * Get accessor for persistent attribute: num_value
	 */
	public java.math.BigDecimal getNum_value();
	/**
	 * Set accessor for persistent attribute: num_value
	 */
	public void setNum_value(java.math.BigDecimal newNum_value);
	/**
	 * Get accessor for persistent attribute: str_value
	 */
	public java.lang.String getStr_value();
	/**
	 * Set accessor for persistent attribute: str_value
	 */
	public void setStr_value(java.lang.String newStr_value);
	/**
	 * Get accessor for persistent attribute: date_value
	 */
	public java.sql.Timestamp getDate_value();
	/**
	 * Set accessor for persistent attribute: date_value
	 */
	public void setDate_value(java.sql.Timestamp newDate_value);
	/**
	 * Get accessor for persistent attribute: key_type
	 */
	public java.lang.Integer getKey_type();
	/**
	 * Set accessor for persistent attribute: key_type
	 */
	public void setKey_type(java.lang.Integer newKey_type);
	/**
	 * Get accessor for persistent attribute: modified
	 */
	public java.sql.Timestamp getModified();
	/**
	 * Set accessor for persistent attribute: modified
	 */
	public void setModified(java.sql.Timestamp newModified);
}
