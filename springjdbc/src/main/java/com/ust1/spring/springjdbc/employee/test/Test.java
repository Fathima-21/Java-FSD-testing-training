package com.ust1.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust1.spring.springjdbc.employee.dao.EmployeeDAO;
import com.ust1.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ust1/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO dao = (EmployeeDAO) ac.getBean("empdaoimpl");
		Employee emp = new Employee();
		emp.setId(3);
		emp.setFirstname("Noobi");
		emp.setLastname("Asheer");
		//int createres=dao.create(emp);
		//System.out.println("NUmber of Records created:"+createres);
		//int updateres=dao.update(emp);
		//System.out.println("Number of Records updated:"+updateres);
		//int delres=dao.delete(emp);
		//System.out.println("Number of records deleted:"+delres);
		//Employee test=dao.read(2);
		//System.out.println(test);
		List<Employee> listofallemp = dao.read();
		System.out.println(listofallemp);
		

	}
	}


