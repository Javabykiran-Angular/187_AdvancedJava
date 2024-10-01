package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.entity.Country;
import com.tka.entity.Employee;
import com.tka.service.MyService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfiguration.class);
		
		//System.out.println("Application Started...");
		
//		Employee e1= context.getBean(Employee.class);
//		Employee e1= context.getBean("emp", Employee.class);
//		System.out.println(e1);
		
		Employee e2= context.getBean(Employee.class);
		System.out.println(e2);
		
		Country con= context.getBean(Country.class);
		System.out.println(con);
		
		MyService service= context.getBean(MyService.class);
		service.display();

	}

}
