package com.tka.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.tka.entity.Country;
import com.tka.entity.Employee;

@ComponentScan(basePackages = {"com.tka"})
public class Myconfiguration {

//	@Bean("emp")
//	@Scope("prototype")
//	public Employee getEmpObj() {
//		return new Employee();
//	}
	
//	
//	@Bean
//	public Country getCountryObj() {
//		return new Country();
//	}
	
}
