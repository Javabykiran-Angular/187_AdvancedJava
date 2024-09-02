package com.tka.test;

import com.tka.dao.MainDao;
import com.tka.entity.Employee;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp.setName("sumit123");
		emp.setEmailid("sumit123@gmail.com");
		emp.setId(1);
		
		MainDao dao=new MainDao();
		int status= dao.updateEmployee(emp);
		if(status>0) {
			System.out.println("Data is Updated");
		}else{
			System.out.println("Data is not Updated");
		}
		
		

	}

}
