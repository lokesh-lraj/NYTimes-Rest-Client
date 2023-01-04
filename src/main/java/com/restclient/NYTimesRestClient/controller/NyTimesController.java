package com.restclient.NYTimesRestClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nytimes")
public class NyTimesController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!";
	}
}
