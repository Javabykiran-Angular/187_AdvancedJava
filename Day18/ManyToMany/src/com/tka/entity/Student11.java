package com.tka.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student11 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "stud_lapi",joinColumns = {
			@JoinColumn(referencedColumnName = "id",name = "stud_id")
	} ,inverseJoinColumns = {
			@JoinColumn(referencedColumnName = "id",name = "lap_id")
	})
	List<Laptop11> lapList;
	
	public Student11() {
		
	}
	
	public Student11(String name) {
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
	
	
	
	public List<Laptop11> getLapList() {
		return lapList;
	}

	public void setLapList(List<Laptop11> lapList) {
		this.lapList = lapList;
	}

	@Override
	public String toString() {
		return "Student11 [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
