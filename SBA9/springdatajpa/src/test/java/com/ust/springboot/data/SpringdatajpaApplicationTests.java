package com.ust.springboot.data;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.ust.springboot.data.entities.Product;
import com.ust.springboot.data.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext ac;

	@Test
	void saveProduct() {
		ProductRepository repository = ac.getBean(ProductRepository.class);
		
		 Product product = new Product(); 
		  product.setId(1);
		  product.setName("iphone");
		  product.setDescription("This is an amazing phone"); 
		  product.setPrice(1200d);
		  repository.save(product);
		 
		 

		 Optional<Product> productOptional = repository.findById(1L);

		 //to return a particular row
		 /*
		  if(productOptional.isPresent())
		  {
			  Product result= productOptional.get();
			  //to update a particular row
			  result.setPrice(1500d);
			  repository.save(result);
			  System.out.println(result);
		  
		  }
		 */
		
		 //for returning a particular column of all the rows
		 // repository.findAll().forEach(p->{System.out.println(p.getPrice());});
		  
		 //for delete
		// repository.deleteById(1L);
		
		//custom finder method for name
		//System.out.println(repository.findByName("iphone"));
		
		//custom finder method for price
		//System.out.println(repository.findByPrice(900d));
		
		//custom finder method for multiple fields
		System.out.println(repository.findByNameAndPrice("oneplus",700d));
		
		

	}

}
