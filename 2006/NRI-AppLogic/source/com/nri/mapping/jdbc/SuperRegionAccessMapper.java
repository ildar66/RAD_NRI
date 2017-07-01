/*
 * Created on 19.09.2007
 *
 * MapperImp Права доступа по регионам.
 */
package com.nri.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.nri.custom.SuperRegionAccessTO;
import com.nri.domain.NriObject;
import com.nri.domain.SuperRegionAccess;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * MapperImp Права доступа по регионам.
 */
public class SuperRegionAccessMapper extends JDBCMapper implements com.nri.mapping.SuperRegionAccessMapper {
	private static final String _createString =
		"INSERT INTO regionsaccess (accessid, editfact, editplan, viewfact, viewplan, operatorid, supRegionId, accesstype) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String findSuperRegionAccessByOperator_SQL =
		"SELECT T1.accessid, T1.operatorid, T1.supregionid, T1.viewplan, T1.viewfact, T1.editplan, T1.editfact, T3.supregname "
			+ "FROM regionsaccess T1, superregions T3  "
			+ "WHERE T1.accesstype = \'S\' AND  T1.supRegionId = T3.supregid  AND  T1.operatorid = ? ";
	private static final String deleteSuperRegionAccessByOperator_SQL = "DELETE FROM regionsaccess  WHERE accesstype = \'S\' AND operatorid = ? ";

	/**
	 * 
	 */
	public SuperRegionAccessMapper() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.jdbc.JDBCMapper#createImpl(java.sql.Connection, com.nri.domain.NriObject)
	 */
	protected Object createImpl(Connection conn, NriObject domainObject) throws SQLException, MappingException {
		throw new MappingException("createImpl not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.jdbc.JDBCMapper#findByPrimaryKeyImpl(java.sql.Connection, com.nri.domain.NriObject)
	 */
	protected NriObject findByPrimaryKeyImpl(Connection conn, NriObject domainObjectWithKeyValues) throws SQLException, MappingException {
		throw new MappingException("findByPrimaryKeyImpl not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.jdbc.JDBCMapper#removeImpl(java.sql.Connection, com.nri.domain.NriObject)
	 */
	protected void removeImpl(Connection conn, NriObject domainObject) throws SQLException, MappingException {
		throw new MappingException("removeImpl not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.jdbc.JDBCMapper#updateImpl(java.sql.Connection, com.nri.domain.NriObject)
	 */
	protected void updateImpl(Connection conn, NriObject anObject) throws SQLException, MappingException {
		throw new MappingException("updateImpl not valid for this type");
	}

	protected SuperRegionAccess activate(ResultSet rs) throws SQLException {
		SuperRegionAccess regionAccess = new SuperRegionAccess((Integer) rs.getObject(1));
		regionAccess.setOperatorId((Integer) rs.getObject(2));
		regionAccess.setSupRegionId((Integer) rs.getObject(3));
		regionAccess.setViewPlan(rs.getString(4));
		regionAccess.setViewFact(rs.getString(5));
		regionAccess.setEditPlan(rs.getString(6));
		regionAccess.setEditFact(rs.getString(7));
		return regionAccess;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		throw new MappingException("insert not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#findAll()
	 */
	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RegionAccessMapper#findOperatorToSuperRegionAccessList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy) throws MappingException {
		ArrayList ret = new ArrayList();
		Connection conn = null;
		try {
			conn = getConnection();
			StringBuffer sb = new StringBuffer("SELECT sreg.supRegId supRegionId, sreg.supregname FROM superregions sreg ");
			sb.append(" WHERE sreg.supregid NOT IN (SELECT supregionid FROM regionsaccess WHERE accesstype = \'S\' AND operatorid = ?)");
			//append order by clause:
			if (orderBy != null && !orderBy.equals(""))
				sb.append(" order by " + orderBy);
			PreparedStatement ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, operatorKey);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Integer supRegionID = (Integer) rs.getObject(1);
				SuperRegionAccess vo = new SuperRegionAccess(null, operatorKey, supRegionID, "N", "N", "N", "N");
				SuperRegionAccessTO to = new SuperRegionAccessTO(vo);
				to.setSupRegName(rs.getString(2));
				ret.add(to);
			}
			return ret;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findOperatorToRoleAccessList code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RegionAccessMapper#findOperatorToSuperRegionList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToSuperRegionList(Integer operatorKey, String orderBy) throws MappingException {
		ArrayList ret = new ArrayList();
		Connection conn = null;
		try {
			conn = getConnection();
			StringBuffer sb = new StringBuffer(findSuperRegionAccessByOperator_SQL);
			//append order by clause:
			if (orderBy != null && !orderBy.equals(""))
				sb.append(" order by " + orderBy);
			PreparedStatement ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, operatorKey);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SuperRegionAccess vo = activate(rs);
				SuperRegionAccessTO to = new SuperRegionAccessTO(vo);
				to.setSupRegName(rs.getString(8));
				ret.add(to);
			}
			return ret;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findOperatorToRoleList code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RegionAccessMapper#saveSuperRegionAccessForOperator(java.lang.Integer, java.util.Collection)
	 */
	public void saveSuperRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			//ощищаем доступ к регионам:
			st = conn.prepareStatement(deleteSuperRegionAccessByOperator_SQL);
			st.setInt(1, operatorKey.intValue());
			st.executeUpdate();
			addSuperRegionAccessList(operatorKey, accessList, conn);
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException saveRegionAccessForOperator code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/**
	 * 
	 * @param operatorKey
	 * @param accessList
	 * @param conn
	 * @throws SQLException
	 * @throws MappingException
	 */
	private void addSuperRegionAccessList(Integer operatorKey, Collection accessList, Connection conn) throws SQLException, MappingException {
		PreparedStatement st;
		//устанавливаем доступ к регионам:
		java.util.Iterator iter = accessList.iterator();
		st = conn.prepareStatement(_createString);
		while (iter.hasNext()) {
			SuperRegionAccess vo = (SuperRegionAccess) iter.next();
			st.setInt(1, vo.getAccessId().intValue());
			st.setString(2, vo.getEditFact());
			st.setString(3, vo.getEditPlan());
			st.setString(4, vo.getViewFact());
			st.setString(5, vo.getViewPlan());
			st.setInt(6, vo.getOperatorId().intValue());
			st.setInt(7, vo.getSupRegionId().intValue());
			st.setString(8, "S");
			if (st.executeUpdate() != 1) {
				String err = "addSuperRegionAccessList =" + operatorKey + " failed";
				throw new MappingException(err);
			}
		}
	}

}
