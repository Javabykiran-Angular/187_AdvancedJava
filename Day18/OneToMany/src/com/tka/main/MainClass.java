package com.tka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Address;

import com.tka.entity.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(User.class);
		config.addAnnotatedClass(Address.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		Address add1=new Address("Pune");
		Address add2=new Address("Mumbai");
		Address add3=new Address("Goa");
		
		List<Address> list=new ArrayList<Address>();
//		list.add(add1);
//		list.add(add2);
		
		Address addr= session.get(Address.class, 3);
		list.add(addr);
		
		User user=new User("Spruha");
		 user.setList(list);
		
//		session.persist(add1);
//		session.persist(add2);
//		session.persist(add3);
		
		session.persist(user);
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		

	}

}
