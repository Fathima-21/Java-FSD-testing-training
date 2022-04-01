package com.ust1.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
			ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcoreadvanced/injecting/interfaces/config.xml");
		OrderBO example=(OrderBO)ac.getBean("bo");
		example.placeOrder();
	}

}
