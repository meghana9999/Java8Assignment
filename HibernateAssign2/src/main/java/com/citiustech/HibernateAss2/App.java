package com.citiustech.HibernateAss2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.citiustech.model.Customer;
import com.citiustech.model.Locker;
import com.citiustech.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        
        Customer customer = new Customer("7001","William","17-05-1995","Kolkata","9876543210");
        Locker locker = new Locker("Loc101","small",1100);
        customer.setLocker(locker);
        
        Customer customer1 = new Customer("7002","Jones","17-05-1990","Hyderabad","8765432190");
        Locker locker1 = new Locker("Loc102","big",2200);
        customer1.setLocker(locker1);
        
        session.beginTransaction();
        session.save(customer);
        session.save(customer1);
        session.getTransaction().commit();
        session.close();
        
    }
}
