package com.nri.sequence.ejb;
/**
 * Bean implementation class for Enterprise Bean: Sequence
 */
public abstract class SequenceBean implements javax.ejb.EntityBean {
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
	public java.lang.String ejbCreate(java.lang.String id) throws javax.ejb.CreateException {
		setId(id);
		setValue(0);
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String id) throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: id
	 */
	public abstract java.lang.String getId();
	/**
	 * Set accessor for persistent attribute: id
	 */
	public abstract void setId(java.lang.String newId);
	/**
	 * Get accessor for persistent attribute: value
	 */
	public abstract int getValue();
	/**
	 * Set accessor for persistent attribute: value
	 */
	public abstract void setValue(int newValue);

	/**
	 * 
	 * @param blockSize
	 * @return
	 */
	public int getNextKeyAfterIncrementingBy(int blockSize) {
		this.setValue(this.getValue() + blockSize);
		return this.getValue();

	}
}
