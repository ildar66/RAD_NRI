package com.nri.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.exception.ModelException;
import com.nri.exception.NoSuchPeopleException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.PeopleStaffListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class PeopleStaffListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			PeopleStaffListForm aForm = (PeopleStaffListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

			Integer peopleKey = aForm.getQuery().getMan();
			//инит. Физ.лицо:
			aForm.setPeopleVO(processor.findPeopleByKey(peopleKey));
			
			initList(request, aForm, processor);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in PeopleStaffListAction.execute:" + e);
		} catch (NoSuchPeopleException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in PeopleStaffListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

	/**
	 * инит. Подразделения
	 * @param request
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 */
	private void initList(HttpServletRequest request, PeopleStaffListForm aForm, SecurityActionProcessor processor) throws ModelException {
		ArrayList list = processor.findWorkers(aForm.getQuery(), aForm.getOrderBy());
		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.PEOPLE_STAFF_LIST, list);
	}
}
