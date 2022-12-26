package com.jojuskills.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static Session makeSession() {
	Configuration config=new Configuration();	
	
	config=config.configure("hibernate.cfg.xml");
	System.out.println("got a connection........"+config);
	
	SessionFactory sessionFactory=config.buildSessionFactory();
	System.out.println("session factory is ready"+sessionFactory);
	
	Session session= sessionFactory.openSession();
	
	return session;
	}
}

