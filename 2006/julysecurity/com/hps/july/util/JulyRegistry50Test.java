package com.hps.july.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author dkrivenko
 */
public class JulyRegistry50Test {

	public static void main(String[] args) {
		Connection con = null;
		try {
			JulyRegistry50 registry = new JulyRegistry50();
			Class.forName("com.informix.jdbc.IfxDriver");
			con = DriverManager.getConnection(
				"jdbc:informix-sqli://172.21.9.137:1541:informixserver=infdata;database=july;DB_LOCALE=ru_RU.1251;CLIENT_LOCALE=ru_RU.1251;informixLockModeWait=60",
				"dimitry","m5q7%lgY");
			
			String result = registry.checkPassword(con, "vad", "vad01");
			System.out.println(result);
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
		}		
	}

}
