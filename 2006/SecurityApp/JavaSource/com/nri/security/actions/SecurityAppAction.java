/*
 * Created on 05.09.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;

import com.nri.exception.MappingException;
import com.nri.exception.ModelException;
import com.nri.model.ActionProcessorFactory;
import com.nri.model.SecurityActionProcessor;
import com.nri.value.BeanKeys;
import com.nri.value.Companys;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SecurityAppAction extends Action {

	/**
	 * 
	 */
	public SecurityAppAction() {
		super();
	}

	/**
	* 
	* @param request
	*/
	protected void addCompanysBean_Old(HttpServletRequest request) {
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
		ArrayList comps = null;
		try {
			comps = processor.findAllCompanies();
		} catch (ModelException me) {
			// Should not eat exception
		}
		Companys companys = new Companys(comps);
		request.setAttribute(BeanKeys.COMPANIES, companys);
	}

	/**
	 * 
	 * @param request
	 */
	protected void addCompanysBean(HttpServletRequest request) {

		HttpSession session = request.getSession();
		if (session.getAttribute(BeanKeys.COMPANIES) != null) {
			return;
		}
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
		ArrayList companies = null;
		try {
			companies = processor.findAllCompanies();
		} catch (ModelException mme) {
			// Should not eat exception
			//		} catch (MappingExceptionme) {
		}

		// Add ValueBean to request context and forward response
		// request.setAttribute(BeanKeys.COMPANIES, companyes);

		session.setAttribute(BeanKeys.COMPANIES, companies);
	}

	/**
	* 
	* @param request
	*/
	protected void addMsUsersBean(HttpServletRequest request) {
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
		ArrayList msUsers = null;
		try {
			msUsers = processor.findMsUsers("*", "msUser");
		} catch (ModelException me) {
			// Should not eat exception
		}
		request.setAttribute(BeanKeys.MS_USERS, msUsers);
	}

	/**
	* 
	* @param request
	*/
	protected void addTerrabyteServers(HttpServletRequest request) throws ModelException{
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
		ArrayList terrabyteServers = null;
		try {
			terrabyteServers = processor.findAllTerrabyteServers();
		} catch (ModelException me) {
			throw me;
		}
		request.setAttribute(BeanKeys.TERRABYTE_SERVERS, terrabyteServers);
	}
}
