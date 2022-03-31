package com.ust1.spring.springcore.properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages cal=(CountriesAndLanguages) ac.getBean("cAndL");
		System.out.println(cal);// to string method is invoked automatically
	
}
}
		

	



