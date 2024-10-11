package com.tka.DatabaseDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.DatabaseDemo.entity.Person;
import com.tka.DatabaseDemo.service.MainService;

@RestController
@RequestMapping("personAPI")
public class MainController {
	
	@Autowired
	MainService service;
	
	@PostMapping("addrecord")
	public String addRecord(@RequestBody Person p) {
		System.out.println(p);
		
		String msg= service.addRecord(p);
		return msg;
	}
	
	@PutMapping("updaterecord/{id}")
	public String addRecord(@RequestBody Person p,@PathVariable int id) {
		//System.out.println(p);
		
		String msg= service.updateRecord(p,id);
		return msg;
	}

}
