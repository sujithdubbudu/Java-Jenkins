package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("api/v1")
public class Sample {
	
	@Autowired
	UserService userService;
	
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
	
	@GetMapping("/users")
	@ResponseBody
	public List<Users> getUSers() {
		return userService.getUsers();
	}

	
	

}
