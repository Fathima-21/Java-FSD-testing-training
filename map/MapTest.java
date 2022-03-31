package com.ust1.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTest {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcore/map/mapconfig.xml");
		Customer cd=(Customer) ac.getBean("customer");
		System.out.println(cd);// toString() method is automatically invoked
		//System.out.println("Brands:"+cd.getProducts());

	}

}
