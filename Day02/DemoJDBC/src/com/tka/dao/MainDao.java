package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.tka.entity.Employee;

public class MainDao {
	
	String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	String DB_URL = "jdbc:mysql://localhost:3306/187Batch";
	String DB_USER = "root";
	String DB_PASSWORD = "Sumit@123";
	Connection con=null;
	PreparedStatement pst=null;
	
	// Step 1 & 2
	public void openDB() {
		try {
		Class.forName(DB_DRIVER);
		
		 con= DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int insertData(Employee emp) {
		
		int status=0;
		
		String strQuery=
		"insert into employee(name,mobileno,emailid) values(?,?,?)";
		try {
			openDB();
		
			pst= con.prepareStatement(strQuery);
			pst.setString(1,emp.getName() );
			pst.setString(2, emp.getMobileno());
			pst.setString(3, emp.getEmailid());
			
			 status= pst.executeUpdate();			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			clsoeDB();
		}
		return status;
		
		
	}
	
	// Step 5 
	public void clsoeDB() {
		
		try {
		
			if(con!=null) {
				con.close();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}
