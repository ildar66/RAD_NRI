package com.hps.july.util;

import java.rmi.RemoteException;
import java.security.cert.X509Certificate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.NamingException;
import javax.sql.DataSource;


import com.hps.july.util.objects.Operator;
import com.ibm.websphere.security.CertificateMapFailedException;
import com.ibm.websphere.security.CertificateMapNotSupportedException;
import com.ibm.websphere.security.CustomRegistryException;
import com.ibm.websphere.security.EntryNotFoundException;
import com.ibm.websphere.security.NotImplementedException;
import com.ibm.websphere.security.PasswordCheckFailedException;
import com.ibm.websphere.security.Result;
import com.ibm.websphere.security.cred.WSCredential;


/**
 * @author divanov
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class JulyRegistry50 implements com.ibm.websphere.security.UserRegistry
{
	private Map properties;
	final private String ROOT_USER = "root";
	final private String ROOT_USER_ID = "0";
	final private String ROOT_USER_PASSWORD = "ujkjdjkjvrf";
	private final java.lang.String ROOT_USER_GROUP = "grp0";
	/**
	 * Constructor for CustomRegistry.
	 */
	public JulyRegistry50() {}

	/**
	 * @see com.ibm.websphere.security.UserRegistry#initialize(Properties)
	 */
	public void initialize(Properties props)
		throws CustomRegistryException, RemoteException
	{
        //System.out.println("intitialize security!");
		if (props == null){
			throw new IllegalArgumentException("Properties required");
		}
		
		properties = Collections.unmodifiableMap(props);
		//createPool();
	}

	protected Operator getOperator(Connection con, String operatorLogin) throws SQLException{
		ResultSet rs = null; PreparedStatement sel = null; 
		try {
			sel = con.prepareStatement( "select * from operators where loiginid=? and isenabled='Y'" );
			sel.setString( 1, operatorLogin );
			rs = sel.executeQuery();

			Operator operator = null;
				
			if (rs.next()){
				operator = new Operator();
				operator.setId(new Integer(rs.getInt("operator")));
				operator.setLogin(rs.getString("loiginid").trim());
				operator.setPassword(rs.getString("password").trim());
			}
			
			return operator;
		} catch (SQLException e){
			throw e;				
		} finally { 
			if (rs != null) { rs.close(); rs = null; }  
			if (sel != null) { sel.close(); sel = null; } 
		}
	}
	
	protected boolean checkOperatorRole(Connection con, String operatorLogin, String roleName) throws SQLException{
		ResultSet rs = null; PreparedStatement sel = null; 
		try {
			sel = con.prepareStatement( 
				"select o2r.role from operators operator, operators2roles o2r " +
				"where operator.isenabled='Y' and o2r.operator = operator.operator " +				"and TRIM(o2r.role) = ? and TRIM(operator.loiginid) = ? ");
			sel.setString( 1, roleName );
			sel.setString( 2, operatorLogin );
			rs = sel.executeQuery();
				
			if (rs.next()) return true;
//			logDebug("Check fail: operator " + operatorLogin + " is not in role " + roleName);
			return false;
			
		} catch (SQLException e){
			throw e;				
		} finally { 
			if (rs != null) { rs.close(); rs = null; }  
			if (sel != null) { sel.close(); sel = null; } 
		}
	} 

	protected String successCheckPassword(Connection con, String operatorLogin) throws SQLException{
		PreparedStatement sel = null;
		try {
			// «апомним врем€ последнего входа в систему
			sel = con.prepareStatement( "UPDATE operators SET lastlogintime = ? WHERE loiginid=?" );
			java.sql.Timestamp dt = new java.sql.Timestamp(new java.util.Date().getTime());
			sel.setTimestamp( 1, dt );
			sel.setString( 2, operatorLogin );
			sel.executeUpdate();
		} catch (SQLException e){
			throw e;
		} finally {
			if (sel != null) sel.close();
		}
		
		logInfo("Login to operator " + operatorLogin + " successfully");
		return operatorLogin;
	}

	public String checkPassword(String userId, String passwd)
		throws PasswordCheckFailedException, CustomRegistryException, RemoteException {

		// Check for special users to be away from database failures
		if (ROOT_USER.equals(userId)) {
			if (ROOT_USER_PASSWORD.equals(passwd)) {
				return userId;
			} else {
				throw new PasswordCheckFailedException(userId);
			}
		} 
			
		Connection con = null;
		try {
			con = getConnection();
			return checkPassword(con, userId, passwd);
		} catch (NamingException e) {
			logError("Exception while logging user: " + userId + ". Message: " + e.getMessage(), e);
			throw new CustomRegistryException(e.getMessage());
		} catch (SQLException e) {
			logError("Exception while logging user: " + userId + ". Message: " + e.getMessage(), e);
			throw new CustomRegistryException(e.getMessage());
		} finally {
			try {
				if (con != null) { con.close(); con = null; }
			} catch (SQLException e){
				logError("Exception while closing Connection: " + e.getMessage(), e);
			}
		}
				
	}
	
	public void logLoginAction(Connection con, Integer operatorId, Integer substitutionOperatorId) throws SQLException{
		PreparedStatement sel = null;
		try {
			sel = con.prepareStatement( "INSERT INTO loginlog (logintime, operatorid, activeoperatorid) " +				"VALUES (?,?,?)" );
			Timestamp dt = new Timestamp(new Date().getTime());
			sel.setTimestamp( 1, dt );
			sel.setInt( 2, operatorId.intValue() );
			sel.setInt( 3, substitutionOperatorId.intValue() );
			sel.executeUpdate();
		} catch (SQLException e){
			throw e;
		} finally {
			if (sel != null) sel.close();
		}
	}

	/**
	 * @see com.ibm.websphere.security.UserRegistry#checkPassword(String, String)
	 */
	public String checkPassword(Connection con, String userId, String passwd)
		throws PasswordCheckFailedException, CustomRegistryException, RemoteException {
		
		// проверка на логин под другим пользователем
		String substitutionUserId = null;
		
		// если логин имеет формат user1::user2 и пароль дл€ user1 правильный, 
		// и user1 имеет роль useOtherLogin то проходит логин под user2	
		Pattern pattern = Pattern.compile("^([a-zA-z0-9_]*)::([a-zA-z0-9_]*)$");
		Matcher matcher = pattern.matcher(userId);
		if (matcher.matches()){
			userId = matcher.group(1);
			substitutionUserId = matcher.group(2);
		}
			
		try {
			Operator operator = getOperator(con, userId);

			if (operator != null){
				// check password
				String cryptPasswd = SecurityUtils.encryptToMD5(passwd);
				// check password true
				if (cryptPasswd.equals(operator.getPassword())){
					
					// if found substitution mode check substitutionUser password
					if (substitutionUserId != null){
						// check substitutionUser password
						Operator substitutionOperator = getOperator(con, substitutionUserId);
						if (substitutionOperator != null &&
								checkOperatorRole(con, operator.getLogin(), "useOtherLogin")){
									
							// ѕользователь выполнил вход в систему под другим логином
							logLoginAction(con, operator.getId(), substitutionOperator.getId());
							return successCheckPassword(con, substitutionUserId); 
						}
						throw new PasswordCheckFailedException(userId);						
					} 
					
					// ѕользователь выполнил вход в систему
					logLoginAction(con, operator.getId(), operator.getId());
					return successCheckPassword(con, userId);
				}
			}

			throw new PasswordCheckFailedException(userId);					
		} catch (PasswordCheckFailedException e){
			throw e;
		} catch (Exception ex) {
			logError("Exception while logging user: " + userId + ". Message: " + ex.getMessage(), ex);
			throw new CustomRegistryException(ex.getMessage());
		} 
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#mapCertificate(X509Certificate[])
	 */
	public String mapCertificate(X509Certificate[] cert)
		throws
			CertificateMapNotSupportedException,
			CertificateMapFailedException,
			CustomRegistryException,
			RemoteException
	{
		if (cert == null) {
			return null;  // special case
		}

		String userName = null;
		X509Certificate cert1=null;
		if (cert.length <= 0) {
			throw new CertificateMapFailedException("Certificate not found");
		};
		cert1=cert[0]; 
	
		try {
		    // map the SubjectDN in the certificate to a userID.
		    userName = cert1.getSubjectDN().getName();
		} catch(Exception e) {
			e.printStackTrace();
		    throw new CertificateMapNotSupportedException(e.getMessage());
		}
	
		try {
		    getUniqueUserId(userName);
		} catch (EntryNotFoundException e) {
			e.printStackTrace();
		    throw new CertificateMapFailedException(e.getMessage());
		}
		return userName;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getRealm()
	 */
	public String getRealm() throws CustomRegistryException, RemoteException
	{
		return "July";
	}
	/**
	* Returns names of all the users in the registry.
	* @return a List of the names of all the users.
	* @exception CustomRegistryException if the registry is "bad".
	**/
	private List getUsersList() throws CustomRegistryException {
		List allUsers = new ArrayList();
		//System.out.println("GetUsers: start");
		try {
			// Add special user
			allUsers.add(ROOT_USER);
			
			// Get list of users from database
			try {
				
				Connection con = getConnection();
				PreparedStatement sel = con.prepareStatement( "select * from operators where " +
					"isenabled='Y'" );
				ResultSet rs = sel.executeQuery();
				while (rs.next()) {
					//System.out.println("GetUsers: adding userName = '" + rs.getString( "loiginid" ).trim() + "'");
					allUsers.add(rs.getString( "loiginid" ).trim());
				}
				try{ rs.close(); } catch( Throwable t ) {}
				try{ sel.close(); } catch( Throwable t ) {}
				try{ con.close(); } catch( Throwable t ) {}
				
			} catch (Exception ex) {
				System.out.println("Catch exception "+ex.getMessage());
				ex.printStackTrace(System.out);
				//throw new CustomRegistryException(ex.getMessage());
			}
		} catch (Exception ex) {
			throw new CustomRegistryException(ex.getMessage());
		} 
		return allUsers;
	}
	/**
	* Returns names of the users in the registry that match a pattern.
	* @param pattern the pattern to match. (For e.g., a* will match all
	* userNames starting with a). At a minimum when a full name is used
	* as the pattern the full name should be returned back if it is a
	* valid user.
	* @return a List of the names of all the users that match the pattern.
	* @exception CustomRegistryException if the registry is "bad".
	**/
	public Result getUsers(String pattern, int limit) throws CustomRegistryException {
		//System.out.println("GetUsersByPattern: start, pattern='" + pattern + "'");
		List allUsers = getUsersList();
		List patUsers = new ArrayList();
		Result res  = new Result();
		//int count = 0;
		for (Iterator i=allUsers.iterator(); i.hasNext();) {
			java.lang.String s = (java.lang.String)i.next();
			if (match(s, pattern)) {
				patUsers.add(s);
				//if(count >= limit) res.setHasMore();
			}
			//count++;
		}
		res.setList(allUsers);
		return res;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getUserDisplayName(String)
	 */
	public String getUserDisplayName(String userName)
		throws EntryNotFoundException, CustomRegistryException, RemoteException
	{
		String displayName = null;

		//System.out.println("GetUserDisplayName: start, userName = '" + userName + "'");
		
		if(!isValidUser(userName)) {
			EntryNotFoundException nsee = new EntryNotFoundException(userName);
			throw nsee;
		}

		if (true) return null;
		
		// Get list of users from database
		try {
			
			Connection con = getConnection();
			PreparedStatement sel = con.prepareStatement( "select * from operators o, people p where " +
				"p.man = o.man and o.loiginid=? and o.isenabled='Y'" );
			sel.setString( 1, userName);
			ResultSet rs = sel.executeQuery();
			if (rs.next())
				displayName = rs.getString( "lastname" ).trim() + " " + 
					rs.getString( "firstname" ).trim() + " " +
					rs.getString( "middlename" ).trim();
			try{ rs.close(); } catch( Throwable t ) {}
			try{ sel.close(); } catch( Throwable t ) {}
			try{ con.close(); } catch( Throwable t ) {}
			
		} catch (Exception ex) {
			System.out.println("Catch exception "+ex.getMessage());
			ex.printStackTrace(System.out);
			//throw new CustomRegistryException(ex.getMessage());
		}
		
		//System.out.println("GetUserDisplayName: end, displayName = '" + displayName + "'");
		return displayName;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getUniqueUserId(String)
	 */
	public String getUniqueUserId(String userName)
		throws EntryNotFoundException, CustomRegistryException, RemoteException
	{
		String uniqueUsrId = null;

		//System.out.println("GetUniqueUserId: start, userName = '" + userName + "'");
		// Check for special users
		if (ROOT_USER.equals(userName))
			uniqueUsrId = ROOT_USER_ID;
		else {
			try {
				
				Connection con = getConnection();
				PreparedStatement sel = con.prepareStatement( "select * from operators where " +
					"loiginid=? and isenabled='Y'" );
				sel.setString( 1, userName );
				ResultSet rs = sel.executeQuery();
				if (rs.next())
					uniqueUsrId = String.valueOf(rs.getInt( "operator" ));
				try{ rs.close(); } catch( Throwable t ) {}
				try{ sel.close(); } catch( Throwable t ) {}
				try{ con.close(); } catch( Throwable t ) {}
				
			} catch (Exception ex) {
				System.out.println("Catch exception "+ex.getMessage());
				ex.printStackTrace(System.out);
				//throw new CustomRegistryException(ex.getMessage());
			}
		}

		if (uniqueUsrId == null) {
			EntryNotFoundException nsee = new EntryNotFoundException(userName);
			throw nsee;
		}

		//System.out.println("GetUniqueUserId: end, userId = '" + uniqueUsrId + "'");
		return uniqueUsrId;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getUserSecurityName(String)
	 */
	public String getUserSecurityName(String uniqueUserId)
		throws EntryNotFoundException, CustomRegistryException, RemoteException
	{
		String usrSecName = null;

		//System.out.println("GetUserSecurityName: start, userId='" + uniqueUserId + "'");
		
		// Check for special users
		if (ROOT_USER_ID.equals(uniqueUserId))
		  usrSecName = ROOT_USER;
		else {
			try {
				
				Connection con = getConnection();
				PreparedStatement sel = con.prepareStatement( "select * from operators where " +
					"operator=? and isenabled='Y'" );
				sel.setInt( 1, Integer.parseInt(uniqueUserId) );
				ResultSet rs = sel.executeQuery();
				if (rs.next())
					usrSecName = rs.getString( "loiginid" ).trim();
				try{ rs.close(); } catch( Throwable t ) {}
				try{ sel.close(); } catch( Throwable t ) {}
				try{ con.close(); } catch( Throwable t ) {}
				
			} catch (Exception ex) {
				System.out.println("Catch exception "+ex.getMessage());
				ex.printStackTrace(System.out);
				//throw new CustomRegistryException(ex.getMessage());
			}
		}

		if (usrSecName == null) {
			EntryNotFoundException ex = new EntryNotFoundException(uniqueUserId);
			throw ex;
		}

		//System.out.println("GetUserSecurityName: end, userSecName='" + usrSecName + "'");
		return usrSecName;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#isValidUser(String)
	 */
	public boolean isValidUser(String userName)
		throws CustomRegistryException, RemoteException
	{
		boolean isValid = false;

		//System.out.println("IsValidUser: start, userName='" + userName + "'");
		
		// Check for special users
		if (ROOT_USER.equals(userName))
			isValid=true;
		else {
			// Check group in database
			try {
				
				Connection con = getConnection();
				PreparedStatement sel = con.prepareStatement( "select * from operators where " +
					"isenabled='Y'" );
				ResultSet rs = sel.executeQuery();
				if (rs.next()) {
					isValid = true;
				}
				try{ rs.close(); } catch( Throwable t ) {}
				try{ sel.close(); } catch( Throwable t ) {}
				try{ con.close(); } catch( Throwable t ) {}
				
			} catch (Exception ex) {
				System.out.println("Catch exception "+ex.getMessage());
				ex.printStackTrace(System.out);
				//throw new CustomRegistryException(ex.getMessage());
			}
		}

		//System.out.println("IsValidUser: end, isValid='" + isValid + "'");
		return isValid;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getGroups(String, int)
	 */
	public Result getGroups(String pattern,int limit)
		throws CustomRegistryException, RemoteException
	{
//        System.out.println("getGroups!");
		List allGroups = new ArrayList();

		//System.out.println("GetGroups: start");
		
		// Get groups from db
		try {
			
			Connection con = getConnection();
			PreparedStatement sel = con.prepareStatement( "select * from roles" );
			ResultSet rs = sel.executeQuery();
			while (rs.next()) {
				//System.out.println("GetGroups: adding group: '" + rs.getString( "role" ).trim() + "'");
				allGroups.add(rs.getString( "role" ).trim());
			}
			try{ rs.close(); } catch( Throwable t ) {}
			try{ sel.close(); } catch( Throwable t ) {}
			try{ con.close(); } catch( Throwable t ) {}
			
		} catch (Exception ex) {
			System.out.println("Catch exception "+ex.getMessage());
			ex.printStackTrace(System.out);
			//throw new CustomRegistryException(ex.getMessage());
		} 
		
		Result result = new Result();
		result.setList(allGroups);
		
		return result;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getGroupDisplayName(String)
	 */
	public String getGroupDisplayName(String groupName)
		throws EntryNotFoundException, CustomRegistryException, RemoteException
	{
		String displayName = null;

		//System.out.println("GetGroupDisplayName: start, name='" + groupName + "'");

		if(!isValidGroup(groupName)) {
			EntryNotFoundException nsee = new EntryNotFoundException(groupName);
			throw nsee;
		}

		if (true) return null;
		
		try {
			
			Connection con = getConnection();
			PreparedStatement sel = con.prepareStatement( "select * from roles where role=?" );
			sel.setString( 1, groupName );
			ResultSet rs = sel.executeQuery();
			if (rs.next())
				displayName = rs.getString( "rolename" ).trim();
			try{ rs.close(); } catch( Throwable t ) {}
			try{ sel.close(); } catch( Throwable t ) {}
			try{ con.close(); } catch( Throwable t ) {}
			
		} catch (Exception ex) {
			System.out.println("Catch exception "+ex.getMessage());
			ex.printStackTrace(System.out);
			//throw new CustomRegistryException(ex.getMessage());
		} 

		//System.out.println("GetGroupDisplayName: before return displayName = " + displayName);
		return displayName;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getUniqueGroupId(String)
	 */
	public String getUniqueGroupId(String groupName)
		throws EntryNotFoundException, CustomRegistryException, RemoteException
	{
		String uniqueGrpId = null;

		//System.out.println("GetUniqueGroupId: start, groupName='" + groupName + "'");
		uniqueGrpId = groupName;

		if (uniqueGrpId == null) {
			EntryNotFoundException nsee = new EntryNotFoundException(groupName);
			throw nsee;
		}

		return uniqueGrpId;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getUniqueGroupIds(String)
	 */
	public List getUniqueGroupIds(String uniqueUserId)
		throws EntryNotFoundException, CustomRegistryException, RemoteException
	{
		List uniqueGrpIds=new ArrayList();

		//System.out.println("GetUniqueGroupIds: start, userId = '" + uniqueUserId + "'");
		if (ROOT_USER_ID.equals(uniqueUserId)) {
			uniqueGrpIds.add(ROOT_USER_GROUP);
		} else {
	
			try {
				
				Connection con = getConnection();
				PreparedStatement sel = con.prepareStatement( "select * from operators2roles ro, operators o where " +
					"o.operator = ro.operator and ro.operator=? and o.isenabled='Y'" );
				sel.setInt( 1, Integer.parseInt(uniqueUserId) );
				ResultSet rs = sel.executeQuery();
				while (rs.next()) {
					//System.out.println("GetUniqueGroupIds: adding group: '" + rs.getString( "role" ).trim() + "'");	
					uniqueGrpIds.add(rs.getString( "role" ).trim());
				}
				try{ rs.close(); } catch( Throwable t ) {}
				try{ sel.close(); } catch( Throwable t ) {}
				try{ con.close(); } catch( Throwable t ) {}
				
			} catch (Exception ex) {
				System.out.println("Catch exception "+ex.getMessage());
				ex.printStackTrace(System.out);
				//throw new CustomRegistryException(ex.getMessage());
			}
		}
			
		return uniqueGrpIds;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getGroupSecurityName(String)
	 */
	public String getGroupSecurityName(String uniqueGroupId)
		throws EntryNotFoundException, CustomRegistryException, RemoteException
	{
		String grpSecName = null;

		//System.out.println("GetGroupSecurityName: start, grpId='" + uniqueGroupId + "'");
		grpSecName = uniqueGroupId;

		if (grpSecName == null) {
			EntryNotFoundException ex =	new EntryNotFoundException(uniqueGroupId);
			throw ex;
		}

		return grpSecName;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#isValidGroup(String)
	 */
	public boolean isValidGroup(String groupName)
		throws CustomRegistryException, RemoteException
	{
		boolean isValid = false;

		//System.out.println("IsValidGroup: start, grpName='" + groupName + "'");
		if (ROOT_USER_GROUP.equals(groupName)) {
			isValid = true;
		} else {

			// Check group in database
			try {
				
				Connection con = getConnection();
				PreparedStatement sel = con.prepareStatement( "select * from roles where " +
					"role=?" );
				sel.setString( 1, groupName);
				ResultSet rs = sel.executeQuery();
				if (rs.next()) {
					isValid = true;
				}
				try{ rs.close(); } catch( Throwable t ) {}
				try{ sel.close(); } catch( Throwable t ) {}
				try{ con.close(); } catch( Throwable t ) {}
				
			} catch (Exception ex) {
				System.out.println("Catch exception "+ex.getMessage());
				ex.printStackTrace(System.out);
				//throw new CustomRegistryException(ex.getMessage());
			}
		}

		//System.out.println("IsValidGroup: end, result='" + isValid + "'");
		return isValid;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getGroupsForUser(String)
	 */
	public List getGroupsForUser(String userName)
		throws EntryNotFoundException, CustomRegistryException, RemoteException
	{
		//System.out.println("GetGroupsForUser: start, username='" + userName + "'");
		List grpsForUser = new ArrayList();

		if (!isValidUser(userName)) {
			//System.out.println("GetGroupsForUser: user invalid");
			throw new EntryNotFoundException(userName);
		}
			
		//System.out.println("GetGroupsForUser: user valid");


		if (ROOT_USER.equals(userName)) {
			grpsForUser.add(ROOT_USER_GROUP);
		} else {
		
			try {
				
				Connection con = getConnection();
				PreparedStatement sel = con.prepareStatement( "select * from operators2roles ro, operators o where " +
					"ro.operator = o.operator and o.loiginid=? and o.isenabled='Y'" );
				sel.setString( 1, userName );
				ResultSet rs = sel.executeQuery();
				while (rs.next()) {
					//System.out.println("GetGroupsForUser: add group: '" + rs.getString( "role" ).trim() + "'");
					grpsForUser.add(rs.getString( "role" ).trim());
				}
				try{ rs.close(); } catch( Throwable t ) {}
				try{ sel.close(); } catch( Throwable t ) {}
				try{ con.close(); } catch( Throwable t ) {}
				
			} catch (Exception ex) {
				System.out.println("Catch exception "+ex.getMessage());
				ex.printStackTrace(System.out);
				//throw new CustomRegistryException(ex.getMessage());
			}
		}
		
		return grpsForUser;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#getUsersForGroup(String, int)
	 * @deprecated
	 */
	public Result getUsersForGroup(String groupName,int limit)
		throws
			NotImplementedException,
			EntryNotFoundException,
			CustomRegistryException,
			RemoteException
	{
		//System.out.println("GetUsersForGroup: start, grpName='" + groupName + "'");
		
		Result res = new Result();
		List usrsForGroup = new ArrayList();

		if (!isValidGroup(groupName)) {
			throw new EntryNotFoundException(groupName);
		}

		if (ROOT_USER_GROUP.equals(groupName)) {
			usrsForGroup.add(ROOT_USER);
		} else {
		
			// Get list of users from database
			try {
				
				Connection con = getConnection();
				PreparedStatement sel = con.prepareStatement( "select * from operators2roles ro, operators o where " +
					"ro.operator = o.operator and o.isenabled='Y' and role=?" );
				sel.setString( 1, groupName);
				ResultSet rs = sel.executeQuery();
				int count = 0;
				while (rs.next()) {
					//System.out.println("GetUsersForGroup: adding user: '" + rs.getString( "loiginid" ).trim() + "'");
					usrsForGroup.add(rs.getString( "loiginid" ).trim());
				}
				try{ rs.close(); } catch( Throwable t ) {}
				try{ sel.close(); } catch( Throwable t ) {}
				try{ con.close(); } catch( Throwable t ) {}
				
			} catch (Exception ex) {
				System.out.println("Catch exception "+ex.getMessage());
				ex.printStackTrace(System.out);
				//throw new CustomRegistryException(ex.getMessage());
			}
		}
		
		res.setList(usrsForGroup);

		return res;
	}
	/**
	 * @see com.ibm.websphere.security.UserRegistry#createCredential(String)
	 */
	public WSCredential createCredential(String arg0)
		throws
			NotImplementedException,
			EntryNotFoundException,
			CustomRegistryException,
			RemoteException
	{
		return null;
		//throw new NotImplementedException();
	}
/*	
	public static void main(String[] params) throws Exception{
		JulyRegistry50 registry = new JulyRegistry50();
		
		Properties properties = new Properties();
		properties.put("URL", "jdbc:db2:vc2");
		properties.put("DriverClass", "COM.ibm.db2.jdbc.app.DB2Driver");
		properties.put("UserName", "vc");
		properties.put("Password", "1111");
	
		registry.initialize(properties);
		
		String userName = params[0];
		String password = params[1];
		
		if (userName.equals(registry.checkPassword(userName, password))){
			System.out.println("username [" + userName + 
				"] with password[" + password + "] authenticated.");
		}
	}
*/	
	private boolean match(String name, String pattern) {
		JulyRegExp50 regexp = new JulyRegExp50(pattern);
		boolean matches = false;
		if(regexp.match(name))
			matches = true;
		return matches;
	}
	
	
	protected DataSource getDataSource() throws NamingException{
		/*
		Properties prp = getSessionContext().getEnvironment();
		String dsName = prp.getProperty("DATASOURCE_NAME");
		String providerURL = prp.getProperty("PROVIDER_URL");
		*/
		javax.naming.InitialContext ctx = null;
		//Properties prop = new Properties();
		//prop.put( javax.naming.Context.PROVIDER_URL, "iiop://" );
		//prop.put( javax.naming.Context.INITIAL_CONTEXT_FACTORY,
		//	"com.ibm.websphere.naming.WsnInitialContextFactory");
			//"com.ibm.ejs.ns.jndi.CNInitialContextFactory" );
		
		ctx = new javax.naming.InitialContext();

		DataSource ds = null;
		//problem with datasource in servlet version !!!
		//try to get datasource version 4.0
		try {
			ds = (DataSource)ctx.lookup( "julysec" );
		} catch(Exception e) {
			System.out.println("Error while getting Datasource 'julysec', cause " + e.getMessage());
			//e.printStackTrace();
		}
		//if exception try get Datasource version 5.0
		if(ds == null) {
			try {
				ds = (DataSource)ctx.lookup( "jdbc/july" );
			} catch(Exception e) {
				System.out.println("Error while getting Datasource 'jdbc/july', cause " + e.getMessage());
				//e.printStackTrace();
			}
		}

		return ds;
	}
	
	
	/**
		* ѕолучение соединени€ с базой данных пользователей
	*/
	private Connection getConnection() throws NamingException, SQLException {
		DataSource dataSource = getDataSource();

		Connection connection = dataSource.getConnection();
		connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		
/*		Class.forName("com.informix.jdbc.IfxDriver");
		Connection connection = DriverManager.getConnection("jdbc:informix-sqli://172.21.9.138:1541:informixserver=beeinf;database=july;DB_LOCALE=ru_RU.1251;CLIENT_LOCALE=ru_RU.1251;user=informix;password=djkr04");
		connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
*/
		return connection;
		
	}

	/**
	 * @param string
	 * @param le
	 */
	private void logError(String message, Throwable e) {
		log("ERROR", message, e);		
	}

	/**
	 * @param string
	 * @param message
	 * @param e
	 */
	private void log(String logStatus, String message, Throwable e) {
		if (e != null) {
			System.out.println(logStatus + " - " + this.getClass().getName() + ": " + message);
			e.printStackTrace();
		} else {
			//System.out.println(logStatus + " - " + this.getClass().getName() + ": " + message);
		}
	}

	/**
	 * @param string
	 * @param message
	 */
	private void log(String logStatus, String message) {
		log(logStatus, message, null);
	}

	/**
	 * @param string
	 */
	private void logInfo(String message) {
		log("INFO ", message);
	}

	/**
	 * @param string
	 */
	private void logDebug(Object message) {
		log("DEBUG", message.toString());
	}


}
