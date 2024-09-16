package com.tka.operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.entity.Song;

public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="from Song";
		Query<Song> query= session.createQuery(hqlQuery,Song.class);
		
		List<Song> list= query.list();
		session.getTransaction().commit();
		session.close();
		
		for (Song song : list) {
			System.out.println(song);
		}
		
		

	}

}
