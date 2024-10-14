package com.tka.DatabaseDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.tka.DatabaseDemo.dao.MainDAO;
import com.tka.DatabaseDemo.entity.Person;

@Service
public class MainService {
	@Autowired
	MainDAO dao;
	
	public String addRecord(Person p) {
		String msg= dao.addRecord(p);
		return msg;
	}

	public String updateRecord(Person p, int id) {
		
		String msg= dao.updateRecord(p,id);
		
		return msg;
	}

	public String deleteRecord(int id) {
		
String msg= dao.deleteRecord(id);
		
		return msg;
	}

	public List<Person> getAllData() {
	
		List<Person> list= dao.getAllData();
		return list;
		
	}

	public Person getParticularRecordById(int id) {
		Person p= dao.getParticularRecordById(id);
		return p;		
	}

	public Person getParticularRecordByMobile(String mobileno) {
		Person p= dao.getParticularRecordByMobile(mobileno);
		return p;
	}

	public String loginCheck(Person p) {
		String msg=null;
		 Person person= dao.loginCheck(p);
		 
		 if(person==null) {
			 msg="Invalid User";
		 }else {
			 msg="Valid User";
		 }
		 
		return msg;
	}
	
	

}
