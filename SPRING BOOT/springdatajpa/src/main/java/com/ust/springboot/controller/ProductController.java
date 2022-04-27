package com.ust.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.springboot.data.entities.Product;
import com.ust.springboot.data.repos.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping
	public Iterable<Product> getProducts()
	{
		return repository.findAll();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product)
	{
		return repository.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product)
	{
		return repository.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id)
	{
		Optional<Product> p=repository.findById(id);
		Product prod=p.get();
		return prod;
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id)
	{
		repository.deleteById(id);
	}

}