package com.springsecurity.main.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.main.entity.User;
import com.springsecurity.main.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;
	
	//Get all Users
	@GetMapping("/")
	public List<User> getAllUser() {
		return userServiceImpl.getAllUser();
	}
	
	//Return Single User
	@GetMapping("/{uname}")
	public User getSingleUser(@PathVariable String uname) {
		return userServiceImpl.getSingleUser(uname);
	}
	
	@PostMapping("/add")
	public User  addUser(@RequestBody User user) {
	 return	userServiceImpl.addUser(user);
	}
	
	//Getting the Current Loggedin User
	@GetMapping("/current-user")
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
