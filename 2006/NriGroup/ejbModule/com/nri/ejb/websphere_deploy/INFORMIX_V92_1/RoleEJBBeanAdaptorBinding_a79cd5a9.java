package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * RoleEJBBeanAdaptorBinding_a79cd5a9
 */
public class RoleEJBBeanAdaptorBinding_a79cd5a9 implements com.ibm.ws.ejbpersistence.beanextensions.BeanAdaptorBinding {
	/**
	 * getExtractor
	 */
	public com.ibm.ws.ejbpersistence.dataaccess.EJBExtractor getExtractor() {
		// extractor for com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanExtractor_a79cd5a9
		com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor extractor =  new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanExtractor_a79cd5a9();
		extractor.setPrimaryKeyColumns(new int[] {1});
		extractor.setDataColumns(new int[] {1,2,3,4,5});
		return extractor;
	}
	/**
	 * getInjector
	 */
	public com.ibm.ws.ejbpersistence.beanextensions.EJBInjector getInjector() {
		return new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanInjectorImpl_a79cd5a9();
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
		cat[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogRDBAlias("RoleEJB", "RoleEJB1_Alias", "INFORMIX", "informix.roles", "RoleEJB_RoleEJB1_Table");

		//-------------------------------------------------------------------------
		fields = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[5];

		fields[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("role", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 20, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("rolename", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 255, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("comment", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._LVARCHAR, 2048, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("sortorder", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[4] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("taskcomment", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 255, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		primarykey = new String[1];
		primarykey[0] = "role";
		cat[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogType("RoleEJB", "RoleEJB1_Table", null, fields, primarykey);

		//-------------------------------------------------------------------------
		fields = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[5];

		fields[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("role", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("roleName", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("comment", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("sortOrder", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[4] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("taskComment", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		primarykey = new String[1];
		primarykey[0] = "role";
		cat[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogType("RoleEJB", "RoleEJB_BO", "com.nri.ejb.RoleEJBBean", fields, primarykey);

		//-------------------------------------------------------------------------
		composedObjs = null;
		composedObjImpls = null;
		subhomes = null;
		cat[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogView("RoleEJB", "RoleEJB_RoleEJB_BO", "RoleEJB_RoleEJB1_Alias", composedObjs, composedObjImpls, 
		"select _converter(\"com.ibm.vap.converters.VapTrimStringConverter\",t1.role),t1.rolename,t1.comment,t1.sortorder,t1.taskcomment from _this t1", 
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
		java.util.Collection result = new java.util.ArrayList(10);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("Create");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Create");
		daSpec.setInputRecordName("Create");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.CREATE_BEAN);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("Remove");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Remove");
		daSpec.setInputRecordName("Remove");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.REMOVE_BEAN);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("Store");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Store");
		daSpec.setInputRecordName("Store");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.STORE_BEAN);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("StoreUsingOCC");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Store");
		daSpec.setInputRecordName("Store");
		daSpec.setOptimistic(true);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.STORE_BEAN);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("FindAll");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindAll");
		daSpec.setInputRecordName("FindAll");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_BEAN);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		daSpec.setReadAccess(true);
		daSpec.setAllowDuplicates(true);
		daSpec.setContainsDuplicates(true);
		daSpec.setSingleResult(false);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("FindAllForUpdate");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindAll");
		daSpec.setInputRecordName("FindAll");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_BEAN);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		daSpec.setReadAccess(false);
		daSpec.setAllowDuplicates(true);
		daSpec.setContainsDuplicates(true);
		daSpec.setSingleResult(false);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("FindByRoleName");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByRoleName");
		daSpec.setInputRecordName("FindByRoleName");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_BEAN);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		daSpec.setReadAccess(true);
		daSpec.setAllowDuplicates(true);
		daSpec.setContainsDuplicates(true);
		daSpec.setSingleResult(false);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("FindByRoleNameForUpdate");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByRoleName");
		daSpec.setInputRecordName("FindByRoleName");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_BEAN);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		daSpec.setReadAccess(false);
		daSpec.setAllowDuplicates(true);
		daSpec.setContainsDuplicates(true);
		daSpec.setSingleResult(false);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("FindByPrimaryKey");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByPrimaryKey");
		daSpec.setInputRecordName("FindByPrimaryKey");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_PK);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		daSpec.setReadAccess(true);
		daSpec.setAllowDuplicates(false);
		daSpec.setContainsDuplicates(false);
		daSpec.setSingleResult(true);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanFunctionSet_a79cd5a9");
		iSpec.setFunctionName("FindByPrimaryKeyForUpdate");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByPrimaryKey");
		daSpec.setInputRecordName("FindByPrimaryKey");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_PK);
		daSpec.setQueryScope(new String[]{"RoleEJB"});
		daSpec.setReadAccess(false);
		daSpec.setAllowDuplicates(false);
		daSpec.setContainsDuplicates(false);
		daSpec.setSingleResult(true);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		return result;

	}
}
