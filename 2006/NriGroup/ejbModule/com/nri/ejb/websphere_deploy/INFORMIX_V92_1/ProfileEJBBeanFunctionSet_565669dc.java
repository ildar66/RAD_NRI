package com.nri.ejb.websphere_deploy.INFORMIX_V92_1;

import com.ibm.websphere.rsadapter.WSInteractionSpec;
import com.ibm.ws.rsadapter.exceptions.DataStoreAdapterException;
import javax.resource.cci.Record;
import javax.resource.cci.IndexedRecord;
import java.sql.*;

/**
 * ProfileEJBBeanFunctionSet_565669dc
 */
public class ProfileEJBBeanFunctionSet_565669dc extends com.ibm.ws.rsadapter.cci.WSResourceAdapterBase implements com.ibm.websphere.rsadapter.DataAccessFunctionSet {
	private java.util.HashMap functionHash;
	/**
	 * Create
	 */
	public void Create(IndexedRecord inputRecord, Object connection, WSInteractionSpec interactionSpec) throws DataStoreAdapterException {
		PreparedStatement pstmt = null;
		try {
			pstmt = prepareStatement(connection,"INSERT INTO informix.profile (operatorid, key, name, type, num_value, str_value, date_value, key_type, modified) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

			// For column operatorid
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.INTEGER);
			}
			// For column key
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(2,tempString);
				else
					pstmt.setNull(2,java.sql.Types.CHAR);
			}
			// For column name
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.CHAR);
			}
			// For column type
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(3);
				if(tempInteger != null)
					pstmt.setInt(4,tempInteger.intValue());
				else
					pstmt.setNull(4,java.sql.Types.INTEGER);
			}
			// For column num_value
			{
				java.math.BigDecimal tempBigDecimal;


				tempBigDecimal=(java.math.BigDecimal)inputRecord.get(4);
				if(tempBigDecimal != null)
					pstmt.setBigDecimal(5,tempBigDecimal);
				else
					pstmt.setNull(5,java.sql.Types.DECIMAL);
			}
			// For column str_value
			{
				String tempString;


				tempString=(String)inputRecord.get(5);
				if(tempString != null)
					pstmt.setString(6,tempString);
				else
					pstmt.setNull(6,java.sql.Types.VARCHAR);
			}
			// For column date_value
			{
				java.sql.Timestamp tempTimestamp;


				tempTimestamp=(java.sql.Timestamp)inputRecord.get(6);
				if(tempTimestamp != null)
					pstmt.setTimestamp(7,tempTimestamp);
				else
					pstmt.setNull(7,java.sql.Types.TIMESTAMP);
			}
			// For column key_type
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(7);
				if(tempInteger != null)
					pstmt.setInt(8,tempInteger.intValue());
				else
					pstmt.setNull(8,java.sql.Types.INTEGER);
			}
			// For column modified
			{
				java.sql.Timestamp tempTimestamp;


				tempTimestamp=(java.sql.Timestamp)inputRecord.get(8);
				if(tempTimestamp != null)
					pstmt.setTimestamp(9,tempTimestamp);
				else
					pstmt.setNull(9,java.sql.Types.TIMESTAMP);
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
			pstmt = prepareStatement(connection,"DELETE FROM informix.profile  WHERE operatorid = ? AND key = ? AND name = ?");

			// For column operatorid
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.INTEGER);
			}
			// For column key
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(2,tempString);
				else
					pstmt.setNull(2,java.sql.Types.CHAR);
			}
			// For column name
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.CHAR);
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
			pstmt = prepareStatement(connection,"UPDATE informix.profile  SET type = ?, num_value = ?, str_value = ?, date_value = ?, key_type = ?, modified = ? WHERE operatorid = ? AND key = ? AND name = ?");

			// For column operatorid
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(7,tempInteger.intValue());
				else
					pstmt.setNull(7,java.sql.Types.INTEGER);
			}
			// For column key
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(8,tempString);
				else
					pstmt.setNull(8,java.sql.Types.CHAR);
			}
			// For column name
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(9,tempString);
				else
					pstmt.setNull(9,java.sql.Types.CHAR);
			}
			// For column type
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(3);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.INTEGER);
			}
			// For column num_value
			{
				java.math.BigDecimal tempBigDecimal;


				tempBigDecimal=(java.math.BigDecimal)inputRecord.get(4);
				if(tempBigDecimal != null)
					pstmt.setBigDecimal(2,tempBigDecimal);
				else
					pstmt.setNull(2,java.sql.Types.DECIMAL);
			}
			// For column str_value
			{
				String tempString;


				tempString=(String)inputRecord.get(5);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.VARCHAR);
			}
			// For column date_value
			{
				java.sql.Timestamp tempTimestamp;


				tempTimestamp=(java.sql.Timestamp)inputRecord.get(6);
				if(tempTimestamp != null)
					pstmt.setTimestamp(4,tempTimestamp);
				else
					pstmt.setNull(4,java.sql.Types.TIMESTAMP);
			}
			// For column key_type
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(7);
				if(tempInteger != null)
					pstmt.setInt(5,tempInteger.intValue());
				else
					pstmt.setNull(5,java.sql.Types.INTEGER);
			}
			// For column modified
			{
				java.sql.Timestamp tempTimestamp;


				tempTimestamp=(java.sql.Timestamp)inputRecord.get(8);
				if(tempTimestamp != null)
					pstmt.setTimestamp(6,tempTimestamp);
				else
					pstmt.setNull(6,java.sql.Types.TIMESTAMP);
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
			pstmt = prepareStatement(connection,"UPDATE informix.profile  SET type = ?, num_value = ?, str_value = ?, date_value = ?, key_type = ?, modified = ? WHERE operatorid = ? AND key = ? AND name = ?");

			// For column operatorid
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(7,tempInteger.intValue());
				else
					pstmt.setNull(7,java.sql.Types.INTEGER);
			}
			// For column key
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(8,tempString);
				else
					pstmt.setNull(8,java.sql.Types.CHAR);
			}
			// For column name
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(9,tempString);
				else
					pstmt.setNull(9,java.sql.Types.CHAR);
			}
			// For column type
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(3);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.INTEGER);
			}
			// For column num_value
			{
				java.math.BigDecimal tempBigDecimal;


				tempBigDecimal=(java.math.BigDecimal)inputRecord.get(4);
				if(tempBigDecimal != null)
					pstmt.setBigDecimal(2,tempBigDecimal);
				else
					pstmt.setNull(2,java.sql.Types.DECIMAL);
			}
			// For column str_value
			{
				String tempString;


				tempString=(String)inputRecord.get(5);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.VARCHAR);
			}
			// For column date_value
			{
				java.sql.Timestamp tempTimestamp;


				tempTimestamp=(java.sql.Timestamp)inputRecord.get(6);
				if(tempTimestamp != null)
					pstmt.setTimestamp(4,tempTimestamp);
				else
					pstmt.setNull(4,java.sql.Types.TIMESTAMP);
			}
			// For column key_type
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(7);
				if(tempInteger != null)
					pstmt.setInt(5,tempInteger.intValue());
				else
					pstmt.setNull(5,java.sql.Types.INTEGER);
			}
			// For column modified
			{
				java.sql.Timestamp tempTimestamp;


				tempTimestamp=(java.sql.Timestamp)inputRecord.get(8);
				if(tempTimestamp != null)
					pstmt.setTimestamp(6,tempTimestamp);
				else
					pstmt.setNull(6,java.sql.Types.TIMESTAMP);
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
			pstmt = prepareStatement(connection,"SELECT T1.operatorid, T1.key, T1.name, T1.type, T1.num_value, T1.str_value, T1.date_value, T1.key_type, T1.modified FROM informix.profile  T1 WHERE T1.operatorid = ? AND T1.key = ? AND T1.name = ?");

			// For column operatorid
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.INTEGER);
			}
			// For column key
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(2,tempString);
				else
					pstmt.setNull(2,java.sql.Types.CHAR);
			}
			// For column name
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.CHAR);
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
			pstmt = prepareStatement(connection,"SELECT T1.operatorid, T1.key, T1.name, T1.type, T1.num_value, T1.str_value, T1.date_value, T1.key_type, T1.modified FROM informix.profile  T1 WHERE T1.operatorid = ? AND T1.key = ? AND T1.name = ? FOR UPDATE ");

			// For column operatorid
			{
				Integer tempInteger;


				tempInteger=(Integer)inputRecord.get(0);
				if(tempInteger != null)
					pstmt.setInt(1,tempInteger.intValue());
				else
					pstmt.setNull(1,java.sql.Types.INTEGER);
			}
			// For column key
			{
				String tempString;


				tempString=(String)inputRecord.get(1);
				if(tempString != null)
					pstmt.setString(2,tempString);
				else
					pstmt.setNull(2,java.sql.Types.CHAR);
			}
			// For column name
			{
				String tempString;


				tempString=(String)inputRecord.get(2);
				if(tempString != null)
					pstmt.setString(3,tempString);
				else
					pstmt.setNull(3,java.sql.Types.CHAR);
			}
			result = pstmt.executeQuery();

		}
		catch (SQLException e) {
			throw new DataStoreAdapterException("DSA_ERROR", e ,this.getClass());
		}
		return createCCIRecord(connection, result);
	}
	/**
	 * ProfileEJBBeanFunctionSet_565669dc
	 */
	public ProfileEJBBeanFunctionSet_565669dc() {
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
