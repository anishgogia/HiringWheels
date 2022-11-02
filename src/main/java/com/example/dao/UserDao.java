package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
	User findByFirstname(String firstname);
	User findByLastname(String lastname);
    User findByPhn(String phn);
}
