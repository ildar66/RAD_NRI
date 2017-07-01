package com.nri.ejb.websphere_deploy.ORACLE_V9_1;

import com.ibm.websphere.rsadapter.WSInteractionSpec;
import com.ibm.ws.rsadapter.exceptions.DataStoreAdapterException;
import javax.resource.cci.Record;
import javax.resource.cci.IndexedRecord;
import java.sql.*;

/**
 * OperatorEJBBeanFunctionSet_f75441b3
 */
public class OperatorEJBBeanFunctionSet_f75441b3 extends com.ibm.ws.rsadapter.cci.WSResourceAdapterBase implements com.ibm.websphere.rsadapter.DataAccessFunctionSet {
	private java.util.HashMap functionHash;
	/**
	 * Create
	 */
	public void Create(IndexedRecord inputRecord, Object connection, WSInteractionSpec interactionSpec) throws DataStoreAdapterException {
		PreparedStatement pstmt = null;
		try {
			pstmt = prepareStatement(connection,"INSERT INTO INFORMIX.OPERATORS (OPERATOR_, MAN, PASSWORD, ISENABLED, MSUCODE, LOIGINID) VALUES (?, ?, ?, ?, ?, ?)");

			// For column MAN
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(2,tempInteger.intValue());
				else
					pstmt.setNull(2,java.sql.Types.DECIMAL);
			}
			// For column PASSWORD
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.CHAR);
			}
			// For column ISENABLED
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(4,tempString);
				else
					pstmt.setNull(4,java.sql.Types.CHAR);
			}
			// For column MSUCODE
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(3);
				if(tempInteger != null)
					pstmt.setInt(5,tempInteger.intValue());
				else
					pstmt.setNull(5,java.sql.Types.DECIMAL);
			}
			// For column LOIGINID
			{
				String tempString;


				tempString=(String)inputRecord.get(4);
				if(tempString != null)
					pstmt.setString(6,tempString);
				else
					pstmt.setNull(6,java.sql.Types.CHAR);
			}
			// For column OPERATOR_
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(5);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.DECIMAL);
			}
			if (pstmt.executeUpdate()==0)
				throw new DataStoreAdapterException("DSA_ERROR",new javax.ejb.NoSuchEntityException(), this.getClass());

		}
		catch (SQLException e) {
			throw new DataStoreAdapterException("DSA_ERROR", e ,this.getClass());
		}
		finally {
			try {
				if(pstmt != null) {
					returnPreparedStatement(connection, pstmt);
				}
			}
			catch (SQLException ignored)
			{}
		}
	}
	/**
	 * Remove
	 */
	public void Remove(IndexedRecord inputRecord, Object connection, WSInteractionSpec interactionSpec) throws DataStoreAdapterException {
		PreparedStatement pstmt = null;
		try {
			pstmt = prepareStatement(connection,"DELETE FROM INFORMIX.OPERATORS  WHERE OPERATOR_ = ?");

			// For column OPERATOR_
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(5);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.DECIMAL);
			}
			if (pstmt.executeUpdate()==0)
				throw new DataStoreAdapterException("DSA_ERROR",new javax.ejb.NoSuchEntityException(), this.getClass());

		}
		catch (SQLException e) {
			throw new DataStoreAdapterException("DSA_ERROR", e ,this.getClass());
		}
		finally {
			try {
				if(pstmt != null) {
					returnPreparedStatement(connection, pstmt);
				}
			}
			catch (SQLException ignored)
			{}
		}
	}
	/**
	 * Store
	 */
	public void Store(IndexedRecord inputRecord, Object connection, WSInteractionSpec interactionSpec) throws DataStoreAdapterException {
		PreparedStatement pstmt = null;
		try {
			pstmt = prepareStatement(connection,"UPDATE INFORMIX.OPERATORS  SET MAN = ?, PASSWORD = ?, ISENABLED = ?, MSUCODE = ?, LOIGINID = ? WHERE OPERATOR_ = ?");

			// For column MAN
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.DECIMAL);
			}
			// For column PASSWORD
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(2,tempString);
				else
					pstmt.setNull(2,java.sql.Types.CHAR);
			}
			// For column ISENABLED
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.CHAR);
			}
			// For column MSUCODE
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(3);
				if(tempInteger != null)
					pstmt.setInt(4,tempInteger.intValue());
				else
					pstmt.setNull(4,java.sql.Types.DECIMAL);
			}
			// For column LOIGINID
			{
				String tempString;


				tempString=(String)inputRecord.get(4);
				if(tempString != null)
					pstmt.setString(5,tempString);
				else
					pstmt.setNull(5,java.sql.Types.CHAR);
			}
			// For column OPERATOR_
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(5);
				if(tempInteger != null)
					pstmt.setInt(6,tempInteger.intValue());
				else
					pstmt.setNull(6,java.sql.Types.DECIMAL);
			}
			if (pstmt.executeUpdate()==0)
				throw new DataStoreAdapterException("DSA_ERROR",new javax.ejb.NoSuchEntityException(), this.getClass());

		}
		catch (SQLException e) {
			throw new DataStoreAdapterException("DSA_ERROR", e ,this.getClass());
		}
		finally {
			try {
				if(pstmt != null) {
					returnPreparedStatement(connection, pstmt);
				}
			}
			catch (SQLException ignored)
			{}
		}
	}
	/**
	 * StoreUsingOCC
	 */
	public void StoreUsingOCC(IndexedRecord inputRecord, Object connection, WSInteractionSpec interactionSpec) throws DataStoreAdapterException {
		PreparedStatement pstmt = null;
		try {
			pstmt = prepareStatement(connection,"UPDATE INFORMIX.OPERATORS  SET MAN = ?, PASSWORD = ?, ISENABLED = ?, MSUCODE = ?, LOIGINID = ? WHERE OPERATOR_ = ?");

			// For column MAN
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.DECIMAL);
			}
			// For column PASSWORD
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(2,tempString);
				else
					pstmt.setNull(2,java.sql.Types.CHAR);
			}
			// For column ISENABLED
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.CHAR);
			}
			// For column MSUCODE
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(3);
				if(tempInteger != null)
					pstmt.setInt(4,tempInteger.intValue());
				else
					pstmt.setNull(4,java.sql.Types.DECIMAL);
			}
			// For column LOIGINID
			{
				String tempString;


				tempString=(String)inputRecord.get(4);
				if(tempString != null)
					pstmt.setString(5,tempString);
				else
					pstmt.setNull(5,java.sql.Types.CHAR);
			}
			// For column OPERATOR_
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(5);
				if(tempInteger != null)
					pstmt.setInt(6,tempInteger.intValue());
				else
					pstmt.setNull(6,java.sql.Types.DECIMAL);
			}
			IndexedRecord oldRecord = interactionSpec.getOldRecord();
			if (pstmt.executeUpdate()==0)
				throw new DataStoreAdapterException("DSA_ERROR",new javax.ejb.NoSuchEntityException(), this.getClass());

		}
		catch (SQLException e) {
			throw new DataStoreAdapterException("DSA_ERROR", e ,this.getClass());
		}
		finally {
			try {
				if(pstmt != null) {
					returnPreparedStatement(connection, pstmt);
				}
			}
			catch (SQLException ignored)
			{}
		}
	}
	/**
	 * FindByPrimaryKey
	 */
	public javax.resource.cci.Record FindByPrimaryKey(IndexedRecord inputRecord, Object connection, WSInteractionSpec interactionSpec) throws DataStoreAdapterException {
		PreparedStatement pstmt = null;
		ResultSet result=null;
		try {
			pstmt = prepareStatement(connection,"SELECT T1.MAN, T1.PASSWORD, T1.ISENABLED, T1.MSUCODE, T1.LOIGINID, T1.OPERATOR_ FROM INFORMIX.OPERATORS  T1 WHERE T1.OPERATOR_ = ?");

			// For column OPERATOR_
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.DECIMAL);
			}
			result = pstmt.executeQuery();

		}
		catch (SQLException e) {
			throw new DataStoreAdapterException("DSA_ERROR", e ,this.getClass());
		}
		return createCCIRecord(connection, result);
	}
	/**
	 * FindByPrimaryKeyForUpdate
	 */
	public javax.resource.cci.Record FindByPrimaryKeyForUpdate(IndexedRecord inputRecord, Object connection, WSInteractionSpec interactionSpec) throws DataStoreAdapterException {
		PreparedStatement pstmt = null;
		ResultSet result=null;
		try {
			pstmt = prepareStatement(connection,"SELECT T1.MAN, T1.PASSWORD, T1.ISENABLED, T1.MSUCODE, T1.LOIGINID, T1.OPERATOR_ FROM INFORMIX.OPERATORS  T1 WHERE T1.OPERATOR_ = ? FOR UPDATE ");

			// For column OPERATOR_
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.DECIMAL);
			}
			result = pstmt.executeQuery();

		}
		catch (SQLException e) {
			throw new DataStoreAdapterException("DSA_ERROR", e ,this.getClass());
		}
		return createCCIRecord(connection, result);
	}
	/**
	 * OperatorEJBBeanFunctionSet_f75441b3
	 */
	public OperatorEJBBeanFunctionSet_f75441b3() {
		functionHash=new java.util.HashMap(6);

		functionHash.put("Create",new Integer(0));
		functionHash.put("Remove",new Integer(1));
		functionHash.put("Store",new Integer(2));
		functionHash.put("StoreUsingOCC",new Integer(3));
		functionHash.put("FindByPrimaryKey",new Integer(4));
		functionHash.put("FindByPrimaryKeyForUpdate",new Integer(5));
	}
	/**
	 * execute
	 */
	public Record execute(WSInteractionSpec interactionSpec, IndexedRecord inputRecord, Object connection) throws javax.resource.ResourceException {
		String functionName=interactionSpec.getFunctionName();
		Record outputRecord=null;
		int functionIndex=((Integer)functionHash.get(functionName)).intValue();

		switch (functionIndex) {
		case 0:
			Create(inputRecord,connection,interactionSpec);
			break;
		case 1:
			Remove(inputRecord,connection,interactionSpec);
			break;
		case 2:
			Store(inputRecord,connection,interactionSpec);
			break;
		case 3:
			StoreUsingOCC(inputRecord,connection,interactionSpec);
			break;
		case 4:
			outputRecord=FindByPrimaryKey(inputRecord,connection,interactionSpec);
			break;
		case 5:
			outputRecord=FindByPrimaryKeyForUpdate(inputRecord,connection,interactionSpec);
			break;
		}
		return outputRecord;
	}
}
