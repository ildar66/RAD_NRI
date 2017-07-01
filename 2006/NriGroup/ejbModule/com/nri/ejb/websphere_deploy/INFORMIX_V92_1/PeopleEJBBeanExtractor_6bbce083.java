package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * PeopleEJBBeanExtractor_6bbce083
 */
public class PeopleEJBBeanExtractor_6bbce083 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * PeopleEJBBeanExtractor_6bbce083
	 */
	public PeopleEJBBeanExtractor_6bbce083() {
		int[] pkCols={1};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2,3,4,5,6,7,8,9};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanCacheEntryImpl_6bbce083 entry=
			new com.nri.ejb.websphere_deploy.INFORMIX_V92_1.PeopleEJBBeanCacheEntryImpl_6bbce083();

		entry.setDataForman(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataForfirstname(dataRow.getString(dataColumns[1]));
		entry.setDataForlastname(dataRow.getString(dataColumns[2]));
		entry.setDataFormiddlename(dataRow.getString(dataColumns[3]));
		entry.setDataForpassportser(dataRow.getString(dataColumns[4]));
		entry.setDataForpassportdate(dataRow.getDate(dataColumns[5]));
		entry.setDataForpassportwhom(dataRow.getString(dataColumns[6]));
		entry.setDataForisactive(dataRow.getString(dataColumns[7]));
		entry.setDataFortabnum(dataRow.getInt(dataColumns[8]), dataRow.wasNull());

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
