package com.dark.RelationsHibernate;

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
    public static void main( String[] args){
        Configuration conn = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AppObj.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conn.getProperties()).build();
        SessionFactory sf = conn.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        // work area
        
        AppObj obj = new AppObj(101,"Anurag");
        session.persist(obj);
        
        
        
        tx.commit();
        System.out.println(obj);
    }
}
