package com.citiustech.HibernateAss5;

import com.citiustech.dao.EmployeeDAO;
import com.citiustech.model.Assets;
import com.citiustech.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EmployeeDAO dao = new EmployeeDAO();
        Employee emp = new Employee("meghana",1001,"abcd");
        Assets asset = new Assets(101,10001,1678,"Laptop",50000,"Hyderabad");
        emp.setAsset(asset);
        dao.addEmployee(emp);
        
        dao.getAssetDetailsBasedOnId();
        
        
    }
}
