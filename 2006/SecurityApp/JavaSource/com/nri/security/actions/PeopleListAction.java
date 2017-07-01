package com.nri.security.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Page;
import com.nri.exception.ModelException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.PeopleListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class PeopleListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			PeopleListForm aForm = (PeopleListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			Page page = processor.findPeoplesByName(aForm.getSearchStr(), buildIsActive(aForm), aForm.getStartAtRow(), aForm.getHowManyRows(), aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.PEOPLE_PAGE, page);
			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in PeopleListAction.execute:" + e);
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
	protected Boolean buildIsActive(PeopleListForm aForm) {
		Boolean isActive = null;
		if ("Y".equals(aForm.getActiveState())) {
			isActive = Boolean.TRUE;
		} else if ("N".equals(aForm.getActiveState())) {
			isActive = Boolean.FALSE;
		}
		return isActive;
	}	
}
