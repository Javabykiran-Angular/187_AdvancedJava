package com.tka.DatabaseDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
