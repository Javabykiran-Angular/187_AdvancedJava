package com.tka.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class UpdateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();	
		//get the Record from DB
		Song song= session.get(Song.class, 1);		
		song.setArtist("arjitsingh");
		//Update the Record
		session.merge(song);
		session.getTransaction().commit();
		session.close();
		
		
		

	}

}
