package com.rentrecorder.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rentrecorder.model.RentRecord;
import com.rentrecorder.service.RentRecordService;

@RestController
public class RentRecordController {
	
	private RentRecordService rentRecordService;
	
	@RequestMapping("/")
	public String defaultMessage() {
		return "You are in Rent recorder app";
	}

	@RequestMapping("/sayhi")
	public String sayHello() {
		System.out.println("Calling hello()");
		return "Hi";
	}
	
	public List<RentRecord> getRentRecords(){
		return rentRecordService.getAllRecords();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addRentRecord(@RequestBody RentRecord rentRecord) {
		rentRecordService.addRecord(rentRecord);
	}
}
