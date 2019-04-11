package com.rentrecorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rentrecorder.model.RentRecord;
import com.rentrecorder.model.User;
import com.rentrecorder.service.RentRecordService;

@RestController
public class RentRecordController {
	
	@Autowired
	private RentRecordService rentRecordService;
	
	@RequestMapping("/users/{id}/rentrecords")
	public List<RentRecord> getAllRentRecords(@PathVariable int id){
		System.out.println("----> In Rent Record GET -----");
		return rentRecordService.getAllRecords(id);
	}
	
	@RequestMapping("/users/{userId}/rentrecords/{recordId}")
	public RentRecord getRentRecord(@PathVariable int recordId){
		System.out.println("----> In Rent Record GET single record -----");
		return rentRecordService.getRecord(recordId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users/{userId}/rentrecords")
	public void addRentRecord(@RequestBody RentRecord rentRecord, @PathVariable String userId) {
		System.out.println("----> In add Rent Record POST -----");
		rentRecord.setUser(new User(Integer.parseInt(userId), "", ""));
		rentRecordService.addRecord(rentRecord);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{userId}/rentrecords/{recordId}")
	public void updateRentRecord(@RequestBody RentRecord rentRecord, @PathVariable String userId) {
		System.out.println("----> In update Rent Record PUT -----");
		rentRecord.setUser(new User(Integer.parseInt(userId), "", ""));
		rentRecordService.addRecord(rentRecord);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{userId}/rentrecords/{recordId}")
	public void deleteRentRecord(int recordId, @RequestBody RentRecord rentRecord) {
		System.out.println("Deleting user record with id -> " + recordId);
		rentRecordService.deleteRecord(recordId);
	}
}
