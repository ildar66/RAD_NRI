package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * CompanyEJBBeanExtractor_8d2adc68
 */
public class CompanyEJBBeanExtractor_8d2adc68 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * CompanyEJBBeanExtractor_8d2adc68
	 */
	public CompanyEJBBeanExtractor_8d2adc68() {
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

		com.nri.ejb.websphere_deploy.INFORMIX_V92_1.CompanyEJBBeanCacheEntryImpl_8d2adc68 entry=
			new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.CompanyEJBBeanCacheEntryImpl_8d2adc68();

		entry.setDataForcompany(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataForname(dataRow.getString(dataColumns[1]));
		entry.setDataForshortname(dataRow.getString(dataColumns[2]));

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
		return "CompanyEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 3;
	}
}
