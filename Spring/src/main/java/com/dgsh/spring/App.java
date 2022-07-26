package com.dgsh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Vehicle obj1 = (Vehicle)context.getBean("c1");
        Vehicle obj2 = (Vehicle)context.getBean("b1");
        Vehicle obj3 = (Vehicle)context.getBean("t1");
        obj1.drive();
        obj2.drive();
        obj3.drive();
        
    }
}
