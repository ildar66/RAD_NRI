/*
 * Created on 13.09.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.mapping.ejb;

import java.util.ArrayList;

import javax.ejb.EJBLocalObject;

import com.nri.domain.NriObject;
import com.nri.domain.Operator;
import com.nri.ejb.OperatorEJBLocal;
import com.nri.ejb.OperatorEJBLocalHome;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchObjectException;
import com.nri.system.AppService;
import com.nri.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class OperatorMapper extends DomainEJBMapper implements com.nri.mapping.OperatorMapper {
	OperatorEJBLocalHome operatorHome;
	/**
	 * 
	 */
	public OperatorMapper() {
		super();
		createInitialContext();
		createOperatorHome();
	}
	
	/**
	 * This method retrieves an instance of OperatorEJBHome from the JNDI initial context.
	 * Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createOperatorHome() {
		try {
			operatorHome = (OperatorEJBLocalHome) initContext.lookup("java:comp/env/ejb/OperatorEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createOperatorHome()");
		}

	}	

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#findEJBObjectMatching(com.nri.domain.NriObject)
	 */
	protected EJBLocalObject findEJBObjectMatching(NriObject domainObject) throws MappingException {
		OperatorEJBLocal operatorEJB = null;
		try {
			Operator operator = (Operator) domainObject;
			operatorEJB = operatorHome.findByPrimaryKey(operator.getOperator());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in OperatorMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in OperatorMapper.findEJBObjectMatching()"));
		}
		return operatorEJB;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.ejb.DomainEJBMapper#map(javax.ejb.EJBLocalObject)
	 */
	public NriObject map(EJBLocalObject input) throws MappingException {
		OperatorEJBLocal ejb;
		try {
			ejb = (OperatorEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non OperatorEJB in OperatorMapper");
		}
		Operator operator = null;
		try {
			operator = new Operator(((Integer) ejb.getPrimaryKey()), ejb.getMan(), ejb.getLoginID(), ejb.getPassword(), ejb.getIsEnabled());
			operator.setMsuCode(ejb.getMsuCode());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in OperatorMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in OperatorMapper.map()");
		}
		return operator;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.OperatorMapper#findById(java.lang.Integer)
	 */
	public Operator findById(Integer id) throws MappingException {
		try {
			OperatorEJBLocal ejb = operatorHome.findByPrimaryKey(id);
			return (Operator) map(ejb);
		} catch (Exception e) {
			throw new MappingException(e, ("Wrapped exception caught in findByID: " + e));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.OperatorMapper#findOperators(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperators(Integer peopleKey, String orderBy) throws MappingException {
		throw new MappingException("findOperators not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		try {
			Operator operator = (Operator) anObject;
			OperatorEJBLocal operatorEJB = operatorHome.create(operator.getOperator(), operator.getMan(), operator.getLoginID(), operator.getPassword(), operator.getIsEnabled());
			operatorEJB.setMsuCode(operator.getMsuCode());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in OperatorMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in OperatorMapper.insert()"));
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#update(com.nri.domain.NriObject)
	 */
	public void update(NriObject anObject) throws NoSuchObjectException, MappingException {
		try {
			Operator operator = (Operator) anObject;
			OperatorEJBLocal operatorEJB = operatorHome.findByPrimaryKey(operator.getOperator());
			operatorEJB.setMan(operator.getMan());
			operatorEJB.setLoginID(operator.getLoginID());			
			operatorEJB.setPassword(operator.getPassword());
			operatorEJB.setIsEnabled(operator.getIsEnabled());
			operatorEJB.setMsuCode(operator.getMsuCode());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in OperatorMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in OperatorMapper.update()");
		}


	}

}
