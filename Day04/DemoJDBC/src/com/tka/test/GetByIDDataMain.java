package com.tka.test;

import com.tka.dao.MainDao;
import com.tka.entity.Employee;

public class GetByIDDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainDao dao=new MainDao();
		Employee emp= dao.getParticularRecordById(3);
		
		if(emp==null) {
			System.out.println("Data is not available");
		}else {
			System.out.println(emp);
		}
		
		
		

	}

}
