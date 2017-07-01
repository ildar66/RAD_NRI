/*
 * Created on 25.08.2007
 *
 * MapperImp работника предприятия.
 */
package com.nri.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nri.custom.WorkerTO;
import com.nri.domain.NriObject;
import com.nri.domain.Worker;
import com.nri.exception.DuplicateKeyException;
import com.nri.exception.MappingException;
import com.nri.exception.NoSuchWorkerException;

/**
 * @author IShaffigulin
 *
 * MapperImp работника предприятия.
 */
public class WorkerMapper extends JDBCMapper implements com.nri.mapping.WorkerMapper {
	protected static final String findSqlString =
		"SELECT first 1000 w.worker, w.isActive, w.isServiceStuff, "
			+ "TRIM(p.lastName) || NVL(' ' || TRIM(p.firstName) || NVL(' ' || TRIM(p.middleName),''),'') fullName, "
			+ "TRIM(wp.name) wpName  "
			+ "FROM workers w, people p,  workPositions wp "
			+ "WHERE w.man = p.man AND w.workPosition = wp.workPosition ";

	/**
	 * 
	 */
	public WorkerMapper() {
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
	 * @see com.nri.mapping.WorkerMapper#findById(java.lang.Integer)
	 */
	public Worker findById(Integer id) throws MappingException {
		throw new NoSuchWorkerException("findById not valid for this type");
	}

	/* (non-Javadoc)
	 * @see com.nri.mapping.WorkerMapper#findByName(java.lang.String, java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findWorkers(Worker query, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		WorkerTO to = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			int next = 1;
			if (query.getIsActive() != null) {
				sb.append(" AND w.isActive = ? ");
			}			
			if (query.getDivision() != null) {
				sb.append(" AND w.division = ? ");
			}
			if (query.getCompany() != null) {
				sb.append(" AND w.company = ? ");
			}
			if (query.getMan() != null) {
				sb.append(" AND w.man = ? ");
			}
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());

			if (query.getIsActive() != null) {
				ps.setString(next++, (query.getIsActive().equals(Boolean.TRUE) ? "Y" : "N"));
			}
			if (query.getDivision() != null) {
				ps.setObject(next++, query.getDivision());
			}
			if (query.getCompany() != null) {
				ps.setObject(next++, query.getCompany());
			}
			if (query.getMan() != null) {
				ps.setObject(next++, query.getMan());
			}			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				to = activateWorkerTO(rs);
				list.add(to);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected WorkerTO activateWorkerTO(ResultSet rs) throws SQLException {
		WorkerTO to = new WorkerTO((Integer) rs.getObject(1));
		to.setIsActive(("Y".equals(rs.getString(2)) ? Boolean.TRUE : Boolean.FALSE));
		to.setIsServiceStuff(("Y".equals(rs.getString(3)) ? Boolean.TRUE : Boolean.FALSE));
		to.setFullNamePeople(rs.getString(4));
		to.setWorkPositionsName(rs.getString(5));
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
	 * @see com.nri.mapping.WorkerMapper#findWorkers(java.lang.String, com.nri.domain.Worker, java.lang.String)
	 */
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		WorkerTO to = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			int next = 1;
			if(name != null && name != "*"){
				sb.append(" AND LOWER(p.lastName) matches LOWER(?) ");
			}
			if (query.getIsActive() != null) {
				sb.append(" AND w.isActive = ? ");
			}			
			if (query.getDivision() != null) {
				sb.append(" AND w.division = ? ");
			}
			if (query.getCompany() != null) {
				sb.append(" AND w.company = ? ");
			}			
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			
			if(name != null && name != "*"){
				ps.setString(next++, name);
			}
			if (query.getIsActive() != null) {
				ps.setString(next++, (query.getIsActive().equals(Boolean.TRUE) ? "Y" : "N"));
			}
			if (query.getDivision() != null) {
				ps.setObject(next++, query.getDivision());
			}
			if (query.getCompany() != null) {
				ps.setObject(next++, query.getCompany());
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				to = activateWorkerTO(rs);
				list.add(to);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

}
