package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;
import com.revature.repositories.UserRepository;

@Service
public class UserService {
	
	private UserRepository ur;
	
	public UserService (UserRepository ur) {
		super();
		this.ur = ur;
	}
	
	public List<User> getUsers(){
		return ur.findAll();
	}
	
	public User getByUsername(String username) {
		return ur.findUserByUsername(username);
	}
	
	
	public User addUser(User user) {
		return ur.save(user);
	}
	
	public User getUserById(int id) throws UserNotFoundException {
		User user = ur.findById(id).orElseThrow(() -> new UserNotFoundException());
		return user;
	}
	
	public User updateUser(User user) throws UserNotFoundException {
		return ur.save(user);
	}

}
