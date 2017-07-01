package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

/**
 * WorkerEJBBeanCacheEntryImpl_7ee08407
 */
public class WorkerEJBBeanCacheEntryImpl_7ee08407 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.nri.ejb.websphere_deploy.WorkerEJBBeanCacheEntry_7ee08407 {
	/**
	 * getWorker
	 */
	public java.lang.Integer getWorker() {
		if(worker_IsNull)
			return null;
		else
			return new Integer(worker_Data);
	}
	/**
	 * setWorker
	 */
	public void setWorker(Integer data) {
		if (data == null)
			this.worker_IsNull= true;
		else {
			this.worker_IsNull= false;
			this.worker_Data=data.intValue(); }
	}
	/**
	 * setDataForworker
	 */
	public void setDataForworker(int data, boolean isNull) {
		this.worker_Data=data;
		this.worker_IsNull=isNull;
	}
	private int worker_Data;
	private boolean worker_IsNull = true;
	/**
	 * getCompany
	 */
	public java.lang.Integer getCompany() {
		if(company_IsNull)
			return null;
		else
			return new Integer(company_Data);
	}
	/**
	 * setCompany
	 */
	public void setCompany(Integer data) {
		if (data == null)
			this.company_IsNull= true;
		else {
			this.company_IsNull= false;
			this.company_Data=data.intValue(); }
	}
	/**
	 * setDataForcompany
	 */
	public void setDataForcompany(int data, boolean isNull) {
		this.company_Data=data;
		this.company_IsNull=isNull;
	}
	private int company_Data;
	private boolean company_IsNull = true;
	/**
	 * getMan
	 */
	public java.lang.Integer getMan() {
		if(man_IsNull)
			return null;
		else
			return new Integer(man_Data);
	}
	/**
	 * setMan
	 */
	public void setMan(Integer data) {
		if (data == null)
			this.man_IsNull= true;
		else {
			this.man_IsNull= false;
			this.man_Data=data.intValue(); }
	}
	/**
	 * setDataForman
	 */
	public void setDataForman(int data, boolean isNull) {
		this.man_Data=data;
		this.man_IsNull=isNull;
	}
	private int man_Data;
	private boolean man_IsNull = true;
	/**
	 * getWorkPosition
	 */
	public java.lang.Integer getWorkPosition() {
		if(workposition_IsNull)
			return null;
		else
			return new Integer(workposition_Data);
	}
	/**
	 * setWorkPosition
	 */
	public void setWorkPosition(Integer data) {
		if (data == null)
			this.workposition_IsNull= true;
		else {
			this.workposition_IsNull= false;
			this.workposition_Data=data.intValue(); }
	}
	/**
	 * setDataForworkposition
	 */
	public void setDataForworkposition(int data, boolean isNull) {
		this.workposition_Data=data;
		this.workposition_IsNull=isNull;
	}
	private int workposition_Data;
	private boolean workposition_IsNull = true;
	/**
	 * getDivision
	 */
	public java.lang.Integer getDivision() {
		if(division_IsNull)
			return null;
		else
			return new Integer(division_Data);
	}
	/**
	 * setDivision
	 */
	public void setDivision(Integer data) {
		if (data == null)
			this.division_IsNull= true;
		else {
			this.division_IsNull= false;
			this.division_Data=data.intValue(); }
	}
	/**
	 * setDataFordivision
	 */
	public void setDataFordivision(int data, boolean isNull) {
		this.division_Data=data;
		this.division_IsNull=isNull;
	}
	private int division_Data;
	private boolean division_IsNull = true;
	/**
	 * getLotusAddress
	 */
	public java.lang.String getLotusAddress() {
		java.lang.String tempData_lotusAddress;
		tempData_lotusAddress =lotusaddress_Data;
		Object tempConvertedObject_lotusAddress = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_lotusAddress);
		return (tempConvertedObject_lotusAddress == null) ? null : (java.lang.String) tempConvertedObject_lotusAddress;
	}
	/**
	 * setLotusAddress
	 */
	public void setLotusAddress(java.lang.String data) {
		this.lotusaddress_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForlotusaddress
	 */
	public void setDataForlotusaddress(String data) {
		this.lotusaddress_Data=data;
	}
	private String lotusaddress_Data;
	/**
	 * getEmail
	 */
	public java.lang.String getEmail() {
		java.lang.String tempData_email;
		tempData_email =email_Data;
		Object tempConvertedObject_email = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_email);
		return (tempConvertedObject_email == null) ? null : (java.lang.String) tempConvertedObject_email;
	}
	/**
	 * setEmail
	 */
	public void setEmail(java.lang.String data) {
		this.email_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForemail
	 */
	public void setDataForemail(String data) {
		this.email_Data=data;
	}
	private String email_Data;
	/**
	 * getPhone1
	 */
	public java.lang.String getPhone1() {
		java.lang.String tempData_phone1;
		tempData_phone1 =phone1_Data;
		Object tempConvertedObject_phone1 = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_phone1);
		return (tempConvertedObject_phone1 == null) ? null : (java.lang.String) tempConvertedObject_phone1;
	}
	/**
	 * setPhone1
	 */
	public void setPhone1(java.lang.String data) {
		this.phone1_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForphone1
	 */
	public void setDataForphone1(String data) {
		this.phone1_Data=data;
	}
	private String phone1_Data;
	/**
	 * getPhone2
	 */
	public java.lang.String getPhone2() {
		java.lang.String tempData_phone2;
		tempData_phone2 =phone2_Data;
		Object tempConvertedObject_phone2 = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_phone2);
		return (tempConvertedObject_phone2 == null) ? null : (java.lang.String) tempConvertedObject_phone2;
	}
	/**
	 * setPhone2
	 */
	public void setPhone2(java.lang.String data) {
		this.phone2_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForphone2
	 */
	public void setDataForphone2(String data) {
		this.phone2_Data=data;
	}
	private String phone2_Data;
	/**
	 * getLocalPhone
	 */
	public java.lang.String getLocalPhone() {
		java.lang.String tempData_localPhone;
		tempData_localPhone =localphone_Data;
		Object tempConvertedObject_localPhone = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_localPhone);
		return (tempConvertedObject_localPhone == null) ? null : (java.lang.String) tempConvertedObject_localPhone;
	}
	/**
	 * setLocalPhone
	 */
	public void setLocalPhone(java.lang.String data) {
		this.localphone_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForlocalphone
	 */
	public void setDataForlocalphone(String data) {
		this.localphone_Data=data;
	}
	private String localphone_Data;
	/**
	 * getFax
	 */
	public java.lang.String getFax() {
		java.lang.String tempData_fax;
		tempData_fax =fax_Data;
		Object tempConvertedObject_fax = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_fax);
		return (tempConvertedObject_fax == null) ? null : (java.lang.String) tempConvertedObject_fax;
	}
	/**
	 * setFax
	 */
	public void setFax(java.lang.String data) {
		this.fax_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForfax
	 */
	public void setDataForfax(String data) {
		this.fax_Data=data;
	}
	private String fax_Data;
	/**
	 * getMobilePhone
	 */
	public java.lang.String getMobilePhone() {
		java.lang.String tempData_mobilePhone;
		tempData_mobilePhone =mobilephone_Data;
		Object tempConvertedObject_mobilePhone = com.ibm.vap.converters.VapTrimStringConverter.singleton().objectFrom(tempData_mobilePhone);
		return (tempConvertedObject_mobilePhone == null) ? null : (java.lang.String) tempConvertedObject_mobilePhone;
	}
	/**
	 * setMobilePhone
	 */
	public void setMobilePhone(java.lang.String data) {
		this.mobilephone_Data=(String)com.ibm.vap.converters.VapTrimStringConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataFormobilephone
	 */
	public void setDataFormobilephone(String data) {
		this.mobilephone_Data=data;
	}
	private String mobilephone_Data;
	/**
	 * getIsActive
	 */
	public java.lang.Boolean getIsActive() {
		java.lang.String tempData_isActive;
		tempData_isActive =isactive_Data;
		Object tempConvertedObject_isActive = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isActive);
		return (tempConvertedObject_isActive == null) ? null : (java.lang.Boolean) tempConvertedObject_isActive;
	}
	/**
	 * setIsActive
	 */
	public void setIsActive(java.lang.Boolean data) {
		this.isactive_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForisactive
	 */
	public void setDataForisactive(String data) {
		this.isactive_Data=data;
	}
	private String isactive_Data;
	/**
	 * getIsOur
	 */
	public java.lang.Boolean getIsOur() {
		java.lang.String tempData_isOur;
		tempData_isOur =isour_Data;
		Object tempConvertedObject_isOur = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isOur);
		return (tempConvertedObject_isOur == null) ? null : (java.lang.Boolean) tempConvertedObject_isOur;
	}
	/**
	 * setIsOur
	 */
	public void setIsOur(java.lang.Boolean data) {
		this.isour_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForisour
	 */
	public void setDataForisour(String data) {
		this.isour_Data=data;
	}
	private String isour_Data;
	/**
	 * getOrganization
	 */
	public java.lang.Integer getOrganization() {
		if(organization_IsNull)
			return null;
		else
			return new Integer(organization_Data);
	}
	/**
	 * setOrganization
	 */
	public void setOrganization(Integer data) {
		if (data == null)
			this.organization_IsNull= true;
		else {
			this.organization_IsNull= false;
			this.organization_Data=data.intValue(); }
	}
	/**
	 * setDataFororganization
	 */
	public void setDataFororganization(int data, boolean isNull) {
		this.organization_Data=data;
		this.organization_IsNull=isNull;
	}
	private int organization_Data;
	private boolean organization_IsNull = true;
	/**
	 * getIsServiceStuff
	 */
	public java.lang.Boolean getIsServiceStuff() {
		java.lang.String tempData_isServiceStuff;
		tempData_isServiceStuff =isservicestuff_Data;
		Object tempConvertedObject_isServiceStuff = com.ibm.vap.converters.VapStringToBooleanConverter.singleton().objectFrom(tempData_isServiceStuff);
		return (tempConvertedObject_isServiceStuff == null) ? null : (java.lang.Boolean) tempConvertedObject_isServiceStuff;
	}
	/**
	 * setIsServiceStuff
	 */
	public void setIsServiceStuff(java.lang.Boolean data) {
		this.isservicestuff_Data=(String)com.ibm.vap.converters.VapStringToBooleanConverter.singleton().dataFrom(data);
	}
	/**
	 * setDataForisservicestuff
	 */
	public void setDataForisservicestuff(String data) {
		this.isservicestuff_Data=data;
	}
	private String isservicestuff_Data;
}
