package com.tka.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id;
	@Value("Kiran")
	String name;
	
	@Autowired
	Country country;
	
	public Employee() {
		
	}
	
//	@Autowired
	public Employee(@Value("Spruha") String name, Country country) {
		super();
		this.name = name;
		this.country = country;
	}

	//@Autowired
	public Employee(@Value("Sumit") String name) {
		super();
		this.name = name;
	}
	public Employee(String name,int id) {
		super();
		this.name = name;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId1(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName1(String name) {
		this.name = name;
	}
	
	
	
	public Country getCountry() {
		return country;
	}

	//@Autowired 
	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
////	
	
	

}