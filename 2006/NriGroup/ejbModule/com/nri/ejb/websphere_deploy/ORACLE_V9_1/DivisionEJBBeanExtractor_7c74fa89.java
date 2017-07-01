package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * DivisionEJBBeanExtractor_7c74fa89
 */
public class DivisionEJBBeanExtractor_7c74fa89 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * DivisionEJBBeanExtractor_7c74fa89
	 */
	public DivisionEJBBeanExtractor_7c74fa89() {
		int[] pkCols={8};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6,7,8};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanCacheEntryImpl_7c74fa89 entry=
			new com.nri.ejb.websphere_deploy.ORACLE_V9_1.DivisionEJBBeanCacheEntryImpl_7c74fa89();

		entry.setDataForTYPE_(dataRow.getString(dataColumns[0]));
		entry.setDataForENCLOSER(dataRow.getInt(dataColumns[1]), dataRow.wasNull());
		entry.setDataForNAME(dataRow.getString(dataColumns[2]));
		entry.setDataForSHORTNAME(dataRow.getString(dataColumns[3]));
		entry.setDataForBOSS(dataRow.getInt(dataColumns[4]), dataRow.wasNull());
		entry.setDataForCOMPANY(dataRow.getInt(dataColumns[5]), dataRow.wasNull());
		entry.setDataForISACTIVE(dataRow.getString(dataColumns[6]));
		entry.setDataForDIVISION(dataRow.getInt(dataColumns[7]), dataRow.wasNull());

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
