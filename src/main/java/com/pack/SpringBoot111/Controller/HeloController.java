package com.pack.SpringBoot111.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HeloController {
	@GetMapping("/hello")
	public String  getMessage() {
		return "HelloWorld from controller";
		
	}
}
