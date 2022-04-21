package com.ust.spring.mvcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ust.spring.mvcspring.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Rahul");
		emp.setSalary(45000);
		modelAndView.addObject("employee", emp);
		return modelAndView;
	}

}
