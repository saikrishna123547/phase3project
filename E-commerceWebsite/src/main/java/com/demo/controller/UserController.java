package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.User;
import com.demo.mainService.UserService;

@RestController
public class UserController{
@Autowired 
public UserService userservice;
	public User authenticate(String userId, String pwd) {	
		return null;
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		
		return userservice.addUser(user);
	}

	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable long id) {
		
		return userservice.getUserById(id);
	}

	@GetMapping("/emailid")
	public User getUserByEmailId(@PathVariable  String emailId) {
		
		return userservice.getUserByEmailId(emailId);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		
		return userservice.updateUser(user);
	}
@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return userservice.getAllUsers();
	}

}
