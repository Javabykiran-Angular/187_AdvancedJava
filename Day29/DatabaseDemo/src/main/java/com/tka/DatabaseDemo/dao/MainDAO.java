package com.tka.DatabaseDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.DatabaseDemo.entity.Person;

@Repository
public class MainDAO {
	
	@Autowired
	SessionFactory factory;
	
	public String addRecord(Person p) {
		Session session= factory.openSession();
		session.beginTransaction();
		session.persist(p);
		session.getTransaction().commit();
		session.close();
		return "Data is Added Successfully";
		
	}

	public String updateRecord(Person p, int id) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		Person person= session.get(Person.class, id);
		person.setName(p.getName());
		person.setMobileno(p.getMobileno());
		
		session.merge(person);
		session.getTransaction().commit();
		session.close();
		
		return "Data is Updated successfully";
	}

	public String deleteRecord(int id) {
		Session session= factory.openSession();
		session.beginTransaction();
		Person p= session.get(Person.class, id);
		
		session.remove(p);
		session.getTransaction().commit();
		session.close();
		return "Data is Deleted successfully";
	}

	public List<Person> getAllData() {
		Session session= factory.openSession();
		session.beginTransaction();
		String hqlquery="from Person";
		Query<Person> query= session.createQuery(hqlquery,Person.class);
		List<Person> list= query.list();
		session.getTransaction().commit();
		session.close();
		return list;
		
	}

	public Person getParticularRecordById(int id) {
	
		Session session= factory.openSession();
		session.beginTransaction();
		Person p= session.get(Person.class, id);
		session.getTransaction().commit();
		session.close();
		return p;
		
	}

	public Person getParticularRecordByMobile(String mobileno) {		
		Session session= factory.openSession();		
		session.beginTransaction();
		String hqlQuery="from Person where mobileno=:mobile";
		
		Query<Person> query= session.createQuery(hqlQuery,Person.class);
		query.setParameter("mobile", mobileno);
		
		Person p= query.uniqueResult();
		session.getTransaction().commit();
		session.close();		
		return p;
	}

	public Person loginCheck(Person p) {
		Session session= factory.openSession();		
		session.beginTransaction();
		String hqlQuery="from Person where mobileno=:mobile and name=:name";
		
		Query<Person> query= session.createQuery(hqlQuery,Person.class);
		query.setParameter("mobile", p.getMobileno());
		query.setParameter("name", p.getName());
		
		Person person= query.uniqueResult();
		session.getTransaction().commit();
		session.close();		
		return person;
		
	}

}
