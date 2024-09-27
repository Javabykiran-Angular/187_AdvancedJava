package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.entity.Employee;
import com.tka.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
		
		
//		Employee e= context.getBean("emp", Employee.class);
//		System.out.println(e);
//		Employee e1= context.getBean("emp", Employee.class);
//		
//		System.out.println(e1);
		
		Student s1= context.getBean(Student.class);	
		System.out.println(s1);
		
		

	}

}
