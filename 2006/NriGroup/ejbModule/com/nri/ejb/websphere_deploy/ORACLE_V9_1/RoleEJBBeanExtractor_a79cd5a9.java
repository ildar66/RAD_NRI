package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * RoleEJBBeanExtractor_a79cd5a9
 */
public class RoleEJBBeanExtractor_a79cd5a9 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * RoleEJBBeanExtractor_a79cd5a9
	 */
	public RoleEJBBeanExtractor_a79cd5a9() {
		int[] pkCols={5};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.ORACLE_V9_1.RoleEJBBeanCacheEntryImpl_a79cd5a9 entry=
			new com.nri.ejb.websphere_deploy.ORACLE_V9_1.RoleEJBBeanCacheEntryImpl_a79cd5a9();

		entry.setDataForROLENAME(dataRow.getString(dataColumns[0]));
		entry.setDataForCOMMENT_(dataRow.getString(dataColumns[1]));
		entry.setDataForSORTORDER(dataRow.getInt(dataColumns[2]), dataRow.wasNull());
		entry.setDataForTASKCOMMENT(dataRow.getString(dataColumns[3]));
		entry.setDataForROLE(dataRow.getString(dataColumns[4]));

		return entry;
	}
	/**
	 * extractPrimaryKey
	 */
	public Object extractPrimaryKey(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] primaryKeyColumns = getPrimaryKeyColumns();

		java.lang.String key;
		key=dataRow.getString(primaryKeyColumns[0]);

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
