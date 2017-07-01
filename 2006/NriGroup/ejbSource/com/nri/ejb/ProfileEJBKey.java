package com.nri.ejb;
/**
 * Key class for Entity Bean: ProfileEJB
 */
public class ProfileEJBKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	/**
	 * Implementation field for persistent attribute: operatorID
	 */
	public java.lang.Integer operatorID;
	/**
	 * Implementation field for persistent attribute: key
	 */
	public java.lang.String key;
	/**
	 * Implementation field for persistent attribute: name
	 */
	public java.lang.String name;
	/**
	 * Creates an empty key for Entity Bean: ProfileEJB
	 */
	public ProfileEJBKey() {
	}
	/**
	 * Creates a key for Entity Bean: ProfileEJB
	 */
	public ProfileEJBKey(java.lang.Integer operatorID, java.lang.String key, java.lang.String name) {
		this.operatorID = operatorID;
		this.key = key;
		this.name = name;
	}
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nri.ejb.ProfileEJBKey) {
			com.nri.ejb.ProfileEJBKey o = (com.nri.ejb.ProfileEJBKey) otherKey;
			return ((this.operatorID.equals(o.operatorID)) && (this.key.equals(o.key)) && (this.name.equals(o.name)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (operatorID.hashCode() + key.hashCode() + name.hashCode());
	}
}
