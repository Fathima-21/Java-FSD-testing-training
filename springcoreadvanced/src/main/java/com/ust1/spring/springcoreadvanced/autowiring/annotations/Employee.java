package com.ust1.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//autowiring constructor
public class Employee {
/*
	Employee(Address address) {
		this.address=address;
	} */

	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired(required=false)
	@Qualifier("address5")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
