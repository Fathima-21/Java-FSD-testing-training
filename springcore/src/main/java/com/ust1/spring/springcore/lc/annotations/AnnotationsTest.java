package com.ust1.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsTest {
	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcore/lc/annotations/annotationsconfig.xml");
		Patient p = (Patient) ac.getBean("patient");
		System.out.println(p);
		ac.registerShutdownHook();
	}

}
