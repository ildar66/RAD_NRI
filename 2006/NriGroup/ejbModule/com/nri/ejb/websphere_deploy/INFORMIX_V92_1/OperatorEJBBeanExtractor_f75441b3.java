package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * OperatorEJBBeanExtractor_f75441b3
 */
public class OperatorEJBBeanExtractor_f75441b3 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * OperatorEJBBeanExtractor_f75441b3
	 */
	public OperatorEJBBeanExtractor_f75441b3() {
		int[] pkCols={1};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.INFORMIX_V92_1.OperatorEJBBeanCacheEntryImpl_f75441b3 entry=
			new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.OperatorEJBBeanCacheEntryImpl_f75441b3();

		entry.setDataForoperator(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataForman(dataRow.getInt(dataColumns[1]), dataRow.wasNull());
		entry.setDataForloiginid(dataRow.getString(dataColumns[2]));
		entry.setDataForpassword(dataRow.getString(dataColumns[3]));
		entry.setDataForisenabled(dataRow.getString(dataColumns[4]));
		entry.setDataFormsucode(dataRow.getInt(dataColumns[5]), dataRow.wasNull());

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
		return "OperatorEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 6;
	}
}
