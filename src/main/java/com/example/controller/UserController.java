package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.entity.User;
import com.example.service.SecurityService;
import com.example.service.UserService;


@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/hiringwheels/signup")
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		userService.save(user)
			return ResponseEntity.ok("User successfully Added !");
		
	}
	
	@PostMapping(value="/hiringwheels/signin")
	public ResponseEntity<Object> loginUser(@RequestBody HashMap<String,String> authDetails) throws UnAuthorizedUserException,UserNotFoundException{
		try {
			return new ResponseEntity<Object>(userService.signIn(authDetails.get("emailID"), authDetails.get("password")),HttpStatus.ACCEPTED);
		}catch(UnAuthorizedUserException ue) {
			return new ResponseEntity<Object>(new String("UnAuthorized User"),HttpStatus.UNAUTHORIZED);
		}catch(UserNotFoundException ufe) {
			return new ResponseEntity<Object>(new String("User Not Found"),HttpStatus.NOT_FOUND);
		}
	}
}