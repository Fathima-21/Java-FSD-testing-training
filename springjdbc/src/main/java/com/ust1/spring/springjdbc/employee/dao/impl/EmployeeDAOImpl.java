package com.ust1.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ust1.spring.springjdbc.employee.dao.EmployeeDAO;
import com.ust1.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.ust1.spring.springjdbc.employee.dto.Employee;
@Component("empdaoimpl")
public class EmployeeDAOImpl implements EmployeeDAO{
	@Autowired
	private JdbcTemplate jdbctemp;

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	public int create(Employee emp) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbctemp.update(sql, emp.getId(), emp.getFirstname(), emp.getLastname());
		return result;
	}
	public int update(Employee emp) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbctemp.update(sql, emp.getFirstname(), emp.getLastname(), emp.getId());
		return result;
	}
	public int delete(Employee emp) {
		String sql = "delete from employee where id=?";
		int result = jdbctemp.update(sql,emp.getId());
		return result;
	}
	public Employee read(int id) {
		String sql="Select * from employee where id=?";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		Employee employee = jdbctemp.queryForObject(sql, rowMapper, id);
		return employee;
	} 
	public List<Employee> read() {
		String sql="Select * from employee";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		List<Employee> result = jdbctemp.query(sql, rowMapper);
		return result;
	}
}
