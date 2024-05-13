package com.Hibernate.Hibernate_1;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory=new Configuration().configure("com/Hibernate/Hibernate_1/hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
        
        StudentPersistent st= new StudentPersistent();
        st.setFirstName("Aditya");
        st.setLastName("Ganjave");
        session.save(st);
        
        Transaction tx=session.getTransaction();
        tx.commit();
        System.out.println(st);
       
        session.close();
        
        
        
    }
}
 