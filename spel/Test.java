package com.ust1.spring.springcoreadvanced.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcoreadvanced/spel/config.xml");
		Instructor instructor = (Instructor) ac.getBean("ins");
		System.out.println(instructor);
		System.out.println(Integer.MAX_VALUE);
	}


}
