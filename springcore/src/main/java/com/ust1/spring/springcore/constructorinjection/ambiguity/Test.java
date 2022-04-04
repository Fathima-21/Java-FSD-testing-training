package com.ust1.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition add = (Addition) ac.getBean("addition");
		System.out.println(add);
	}


}
