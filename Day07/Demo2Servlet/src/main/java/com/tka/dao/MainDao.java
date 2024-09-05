package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tka.entity.User;

public class MainDao {
	
	String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	String DB_URL = "jdbc:mysql://localhost:3306/187Batch";
	String DB_USER = "root";
	String DB_PASSWORD = "Sumit@123";
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rst=null;
	
	
	// Step 1 & 2
		public void openDB() {
			try {
			Class.forName(DB_DRIVER);
			
			 con= DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		public User login(User user) {
			String query=
		"select * from user where username=? and password=?";
			User u=null;
			try {
				openDB();
				pst= con.prepareStatement(query);
				pst.setString(1, user.getUsername());
				pst.setString(2, user.getPassword());
				rst= pst.executeQuery();
				
				while(rst.next()) {
					u=new User();
					u.setId(rst.getInt("id"));
					u.setUsername(rst.getString("username"));
					u.setPassword(rst.getString("password"));
				}
				
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				closeDB();
			}
			
			return u;
			
		}
		
		
		// Step 5 
		public void closeDB() {
			
			try {
			
				if(con!=null) {
					con.close();
				}
				
				if(rst!=null) {
					rst.close();
				}
				if(pst!=null) {
					pst.close();
				}
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	

}
