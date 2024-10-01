package com.tka.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id;
	String name;
	
	//Country country;
	
	public Employee() {
		
	}
	
	public Employee(String name) {
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
	
	
	
//	public Country getCountry() {
//		return country;
//	}
//
//	public void setCountry(Country country) {
//		this.country = country;
//	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
//	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
////	
	
	

}
