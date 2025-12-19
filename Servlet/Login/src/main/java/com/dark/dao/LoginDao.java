package com.dark.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	static String DBuser = "root";
	static String DBpass = "password";
	static String DBurl = "jdbc:mysql://localhost:3306/db";
	
	public static Boolean check(String user, String pass){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DBurl,DBuser,DBpass);
			
			String init = "select * from JDBC_users where username =? and password =? ;";
			PreparedStatement stm = conn.prepareStatement(init);
			
			stm.setString(1, user);
			stm.setString(2, pass);
			
			ResultSet rs = stm.executeQuery();
			
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("stmrs");
			e.printStackTrace();
		}
		return null;
	}
	public static Boolean register(String user,String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DBurl,DBuser,DBpass);
			
			String init = "insert into JDBC_users values (? , ?) ;";
			PreparedStatement stm = conn.prepareStatement(init);
			
			stm.setString(1, user);
			stm.setString(2, pass);
			
			stm.executeUpdate();
			//-------------------------
			init = "select * from JDBC_users where username =? and password =? ;";
			stm = conn.prepareStatement(init);
			
			stm.setString(1, user);
			stm.setString(2, pass);
			
			ResultSet rs = stm.executeQuery();
			
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("stmrs");
			e.printStackTrace();
		}
		return null;
	}
	
}
