package com.rentrecorder.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rentrecorder.model.User;
import com.rentrecorder.repository.UserRepository;

@Service
public class UserService {

	List<User> userList = new ArrayList<>(Arrays.asList(new User("Krishna", "Balram", "Mathura"), new User("Radha", "Lalita", "Vrundavan")));
	
	private UserRepository userRepository;
	
	public List<User> getUsersList(){
		List<User> usrList = new ArrayList<>();
		userRepository.findAll().forEach(usrList::add);
		return usrList;
	}
	
	public User getRecord(String id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> getAllRecords() {
		List<User> userRecordList = new ArrayList<User>();
		userRepository.findAll().forEach(userRecordList::add);
		return userRecordList;
	}
	
	public void addRecord(User user) {
		userRepository.save(user);
	}
	
	public void deleteRecord(User user) {
		userRepository.delete(user);
	}
}
