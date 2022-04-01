package com.ust1.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcoreadvanced/injecting/interfaces/annotations/config.xml");
		OrderBO example=(OrderBO) ac.getBean("boi");
		example.placeOrder();
		
	}

}
