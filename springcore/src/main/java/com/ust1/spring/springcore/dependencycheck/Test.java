package com.ust1.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcore/dependencycheck/config.xml");
		Prescription p = (Prescription) ac.getBean("prescription");
		System.out.println(p);

	}

}
