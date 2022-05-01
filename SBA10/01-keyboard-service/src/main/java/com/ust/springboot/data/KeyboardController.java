package com.ust.springboot.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class KeyboardController {
	
	@GetMapping("keyboard/details")
	public Keyboard getDetails()
	{
		Keyboard k=new Keyboard();
		k.setId(1);
		k.setBrand("Yamaha");
		k.setPrice(50000);
		return k;
	}

}