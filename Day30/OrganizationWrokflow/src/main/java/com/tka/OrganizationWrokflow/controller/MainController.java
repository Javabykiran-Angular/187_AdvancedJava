package com.tka.OrganizationWrokflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.OrganizationWrokflow.entity.Country;
import com.tka.OrganizationWrokflow.service.MainService;
import com.tka.OrganizationWrokflow.service.MainService;

@RestController
@RequestMapping("api")
public class MainController {
	
	@Autowired
	MainService service;
	
	@PostMapping("addcountry")
	public ResponseEntity<String> addCountry(@RequestBody Country c) {
		String msg= service.addCountry(c);
		return ResponseEntity.ok(msg);
	}
	
	@PutMapping("updatecountry/{id}")
	public ResponseEntity<String> updateCountry(@RequestBody Country c,@PathVariable int id){
		String msg= service.updateCountry(c,id);
		return ResponseEntity.ok(msg);
	}
	
	@DeleteMapping("deletecountry/{id}")
	public ResponseEntity<String> deleteCountry(@PathVariable int id){
		String msg= service.deleteCountry(id);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("getAllCountry")
	public ResponseEntity<List<Country>> getAllCountry(){
		
		List<Country> list=service.getAllCountry();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("getCountryById/{id}")
	public ResponseEntity<Country> getParticularCountryById(@PathVariable int id){
		Country con= service.getParticularCountryById(id);
//		return ResponseEntity.ok(con);
		return ResponseEntity.status(201).body(con);
	}
	
	
	
	
	
	
	
	
	

}