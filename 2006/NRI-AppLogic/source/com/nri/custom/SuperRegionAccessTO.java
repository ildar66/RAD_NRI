/*
 * Created on 19.09.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.custom;

import java.io.Serializable;

import com.nri.domain.SuperRegionAccess;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SuperRegionAccessTO implements Serializable {
	private SuperRegionAccess vo = null;
	private String supRegName = null;
	/**
	 * 
	 */
	public SuperRegionAccessTO(SuperRegionAccess aVo) {
		super();
		setVo(aVo);
	}

	/**
	 * @return
	 */
	public String getSupRegName() {
		return supRegName;
	}

	/**
	 * @param string
	 */
	public void setSupRegName(String string) {
		supRegName = string;
	}

	/**
	 * @return
	 */
	public SuperRegionAccess getVo() {
		return vo;
	}

	/**
	 * @param access
	 */
	private void setVo(SuperRegionAccess access) {
		vo = access;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (08.12.2005 17:30:33)
	 * @return boolean
	 */
	public boolean getEditFact() {
		return "Y".equals(vo.getEditFact());
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (08.12.2005 17:30:33)
	 * @return boolean
	 */
	public boolean getEditPlan() {
		return "Y".equals(vo.getEditPlan());
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (08.12.2005 17:30:33)
	 * @return boolean
	 */
	public boolean getViewFact() {
		return "Y".equals(vo.getViewFact());
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (08.12.2005 17:30:33)
	 * @return boolean
	 */
	public boolean getViewPlan() {
		return "Y".equals(vo.getViewPlan());
	}
}
