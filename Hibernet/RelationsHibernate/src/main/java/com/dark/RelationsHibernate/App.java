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
        Configuration conn = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conn.getProperties()).build();
        SessionFactory sf = conn.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        // work area
        Laptop laptop = new Laptop(5511,"dell");
        Student student = new Student(101,"Anurag",97,laptop);
        
        
       
        //save area
        session.persist(laptop);
        session.persist(student);
        
        
        // commit
        tx.commit();
        // Extras
        System.out.println(student);
    }
}
