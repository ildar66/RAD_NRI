/*
 * Created on 14.09.2007
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

import com.nri.custom.PeopleToNfsUserTO;
import com.nri.domain.NriObject;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class PeopleToNfsUserMapper extends JDBCMapper implements com.nri.mapping.PeopleToNfsUserMapper {
	private static final String FIND_SQL =
		"SELECT T1.personID, T1.idUserNRI, T1.flagMain, T2.login, T2.fullName, T2.recordStatus FROM nfs_lnkUser T1, nfs_users T2 WHERE T2.personID = T1.personID AND T1.idUserNRI = ? ";
	private static final String deleteLink_SQL = "DELETE FROM nfs_lnkUser WHERE idUserNRI = ? AND personID = ? ";
	private static final String addLink_SQL = "INSERT INTO nfs_lnkUser(idUserNRI, personID, flagMain) VALUES (?,?,?) ";
	private static final String clearMainLink_SQL = "UPDATE nfs_lnkUser SET flagMain ='N' WHERE idUserNRI = ? ";
	private static final String setMainLink_SQL = "UPDATE nfs_lnkUser SET flagMain ='Y' WHERE idUserNRI = ? AND personID = ? ";

	/**
	 * 
	 */
	public PeopleToNfsUserMapper() {
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
	 * @see com.nri.mapping.PeopleToNfsUserMapper#findPeopleToNfsUsers(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findPeopleToNfsUsers(Integer peopleKey, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		PeopleToNfsUserTO link = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(FIND_SQL);
		try {
			conn = getConnection();
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			PreparedStatement ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, peopleKey);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				link = activateTO(rs);
				list.add(link);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected PeopleToNfsUserTO activateTO(ResultSet rs) throws SQLException {
		PeopleToNfsUserTO to = new PeopleToNfsUserTO((Integer) rs.getObject(1), (Integer) rs.getObject(2));
		to.setFlagMain(rs.getString(3));
		to.setLogin(rs.getString(4));
		to.setFullName(rs.getString(5));
		to.setRecordStatus(rs.getString(6));
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
	 * @see com.nri.mapping.PeopleToNfsUserMapper#addLinkPeopleToNfsUser(java.lang.Integer, java.lang.Integer)
	 */
	public void addLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		String flagMain = "N";
		try {
			conn = getConnection();
			st = conn.prepareStatement(addLink_SQL);
			st.setInt(1, peopleKey.intValue());
			st.setInt(2, nfsUserKey.intValue());
			st.setString(3, flagMain);
			if (st.executeUpdate() != 1) {
				String err = "ADD nfs_lnkUser.personID(nfsUserKey)=" + nfsUserKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			if(se.getErrorCode() == -268){
				throw new MappingException(se, "ƒанна€ св€зь присутствует!");
			}
			throw new MappingException(se, "SQLException addLinkPeopleToNfsUser code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.PeopleToNfsUserMapper#deleteLinkPeopleToNfsUser(java.lang.Integer, java.lang.Integer)
	 */
	public void deleteLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(deleteLink_SQL);
			st.setInt(1, peopleKey.intValue());
			st.setInt(2, nfsUserKey.intValue());
			if (st.executeUpdate() != 1) {
				String err = "Delete nfs_lnkUser.personID(nfsUserKey)=" + nfsUserKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException deleteLinkPeopleToNfsUser code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.PeopleToNfsUserMapper#setMainLinkPeopleToNfsUser(java.lang.Integer, java.lang.Integer)
	 */
	public void setMainLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			//ощищаем гл. пользовател€:	
			st = conn.prepareStatement(clearMainLink_SQL);
			st.setInt(1, peopleKey.intValue());
			st.executeUpdate();
			//устанавливаем гл. пользовател€:
			st = conn.prepareStatement(setMainLink_SQL);
			st.setInt(1, peopleKey.intValue());
			st.setInt(2, nfsUserKey.intValue());
			if (st.executeUpdate() != 1) {
				String err = "setMainLink nfs_lnkUser.personID(nfsUserKey)=" + nfsUserKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException setMainLinkPeopleToNfsUser code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

}
