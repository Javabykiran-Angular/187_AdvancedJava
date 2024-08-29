package com.tka.entity;

public class Employee {
	int id;
	String name;
	String emailid;
	String mobileno;
	
	public Employee() {
		
	}
	
	public Employee(String name, String emailid, String mobileno) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.mobileno = mobileno;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailid=" + emailid + ", mobileno=" + mobileno + "]";
	}
	
	
	

}
