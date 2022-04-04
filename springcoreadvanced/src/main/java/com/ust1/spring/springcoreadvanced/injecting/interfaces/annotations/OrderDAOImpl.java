package com.ust1.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("y")
public class OrderDAOImpl implements OrderDAO {
	public void createOrder() {
		System.out.println("inside OrderDAO createOrder()");
	}
	
	
	

}
