package com.ust1.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcoreadvanced/standalone/collections/config.xml");
		ProductsList pl = (ProductsList) ac.getBean("productsList");
		System.out.println(pl);
	}

}
