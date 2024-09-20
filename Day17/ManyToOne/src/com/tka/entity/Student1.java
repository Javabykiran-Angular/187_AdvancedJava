package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	
	@ManyToOne
	Laptop1 laptop;
	
	public Student1() {
		
	}

	public Student1(String name) {
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

	public Laptop1 getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop1 laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	
	

}
