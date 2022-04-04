package com.ust1.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcore/constructorinjection/config.xml");
		Employee e = (Employee) ac.getBean("employee");
		System.out.println(e);
		// note- use c- schema
	}


}
