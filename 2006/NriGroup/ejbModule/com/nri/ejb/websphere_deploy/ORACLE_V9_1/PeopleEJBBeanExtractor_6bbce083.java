package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * PeopleEJBBeanExtractor_6bbce083
 */
public class PeopleEJBBeanExtractor_6bbce083 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * PeopleEJBBeanExtractor_6bbce083
	 */
	public PeopleEJBBeanExtractor_6bbce083() {
		int[] pkCols={9};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6,7,8,9};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.ORACLE_V9_1.PeopleEJBBeanCacheEntryImpl_6bbce083 entry=
			new com.nri.ejb.websphere_deploy.ORACLE_V9_1.PeopleEJBBeanCacheEntryImpl_6bbce083();

		entry.setDataForFIRSTNAME(dataRow.getString(dataColumns[0]));
		entry.setDataForLASTNAME(dataRow.getString(dataColumns[1]));
		entry.setDataForMIDDLENAME(dataRow.getString(dataColumns[2]));
		entry.setDataForPASSPORTSER(dataRow.getString(dataColumns[3]));
		entry.setDataForPASSPORTDATE(dataRow.getTimestamp(dataColumns[4]));
		entry.setDataForPASSPORTWHOM(dataRow.getString(dataColumns[5]));
		entry.setDataForISACTIVE(dataRow.getString(dataColumns[6]));
		entry.setDataForTABNUM(dataRow.getInt(dataColumns[7]), dataRow.wasNull());
		entry.setDataForMAN(dataRow.getInt(dataColumns[8]), dataRow.wasNull());

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
		return "PeopleEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 9;
	}
}
