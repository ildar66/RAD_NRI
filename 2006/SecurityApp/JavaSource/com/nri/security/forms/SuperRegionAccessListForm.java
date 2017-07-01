package com.nri.security.forms;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Operator;
import com.nri.domain.People;
import com.nri.domain.SuperRegionAccess;
//import com.nri.ejb.helper.OIDGeneratorHelper;
import com.nri.sequence.SequenceGeneratorHelper;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class SuperRegionAccessListForm extends ActionForm {
	private Operator operatorVO = new Operator();
	private String orderBy = "supregname";
	private People peopleVO = new People();
	private java.lang.String operation = "";
	private int[] viewPlan = new int[0];
	private int[] editPlan = new int[0];
	private int[] viewFact = new int[0];
	private int[] editFact = new int[0];

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		peopleVO = new People();
		operation = "";
		viewPlan = new int[0];
		editPlan = new int[0];
		viewFact = new int[0];
		editFact = new int[0];
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new org.apache.struts.action.ActionError("error.field.required"));
		// }
		return errors;

	}
	/**
	 * @return
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * @param string
	 */
	public void setOrderBy(String string) {
		orderBy = string;
	}

	/**
	 * @return
	 */
	public People getPeopleVO() {
		return peopleVO;
	}

	/**
	 * @param people
	 */
	public void setPeopleVO(People people) {
		peopleVO = people;
	}

	/**
	 * @param string
	 */
	public void setOperator(Integer operator) {
		getOperatorVO().setOperator(operator);
	}

	/**
	 * @return Integer
	 */
	public Integer getOperator() {
		return getOperatorVO().getOperator();
	}

	/**
	 * @return
	 */
	public Operator getOperatorVO() {
		return operatorVO;
	}

	/**
	 * @param operator
	 */
	public void setOperatorVO(Operator operator) {
		operatorVO = operator;
	}

	/**
	 * @return
	 */
	public java.lang.String getOperation() {
		return operation;
	}

	/**
	 * @param string
	 */
	public void setOperation(java.lang.String string) {
		operation = string;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (09.12.2005 16:05:39)
	 * @return java.util.List
	 */
	public java.util.Collection createAccessList() {
		HashMap hashAccessList = new java.util.HashMap();
		SuperRegionAccess vo = null;
		Integer supRegId = null;
		//Editfact:
		for (int i = 0; i < getEditFact().length; i++) {
			supRegId = new Integer(getEditFact()[i]);
			vo = (SuperRegionAccess) hashAccessList.get(supRegId);
			if (vo != null) {
				vo.setEditFact("Y");
			} else {
				vo = new SuperRegionAccess(getNextKey(), getOperator(), supRegId, "N", "N", "N", "Y");
				hashAccessList.put(supRegId, vo);
			}
		}
		//Editplan:
		for (int i = 0; i < getEditPlan().length; i++) {
			supRegId = new Integer(getEditPlan()[i]);
			vo = (SuperRegionAccess) hashAccessList.get(supRegId);
			if (vo != null) {
				vo.setEditPlan("Y");
			} else {
				vo = new SuperRegionAccess(getNextKey(), getOperator(), supRegId, "N", "N", "Y", "N");
				hashAccessList.put(supRegId, vo);
			}
		}
		//Viewfact:
		for (int i = 0; i < getViewFact().length; i++) {
			supRegId = new Integer(getViewFact()[i]);
			vo = (SuperRegionAccess) hashAccessList.get(supRegId);
			if (vo != null) {
				vo.setViewFact("Y");
			} else {
				vo = new SuperRegionAccess(getNextKey(), getOperator(), supRegId, "N", "Y", "N", "N");
				hashAccessList.put(supRegId, vo);
			}
		}
		//Viewplan:
		for (int i = 0; i < getViewPlan().length; i++) {
			supRegId = new Integer(getViewPlan()[i]);
			vo = (SuperRegionAccess) hashAccessList.get(supRegId);
			if (vo != null) {
				vo.setViewPlan("Y");
			} else {
				vo = new SuperRegionAccess(getNextKey(), getOperator(), supRegId, "Y", "N", "N", "N");
				hashAccessList.put(supRegId, vo);
			}
		}
		return hashAccessList.values();
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (12.12.2005 11:34:11)
	 */
	private Integer getNextKey() {
		Integer nextKey = null;
		try {
			//nextKey = new Integer(OIDGeneratorHelper.getNextId("tables.regionsaccess"));
			nextKey = new Integer(SequenceGeneratorHelper.getNextId("tables.regionsaccess"));
		} catch (Exception e) {
			System.out.println("Ошибка генерация ключа tables.regionsaccess");
			e.printStackTrace();
		}
		return nextKey;
	}
	/**
	 * @return
	 */
	public int[] getEditFact() {
		return editFact;
	}

	/**
	 * @return
	 */
	public int[] getEditPlan() {
		return editPlan;
	}

	/**
	 * @return
	 */
	public int[] getViewFact() {
		return viewFact;
	}

	/**
	 * @return
	 */
	public int[] getViewPlan() {
		return viewPlan;
	}

	/**
	 * @param is
	 */
	public void setEditFact(int[] is) {
		editFact = is;
	}

	/**
	 * @param is
	 */
	public void setEditPlan(int[] is) {
		editPlan = is;
	}

	/**
	 * @param is
	 */
	public void setViewFact(int[] is) {
		viewFact = is;
	}

	/**
	 * @param is
	 */
	public void setViewPlan(int[] is) {
		viewPlan = is;
	}

}
