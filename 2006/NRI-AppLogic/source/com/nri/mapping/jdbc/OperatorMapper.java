/*
 * Created on 12.09.2007
 *
 * MapperImp операторов NRI.
 */
package com.nri.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nri.custom.OperatorTO;
import com.nri.domain.NriObject;
import com.nri.domain.Operator;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchOperatorException;

/**
 * @author IShaffigulin
 *
 * MapperImp операторов NRI.
 */
public class OperatorMapper extends JDBCMapper implements com.nri.mapping.OperatorMapper {

	/**
	 * 
	 */
	public OperatorMapper() {
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
	 * @see com.nri.mapping.OperatorMapper#findOperators(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findOperators(Integer peopleKey, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		OperatorTO to = null;
		Connection conn = null;
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT ");
		sql.append(" 	o.operator as operator, o.loiginID as loginID, o.isEnabled as isEnabled, ");
		sql.append(" 	m.msUser as msUser");
		sql.append(" FROM ");
		sql.append(" 	operators o, outer msUsers m ");
		sql.append(" WHERE ");
		sql.append("	m.msucode = o.msucode AND o.man = ? ");
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			int next = 1;
			if (orderBy != null && !orderBy.equals("")) {
				sql.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sql.toString());
			ps.setObject(next++, peopleKey);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				to = activateOperatorTO(rs);
				list.add(to);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findOperators code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected OperatorTO activateOperatorTO(ResultSet rs) throws SQLException {
		OperatorTO to = new OperatorTO((Integer) rs.getObject(1));
		to.setLoginID(rs.getString(2));
		to.setIsEnabled(("Y".equals(rs.getString(3)) ? Boolean.TRUE : Boolean.FALSE));
		to.setMsUser(rs.getString(4));
		return to;
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
	 * @see com.nri.mapping.OperatorMapper#findById(java.lang.Integer)
	 */
	public Operator findById(Integer id) throws MappingException {
		throw new NoSuchOperatorException("findById not valid for this type");
	}

}
