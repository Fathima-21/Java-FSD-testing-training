package com.ust1.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("boi")
public class OrderBOImpl implements OrderBO{
	@Autowired
	@Qualifier("x")
	private OrderDAO dao;
	
	public void placeOrder() {
		System.out.println("inside OrderBO placeOrder()");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}
	
}
