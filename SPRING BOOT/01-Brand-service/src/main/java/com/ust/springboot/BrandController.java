package com.ust.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class BrandController {
	
	@Autowired
	BrandProxy proxy;

	@GetMapping("/keyboard/brand")
	public Brand getBrand()
	{
		Keyboard k=proxy.getDetails();
		return new Brand(k);
	}
	

}