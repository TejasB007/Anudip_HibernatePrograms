package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       
    	Configuration cfg = new Configuration();
    	
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction tr= session.beginTransaction();
    	
    	Student std = new Student();
    	
    	std.setId(1);
    	std.setName("TejasB");
    	std.setAddress("Kop");
    	std.setPhno(942325752);
    	std.setMarks(78);
    	
    	  session.save(std);
          
          tr.commit();
          session.close();
          System.out.println("Student add hua");
    }
}
