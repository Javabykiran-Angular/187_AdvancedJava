package com.tka.DatabaseDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@DeleteMapping("deleterecord/{id}")
	public String deleteRecord(@PathVariable int id) {
		//System.out.println(p);
		
		String msg= service.deleteRecord(id);
		return msg;
	}
	
	@GetMapping("getAll")
	public List<Person> getAllData() {
		 List<Person> list= service.getAllData();
		 return list;
	}
	
	@GetMapping("getParticularRecord/{id}")
	public Person getParticularRecordById(@PathVariable int id) {
		Person p= service.getParticularRecordById(id);
		return p;
	}
	
	@GetMapping("getParticularRecordByMobile")
	public Person getParticularRecordByMobile(@RequestParam String mobileno) {
		Person p= service.getParticularRecordByMobile(mobileno);
		return p;		
	}
	
	@PostMapping("login")
	public String loginCheck(@RequestBody Person p) {
		String msg= service.loginCheck(p);
		return msg;
		
	}
	
	

}
