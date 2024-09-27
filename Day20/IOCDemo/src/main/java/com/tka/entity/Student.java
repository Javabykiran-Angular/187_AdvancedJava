package com.tka.entity;

public class Student {
	
	int id;
	String name;
	
	public Student() {
		
	}
	
	public Student(String name) {
		super();
		this.name = name;
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
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//	}
	
	

}
