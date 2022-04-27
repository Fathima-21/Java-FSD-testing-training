package com.ust.springboot;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="01-keyboard-service",url="http://localhost:8080")
public interface BrandProxy {
	
	@GetMapping("/feign/keyboard/details")
	Keyboard getDetails();

}