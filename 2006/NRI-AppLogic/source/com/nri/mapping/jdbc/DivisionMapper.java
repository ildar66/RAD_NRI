/*
 * Created on 31.07.2007
 *
 * MapperImp подразделений предприятия.
 */
package com.nri.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nri.domain.Division;
import com.nri.domain.DivisionType;
import com.nri.domain.NriObject;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchDivisionException;
import com.nri.util.ApplProperties;

/**
 * @author IShaffigulin
 *
 * MapperImp подразделений предприятия.
 */
public class DivisionMapper extends JDBCMapper implements com.nri.mapping.DivisionMapper {
	protected static final String findByNameSqlString =
		"SELECT division, type, encloser, name, shortName, boss, company, isActive FROM " + ApplProperties.getDatasourceSchema() + ".divisions WHERE LOWER(name) matches LOWER(?)";
	protected static final String findSqlString =
		"SELECT division, type, encloser, name, shortName, boss, company, isActive FROM " + ApplProperties.getDatasourceSchema() + ".divisions WHERE 1=1 ";

	/**
	 * 
	 */
	public DivisionMapper() {
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
	 * @see com.nri.mapping.DivisionMapper#findById(java.lang.Integer)
	 */
	public Division findById(Integer id) throws MappingException {
		throw new NoSuchDivisionException("findById not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findByName(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findByName(String name, Integer company, Boolean isActive, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		Division division = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByNameSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			int next = 1;
			if (isActive != null) {
				sb.append(" AND isActive = ? ");
			}
			if (company != null) {
				sb.append(" AND company = ? ");
			}
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setString(next++, name);
			if (isActive != null) {
				ps.setString(next++, (isActive.equals(Boolean.TRUE) ? "Y" : "N"));
			}
			if (company != null) {
				ps.setObject(next++, company);
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				division = activate(rs);
				list.add(division);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected Division activate(ResultSet rs) throws SQLException {
		Boolean isActive = "Y".equals(rs.getString(8)) ? Boolean.TRUE : Boolean.FALSE;
		Division division = new Division((Integer) rs.getObject(1), DivisionType.factory(rs.getString(2)), rs.getString(4).trim(), isActive);
		division.setEncloser((Integer) rs.getObject(3));
		division.setShortName(rs.getString(5));
		division.setBoss((Integer) rs.getObject(6));
		division.setCompany((Integer) rs.getObject(7));
		return division;
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
	 * @see com.nri.mapping.DivisionMapper#findDivisionsHierarchy(java.lang.Integer, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		Division division = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			sb.append(" AND encloser = ? ");
			if (isActive != null) {
				sb.append(" AND isActive = ? ");
			}			
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, encloserKey);
			if (isActive != null) {
				ps.setString(2, (isActive.equals(Boolean.TRUE) ? "Y" : "N"));
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				division = activate(rs);
				list.add(division);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findByName(java.lang.String, java.lang.Integer, java.lang.Boolean, com.nri.domain.DivisionType, java.lang.String)
	 */
	public ArrayList findByName(String name, Integer company, Boolean isActive, DivisionType type, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		Division division = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByNameSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			int next = 1;
			if (isActive != null) {
				sb.append(" AND isActive = ? ");
			}
			if (company != null) {
				sb.append(" AND company = ? ");
			}
			if (type != null) {
				sb.append(" AND type = ? ");
			}			
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setString(next++, name);
			if (isActive != null) {
				ps.setString(next++, (isActive.equals(Boolean.TRUE) ? "Y" : "N"));
			}
			if (company != null) {
				ps.setObject(next++, company);
			}
			if (type != null) {
				ps.setObject(next++, type.getType());
			}			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				division = activate(rs);
				list.add(division);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.DivisionMapper#findDivisionHierarchyForEncloser(java.lang.Integer, int)
	 */
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws MappingException {
		throw new MappingException("findDivisionHierarchyForEncloser not valid for this type");
	}

}
