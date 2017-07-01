package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * MsUserEJBBeanExtractor_da8ec80c
 */
public class MsUserEJBBeanExtractor_da8ec80c extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * MsUserEJBBeanExtractor_da8ec80c
	 */
	public MsUserEJBBeanExtractor_da8ec80c() {
		int[] pkCols={1};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.ORACLE_V9_1.MsUserEJBBeanCacheEntryImpl_da8ec80c entry=
			new com.nri.ejb.websphere_deploy.ORACLE_V9_1.MsUserEJBBeanCacheEntryImpl_da8ec80c();

		entry.setDataForMSUCODE(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataForMSUSER(dataRow.getString(dataColumns[1]));
		entry.setDataForMSPASSWORD(dataRow.getString(dataColumns[2]));

		return entry;
	}
	/**
	 * extractPrimaryKey
	 */
	public Object extractPrimaryKey(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] primaryKeyColumns = getPrimaryKeyColumns();

		java.lang.Integer key;
		key=new Integer(dataRow.getInt(primaryKeyColumns[0]));

		return key;
	}
	/**
	 * getHomeName
	 */
	public String getHomeName() {
		return "MsUserEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 3;
	}
}
