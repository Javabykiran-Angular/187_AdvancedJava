package com.tka.OrganizationWrokflow.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.OrganizationWrokflow.dao.MainDAO;
import com.tka.OrganizationWrokflow.entity.Country;
import com.tka.OrganizationWrokflow.entity.Employee;

@Service
public class MainService {
	@Autowired
	MainDAO dao;

	public String addCountry(Country c) {
		
		String msg= dao.addCountry(c);
		
		if(Objects.isNull(msg)) {
			msg="Country is Not addedd";
		}
				
		return msg;
	}

	public String updateCountry(Country c, int id) {
		String msg= dao.updateCountry(c,id);
		if(Objects.isNull(msg)) {
			msg="Country is not Updated";
		}
		return msg;
	}

	public String deleteCountry(int id) {
		
		String msg= dao.deleteCountry(id);
		if(Objects.isNull(msg)) {
			msg="Country is not Deleted";
		}
		return msg;

	}

	public List<Country> getAllCountry() {
		
		List<Country> list=dao.getAllCountry();		
		
		return list;
	}

	public Country getParticularCountryById(int id) {
		Country con= dao.getParticularCountryById(id);
		return con;
	}

	public String addEmployee(Employee emp) {
		String msg= dao.addEmployee(emp);
		if(Objects.isNull(msg)) {
			msg="Employee Addedd Successfully";
			
		}
		return msg;
		
	}

}
