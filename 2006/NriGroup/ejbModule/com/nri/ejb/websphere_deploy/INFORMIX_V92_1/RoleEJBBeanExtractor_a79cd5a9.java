package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * RoleEJBBeanExtractor_a79cd5a9
 */
public class RoleEJBBeanExtractor_a79cd5a9 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * RoleEJBBeanExtractor_a79cd5a9
	 */
	public RoleEJBBeanExtractor_a79cd5a9() {
		int[] pkCols={1};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanCacheEntryImpl_a79cd5a9 entry=
			new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.RoleEJBBeanCacheEntryImpl_a79cd5a9();

		entry.setDataForrole(dataRow.getString(dataColumns[0]));
		entry.setDataForrolename(dataRow.getString(dataColumns[1]));
		entry.setDataForcomment(dataRow.getString(dataColumns[2]));
		entry.setDataForsortorder(dataRow.getInt(dataColumns[3]), dataRow.wasNull());
		entry.setDataFortaskcomment(dataRow.getString(dataColumns[4]));

		return entry;
	}
	/**
	 * extractPrimaryKey
	 */
	public Object extractPrimaryKey(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] primaryKeyColumns = getPrimaryKeyColumns();

		java.lang.String key;
		java.lang.String tempString;
		Object tempObject;

		tempString=dataRow.getString(primaryKeyColumns[0]);
		tempObject = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempString);
		key = (tempObject == null) ? null : (java.lang.String) tempObject;

		return key;
	}
	/**
	 * getHomeName
	 */
	public String getHomeName() {
		return "RoleEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 5;
	}
}
