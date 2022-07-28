package com.dgsh.spring_di_ioc.to;

public class Hello {
	
	private String message;

	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hello(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Hello [message=" + message + "]";
	}
	

}
