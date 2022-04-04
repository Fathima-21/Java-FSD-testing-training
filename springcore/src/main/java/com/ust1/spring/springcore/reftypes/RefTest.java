package com.ust1.spring.springcore.reftypes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RefTest {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcore/reftypes/reftypesconfig.xml");
		Student s=(Student) ac.getBean("student");
		System.out.println(s);// to string method is invoked automatically

	}

}
