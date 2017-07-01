package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * DivisionEJBBeanExtractor_7c74fa89
 */
public class DivisionEJBBeanExtractor_7c74fa89 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * DivisionEJBBeanExtractor_7c74fa89
	 */
	public DivisionEJBBeanExtractor_7c74fa89() {
		int[] pkCols={1};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6,7,8};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.INFORMIX_V92_1.DivisionEJBBeanCacheEntryImpl_7c74fa89 entry=
			new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.DivisionEJBBeanCacheEntryImpl_7c74fa89();

		entry.setDataFordivision(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataFortype(dataRow.getString(dataColumns[1]));
		entry.setDataForencloser(dataRow.getInt(dataColumns[2]), dataRow.wasNull());
		entry.setDataForname(dataRow.getString(dataColumns[3]));
		entry.setDataForshortname(dataRow.getString(dataColumns[4]));
		entry.setDataForboss(dataRow.getInt(dataColumns[5]), dataRow.wasNull());
		entry.setDataForcompany(dataRow.getInt(dataColumns[6]), dataRow.wasNull());
		entry.setDataForisactive(dataRow.getString(dataColumns[7]));

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
		return "DivisionEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 8;
	}
}
