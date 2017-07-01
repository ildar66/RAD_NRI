package com.nri.sequence.ejb.websphere_deploy.INFORMIX_V94_1;

/**
 * SequenceBeanExtractor_61331c68
 */
public class SequenceBeanExtractor_61331c68 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * SequenceBeanExtractor_61331c68
	 */
	public SequenceBeanExtractor_61331c68() {
		int[] pkCols={1};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.sequence.ejb.websphere_deploy.INFORMIX_V94_1.SequenceBeanCacheEntryImpl_61331c68 entry=
			new com.nri.sequence.ejb.websphere_deploy.INFORMIX_V94_1.SequenceBeanCacheEntryImpl_61331c68();

		entry.setDataForid(dataRow.getString(dataColumns[0]));
		entry.setDataForvalue(dataRow.getInt(dataColumns[1]));

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
		return "Sequence";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 2;
	}
}
