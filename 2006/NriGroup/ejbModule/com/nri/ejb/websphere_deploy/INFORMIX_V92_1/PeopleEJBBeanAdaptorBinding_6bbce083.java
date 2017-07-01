package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * PeopleEJBBeanAdaptorBinding_6bbce083
 */
public class PeopleEJBBeanAdaptorBinding_6bbce083 implements com.ibm.ws.ejbpersistence.beanextensions.BeanAdaptorBinding {
	/**
	 * getExtractor
	 */
	public com.ibm.ws.ejbpersistence.dataaccess.EJBExtractor getExtractor() {
		// extractor for com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanExtractor_6bbce083
		com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor extractor =  new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanExtractor_6bbce083();
		extractor.setPrimaryKeyColumns(new int[] {1});
		extractor.setDataColumns(new int[] {1,2,3,4,5,6,7,8,9});
		return extractor;
	}
	/**
	 * getInjector
	 */
	public com.ibm.ws.ejbpersistence.beanextensions.EJBInjector getInjector() {
		return new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanInjectorImpl_6bbce083();
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
		cat[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogRDBAlias("PeopleEJB", "PeopleEJB1_Alias", "INFORMIX", "informix.people", "PeopleEJB_PeopleEJB1_Table");

		//-------------------------------------------------------------------------
		fields = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[9];

		fields[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("man", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("firstname", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 80, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("lastname", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 80, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("middlename", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 80, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[4] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("passportser", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 80, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[5] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("passportdate", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._DATE, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[6] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("passportwhom", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 80, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[7] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("isactive", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 1, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, true, 0, -1, 0);
		fields[8] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("tabnum", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		primarykey = new String[1];
		primarykey[0] = "man";
		cat[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogType("PeopleEJB", "PeopleEJB1_Table", null, fields, primarykey);

		//-------------------------------------------------------------------------
		fields = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef[9];

		fields[0] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("man", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[1] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("firstName", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("lastName", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("middleName", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[4] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("passportSer", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[5] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("passportDate", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._DATE, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[6] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("passportWhom", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._CHARACTER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[7] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("isActive", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols.BOOLEAN, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		fields[8] = new com.ibm.ObjectQuery.metadata.OSQLExternalColumnDef("tabNum", new String(), com.ibm.ObjectQuery.engine.OSQLSymbols._INTEGER, 0, com.ibm.ObjectQuery.engine.OSQLConstants.NO_TYPE, false, 0, -1, 0);
		primarykey = new String[1];
		primarykey[0] = "man";
		cat[2] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogType("PeopleEJB", "PeopleEJB_BO", "com.nri.ejb.PeopleEJBBean", fields, primarykey);

		//-------------------------------------------------------------------------
		composedObjs = null;
		composedObjImpls = null;
		subhomes = null;
		cat[3] = new com.ibm.ObjectQuery.metadata.OSQLExternalCatalogView("PeopleEJB", "PeopleEJB_PeopleEJB_BO", "PeopleEJB_PeopleEJB1_Alias", composedObjs, composedObjImpls, 
		"select t1.man,_converter(\"com.ibm.vap.converters.VapTrimStringConverter\",t1.firstname),_converter(\"com.ibm.vap.converters.VapTrimStringConverter\",t1.lastname),_converter(\"com.ibm.vap.converters.VapTrimStringConverter\",t1.middlename),_converter(\"com.ibm.vap.converters.VapTrimStringConverter\",t1.passportser),t1.passportdate,_converter(\"com.ibm.vap.converters.VapTrimStringConverter\",t1.passportwhom),_converter(\"com.ibm.vap.converters.VapStringToBooleanConverter\",t1.isactive),t1.tabnum from _this t1", 
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
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanFunctionSet_6bbce083");
		iSpec.setFunctionName("Create");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Create");
		daSpec.setInputRecordName("Create");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.CREATE_BEAN);
		daSpec.setQueryScope(new String[]{"PeopleEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanFunctionSet_6bbce083");
		iSpec.setFunctionName("Remove");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Remove");
		daSpec.setInputRecordName("Remove");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.REMOVE_BEAN);
		daSpec.setQueryScope(new String[]{"PeopleEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanFunctionSet_6bbce083");
		iSpec.setFunctionName("Store");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Store");
		daSpec.setInputRecordName("Store");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.STORE_BEAN);
		daSpec.setQueryScope(new String[]{"PeopleEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanFunctionSet_6bbce083");
		iSpec.setFunctionName("StoreUsingOCC");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("Store");
		daSpec.setInputRecordName("Store");
		daSpec.setOptimistic(true);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.STORE_BEAN);
		daSpec.setQueryScope(new String[]{"PeopleEJB"});
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanFunctionSet_6bbce083");
		iSpec.setFunctionName("FindByPrimaryKey");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByPrimaryKey");
		daSpec.setInputRecordName("FindByPrimaryKey");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_PK);
		daSpec.setQueryScope(new String[]{"PeopleEJB"});
		daSpec.setReadAccess(true);
		daSpec.setAllowDuplicates(false);
		daSpec.setContainsDuplicates(false);
		daSpec.setSingleResult(true);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		daSpec=com.ibm.ws.ejbpersistence.beanextensions.DataAccessSpecFactory.getDataAccessSpec();
		iSpec=new com.ibm.ws.rsadapter.cci.WSInteractionSpecImpl();
		iSpec.setFunctionSetName("com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanFunctionSet_6bbce083");
		iSpec.setFunctionName("FindByPrimaryKeyForUpdate");
		daSpec.setInteractionSpec(iSpec);
		daSpec.setSpecName("FindByPrimaryKey");
		daSpec.setInputRecordName("FindByPrimaryKey");
		daSpec.setOptimistic(false);
		daSpec.setType(com.ibm.ws.ejbpersistence.beanextensions.EJBDataAccessSpec.FIND_PK);
		daSpec.setQueryScope(new String[]{"PeopleEJB"});
		daSpec.setReadAccess(false);
		daSpec.setAllowDuplicates(false);
		daSpec.setContainsDuplicates(false);
		daSpec.setSingleResult(true);
		daSpec.setExtractor(new com.ibm.ws.ejbpersistence.dataaccess.WholeRowExtractor(getExtractor()));
		result.add(daSpec);

		return result;

	}
}
