package com.ust1.spring.springcoreadvanced.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcoreadvanced/propertyplaceholder/config.xml");
		MyDAO example=(MyDAO) ac.getBean("myDAO");
		System.out.println(example);
	}

}
