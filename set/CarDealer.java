package com.ust1.spring.springcore.set;
import java.util.Set;

public class CarDealer {

	private String name;
	private Set<String> brands;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBrands() {
		return brands;
	}

	public void setBrands(Set<String> brands) {
		this.brands = brands;
	}

}
