package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Sample {
	
	@GetMapping("/")
	String Test()
	{
		return "Jenkins Build Test";
	}

}
