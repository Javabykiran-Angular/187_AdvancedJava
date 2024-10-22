package com.tka.DemoMVC.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String emailid;
	private String mobileno;
	private String gender;
	private double salary;
	
	public Person() {
		
	}
	
	public Person(String name, String emailid, String mobileno, String gender, double salary) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.gender = gender;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", emailid=" + emailid + ", mobileno=" + mobileno + ", gender="
				+ gender + ", salary=" + salary + "]";
	}
	
	
	

}
