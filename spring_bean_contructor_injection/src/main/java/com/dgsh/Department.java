package com.dgsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	
	@Autowired
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public void showDepartment() {
		System.out.println("This is Department " + user);
	}
	
	

}
