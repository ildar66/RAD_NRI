package com.nri.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.DivisionType;
import com.nri.exception.ModelException;
import com.nri.exception.NoSuchCompanyException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.DivisionListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class DivisionListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			DivisionListForm aForm = (DivisionListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

			Integer companyKey = new Integer(aForm.getCompany());
			//инит. Компанию:
			aForm.setCompanyVO(processor.findCompanyByKey(companyKey));
			//инит. Подразделения: 
			ArrayList list = processor.findDivisions(aForm.getSearchStr(), companyKey, buildIsActive(aForm), DivisionType.factory(aForm.getType()), aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.DIVISION_LIST, list);
			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in DivisionListAction.execute:" + e);
		} catch (NoSuchCompanyException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in DivisionListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

	/**
	 * 
	 * @param aForm
	 * @return
	 */
	protected Boolean buildIsActive(DivisionListForm aForm) {
		Boolean isActive = null;
		if ("Y".equals(aForm.getActiveState())) {
			isActive = Boolean.TRUE;
		} else if ("N".equals(aForm.getActiveState())) {
			isActive = Boolean.FALSE;
		}
		return isActive;
	}
}
