package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop1;
import com.tka.entity.Student1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student1.class);
		config.addAnnotatedClass(Laptop1.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
//		Laptop1 lap1=new Laptop1("Dell");
//		Laptop1 lap2=new Laptop1("HP");
//		Laptop1 lap3=new Laptop1("Accer");
//		Laptop1 lap4=new Laptop1("Mac");
		
//		session.persist(lap1);
//		session.persist(lap2);
//		session.persist(lap3);
//		session.persist(lap4);
		
		Laptop1 l1= session.get(Laptop1.class, 3);
		
		Student1 s=new Student1();
		s.setName("Pratik");
		s.setLaptop(l1);
		
		session.persist(s);		
		
		session.getTransaction().commit();
		session.close();
		

	}

}
