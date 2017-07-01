package com.nri.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPWorkerEJB_7ee08407
 */
public class EJSLocalCMPWorkerEJB_7ee08407 extends EJSLocalWrapper implements com.nri.ejb.WorkerEJBLocal {
	/**
	 * EJSLocalCMPWorkerEJB_7ee08407
	 */
	public EJSLocalCMPWorkerEJB_7ee08407() {
		super();	}
	/**
	 * getIsActive
	 */
	public java.lang.Boolean getIsActive() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Boolean _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getIsActive();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getIsOur
	 */
	public java.lang.Boolean getIsOur() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Boolean _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getIsOur();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getIsServiceStuff
	 */
	public java.lang.Boolean getIsServiceStuff() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Boolean _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.getIsServiceStuff();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getCompany
	 */
	public java.lang.Integer getCompany() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = beanRef.getCompany();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getDivision
	 */
	public java.lang.Integer getDivision() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = beanRef.getDivision();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 4, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getMan
	 */
	public java.lang.Integer getMan() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 5, _EJS_s);
			_EJS_result = beanRef.getMan();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getOrganization
	 */
	public java.lang.Integer getOrganization() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 6, _EJS_s);
			_EJS_result = beanRef.getOrganization();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getWorkPosition
	 */
	public java.lang.Integer getWorkPosition() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.Integer _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 7, _EJS_s);
			_EJS_result = beanRef.getWorkPosition();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 7, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getEmail
	 */
	public java.lang.String getEmail() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 8, _EJS_s);
			_EJS_result = beanRef.getEmail();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 8, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getFax
	 */
	public java.lang.String getFax() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 9, _EJS_s);
			_EJS_result = beanRef.getFax();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 9, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getLocalPhone
	 */
	public java.lang.String getLocalPhone() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 10, _EJS_s);
			_EJS_result = beanRef.getLocalPhone();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 10, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getLotusAddress
	 */
	public java.lang.String getLotusAddress() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 11, _EJS_s);
			_EJS_result = beanRef.getLotusAddress();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 11, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getMobilePhone
	 */
	public java.lang.String getMobilePhone() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 12, _EJS_s);
			_EJS_result = beanRef.getMobilePhone();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 12, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getPhone1
	 */
	public java.lang.String getPhone1() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 13, _EJS_s);
			_EJS_result = beanRef.getPhone1();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 13, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getPhone2
	 */
	public java.lang.String getPhone2() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 14, _EJS_s);
			_EJS_result = beanRef.getPhone2();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 14, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * setCompany
	 */
	public void setCompany(java.lang.Integer newCompany) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 15, _EJS_s);
			beanRef.setCompany(newCompany);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 15, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setDivision
	 */
	public void setDivision(java.lang.Integer newDivision) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 16, _EJS_s);
			beanRef.setDivision(newDivision);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 16, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setEmail
	 */
	public void setEmail(java.lang.String newEmail) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 17, _EJS_s);
			beanRef.setEmail(newEmail);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 17, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setFax
	 */
	public void setFax(java.lang.String newFax) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 18, _EJS_s);
			beanRef.setFax(newFax);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 18, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setIsActive
	 */
	public void setIsActive(java.lang.Boolean newIsActive) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 19, _EJS_s);
			beanRef.setIsActive(newIsActive);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 19, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setIsOur
	 */
	public void setIsOur(java.lang.Boolean newIsOur) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 20, _EJS_s);
			beanRef.setIsOur(newIsOur);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 20, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setIsServiceStuff
	 */
	public void setIsServiceStuff(java.lang.Boolean newIsServiceStuff) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 21, _EJS_s);
			beanRef.setIsServiceStuff(newIsServiceStuff);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 21, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setLocalPhone
	 */
	public void setLocalPhone(java.lang.String newLocalPhone) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 22, _EJS_s);
			beanRef.setLocalPhone(newLocalPhone);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 22, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setLotusAddress
	 */
	public void setLotusAddress(java.lang.String newLotusAddress) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 23, _EJS_s);
			beanRef.setLotusAddress(newLotusAddress);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 23, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setMan
	 */
	public void setMan(java.lang.Integer newMan) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 24, _EJS_s);
			beanRef.setMan(newMan);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 24, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setMobilePhone
	 */
	public void setMobilePhone(java.lang.String newMobilePhone) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 25, _EJS_s);
			beanRef.setMobilePhone(newMobilePhone);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 25, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setOrganization
	 */
	public void setOrganization(java.lang.Integer newOrganization) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 26, _EJS_s);
			beanRef.setOrganization(newOrganization);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 26, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setPhone1
	 */
	public void setPhone1(java.lang.String newPhone1) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 27, _EJS_s);
			beanRef.setPhone1(newPhone1);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 27, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setPhone2
	 */
	public void setPhone2(java.lang.String newPhone2) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 28, _EJS_s);
			beanRef.setPhone2(newPhone2);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 28, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setWorkPosition
	 */
	public void setWorkPosition(java.lang.Integer newWorkPosition) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			com.nri.ejb.WorkerEJBBean beanRef = (com.nri.ejb.WorkerEJBBean)container.preInvoke(this, 29, _EJS_s);
			beanRef.setWorkPosition(newWorkPosition);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 29, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
