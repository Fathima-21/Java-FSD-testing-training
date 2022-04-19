package com.ust1.spring.springorm1.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust1.spring.springorm1.product.dao.ProductDao;
import com.ust1.spring.springorm1.product.entity.Product;


import java.util.List;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ust1/spring/springorm1/product/test/config.xml");
		ProductDao pd = (ProductDao) ac.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		//product.setName("huawei");
		//product.setDesc("amazing phone");
		//product.setPrice(154);
		//pd.create(product);
		pd.update(product);
		//pd.delete(product);
		
		//Product prod=pd.find(1);
		//System.out.println(prod);
		
		//List<Product> findall = pd.findall();
		//System.out.println(findall);
	}
	}


