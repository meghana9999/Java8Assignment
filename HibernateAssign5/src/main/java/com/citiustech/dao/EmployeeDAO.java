package com.citiustech.dao;

import java.util.Comparator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.citiustech.model.Assets;
import com.citiustech.model.Employee;
import com.citiustech.util.HibernateUtil;

public class EmployeeDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	public void addEmployee(Employee emp) {
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();	
	}
	
	public void addAsset(Assets asset) {
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(asset);
		session.getTransaction().commit();	
	}
	
	public void deleteMovie() {
		//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    
	    Employee employee = session.get(Employee.class, "1001");
	    session.beginTransaction();
	    session.delete(employee);
	    session.getTransaction().commit();
	}
	
	public void updateMovie() {
		//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.getCurrentSession();
	     
		Employee employee = session.get(Employee.class, "1001");
		employee.setPassword("password");
			session.beginTransaction();
	       session.save(employee);
	       session.getTransaction().commit();
	}
	
	public Assets getAssetDetailsBasedOnId() {
		//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	     Session session = sessionFactory.openSession();
	     
		Assets assets= session.get(Assets.class, "1001");
		return assets;
	}
	
	public Assets getAssetsWithMaximumPrice() {
		return null;
	}
	
	public long countNumberOfEmployees() {
		//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	     Session session = sessionFactory.openSession();
	     
		Query employees = session.createQuery("from Employee");
		return employees.stream().count();
	}
	
	public List<Employee> getEmployeeDetails(){
		Session session = sessionFactory.openSession();
	     
		Query employees = session.createQuery("from Employee e order by e.empName");
		return (List<Employee>) employees;
	}
	
	public Employee getEmployeeDetailsBasedOnId() {
		//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	     Session session = sessionFactory.openSession();
	     
		Employee employee= session.get(Employee.class, "1001");
		Assets asset = session.get(Assets.class, employee.getAsset().getAssetId());
		return null;
	}
	
	public void getAverageAssetPrice() {
		Session session = sessionFactory.openSession();
		Query query= session.getNamedQuery("findAveragePriceForEachLocation");
		List<Assets> assets =query.getResultList();
	}
}
