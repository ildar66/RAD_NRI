package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * ProfileEJBBeanAdaptorBinding_565669dc
 */
public class ProfileEJBBeanAdaptorBinding_565669dc implements com.ibm.ws.ejbpersistence.beanextensions.BeanAdaptorBinding {
	/**
	 * getExtractor
	 */
	public com.ibm.ws.ejbpersistence.dataaccess.EJBExtractor getExtractor() {
		// extractor for com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanExtractor_565669dc
		com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor extractor =  new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanExtractor_565669dc();
		extractor.setPrimaryKeyColumns(new int[] {1,2,3});
		extractor.setDataColumns(new int[] {1,2,3,4,5,6,7,8,9});
		return extractor;
	}
	/**
	 * getInjector
	 */
	public com.ibm.ws.ejbpersistence.beanextensions.EJBInjector getInjector() {
		return new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanInjectorImpl_565669dc();
	}
	/**
	 * getAdapter
	 */
	public com.ibm.websphere.ejbpersistence.EJBToRAAdapter getAdapter() {
		return com.ibm.ws.rsadapter.cci.WSRelationalRAAdapter.createAdapter();
	}
	/**
	 * getMetadata
	 */
	public Object[] getMetadata() {
		
		java.lang.String[] primarykey, subhomes, composedObjs, composedObjImpls;
		com.ibm.ObjectQuery.metadata.OSQLExternalCatalogEntry[] cat;
		com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[] fields;
		cat = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogEntry[4];
		//-------------------------------------------------------------------------
		cat[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogRDBAlias("ProfileEJB", "ProfileEJB1_Alias", "INFORMIX", "informix.profile", "ProfileEJB_ProfileEJB1_Table");

		//-------------------------------------------------------------------------
		fields = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[9];

		fields[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("operatorid", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("key", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 64, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("name", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 64, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("type", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[4] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("num_value", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._DECIMAL, -1, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 15, 4, 0);
		fields[5] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("str_value", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 255, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[6] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("date_value", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._TIMESTAMP, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[7] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("key_type", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[8] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("modified", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._TIMESTAMP, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		primarykey = new String[3];
		primarykey[0] = "operatorid";
		primarykey[1] = "key";
		primarykey[2] = "name";
		cat[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogType("ProfileEJB", "ProfileEJB1_Table", null, fields, primarykey);

		//-------------------------------------------------------------------------
		fields = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[9];

		fields[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("operatorID", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("key", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("name", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("type", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[4] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("num_value", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._DECIMAL, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[5] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("str_value", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[6] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("date_value", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._TIMESTAMP, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[7] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("key_type", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[8] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("modified", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._TIMESTAMP, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		primarykey = new String[3];
		primarykey[0] = "operatorID";
		primarykey[1] = "key";
		primarykey[2] = "name";
		cat[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogType("ProfileEJB", "ProfileEJB_BO", "com.nri.ejb.ProfileEJBBean", fields, primarykey);

		//-------------------------------------------------------------------------
		composedObjs = null;
		composedObjImpls = null;
		subhomes = null;
		cat[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogView("ProfileEJB", "ProfileEJB_ProfileEJB_BO", "ProfileEJB_ProfileEJB1_Alias", composedObjs, composedObjImpls, 
		"select t1.operatorid,t1.key,t1.name,t1.type,t1.num_value,t1.str_value,t1.date_value,t1.key_type,t1.modified from _this t1", 
		null, subhomes, 
		0, null);



		return cat;
	}
	/**
	 * createDataAccessSpecs
	 */
	public java.util.Collection createDataAccessSpecs() throws javax.resource.ResourceException {
		com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec daSpec;
		com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl iSpec;
		java.util.Collection result = new java.util.ArrayList(6);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanFunctionSet_565669dc");
		iSpec.setFunctionName("Create");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Create");
		daSpec.setInputRecordName("Create");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.CREATE_BEAN);
		daSpec.setQueryScope(new String[]{"ProfileEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanFunctionSet_565669dc");
		iSpec.setFunctionName("Remove");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Remove");
		daSpec.setInputRecordName("Remove");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.REMOVE_BEAN);
		daSpec.setQueryScope(new String[]{"ProfileEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanFunctionSet_565669dc");
		iSpec.setFunctionName("Store");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Store");
		daSpec.setInputRecordName("Store");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.STORE_BEAN);
		daSpec.setQueryScope(new String[]{"ProfileEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanFunctionSet_565669dc");
		iSpec.setFunctionName("StoreUsingOCC");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Store");
		daSpec.setInputRecordName("Store");
		daSpec.setOptimistic(true);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.STORE_BEAN);
		daSpec.setQueryScope(new String[]{"ProfileEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanFunctionSet_565669dc");
		iSpec.setFunctionName("FindByPrimaryKey");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByPrimaryKey");
		daSpec.setInputRecordName("FindByPrimaryKey");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_PK);
		daSpec.setQueryScope(new String[]{"ProfileEJB"});
		daSpec.setReadAccess(true);
		daSpec.setAllowDuplicates(false);
		daSpec.setContainsDuplicates(false);
		daSpec.setSingleResult(true);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanFunctionSet_565669dc");
		iSpec.setFunctionName("FindByPrimaryKeyForUpdate");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByPrimaryKey");
		daSpec.setInputRecordName("FindByPrimaryKey");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_PK);
		daSpec.setQueryScope(new String[]{"ProfileEJB"});
		daSpec.setReadAccess(false);
		daSpec.setAllowDuplicates(false);
		daSpec.setContainsDuplicates(false);
		daSpec.setSingleResult(true);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		return result;

	}
}
