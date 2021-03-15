package com.homework.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HomeworkDB {
	private final static String CLASS_NAME = "org.mariadb.jdbc.Driver";
	private final static String URL = "jdbc:mariadb://localhost:3306/study";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "1234";
	
	static {
		try {
			Class.forName(CLASS_NAME);
			System.out.println("나 실행되면 문제없다.");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getCon() {
		try {
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement st) {
		if(st != null) {
			try {
				st.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}	
	}
	
	
	public static void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public static void close(Connection con, Statement st) {
		close(st);
		close(con);
	}
	
	public static void close(Connection con, Statement st, ResultSet rs) {
		close(rs);
		close(con, st);
	}
}
