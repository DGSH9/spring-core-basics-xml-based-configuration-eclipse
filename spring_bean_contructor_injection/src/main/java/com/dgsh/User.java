package com.dgsh;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "This is User";
	}
	
}
