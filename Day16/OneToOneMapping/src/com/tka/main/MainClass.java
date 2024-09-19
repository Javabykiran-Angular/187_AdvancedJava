package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop;
import com.tka.entity.Student;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Laptop.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		Laptop lap1=new Laptop("Dell");
		Laptop lap2=new Laptop("HP");
		Laptop lap3=new Laptop("Accer");
		Laptop lap4=new Laptop("MacOS");
		
//		Student stud=new Student("Sumit", "9960556397");
//		stud.setLaptop(lap4);
//		
//		Student stud=new Student("Spruha", "9960556397");
//		
//		Laptop l1= session.get(Laptop.class, 1);
//		stud.setLaptop(l1);
//		
//		session.persist(lap1);
//		session.persist(lap2);
//		session.persist(lap3);
//		session.persist(lap4);
		
//		session.persist(stud);
		
		Student s1= session.get(Student.class, 2);
		
		session.getTransaction().commit();
		session.close();
		System.out.println(s1);
		
		
		
		
		
		
		

	}

}
