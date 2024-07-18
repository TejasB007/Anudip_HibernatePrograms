package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        
        Session session=sessionFactory.openSession();
        
        Transaction tr=session.beginTransaction();
        
        Employee emp=new Employee();
        
        Department deptt=new Department();
        
        emp.setId(03);
        emp.setName("ABC");
        emp.setDept("IT");
        emp.setSalary(100000);
        
        session.save(emp);
        
        tr.commit();
        session.close();
        
        System.out.println("Running successfully");
    }
}
