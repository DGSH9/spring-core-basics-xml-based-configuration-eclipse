package com.dgsh.spring_hibernate_template_maven_simplylearn.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dgsh.spring_hibernate_template_maven_simplylearn.dao.TraineeDao;
import com.dgsh.spring_hibernate_template_maven_simplylearn.to.Trainee;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
    	TraineeDao traineeDao = (TraineeDao)context.getBean("edao");
    	
    	Trainee trainee = new Trainee("Neeraj",14,896857047);
    	System.out.println(traineeDao.addTrainee(trainee));
    	System.out.println("All Trainee are");
    	System.out.println(traineeDao.getAllTrainee());
    	
      
    }
}
