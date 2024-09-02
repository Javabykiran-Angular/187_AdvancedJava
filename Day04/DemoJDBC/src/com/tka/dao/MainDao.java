package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Employee;

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
	
	public int updateEmployee(Employee emp) {
		
		String query="update employee set name=?, emailid=? where id=?";
		int status=0;
		
		try {
			openDB();
			
			pst= con.prepareStatement(query);
			pst.setString(1, emp.getName());
			pst.setString(2, emp.getEmailid());
			pst.setInt(3, emp.getId());
			status= pst.executeUpdate();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			clsoeDB();
		}
		return status;
		
	}
	
	public int deleteData(int id) {
		String query="delete from employee where id=?";
		int status=0;
		try {
			openDB();
			pst= con.prepareStatement(query);
			pst.setInt(1, id);
			status= pst.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			clsoeDB();
		}
		return status;
		
	}
	
	public List<Employee> getAllRecord() {
		String query="select * from employee";
		List<Employee> list=new ArrayList<Employee>();
		
		try {
			openDB();
			
			pst=con.prepareStatement(query);
			rst= pst.executeQuery();
			
			while(rst.next()) {
			
				Employee emp=new Employee();
				emp.setId(rst.getInt("id"));
				emp.setName(rst.getString("name"));
				emp.setEmailid(rst.getString("emailid"));
				emp.setMobileno(rst.getString("mobileno"));				
				list.add(emp);		
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			clsoeDB();
		}
		
		return list;
	}
	
	
	public Employee getParticularRecordById(int id) {
		String query="select * from employee where id=?";
		Employee emp=null;
		try {
			
			openDB();
			
			pst= con.prepareStatement(query);
			pst.setInt(1, id);
			rst= pst.executeQuery();
			
			while(rst.next()) {
				emp=new Employee();
				emp.setId(rst.getInt("id"));
				emp.setName(rst.getString("name"));
				emp.setEmailid(rst.getString("emailid"));
				emp.setMobileno(rst.getString("mobileno"));
				
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			clsoeDB();
			
		}
		return emp;
		
		
	}
	
	
	// Step 5 
	public void clsoeDB() {
		
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
