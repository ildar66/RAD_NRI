package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

/**
 * WorkerEJBBeanCacheEntryImpl_7ee08407
 */
public class WorkerEJBBeanCacheEntryImpl_7ee08407 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.WorkerEJBBeanCacheEntry_7ee08407 {
	/**
	 * getCompany
	 */
	public java.lang.Integer getCompany() {
		if(COMPANY_IsNull)
			return null;
		else
			return new Integer(COMPANY_Data);
	}
	/**
	 * setCompany
	 */
	public void setCompany(Integer data) {
		if (data == null)
			this.COMPANY_IsNull= true;
		else {
			this.COMPANY_IsNull= false;
			this.COMPANY_Data=data.intValue(); }
	}
	/**
	 * setDataForCOMPANY
	 */
	public void setDataForCOMPANY(int data, boolean isNull) {
		this.COMPANY_Data=data;
		this.COMPANY_IsNull=isNull;
	}
	private int COMPANY_Data;
	private boolean COMPANY_IsNull = true;
	/**
	 * getMan
	 */
	public java.lang.Integer getMan() {
		if(MAN_IsNull)
			return null;
		else
			return new Integer(MAN_Data);
	}
	/**
	 * setMan
	 */
	public void setMan(Integer data) {
		if (data == null)
			this.MAN_IsNull= true;
		else {
			this.MAN_IsNull= false;
			this.MAN_Data=data.intValue(); }
	}
	/**
	 * setDataForMAN
	 */
	public void setDataForMAN(int data, boolean isNull) {
		this.MAN_Data=data;
		this.MAN_IsNull=isNull;
	}
	private int MAN_Data;
	private boolean MAN_IsNull = true;
	/**
	 * getWorkPosition
	 */
	public java.lang.Integer getWorkPosition() {
		if(WORKPOSITION_IsNull)
			return null;
		else
			return new Integer(WORKPOSITION_Data);
	}
	/**
	 * setWorkPosition
	 */
	public void setWorkPosition(Integer data) {
		if (data == null)
			this.WORKPOSITION_IsNull= true;
		else {
			this.WORKPOSITION_IsNull= false;
			this.WORKPOSITION_Data=data.intValue(); }
	}
	/**
	 * setDataForWORKPOSITION
	 */
	public void setDataForWORKPOSITION(int data, boolean isNull) {
		this.WORKPOSITION_Data=data;
		this.WORKPOSITION_IsNull=isNull;
	}
	private int WORKPOSITION_Data;
	private boolean WORKPOSITION_IsNull = true;
	/**
	 * getDivision
	 */
	public java.lang.Integer getDivision() {
		if(DIVISION_IsNull)
			return null;
		else
			return new Integer(DIVISION_Data);
	}
	/**
	 * setDivision
	 */
	public void setDivision(Integer data) {
		if (data == null)
			this.DIVISION_IsNull= true;
		else {
			this.DIVISION_IsNull= false;
			this.DIVISION_Data=data.intValue(); }
	}
	/**
	 * setDataForDIVISION
	 */
	public void setDataForDIVISION(int data, boolean isNull) {
		this.DIVISION_Data=data;
		this.DIVISION_IsNull=isNull;
	}
	private int DIVISION_Data;
	private boolean DIVISION_IsNull = true;
	/**
	 * getLotusAddress
	 */
	public java.lang.String getLotusAddress() {
		return LOTUSADDRESS_Data;
	}
	/**
	 * setLotusAddress
	 */
	public void setLotusAddress(String data) {
		this.LOTUSADDRESS_Data=data;
	}
	/**
	 * setDataForLOTUSADDRESS
	 */
	public void setDataForLOTUSADDRESS(String data) {
		this.LOTUSADDRESS_Data=data;
	}
	private String LOTUSADDRESS_Data;
	/**
	 * getEmail
	 */
	public java.lang.String getEmail() {
		return EMAIL_Data;
	}
	/**
	 * setEmail
	 */
	public void setEmail(String data) {
		this.EMAIL_Data=data;
	}
	/**
	 * setDataForEMAIL
	 */
	public void setDataForEMAIL(String data) {
		this.EMAIL_Data=data;
	}
	private String EMAIL_Data;
	/**
	 * getPhone1
	 */
	public java.lang.String getPhone1() {
		return PHONE1_Data;
	}
	/**
	 * setPhone1
	 */
	public void setPhone1(String data) {
		this.PHONE1_Data=data;
	}
	/**
	 * setDataForPHONE1
	 */
	public void setDataForPHONE1(String data) {
		this.PHONE1_Data=data;
	}
	private String PHONE1_Data;
	/**
	 * getPhone2
	 */
	public java.lang.String getPhone2() {
		return PHONE2_Data;
	}
	/**
	 * setPhone2
	 */
	public void setPhone2(String data) {
		this.PHONE2_Data=data;
	}
	/**
	 * setDataForPHONE2
	 */
	public void setDataForPHONE2(String data) {
		this.PHONE2_Data=data;
	}
	private String PHONE2_Data;
	/**
	 * getLocalPhone
	 */
	public java.lang.String getLocalPhone() {
		return LOCALPHONE_Data;
	}
	/**
	 * setLocalPhone
	 */
	public void setLocalPhone(String data) {
		this.LOCALPHONE_Data=data;
	}
	/**
	 * setDataForLOCALPHONE
	 */
	public void setDataForLOCALPHONE(String data) {
		this.LOCALPHONE_Data=data;
	}
	private String LOCALPHONE_Data;
	/**
	 * getFax
	 */
	public java.lang.String getFax() {
		return FAX_Data;
	}
	/**
	 * setFax
	 */
	public void setFax(String data) {
		this.FAX_Data=data;
	}
	/**
	 * setDataForFAX
	 */
	public void setDataForFAX(String data) {
		this.FAX_Data=data;
	}
	private String FAX_Data;
	/**
	 * getMobilePhone
	 */
	public java.lang.String getMobilePhone() {
		return MOBILEPHONE_Data;
	}
	/**
	 * setMobilePhone
	 */
	public void setMobilePhone(String data) {
		this.MOBILEPHONE_Data=data;
	}
	/**
	 * setDataForMOBILEPHONE
	 */
	public void setDataForMOBILEPHONE(String data) {
		this.MOBILEPHONE_Data=data;
	}
	private String MOBILEPHONE_Data;
	/**
	 * getIsActive
	 */
	public java.lang.Boolean getIsActive() {
		java.lang.String tempData_isActive;
		tempData_isActive =ISACTIVE_Data;
		Object tempConvertedObject_isActive = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isActive);
		return (tempConvertedObject_isActive == null) ? null : (java.lang.Boolean) tempConvertedObject_isActive;
	}
	/**
	 * setIsActive
	 */
	public void setIsActive(java.lang.Boolean data) {
		this.ISACTIVE_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForISACTIVE
	 */
	public void setDataForISACTIVE(String data) {
		this.ISACTIVE_Data=data;
	}
	private String ISACTIVE_Data;
	/**
	 * getIsOur
	 */
	public java.lang.Boolean getIsOur() {
		java.lang.String tempData_isOur;
		tempData_isOur =ISOUR_Data;
		Object tempConvertedObject_isOur = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isOur);
		return (tempConvertedObject_isOur == null) ? null : (java.lang.Boolean) tempConvertedObject_isOur;
	}
	/**
	 * setIsOur
	 */
	public void setIsOur(java.lang.Boolean data) {
		this.ISOUR_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForISOUR
	 */
	public void setDataForISOUR(String data) {
		this.ISOUR_Data=data;
	}
	private String ISOUR_Data;
	/**
	 * getIsServiceStuff
	 */
	public java.lang.Boolean getIsServiceStuff() {
		java.lang.String tempData_isServiceStuff;
		tempData_isServiceStuff =ISSERVICESTUFF_Data;
		Object tempConvertedObject_isServiceStuff = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isServiceStuff);
		return (tempConvertedObject_isServiceStuff == null) ? null : (java.lang.Boolean) tempConvertedObject_isServiceStuff;
	}
	/**
	 * setIsServiceStuff
	 */
	public void setIsServiceStuff(java.lang.Boolean data) {
		this.ISSERVICESTUFF_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForISSERVICESTUFF
	 */
	public void setDataForISSERVICESTUFF(String data) {
		this.ISSERVICESTUFF_Data=data;
	}
	private String ISSERVICESTUFF_Data;
	/**
	 * getOrganization
	 */
	public java.lang.Integer getOrganization() {
		if(ORGANIZATION__IsNull)
			return null;
		else
			return new Integer(ORGANIZATION__Data);
	}
	/**
	 * setOrganization
	 */
	public void setOrganization(Integer data) {
		if (data == null)
			this.ORGANIZATION__IsNull= true;
		else {
			this.ORGANIZATION__IsNull= false;
			this.ORGANIZATION__Data=data.intValue(); }
	}
	/**
	 * setDataForORGANIZATION_
	 */
	public void setDataForORGANIZATION_(int data, boolean isNull) {
		this.ORGANIZATION__Data=data;
		this.ORGANIZATION__IsNull=isNull;
	}
	private int ORGANIZATION__Data;
	private boolean ORGANIZATION__IsNull = true;
	/**
	 * getWorker
	 */
	public java.lang.Integer getWorker() {
		if(WORKER_IsNull)
			return null;
		else
			return new Integer(WORKER_Data);
	}
	/**
	 * setWorker
	 */
	public void setWorker(Integer data) {
		if (data == null)
			this.WORKER_IsNull= true;
		else {
			this.WORKER_IsNull= false;
			this.WORKER_Data=data.intValue(); }
	}
	/**
	 * setDataForWORKER
	 */
	public void setDataForWORKER(int data, boolean isNull) {
		this.WORKER_Data=data;
		this.WORKER_IsNull=isNull;
	}
	private int WORKER_Data;
	private boolean WORKER_IsNull = true;
}
