package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * ProfileEJBBeanExtractor_565669dc
 */
public class ProfileEJBBeanExtractor_565669dc extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * ProfileEJBBeanExtractor_565669dc
	 */
	public ProfileEJBBeanExtractor_565669dc() {
		int[] pkCols={6,7,8};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6,7,8,9};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.ORACLE_V9_1.ProfileEJBBeanCacheEntryImpl_565669dc entry=
			new com.nri.ejb.websphere_deploy.ORACLE_V9_1.ProfileEJBBeanCacheEntryImpl_565669dc();

		entry.setDataForNUM_VALUE(dataRow.getBigDecimal(dataColumns[0]));
		entry.setDataForSTR_VALUE(dataRow.getString(dataColumns[1]));
		entry.setDataForDATE_VALUE(dataRow.getTimestamp(dataColumns[2]));
		entry.setDataForKEY_TYPE(dataRow.getInt(dataColumns[3]), dataRow.wasNull());
		entry.setDataForMODIFIED(dataRow.getTimestamp(dataColumns[4]));
		entry.setDataForOPERATORID(dataRow.getInt(dataColumns[5]), dataRow.wasNull());
		entry.setDataForKEY(dataRow.getString(dataColumns[6]));
		entry.setDataForNAME(dataRow.getString(dataColumns[7]));
		entry.setDataForTYPE_(dataRow.getInt(dataColumns[8]), dataRow.wasNull());

		return entry;
	}
	/**
	 * extractPrimaryKey
	 */
	public Object extractPrimaryKey(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] primaryKeyColumns = getPrimaryKeyColumns();

		com.nri.ejb.ProfileEJBKey key=
			new com.nri.ejb.ProfileEJBKey();

		key.operatorID=new Integer(dataRow.getInt(primaryKeyColumns[0]));
		key.key=dataRow.getString(primaryKeyColumns[1]);
		key.name=dataRow.getString(primaryKeyColumns[2]);

		return key;
	}
	/**
	 * getHomeName
	 */
	public String getHomeName() {
		return "ProfileEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 9;
	}
}
