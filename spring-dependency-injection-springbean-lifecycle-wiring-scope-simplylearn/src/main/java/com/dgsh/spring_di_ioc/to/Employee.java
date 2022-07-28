package com.dgsh.spring_di_ioc.to;

public class Employee {
	
	private long employeeId;
	private String employeeName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public Employee(long employeeId, String employeeName) {
		
		super();
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		System.out.println("parameter constructor Argument Called...");
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	

}
