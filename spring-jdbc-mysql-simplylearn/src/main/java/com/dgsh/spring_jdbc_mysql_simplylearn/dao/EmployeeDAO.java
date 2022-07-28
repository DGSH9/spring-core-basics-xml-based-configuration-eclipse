package com.dgsh.spring_jdbc_mysql_simplylearn.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.dgsh.spring_jdbc_mysql_simplylearn.to.Employee;

public class EmployeeDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager platformTransactionManager;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	public int addEmployee(Employee e) {
		int count = 0;
		String query = "insert into employee values(?,?,?,?)";
		count = jdbcTemplate.update(query,e.getEid(),e.getEname(),e.getAge(),e.getPassword());
		return count;
	}
	
	public List<Employee> getAllEmployees(){
		String sqlString = "select * from employee";
		@SuppressWarnings("unchecked")
		List<Employee> listmpEmployees = jdbcTemplate.query(sqlString, new EmployeeMapper());
		return listmpEmployees;
	}
	
	public List<Employee> getAllEmployeesOnAge(int age){
		String sqlString = "select * from employee where age = ?";
		@SuppressWarnings("unchecked")
		List<Employee> listmpEmployees = jdbcTemplate.query(sqlString, new EmployeeMapper(),age);
		return listmpEmployees;
	}
	
	public void performMultiActionEmployee(Employee e) {
		System.out.println();
		System.out.println("Performimg multiple action");
		TransactionDefinition td  =new DefaultTransactionDefinition();
		TransactionStatus ts = platformTransactionManager.getTransaction(td);
		try {
			String query = "insert into employee values(?,?,?,?)";
			int count = jdbcTemplate.update(query,e.getEid(),e.getEname(),e.getAge(),e.getPassword());
			System.out.println(count + "Record inerted");
			
			String sqlString = "select * from employee where Age =(select max(Age) from employee)";
			List<Employee> listmpEmployees = jdbcTemplate.query(sqlString, new EmployeeMapper());
			System.out.println("Max age  = " + listmpEmployees);
			platformTransactionManager.commit(ts);
		}
		catch (Exception ex) {
			System.out.println("Transaction Failed "+ ex);
			platformTransactionManager.rollback(ts);
		}
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public PlatformTransactionManager getPlatformTransactionManager() {
		return platformTransactionManager;
	}	

	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}
	
	
	
	
	
	
	
	
}
