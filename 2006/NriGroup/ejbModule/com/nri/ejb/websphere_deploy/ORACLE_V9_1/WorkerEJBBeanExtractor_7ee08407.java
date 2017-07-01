package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * WorkerEJBBeanExtractor_7ee08407
 */
public class WorkerEJBBeanExtractor_7ee08407 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * WorkerEJBBeanExtractor_7ee08407
	 */
	public WorkerEJBBeanExtractor_7ee08407() {
		int[] pkCols={16};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.ORACLE_V9_1.WorkerEJBBeanCacheEntryImpl_7ee08407 entry=
			new com.nri.ejb.websphere_deploy.ORACLE_V9_1.WorkerEJBBeanCacheEntryImpl_7ee08407();

		entry.setDataForCOMPANY(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataForMAN(dataRow.getInt(dataColumns[1]), dataRow.wasNull());
		entry.setDataForWORKPOSITION(dataRow.getInt(dataColumns[2]), dataRow.wasNull());
		entry.setDataForDIVISION(dataRow.getInt(dataColumns[3]), dataRow.wasNull());
		entry.setDataForLOTUSADDRESS(dataRow.getString(dataColumns[4]));
		entry.setDataForEMAIL(dataRow.getString(dataColumns[5]));
		entry.setDataForPHONE1(dataRow.getString(dataColumns[6]));
		entry.setDataForPHONE2(dataRow.getString(dataColumns[7]));
		entry.setDataForLOCALPHONE(dataRow.getString(dataColumns[8]));
		entry.setDataForFAX(dataRow.getString(dataColumns[9]));
		entry.setDataForMOBILEPHONE(dataRow.getString(dataColumns[10]));
		entry.setDataForISACTIVE(dataRow.getString(dataColumns[11]));
		entry.setDataForISOUR(dataRow.getString(dataColumns[12]));
		entry.setDataForISSERVICESTUFF(dataRow.getString(dataColumns[13]));
		entry.setDataForORGANIZATION_(dataRow.getInt(dataColumns[14]), dataRow.wasNull());
		entry.setDataForWORKER(dataRow.getInt(dataColumns[15]), dataRow.wasNull());

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
		return "WorkerEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 16;
	}
}
