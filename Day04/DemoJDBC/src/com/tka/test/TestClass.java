package com.tka.test;

import com.tka.dao.MainDao;
import com.tka.entity.Employee;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee("Kiran","kiran@gmail.com","9960556397");
		MainDao dao=new MainDao();
		int status= dao.insertData(emp);
		if(status>0) {
			System.out.println("Data insert successfully");
		}else {
			System.out.println("Data is not insert successfully");
		}
		

	}

}
