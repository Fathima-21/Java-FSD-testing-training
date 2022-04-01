package com.ust1.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("x")
public class OrderDAOImpl2 implements OrderDAO {
	public void createOrder() {
		System.out.println("inside OrderDAOImpl2 createOrder()");
	}

}
