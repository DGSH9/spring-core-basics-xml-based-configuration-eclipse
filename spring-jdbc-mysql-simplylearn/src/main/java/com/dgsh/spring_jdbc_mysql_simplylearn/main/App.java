package com.dgsh.spring_jdbc_mysql_simplylearn.main;


import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dgsh.spring_jdbc_mysql_simplylearn.dao.EmployeeDAO;
import com.dgsh.spring_jdbc_mysql_simplylearn.to.Employee;



public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       EmployeeDAO employeeDAO = (EmployeeDAO)context.getBean("edao");
       
       
       //Create data into databases
       /*Employee e1 = new Employee();
       e1.setEid(107);
       e1.setEname("Ram");
       e1.setAge(60);
       e1.setPassword("Ram@123");
       
       int count = employeeDAO.addEmployee(e1);
       System.out.println("records added "+count);*/
       
       //Read data
       /*List<Employee> arr1 = employeeDAO.getAllEmployees();
       for (Employee i : arr1) {
		System.out.println(i);
       }*/
       
       
       
       //Multiple action
       /*Employee e1 = new Employee();
       e1.setEid(109);
       e1.setEname("Prince");
       e1.setAge(23);
       e1.setPassword("Prince@123");
       employeeDAO.performMultiActionEmployee(e1);*/
       
       
       
       
       
    }
}
