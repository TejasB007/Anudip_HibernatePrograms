package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       
    	Configuration cfg =new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory=cfg.buildSessionFactory();
    	
    	Session session=sessionFactory.openSession();
    	
    	Transaction tr=session.beginTransaction();
    	
    	Husband hs=new Husband();
    	
    	Wife wf=new Wife();
    	
    	hs.setHid(1);
    	hs.sethName("abc");
    	hs.setWife(wf);
    	
    	wf.setWid(1);
    	wf.setwName("pqr");
    	wf.setHusband(hs);
    	
    	session.save(wf);
    	session.save(hs);
    	
    	tr.commit();
    	session.close();
    	
    	System.out.println("Husband wife add hue");

    }
}
