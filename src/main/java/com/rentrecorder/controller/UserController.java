package com.rentrecorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rentrecorder.model.User;
import com.rentrecorder.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String defaultMessage() {
		return "You are in Rent recorder app";
	}

	@RequestMapping("/sayhi")
	public String sayHello() {
		System.out.println("Calling hello()");
		return "Hi";
	}
	
	@RequestMapping("/users")
	public List<User> getUsers() {
		return userService.getUsersList();
	}
	
	@RequestMapping("/users/{id}")
	public void getUserById(String id) {
		userService.getRecord(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody User user) {
		userService.addRecord(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users")
	public void updateUser(@RequestBody User user) {
		userService.addRecord(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users")
	public void deleteUser(@RequestBody User user) {
		userService.deleteRecord(user);
	}
	
}
