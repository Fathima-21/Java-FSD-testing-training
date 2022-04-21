package com.ust.spring.mvcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ust.spring.mvcspring.dto.Employee;

@Controller
public class RequestParamsController {
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value="sal",required=false,defaultValue="1000") double salary) {
		//System.out.println("ID:" + id);
		//System.out.println("Name:" + name);
		//System.out.println("Salary:" + salary);
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("displyDetailsInURL");
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		modelAndView.addObject(emp);
		return  modelAndView;
	}

}
