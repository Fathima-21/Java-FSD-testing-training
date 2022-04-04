package com.ust1.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductsList {
	List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

	@Override
	public String toString() {
		return "ProductsList [productNames=" + productNames + "]";
	}

}
