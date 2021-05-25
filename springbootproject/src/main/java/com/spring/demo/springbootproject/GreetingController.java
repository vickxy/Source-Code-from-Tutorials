package com.spring.demo.springbootproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/greeting")
	public String gretting() {
		return "Hi Spring";
	}
}
