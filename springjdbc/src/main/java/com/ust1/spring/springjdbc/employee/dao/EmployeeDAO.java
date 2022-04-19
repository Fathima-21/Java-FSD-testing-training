package com.ust1.spring.springjdbc.employee.dao;

import java.util.List;

import com.ust1.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {
	int create(Employee emp);
	
	int update(Employee emp);
	
	int delete(Employee emp);
	
	Employee read(int id);
	
	List<Employee> read();

}
