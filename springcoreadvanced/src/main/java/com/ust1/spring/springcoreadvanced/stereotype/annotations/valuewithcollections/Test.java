package com.ust1.spring.springcoreadvanced.stereotype.annotations.valuewithcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcoreadvanced/stereotype/annotations/valuewithcollections/config.xml");
		Instructor instructor = (Instructor) ac.getBean("ins");
		System.out.println(instructor.hashCode());
		
		Instructor instructor2 = (Instructor) ac.getBean("ins");
		System.out.println(instructor2.hashCode());
	}

}
