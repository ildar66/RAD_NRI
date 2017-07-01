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

import com.nri.custom.RegionAccessTO;
import com.nri.domain.NriObject;
import com.nri.domain.RegionAccess;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * MapperImp Права доступа по регионам.
 */
public class RegionAccessMapper extends JDBCMapper implements com.nri.mapping.RegionAccessMapper {
	private static final String findRegionAccessByOperator_SQL =
		"SELECT T1.accessid, T1.operatorid, T1.accesstype, T1.supregionid, T1.regionid, T1.viewplan, T1.viewfact, T1.editplan, T1.editfact, T1.viewarenda, T1.editarenda, T2.regname, T3.supregname, T2.hasArendaPurchaser "
			+ "FROM regionsaccess T1, regions T2, superregions T3  "
			+ "WHERE T1.accesstype = \'R\' AND  T1.regionid = T2.regionid  AND  T2.supregid = T3.supregid  AND  T1.operatorid = ? ";
	private static final String deleteRegionAccessByOperator_SQL = "DELETE FROM regionsaccess  WHERE accesstype = \'R\' AND operatorid = ? ";
	private static final String _createString =
		"INSERT INTO regionsaccess (accessid, editfact, editplan, viewfact, viewplan, viewarenda, editarenda, operatorid, regionid, accesstype) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	/**
	 * 
	 */
	public RegionAccessMapper() {
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

	/* (non-Javadoc)
	 * @see com.nri.mapping.RegionAccessMapper#findOperatorToRegionList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToRegionList(Integer operatorKey, String orderBy) throws MappingException {
		ArrayList ret = new ArrayList();
		Connection conn = null;
		try {
			conn = getConnection();
			StringBuffer sb = new StringBuffer(findRegionAccessByOperator_SQL);
			//append order by clause:
			if (orderBy != null && !orderBy.equals(""))
				sb.append(" order by " + orderBy);
			PreparedStatement ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, operatorKey);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				RegionAccess vo = activate(rs);
				RegionAccessTO to = new RegionAccessTO(vo);
				to.setRegionName(rs.getString(12));
				to.setSupRegName(rs.getString(13));
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

	protected RegionAccess activate(ResultSet rs) throws SQLException {
		RegionAccess regionAccess = new RegionAccess((Integer) rs.getObject(1));
		regionAccess.setOperatorId((Integer) rs.getObject(2));
		regionAccess.setRegionId((Integer) rs.getObject(5));
		regionAccess.setViewPlan(rs.getString(6));
		regionAccess.setViewFact(rs.getString(7));
		regionAccess.setEditPlan(rs.getString(8));
		regionAccess.setEditFact(rs.getString(9));
		regionAccess.setViewArenda(rs.getString(10));
		regionAccess.setEditArenda(rs.getString(11));
		return regionAccess;
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.RegionAccessMapper#findOperatorToRegionAccessList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperatorToRegionAccessList(Integer operatorKey, String orderBy) throws MappingException {
		ArrayList ret = new ArrayList();
		Connection conn = null;
		try {
			conn = getConnection();
			StringBuffer sb = new StringBuffer("SELECT reg.regionid, reg.regname, sreg.supregname FROM regions reg, superregions sreg ");
			sb.append(" WHERE reg.supregid = sreg.supregid AND reg.regionid NOT IN (SELECT regionid FROM regionsaccess WHERE accesstype = \'R\' AND operatorid = ?)");
			//append order by clause:
			if (orderBy != null && !orderBy.equals(""))
				sb.append(" order by " + orderBy);
			PreparedStatement ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, operatorKey);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Integer regionID = (Integer) rs.getObject(1);
				RegionAccess vo = new RegionAccess(null, operatorKey, regionID, "N", "N", "N", "N", "N", "N");
				RegionAccessTO to = new RegionAccessTO(vo);
				to.setRegionName(rs.getString(2));
				to.setSupRegName(rs.getString(3));
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
	 * @see com.nri.mapping.RegionAccessMapper#saveRegionAccessForOperator(java.lang.Integer, java.util.Collection)
	 */
	public void saveRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			//ощищаем доступ к регионам:
			st = conn.prepareStatement(deleteRegionAccessByOperator_SQL);
			st.setInt(1, operatorKey.intValue());
			st.executeUpdate();
			addRegionAccessList(operatorKey, accessList, conn);
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
	private void addRegionAccessList(Integer operatorKey, Collection accessList, Connection conn) throws SQLException, MappingException {
		PreparedStatement st;
		//устанавливаем доступ к регионам:
		java.util.Iterator iter = accessList.iterator();
		st = conn.prepareStatement(_createString);
		while (iter.hasNext()) {
			RegionAccess vo = (RegionAccess) iter.next();
			st.setInt(1, vo.getAccessId().intValue());
			st.setString(2, vo.getEditFact());
			st.setString(3, vo.getEditPlan());
			st.setString(4, vo.getViewFact());
			st.setString(5, vo.getViewPlan());
			st.setString(6, vo.getViewArenda());
			st.setString(7, vo.getEditArenda());
			st.setInt(8, vo.getOperatorId().intValue());
			st.setInt(9, vo.getRegionId().intValue());
			st.setString(10, "R");
			if (st.executeUpdate() != 1) {
				String err = "addRegionAccessList =" + operatorKey + " failed";
				throw new MappingException(err);
			}
		}
	}

}
