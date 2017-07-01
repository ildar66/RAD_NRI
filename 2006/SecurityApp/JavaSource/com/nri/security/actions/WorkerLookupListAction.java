package com.nri.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nri.domain.Division;
import com.nri.exception.ModelException;
import com.nri.exception.NoSuchCompanyException;
import com.nri.exception.NoSuchDivisionException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.security.forms.WorkerLookupListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class WorkerLookupListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			WorkerLookupListForm aForm = (WorkerLookupListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

			initForm(aForm, processor);

			initList(request, aForm, processor);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in WorkerLookupListAction.execute:" + e);
		} catch (NoSuchCompanyException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in WorkerLookupListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

	/**
	 * 
	 * @param aForm
	 * @param processor
	 * @throws NoSuchDivisionException
	 * @throws NoSuchCompanyException
	 */
	private void initForm(WorkerLookupListForm aForm, SecurityActionProcessor processor) throws NoSuchDivisionException, NoSuchCompanyException {
		Integer divisionKey = aForm.getQuery().getDivision();
		Integer companyKey = aForm.getQuery().getCompany();
		if (divisionKey != null) {
			Division division = (Division) processor.findDivisionByKey(divisionKey);
			aForm.setDivisionVO(division);
			companyKey = division.getCompany();
			if (companyKey != null) {
				aForm.setCompanyVO(processor.findCompanyByKey(companyKey));
			}
		}else if(companyKey != null){
			aForm.setCompanyVO(processor.findCompanyByKey(companyKey));			
		}
	}

	/**
	 * инит. Подразделения
	 * @param request
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 */
	private void initList(HttpServletRequest request, WorkerLookupListForm aForm, SecurityActionProcessor processor) throws ModelException {
		ArrayList list = processor.findWorkers(aForm.getSearchStr(), aForm.getQuery(), aForm.getOrderBy());
		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.WORKER_LOOKUP_LIST, list);
	}
}
