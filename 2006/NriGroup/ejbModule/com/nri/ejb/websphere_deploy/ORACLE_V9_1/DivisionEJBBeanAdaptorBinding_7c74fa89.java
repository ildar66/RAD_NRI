package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * DivisionEJBBeanAdaptorBinding_7c74fa89
 */
public class DivisionEJBBeanAdaptorBinding_7c74fa89 implements com.ibm.ws.ejbpersistence.beanextensions.BeanAdaptorBinding {
	/**
	 * getExtractor
	 */
	public com.ibm.ws.ejbpersistence.dataaccess.EJBExtractor getExtractor() {
		// extractor for com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanExtractor_7c74fa89
		com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor extractor =  new com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanExtractor_7c74fa89();
		extractor.setPrimaryKeyColumns(new int[] {8});
		extractor.setDataColumns(new int[] {1,2,3,4,5,6,7,8});
		return extractor;
	}
	/**
	 * getInjector
	 */
	public com.ibm.ws.ejbpersistence.beanextensions.EJBInjector getInjector() {
		return new com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanInjectorImpl_7c74fa89();
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
		cat[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogRDBAlias("DivisionEJB", "DivisionEJB1_Alias", "ORACLE", "INFORMIX.DIVISIONS", "DivisionEJB_DivisionEJB1_Table");

		//-------------------------------------------------------------------------
		fields = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[8];

		fields[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("TYPE_", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 4, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("ENCLOSER", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._DECIMAL, -1, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 10, 0, 0);
		fields[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("NAME", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 800, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("SHORTNAME", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 160, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[4] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("BOSS", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._DECIMAL, -1, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 10, 0, 0);
		fields[5] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("COMPANY", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._DECIMAL, -1, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 10, 0, 0);
		fields[6] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("ISACTIVE", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 1, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[7] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("DIVISION", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._DECIMAL, -1, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 10, 0, 0);
		primarykey = new String[1];
		primarykey[0] = "DIVISION";
		cat[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogType("DivisionEJB", "DivisionEJB1_Table", null, fields, primarykey);

		//-------------------------------------------------------------------------
		fields = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[8];

		fields[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("type", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("encloser", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("name", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("shortName", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[4] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("boss", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[5] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("company", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[6] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("isActive", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols.BOOLEAN, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[7] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("division", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		primarykey = new String[1];
		primarykey[0] = "division";
		cat[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogType("DivisionEJB", "DivisionEJB_BO", "com.nri.ejb.DivisionEJBBean", fields, primarykey);

		//-------------------------------------------------------------------------
		composedObjs = null;
		composedObjImpls = null;
		subhomes = null;
		cat[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogView("DivisionEJB", "DivisionEJB_DivisionEJB_BO", "DivisionEJB_DivisionEJB1_Alias", composedObjs, composedObjImpls, 
		"select t1.TYPE_,t1.ENCLOSER,t1.NAME,t1.SHORTNAME,t1.BOSS,t1.COMPANY,_converter(\"com.ibm.vap.converters.VapStringToBooleanConverter\",t1.ISACTIVE),t1.DIVISION from _this t1", 
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
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanFunctionSet_7c74fa89");
		iSpec.setFunctionName("Create");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Create");
		daSpec.setInputRecordName("Create");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.CREATE_BEAN);
		daSpec.setQueryScope(new String[]{"DivisionEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanFunctionSet_7c74fa89");
		iSpec.setFunctionName("Remove");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Remove");
		daSpec.setInputRecordName("Remove");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.REMOVE_BEAN);
		daSpec.setQueryScope(new String[]{"DivisionEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanFunctionSet_7c74fa89");
		iSpec.setFunctionName("Store");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Store");
		daSpec.setInputRecordName("Store");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.STORE_BEAN);
		daSpec.setQueryScope(new String[]{"DivisionEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanFunctionSet_7c74fa89");
		iSpec.setFunctionName("StoreUsingOCC");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Store");
		daSpec.setInputRecordName("Store");
		daSpec.setOptimistic(true);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.STORE_BEAN);
		daSpec.setQueryScope(new String[]{"DivisionEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanFunctionSet_7c74fa89");
		iSpec.setFunctionName("FindByPrimaryKey");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByPrimaryKey");
		daSpec.setInputRecordName("FindByPrimaryKey");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_PK);
		daSpec.setQueryScope(new String[]{"DivisionEJB"});
		daSpec.setReadAccess(true);
		daSpec.setAllowDuplicates(false);
		daSpec.setContainsDuplicates(false);
		daSpec.setSingleResult(true);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanFunctionSet_7c74fa89");
		iSpec.setFunctionName("FindByPrimaryKeyForUpdate");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByPrimaryKey");
		daSpec.setInputRecordName("FindByPrimaryKey");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_PK);
		daSpec.setQueryScope(new String[]{"DivisionEJB"});
		daSpec.setReadAccess(false);
		daSpec.setAllowDuplicates(false);
		daSpec.setContainsDuplicates(false);
		daSpec.setSingleResult(true);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		return result;

	}
}
