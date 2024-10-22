package com.tka.DemoMVC.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DemoMVC.dao.MainDao;
import com.tka.DemoMVC.entity.Person;
import com.tka.DemoMVC.entity.User;

@Service
public class MainService {
	
	@Autowired
	MainDao dao;

	public String login(User user) {
		// TODO Auto-generated method stub
		
		User u= dao.login(user);
		String msg=null;
		if(Objects.isNull(u)) {
			msg="invalid user";
		}else {
			msg="valid user";
		}
		
		return msg;
	}

	public List<Person> geAllPersonRecord() {
		List<Person> list= dao.geAllPersonRecord();
		return list;
	}

}
