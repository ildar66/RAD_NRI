/*
 * Created on 31.07.2007
 *
 * Mapper Пользователь системы NFS.
 */
package com.nri.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nri.domain.NfsUser;
import com.nri.domain.NriObject;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.util.ApplProperties;

/**
 * @author IShaffigulin
 *
 * Mapper Пользователь системы NFS.
 */
public class NfsUserMapper extends JDBCMapper implements com.nri.mapping.NfsUserMapper {
	protected static final String FIND_SQL = "SELECT personID, idUserNFS, login, fullName, flagWorkNRI, recordStatus FROM " + ApplProperties.getDatasourceSchema() + ".nfs_users ";

	/**
	 * 
	 */
	public NfsUserMapper() {
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
	 * @see com.nri.mapping.NfsUserMapper#findByName(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findByName(String name, Boolean isActive, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		NfsUser nfsUser = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(FIND_SQL);
		sb.append(" WHERE upper(fullName) matches upper(?) ");
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (isActive != null) {
				sb.append(" AND recordStatus = ? ");
			}
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setString(1, name);
			if (isActive != null) {
				ps.setString(2, (isActive.equals(Boolean.TRUE) ? "A" : "D"));
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				nfsUser = activate(rs);
				list.add(nfsUser);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected NfsUser activate(ResultSet rs) throws SQLException {
		NfsUser nfsUser = new NfsUser((Integer) rs.getObject(1));
		nfsUser.setIdUserNFS((Integer) rs.getObject(2));
		nfsUser.setLogin(rs.getString(3));
		nfsUser.setFullName(rs.getString(4));
		nfsUser.setFlagWorkNRI(rs.getString(5));
		//nfsUser.setRecordStatus(("Y".equals(rs.getString(6)) ? Boolean.TRUE : Boolean.FALSE));
		nfsUser.setRecordStatus(rs.getString(6));

		return nfsUser;
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

}
