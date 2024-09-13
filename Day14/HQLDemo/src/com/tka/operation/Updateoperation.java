package com.tka.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.tka.entity.Song;

public class Updateoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="update Song set name=:myname where id=:myid";		
		 
		//Hibernate 6
				MutationQuery mQuery= session.createMutationQuery(hqlQuery);
				mQuery.setParameter("myname", "deshmera");
				mQuery.setParameter("myid", 3);
				int status=mQuery.executeUpdate();				
		
//		Hibernate 5
//		Query<Song> query= session.createQuery(hqlQuery, Song.class);
//		query.setParameter("myname", "deshmera");
//		query.setParameter("myid", 3);
//		int status= query.executeUpdate();
//		
		session.getTransaction().commit();
		session.close();
		if(status>0) {
			System.out.println("Data is updatated..");
		}else {
			System.out.println("Data is not updatated..");
		}
		
		
		
		

	}

}
