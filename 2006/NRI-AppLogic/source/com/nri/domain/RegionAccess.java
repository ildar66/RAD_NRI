/*
 * Created on 19.09.2007
 *
 * NriObject Права доступа по филиалам региона.
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * NriObject Права доступа по филиалам региона.
 */
public class RegionAccess extends NriObject {
	private java.lang.Integer accessId; //Идентификатор записи доступа
	private java.lang.Integer operatorId; //Ссылка на оператора
	private java.lang.Integer regionId; //Ссылка на регион
	private java.lang.String viewPlan; //Просмотр плана
	private java.lang.String viewFact; //Просмотр факта
	private java.lang.String editPlan; //Редактир_ плана
	private java.lang.String editFact; //Редактир_ факта
	private java.lang.String viewArenda; //Просмотр для модуля "Аренды"
	private java.lang.String editArenda; //Редакция для модуля "Аренды"

	public RegionAccess() {
		super();
	}

	public RegionAccess(Integer aAccessId) {
		super();
		setAccessId(accessId);
	}

	public RegionAccess(Integer iAccessid, Integer iOperatorid, Integer iRegionid, String iViewplan, String iViewfact, String iEditplan, String iEditfact, String iViewarenda, String iEditarenda) {
		setAccessId(iAccessid);
		setOperatorId(iOperatorid);
		setRegionId(iRegionid);
		setViewPlan(iViewplan);
		setViewFact(iViewfact);
		setEditPlan(iEditplan);
		setEditFact(iEditfact);
		setViewArenda(iViewarenda);
		setEditArenda(iEditarenda);
	}

	/**
	 * @return
	 */
	public java.lang.Integer getAccessId() {
		return accessId;
	}

	/**
	 * @return
	 */
	public java.lang.String getEditArenda() {
		return editArenda;
	}

	/**
	 * @return
	 */
	public java.lang.String getEditFact() {
		return editFact;
	}

	/**
	 * @return
	 */
	public java.lang.String getEditPlan() {
		return editPlan;
	}

	/**
	 * @return
	 */
	public java.lang.Integer getOperatorId() {
		return operatorId;
	}

	/**
	 * @return
	 */
	public java.lang.Integer getRegionId() {
		return regionId;
	}

	/**
	 * @return
	 */
	public java.lang.String getViewArenda() {
		return viewArenda;
	}

	/**
	 * @return
	 */
	public java.lang.String getViewFact() {
		return viewFact;
	}

	/**
	 * @return
	 */
	public java.lang.String getViewPlan() {
		return viewPlan;
	}

	/**
	 * @param integer
	 */
	public void setAccessId(java.lang.Integer integer) {
		accessId = integer;
	}

	/**
	 * @param string
	 */
	public void setEditArenda(java.lang.String string) {
		editArenda = string;
	}

	/**
	 * @param string
	 */
	public void setEditFact(java.lang.String string) {
		editFact = string;
	}

	/**
	 * @param string
	 */
	public void setEditPlan(java.lang.String string) {
		editPlan = string;
	}

	/**
	 * @param integer
	 */
	public void setOperatorId(java.lang.Integer integer) {
		operatorId = integer;
	}

	/**
	 * @param integer
	 */
	public void setRegionId(java.lang.Integer integer) {
		regionId = integer;
	}

	/**
	 * @param string
	 */
	public void setViewArenda(java.lang.String string) {
		viewArenda = string;
	}

	/**
	 * @param string
	 */
	public void setViewFact(java.lang.String string) {
		viewFact = string;
	}

	/**
	 * @param string
	 */
	public void setViewPlan(java.lang.String string) {
		viewPlan = string;
	}

}
