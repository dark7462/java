package com.dark.demoHibernate;

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
public class App{
    public static void main( String[] args ){
    	hibernate renu = new hibernate();
        renu.setId(104);
        renu.setName("Harsh");
       
        Configuration conn = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(hibernate.class); 
        // configration for hibernate for JDBC 
        
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conn.getProperties()).build();
        
        SessionFactory sf = conn.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
//        session.persist(renu);    // .save() is changed to .persist()
        
        // to fetch data from data base
        hibernate sample = (hibernate)session.get(hibernate.class, 101);
        
        tx.commit();
        
        System.out.println(sample);
        
    }
}
