package com.nri.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.nri.ejb.websphere_deploy.ProfileEJBBeanCacheEntry_565669dc;
import com.nri.ejb.websphere_deploy.ORACLE_V9_1.ProfileEJBBeanCacheEntryImpl_565669dc;

/**
 * Bean implementation class for Enterprise Bean: ProfileEJB
 */
public class ConcreteProfileEJB_565669dc extends com.nri.ejb.ProfileEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private ProfileEJBBeanCacheEntry_565669dc dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteProfileEJB_565669dc
	 */
	public ConcreteProfileEJB_565669dc() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.nri.ejb.websphere_deploy.ProfileEJBBeanInjector_565669dc getInjector() {
		return (com.nri.ejb.websphere_deploy.ProfileEJBBeanInjector_565669dc)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.nri.ejb.websphere_deploy.ProfileEJBBeanCacheEntry_565669dc) inRecord;;
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
	public com.nri.ejb.ProfileEJBKey ejbFindByPrimaryKey(com.nri.ejb.ProfileEJBKey primaryKey) throws javax.ejb.FinderException {
		return (com.nri.ejb.ProfileEJBKey)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((com.nri.ejb.ProfileEJBKey)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public com.nri.ejb.ProfileEJBKey ejbFindByPrimaryKeyForCMR_Local(com.nri.ejb.ProfileEJBKey pk) throws javax.ejb.FinderException {
		return (com.nri.ejb.ProfileEJBKey)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public com.nri.ejb.ProfileEJBKey ejbCreate(java.lang.Integer operatorID, java.lang.String key, java.lang.String name, java.lang.Integer type, java.lang.Integer key_type) throws javax.ejb.CreateException {
		dataCacheEntry = new ProfileEJBBeanCacheEntryImpl_565669dc();
		 super.ejbCreate(operatorID, key, name, type, key_type);
		return (com.nri.ejb.ProfileEJBKey)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer operatorID, java.lang.String key, java.lang.String name, java.lang.Integer type, java.lang.Integer key_type) throws javax.ejb.CreateException {
		super.ejbPostCreate(operatorID, key, name, type, key_type);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		com.nri.ejb.ProfileEJBKey pk = new com.nri.ejb.ProfileEJBKey();
		pk.operatorID = getOperatorID();
		pk.key = getKey();
		pk.name = getName();
		return pk;
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 9;
	}
	/**
	 * Get accessor for persistent attribute: operatorID
	 */
	public java.lang.Integer getOperatorID() {
		return dataCacheEntry.getOperatorID();
	}
	/**
	 * Set accessor for persistent attribute: operatorID
	 */
	public void setOperatorID(java.lang.Integer newOperatorID) {
		instanceExtension.markDirty(0,getOperatorID(),newOperatorID);
		dataCacheEntry.setOperatorID(newOperatorID);
	}
	/**
	 * Get accessor for persistent attribute: key
	 */
	public java.lang.String getKey() {
		return dataCacheEntry.getKey();
	}
	/**
	 * Set accessor for persistent attribute: key
	 */
	public void setKey(java.lang.String newKey) {
		instanceExtension.markDirty(1,getKey(),newKey);
		dataCacheEntry.setKey(newKey);
	}
	/**
	 * Get accessor for persistent attribute: name
	 */
	public java.lang.String getName() {
		return dataCacheEntry.getName();
	}
	/**
	 * Set accessor for persistent attribute: name
	 */
	public void setName(java.lang.String newName) {
		instanceExtension.markDirty(2,getName(),newName);
		dataCacheEntry.setName(newName);
	}
	/**
	 * Get accessor for persistent attribute: type
	 */
	public java.lang.Integer getType() {
		return dataCacheEntry.getType();
	}
	/**
	 * Set accessor for persistent attribute: type
	 */
	public void setType(java.lang.Integer newType) {
		instanceExtension.markDirty(3,getType(),newType);
		dataCacheEntry.setType(newType);
	}
	/**
	 * Get accessor for persistent attribute: num_value
	 */
	public java.math.BigDecimal getNum_value() {
		return dataCacheEntry.getNum_value();
	}
	/**
	 * Set accessor for persistent attribute: num_value
	 */
	public void setNum_value(java.math.BigDecimal newNum_value) {
		instanceExtension.markDirty(4,getNum_value(),newNum_value);
		dataCacheEntry.setNum_value(newNum_value);
	}
	/**
	 * Get accessor for persistent attribute: str_value
	 */
	public java.lang.String getStr_value() {
		return dataCacheEntry.getStr_value();
	}
	/**
	 * Set accessor for persistent attribute: str_value
	 */
	public void setStr_value(java.lang.String newStr_value) {
		instanceExtension.markDirty(5,getStr_value(),newStr_value);
		dataCacheEntry.setStr_value(newStr_value);
	}
	/**
	 * Get accessor for persistent attribute: date_value
	 */
	public java.sql.Timestamp getDate_value() {
		return dataCacheEntry.getDate_value();
	}
	/**
	 * Set accessor for persistent attribute: date_value
	 */
	public void setDate_value(java.sql.Timestamp newDate_value) {
		instanceExtension.markDirty(6,getDate_value(),newDate_value);
		dataCacheEntry.setDate_value(newDate_value);
	}
	/**
	 * Get accessor for persistent attribute: key_type
	 */
	public java.lang.Integer getKey_type() {
		return dataCacheEntry.getKey_type();
	}
	/**
	 * Set accessor for persistent attribute: key_type
	 */
	public void setKey_type(java.lang.Integer newKey_type) {
		instanceExtension.markDirty(7,getKey_type(),newKey_type);
		dataCacheEntry.setKey_type(newKey_type);
	}
	/**
	 * Get accessor for persistent attribute: modified
	 */
	public java.sql.Timestamp getModified() {
		return dataCacheEntry.getModified();
	}
	/**
	 * Set accessor for persistent attribute: modified
	 */
	public void setModified(java.sql.Timestamp newModified) {
		instanceExtension.markDirty(8,getModified(),newModified);
		dataCacheEntry.setModified(newModified);
	}
}
