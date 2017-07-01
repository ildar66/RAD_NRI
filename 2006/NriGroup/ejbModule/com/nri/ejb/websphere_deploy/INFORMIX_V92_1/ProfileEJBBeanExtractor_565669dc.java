package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * ProfileEJBBeanExtractor_565669dc
 */
public class ProfileEJBBeanExtractor_565669dc extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * ProfileEJBBeanExtractor_565669dc
	 */
	public ProfileEJBBeanExtractor_565669dc() {
		int[] pkCols={1,2,3};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6,7,8,9};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanCacheEntryImpl_565669dc entry=
			new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.ProfileEJBBeanCacheEntryImpl_565669dc();

		entry.setDataForoperatorid(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataForkey(dataRow.getString(dataColumns[1]));
		entry.setDataForname(dataRow.getString(dataColumns[2]));
		entry.setDataFortype(dataRow.getInt(dataColumns[3]), dataRow.wasNull());
		entry.setDataFornum_value(dataRow.getBigDecimal(dataColumns[4]));
		entry.setDataForstr_value(dataRow.getString(dataColumns[5]));
		entry.setDataFordate_value(dataRow.getTimestamp(dataColumns[6]));
		entry.setDataForkey_type(dataRow.getInt(dataColumns[7]), dataRow.wasNull());
		entry.setDataFormodified(dataRow.getTimestamp(dataColumns[8]));

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
