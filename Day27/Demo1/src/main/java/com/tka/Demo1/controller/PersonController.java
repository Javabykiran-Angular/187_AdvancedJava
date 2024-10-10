package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Demo1.entity.Employee;

@RestController
@RequestMapping("personApi")
public class PersonController {
	
	@GetMapping("person")
	public String getAllRecord() {
		return "U r in person get All method";
	}
	@PostMapping("person")
	public String postRecord(@RequestBody Employee emp) {
		System.out.println(emp);
		return "U r in person postRecord method";
	}
	
	@PutMapping("person/{id}")
	public String updateRecord(@RequestBody Employee emp,@PathVariable int id) {
		System.out.println(emp);
		System.out.println(id);
		return "U r in person updateRecord method";
	}
	
	@DeleteMapping("person/{id}")
	public String deleteRecord(@PathVariable int id) {
		
		System.out.println(id);
		return "U r in person deleteRecord method";
	}
	
	@GetMapping("person/{id}")
	public Employee getParticularDataById(@PathVariable int id) {
		System.out.println("Id is "+id);
		Employee e=new Employee("Sumit");
		e.setId(9);
		return e;		
	}
	

}
