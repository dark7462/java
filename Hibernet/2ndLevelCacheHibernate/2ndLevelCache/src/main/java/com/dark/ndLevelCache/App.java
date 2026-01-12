package com.dark.ndLevelCache;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args ){
    	Configuration conn = new Configuration().configure().addAnnotatedClass(hibernate.class);
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conn.getProperties()).build();
    	SessionFactory sf = conn.buildSessionFactory(reg);
    	Session session1 = sf.openSession();
    	Transaction tx = session1.beginTransaction();
    	
    	hibernate sample = session1.find(hibernate.class, 101); // instead of get that's deprecated use find (lasted)
    	/*
    		Old Hibernate way: session. get(Class, ID)
			Standard JPA way: session.find(Class, ID)
    	*/
    	System.out.println(sample);
    	
    	tx.commit();
    	Session session2 = sf.openSession();
    	tx = session2.beginTransaction();
    	
    	// this will not fire a sql quesry again 
    	hibernate sample2 = session1.find(hibernate.class, 101);
    	System.out.println(sample2);
    	
    	tx.commit();
    }
}