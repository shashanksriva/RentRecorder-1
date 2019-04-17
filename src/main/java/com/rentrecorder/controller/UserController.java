package com.rentrecorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rentrecorder.model.User;
import com.rentrecorder.service.UserService;
import com.rentrecorder.util.Util;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView defaultMessage() {
		System.out.println("You are in Rent recorder app");
		return Util.getView("login");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome(ModelMap model) {
		System.out.println("You are in Rent recorder Welcome");
		return Util.getView("welcome");
	}
	
	@RequestMapping("/home")
	public ModelAndView getHome(ModelMap model) {
		System.out.println("You are in Rent recorder Home");
		return Util.getView("home");
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
		System.out.println("User :: " + user);
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
