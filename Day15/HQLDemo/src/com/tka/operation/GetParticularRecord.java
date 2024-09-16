package com.tka.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.entity.Song;

public class GetParticularRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		String hqlQuery="from Song where id=:id";
		Query<Song> query= session.createQuery(hqlQuery,Song.class);
		query.setParameter("id", 3);
		Song song= query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		System.out.println(song);
		
		

	}

}
