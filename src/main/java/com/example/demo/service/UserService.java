package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Users;
import com.example.demo.repo.UserRepo;

@Component
public class UserService {
	@Autowired
	private UserRepo usersRepository;

    public List<Users> getUsers() {
    	System.out.println(usersRepository.findAll());
        return usersRepository.findAll();
    }

	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		return usersRepository.save(user);
	}

	public Users findById(String id) {
		// TODO Auto-generated method stub
		return usersRepository.findById(id);
	}

	
}
