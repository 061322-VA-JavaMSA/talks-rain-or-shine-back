package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;
import com.revature.services.UserService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://pomtreesbucket.s3-website-us-east-1.amazonaws.com"})
public class UserController {

	private UserService us;

	public UserController() {
		super();

	}

	@Autowired
	public UserController(UserService us) {
		super();
		this.us = us;
	}

	@GetMapping("/users")
	public List<User> getUsers(){
		return (List<User>) us.getUsers();
	}

	@PostMapping("/users")
	void addUser(@RequestBody User user) {
		us.addUser(user);
	}

	@PutMapping("/users")
	public User updateUser(@RequestBody User user) throws UserNotFoundException {
		return us.updateUser(user);
  }

}
