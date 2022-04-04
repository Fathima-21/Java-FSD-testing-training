package com.ust1.spring.springcoreadvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO {
	
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
