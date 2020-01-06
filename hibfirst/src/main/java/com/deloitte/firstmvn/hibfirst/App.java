package com.deloitte.firstmvn.hibfirst;
import java.sql.Date;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.firstmvn.hibfirst.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
    	//----------------using without XML file ------------------------------//
    	Properties prop = new Properties();
    	prop.put("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
    	prop.put("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:orcl");
    	prop.put("hibernate.connection.username", "scott");
    	prop.put("hibernate.connection.password", "tiger");
    	prop.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
    	prop.put("hibernate.show_slq", "true");
    	Configuration cfg = new Configuration(); 
       cfg.addAnnotatedClass(Employee.class);
       cfg.addProperties(prop);
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Employee e = session.get(Employee.class, 101);
       if(e!=null)// for getting data from database
    	   System.out.println(e.getEname()+" "+e.getSalary()+ " "+e.getDoj());
       session.close();
       factory.close();
       
    }
}
       
       
       // Employee emp = new Employee(101,"Ajay Saxena",1000,new Date(2020,1,3)); // for inserting into database
     
      //Transaction trans = session.beginTransaction();// for inserting into database
      // session.save(emp);// for inserting into database
     //  trans.commit();// for inserting into database
       
    // for getting data from database
       
       
       
       /* Employee e = session.get(Employee.class, 101);
       if(e!=null)// for getting data from database
    	   System.out.println(e.getEname()+" "+e.getSalary()+ " "+e.getDoj());
       else
    	   System.out.println("Employee Id not found");*/
       
   /*    //For Modifying the employee
       Employee emp = session.get(Employee.class, 101);
       emp.setSalary(786);
       emp.setEname("NewName");
       Transaction trans = session.beginTransaction();
      // session.saveOrUpdate(emp);
       	trans.commit();*/
       
       //-------------for Deleting--------------------
       
       
      /* Employee e = session.get(Employee.class, 101);
       Transaction trans = session.beginTransaction();
       session.delete(e);
       trans.commit();
       session.close();
       factory.close();
       */

