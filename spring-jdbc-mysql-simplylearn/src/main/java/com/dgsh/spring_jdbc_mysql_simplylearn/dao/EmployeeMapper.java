package com.dgsh.spring_jdbc_mysql_simplylearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dgsh.spring_jdbc_mysql_simplylearn.to.Employee;


public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEid(rs.getInt("Eid"));
		employee.setAge(rs.getInt("Age"));
		employee.setEname(rs.getString("Ename"));
		employee.setPassword(rs.getString("Password"));
		
		return employee;
	}
	
	
}
