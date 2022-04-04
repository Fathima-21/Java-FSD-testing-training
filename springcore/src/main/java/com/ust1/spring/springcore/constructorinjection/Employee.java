package com.ust1.spring.springcore.constructorinjection;

public class Employee {
	Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	private int id;

	private Address address;

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}
