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
		return "Docker  Build Test";
	}
	
	@GetMapping("/camelCase")
	String myCamelCase()
	{
		return "String test= \"a b c d-e-f%g\";\r\n"
				+ "		String[] words = test.split(\"[\\\\W_]+\");\r\n"
				+ "		StringBuilder builder = new StringBuilder();\r\n"
				+ "		for (int i = 0; i < words.length; i++) {\r\n"
				+ "			String word = words[i];\r\n"
				+ "			if (i == 0) {\r\n"
				+ "				word = word.isEmpty() ? word : word.toLowerCase();\r\n"
				+ "			} else {\r\n"
				+ "				word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();\r\n"
				+ "			}\r\n"
				+ "			builder.append(word);\r\n"
				+ "		}\r\n"
				+ "		System.out.println(builder.toString());";
	}
	
	
	

}
