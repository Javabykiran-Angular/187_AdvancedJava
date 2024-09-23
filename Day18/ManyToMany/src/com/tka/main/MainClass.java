package com.tka.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.tka.entity.Laptop11;

import com.tka.entity.Student11;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student11.class);
		config.addAnnotatedClass(Laptop11.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		Laptop11 lap1=new Laptop11("Dell");
		Laptop11 lap2=new Laptop11("HP");
		Laptop11 lap3=new Laptop11("Accer");
		
		List<Laptop11> list=new ArrayList<Laptop11>();
//		list.add(lap1);
//		list.add(lap2);
		
//		Laptop11 l= session.get(Laptop11.class, 3);
//		list.add(l);
//		
//		Student11 stud=new Student11("Spruha");
//		stud.setLapList(list);
		
//		session.persist(lap1);
//		session.persist(lap2);
//		session.persist(lap3);
		
//		session.persist(stud);
		
		Student11 s= session.get(Student11.class, 1);
		List<Laptop11> lapiList= s.getLapList();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(s);
		
		for (Laptop11 laptop11 : lapiList) {
			System.out.println(laptop11);
		}
		
		
		
		
		
		

	}

}
