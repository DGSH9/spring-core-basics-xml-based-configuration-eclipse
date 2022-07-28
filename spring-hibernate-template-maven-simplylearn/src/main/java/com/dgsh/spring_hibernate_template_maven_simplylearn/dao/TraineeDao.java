package com.dgsh.spring_hibernate_template_maven_simplylearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.dgsh.spring_hibernate_template_maven_simplylearn.to.Trainee;

public class TraineeDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public Integer addTrainee(Trainee t) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		
		Integer integer = (Integer) session.save(t);
		session.getTransaction().commit();
		return integer;
		
	}
	
	public List<Trainee> getAllTrainee(){
		List<Trainee> trainees  = new ArrayList<Trainee>();
		trainees = hibernateTemplate.loadAll(Trainee.class);
		return trainees;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
