/*
 * Created on 19.09.2007
 *
 *	NriObject ����� ������� �� ��������.
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * NriObject ����� ������� �� ��������.
 */
public class SuperRegionAccess extends NriObject {
	private java.lang.Integer accessId; //������������� ������ �������
	private java.lang.Integer operatorId; //������ �� ���������
	private java.lang.Integer supRegionId; //������ �� �����������
	private java.lang.String viewPlan; //�������� �����
	private java.lang.String viewFact; //�������� �����
	private java.lang.String editPlan; //��������_ �����
	private java.lang.String editFact; //��������_ �����

	public SuperRegionAccess() {
		super();
	}

	public SuperRegionAccess(Integer aAccessId) {
		super();
		setAccessId(accessId);
	}

	public SuperRegionAccess(Integer iAccessid, Integer iOperatorid, Integer iSupregionid, String iViewplan, String iViewfact, String iEditplan, String iEditfact) {
		setAccessId(iAccessid);
		setOperatorId(iOperatorid);
		setSupRegionId(iSupregionid);
		setViewPlan(iViewplan);
		setViewFact(iViewfact);
		setEditPlan(iEditplan);
		setEditFact(iEditfact);
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
	public java.lang.Integer getSupRegionId() {
		return supRegionId;
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
	public void setSupRegionId(java.lang.Integer integer) {
		supRegionId = integer;
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
