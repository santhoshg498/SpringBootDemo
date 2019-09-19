package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(value="/gsk")
	public String hello() {
		return "Hello gsk welcome to spring boot";
	}

}
