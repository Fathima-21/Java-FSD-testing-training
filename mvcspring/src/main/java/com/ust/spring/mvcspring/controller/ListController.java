package com.ust.spring.mvcspring.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ust.spring.mvcspring.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Rahul");
		emp1.setSalary(45000);

		Employee emp2 = new Employee();
		emp2.setId(102);
		emp2.setName("Arun");
		emp2.setSalary(46000);

		Employee emp3 = new Employee();
		emp3.setId(103);
		emp3.setName("Parvathi");
		emp3.setSalary(50000);

		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);

		modelAndView.addObject("employeelist", emplist);
		return modelAndView;
	}

}
