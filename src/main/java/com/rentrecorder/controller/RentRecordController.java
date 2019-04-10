package com.rentrecorder.controller;

import java.util.List;

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
	
	private RentRecordService rentRecordService;
	
	@RequestMapping("/users/{id}/rentrecords")
	public List<RentRecord> getAllRentRecords(@PathVariable String id){
		return rentRecordService.getAllRecords(id);
	}
	
	@RequestMapping("/users/{userId}/rentrecords/{recordId}")
	public RentRecord getRentRecord(@PathVariable String recordId){
		return rentRecordService.getRecord(recordId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users/{userId}/rentrecords}")
	public void addRentRecord(@RequestBody RentRecord rentRecord, @PathVariable String userId) {
		rentRecord.setUser(new User(userId, "shahsanksri", "Shashank Srivastava"));
		rentRecordService.addRecord(rentRecord);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{userId}/rentrecords/{recordId}")
	public void updateRentRecord(@RequestBody RentRecord rentRecord, @PathVariable String userId) {
		rentRecord.setUser(new User(userId, "shahsanksri", "Shashank Srivastava"));
		rentRecordService.addRecord(rentRecord);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{userId}/rentrecords/{recordId}")
	public void deleteRentRecord(String recordId, @RequestBody RentRecord rentRecord) {
		System.out.println("Deleting user record with id -> " + recordId);
		rentRecordService.deleteRecord(recordId);
	}
}
