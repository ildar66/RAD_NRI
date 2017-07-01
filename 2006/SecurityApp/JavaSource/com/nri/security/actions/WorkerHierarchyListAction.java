package com.nri.security.actions;

import java.util.ArrayList;
import java.util.LinkedList;

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
import com.nri.security.forms.WorkerHierarchyListForm;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;
import com.nri.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class WorkerHierarchyListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			WorkerHierarchyListForm aForm = (WorkerHierarchyListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

			Integer divisionKey = aForm.getQuery().getDivision();

			initHierarchyForEncloser(request, aForm, processor, divisionKey);
			initList(request, aForm, processor);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in WorkerHierarchyListAction.execute:" + e);
		} catch (NoSuchCompanyException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in WorkerHierarchyListAction.execute:" + e);
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
	private void initList(HttpServletRequest request, WorkerHierarchyListForm aForm, SecurityActionProcessor processor) throws ModelException {
		ArrayList list = processor.findWorkers(aForm.getQuery(), aForm.getOrderBy());
		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.WORKER_HIERARCHY_LIST, list);
	}

	/**
	 * 
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 * @throws NoSuchCompanyException
	 */
	private void initHierarchyForEncloser(HttpServletRequest request, WorkerHierarchyListForm aForm, SecurityActionProcessor processor, Integer encloserKey)
		throws ModelException, NoSuchCompanyException {
		//инит иерархию:
		LinkedList hierarchyEncloser = (LinkedList)processor.findDivisionHierarchyForEncloser(encloserKey, 10);
		//инит. Компанию:			
		Division encloser = (Division)hierarchyEncloser.getLast();
		Integer companyKey = encloser.getCompany();
		if (companyKey != null) {
			aForm.setCompanyVO(processor.findCompanyByKey(companyKey));
		}
		
		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.ENCLOSER_HIERARCHY, hierarchyEncloser);
	}
}
