package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{
	
	@Query(value = "SELECT * FROM USERS u where u.id=:id ", nativeQuery = true)
	public Users findById(String id);

}
