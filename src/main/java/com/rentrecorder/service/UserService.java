package com.rentrecorder.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rentrecorder.model.RentRecord;
import com.rentrecorder.model.User;
import com.rentrecorder.repository.UserRepository;

@Service
public class UserService {

	private List<String> userList = new ArrayList<>(Arrays.asList("Krishna", "Balram", "Mathura", "Vrundavan"));
	
	private UserRepository userRepository;
	
	public List<String> getUsersList(){
		
		return userList;
	}
	
	public User getRecord(String id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> getAllRecords() {
		List<User> rentRecordList = new ArrayList<User>();
		userRepository.findAll().forEach(rentRecordList::add);
		return rentRecordList;
	}
	
	public void addRecord(User user) {
		userRepository.save(user);
	}
	
	public void deleteRecord(User user) {
		userRepository.delete(user);
	}
}
