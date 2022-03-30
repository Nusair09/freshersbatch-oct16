package com.springsecurity.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/admin")
	public String hello() {
		return "Hello World!!";
	}
	
	@GetMapping("/")
	public String user() {
		return "Hello User";
	}
}
