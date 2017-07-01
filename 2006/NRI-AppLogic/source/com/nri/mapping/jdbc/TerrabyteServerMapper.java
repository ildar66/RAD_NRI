/*
 * Created on 11.10.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nri.domain.NriObject;
import com.nri.domain.TerrabyteServer;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TerrabyteServerMapper extends JDBCMapper implements com.nri.mapping.TerrabyteServerMapper {
	protected static final String findAllSqlString =
		"SELECT id, location, description, host, port FROM tb_servers ";

	/**
	 * 
	 */
	public TerrabyteServerMapper() {
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
	 * @see com.nri.mapping.Mapper#insert(com.nri.domain.NriObject)
	 */
	public void insert(NriObject anObject) throws DuplicateKeyException, MappingException {
		throw new MappingException("insert not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.Mapper#findAll()
	 */
	public ArrayList findAll() throws MappingException {
		ArrayList list = new ArrayList();
		TerrabyteServer terrabyteServer = null;
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(findAllSqlString + " order by location ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				terrabyteServer = activate(rs);
				list.add(terrabyteServer);
			}
			return list;
		} catch (SQLException se) {
			return null;
		} finally {
			close(conn);
		}
	}
	
	protected TerrabyteServer activate(ResultSet rs) throws SQLException {
		TerrabyteServer people = new TerrabyteServer((Integer) rs.getObject(1));
		people.setLocation(rs.getString(2));
		people.setDescription(rs.getString(3));
		people.setHost(rs.getString(4));
		people.setPort((Integer) rs.getObject(5));
		return people;
	}	

}
