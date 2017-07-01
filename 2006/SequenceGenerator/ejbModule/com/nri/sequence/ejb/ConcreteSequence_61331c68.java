package com.nri.sequence.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.sequence.ejb.websphere_deploy.SequenceBeanCacheEntry_61331c68;
import com.nri.sequence.ejb.websphere_deploy.INFORMIX_V94_1.SequenceBeanCacheEntryImpl_61331c68;

/**
 * Bean implementation class for Enterprise Bean: Sequence
 */
public class ConcreteSequence_61331c68 extends com.nri.sequence.ejb.SequenceBean implements javax.ejb.EntityBean, ConcreteBean {
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
		instanceExtension.setEntityContext(ctx);
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		super.unsetEntityContext();
		instanceExtension.unsetEntityContext();
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
			super.ejbActivate();
			instanceExtension.ejbActivate();
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		instanceExtension.ejbLoad();
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
		super.ejbPassivate();
		instanceExtension.ejbPassivate();
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		super.ejbRemove();
		instanceExtension.ejbRemove();
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		super.ejbStore();
		instanceExtension.ejbStore();
	}
	private ConcreteBeanInstanceExtension instanceExtension;
	private SequenceBeanCacheEntry_61331c68 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteSequence_61331c68
	 */
	public ConcreteSequence_61331c68() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.sequence.ejb.websphere_deploy.SequenceBeanInjector_61331c68 getInjector() {
		return (com.nri.sequence.ejb.websphere_deploy.SequenceBeanInjector_61331c68)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.sequence.ejb.websphere_deploy.SequenceBeanCacheEntry_61331c68) inRecord;;
		super.ejbLoad();
	}
	/**
	 * resetCMP
	 */
	public void resetCMP() {
			dataCacheEntry = null;
	}
	/**
	 * resetCMR
	 */
	public void resetCMR() {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public java.lang.String ejbFindByPrimaryKey(java.lang.String primaryKey) throws javax.ejb.FinderException {
		return (java.lang.String)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((java.lang.String)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public java.lang.String ejbFindByPrimaryKeyForCMR_Local(java.lang.String pk) throws javax.ejb.FinderException {
		return (java.lang.String)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public java.lang.String ejbCreate(java.lang.String id) throws javax.ejb.CreateException {
		dataCacheEntry = new SequenceBeanCacheEntryImpl_61331c68();
		 super.ejbCreate(id);
		return (java.lang.String)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String id) throws javax.ejb.CreateException {
		super.ejbPostCreate(id);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getId();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 2;
	}
	/**
	 * Get accessor for persistent attribute: id
	 */
	public java.lang.String getId() {
		return dataCacheEntry.getId();
	}
	/**
	 * Set accessor for persistent attribute: id
	 */
	public void setId(java.lang.String newId) {
		instanceExtension.markDirty(0,getId(),newId);
		dataCacheEntry.setId(newId);
	}
	/**
	 * Get accessor for persistent attribute: value
	 */
	public int getValue() {
		return dataCacheEntry.getValue();
	}
	/**
	 * Set accessor for persistent attribute: value
	 */
	public void setValue(int newValue) {
		instanceExtension.markDirty(1,getValue(),newValue);
		dataCacheEntry.setValue(newValue);
	}
}
