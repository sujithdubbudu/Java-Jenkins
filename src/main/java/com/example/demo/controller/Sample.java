package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("api/v1")
public class Sample {
	
	@Autowired
	UserService userService;
	
	@Value("${spring.application.owner}")
	private String ownerName;
	
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
	
	@PostMapping("/save/users")
	@ResponseBody
	public Users SaveUser(@RequestBody Users user) {
		return userService.saveUser(user);
	}
	
    @GetMapping("/getUser/{id}")
    public Users findUserById(@PathVariable String id) {
		 Users user = userService.findById(id);
		 if(user==null)
			 throw new UserNotFoundException("User id: "+id+" not Found ");
		return user;
		 
    	
    }
    
    @GetMapping("/ownername")
	public String getOwnerName() {
		return ownerName;
	}
    
    

	
	

}
