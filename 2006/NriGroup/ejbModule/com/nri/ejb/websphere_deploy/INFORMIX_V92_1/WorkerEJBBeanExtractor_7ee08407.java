package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * WorkerEJBBeanExtractor_7ee08407
 */
public class WorkerEJBBeanExtractor_7ee08407 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * WorkerEJBBeanExtractor_7ee08407
	 */
	public WorkerEJBBeanExtractor_7ee08407() {
		int[] pkCols={1};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.INFORMIX_V92_1.WorkerEJBBeanCacheEntryImpl_7ee08407 entry=
			new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.WorkerEJBBeanCacheEntryImpl_7ee08407();

		entry.setDataForworker(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataForcompany(dataRow.getInt(dataColumns[1]), dataRow.wasNull());
		entry.setDataForman(dataRow.getInt(dataColumns[2]), dataRow.wasNull());
		entry.setDataForworkposition(dataRow.getInt(dataColumns[3]), dataRow.wasNull());
		entry.setDataFordivision(dataRow.getInt(dataColumns[4]), dataRow.wasNull());
		entry.setDataForlotusaddress(dataRow.getString(dataColumns[5]));
		entry.setDataForemail(dataRow.getString(dataColumns[6]));
		entry.setDataForphone1(dataRow.getString(dataColumns[7]));
		entry.setDataForphone2(dataRow.getString(dataColumns[8]));
		entry.setDataForlocalphone(dataRow.getString(dataColumns[9]));
		entry.setDataForfax(dataRow.getString(dataColumns[10]));
		entry.setDataFormobilephone(dataRow.getString(dataColumns[11]));
		entry.setDataForisactive(dataRow.getString(dataColumns[12]));
		entry.setDataForisour(dataRow.getString(dataColumns[13]));
		entry.setDataFororganization(dataRow.getInt(dataColumns[14]), dataRow.wasNull());
		entry.setDataForisservicestuff(dataRow.getString(dataColumns[15]));

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
