package com.dgsh.spring_di_ioc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dgsh.spring_di_ioc.to.Employee;
import com.dgsh.spring_di_ioc.to.Hello;

public class MyController 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Hello obj1 = (Hello)context.getBean("h1");
//        System.out.println(obj1.getMessage());
//        Hello obj2 = (Hello)context.getBean("h2");
//        System.out.println(obj2.getMessage());
//    	
//        
//        Employee employee = (Employee)context.getBean("e1");
//        System.out.println(employee);
//        System.out.println(employee.getEmployeeId());
//        System.out.println(employee.getEmployeeName());
        
        System.out.println("========Spacing========");
        Employee employee2 = (Employee)context.getBean("e2");
        System.out.println(employee2);
    	
    }
}
