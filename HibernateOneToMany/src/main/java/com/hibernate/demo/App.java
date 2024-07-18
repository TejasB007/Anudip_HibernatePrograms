package com.hibernate.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Child;
import com.hibernate.demo.entity.Parent;

public class App 
{
    public static void main( String[] args )
    {
      
    	Configuration cfg =new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory=cfg.buildSessionFactory();
    	
    	Session session=sessionFactory.openSession();
    	
    	Transaction tr=session.beginTransaction();
    	
    	Parent parent1=new Parent();
     	parent1.setpId(1);
    	parent1.setpName("Amitabh");
    	
    	Child child1=new Child();
    	
    	child1.setcId(1);
    	child1.setcName("Abhishekh");
    	child1.setParent(parent1);
    	
    	Child child2=new Child();
    	child2.setcId(2);
    	child2.setcName("Abc");
    	child2.setParent(parent1);
    	
    	session.save(child1);
    	session.save(child2);
   
    	
    	ArrayList list =new ArrayList();
    	
    	list.add(child1);
    	list.add(child2);
    	parent1.setChild(list);
    	
    	session.save(parent1);
    	
    	
    	tr.commit();
    	
    	session.close();
    	
    	System.out.println("----");
    	
    }
}
