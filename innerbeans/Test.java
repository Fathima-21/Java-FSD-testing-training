package com.ust1.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ust1/spring/springcore/innerbeans/config.xml");
		Employee emp = (Employee) ac.getBean("employee");
		System.out.println(emp.hashCode());
		
		Employee emp2 = (Employee) ac.getBean("employee");
		System.out.println(emp2.hashCode());
		
		
	}

}
