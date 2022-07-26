package com.dgsh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Vehicle obj1 = (Vehicle)context.getBean("car");
        Vehicle obj2 = (Vehicle)context.getBean("bike");
        obj1.drive();
        obj2.drive();

        
    }
}
