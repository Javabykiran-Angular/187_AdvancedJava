package com.tka.test;

import java.util.List;

import com.tka.dao.MainDao;
import com.tka.entity.Employee;

public class ListRecordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainDao dao=new MainDao();
		List<Employee> list= dao.getAllRecord();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		

	}

}
