package com.tka.test;

import com.tka.dao.MainDao;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainDao dao=new MainDao();
		int status= dao.deleteData(1);
		if(status>0) {
			System.out.println("Data is Deleted");
		}else{
			System.out.println("Data is not Deleted");
		}
		

	}

}
