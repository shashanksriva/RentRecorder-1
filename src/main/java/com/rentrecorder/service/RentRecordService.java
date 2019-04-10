package com.rentrecorder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentrecorder.model.RentRecord;
import com.rentrecorder.repository.RentRecordRepository;

@Service
public class RentRecordService {
	
	@Autowired
	private RentRecordRepository rentRecordRepo;

	public RentRecord getRecord(String id) {
		return rentRecordRepo.findById(id).orElse(null);
	}
	
	public List<RentRecord> getAllRecords(String id) {
		List<RentRecord> rentRecordList = new ArrayList<RentRecord>();
		rentRecordRepo.findByUserPhoneNumber(id).forEach(rentRecordList::add);
		return rentRecordList;
	}
	
	public void addRecord(RentRecord rentRecord) {
		rentRecordRepo.save(rentRecord);
	}
	
	public void deleteRecord(String id) {
		rentRecordRepo.deleteById(id);
	}

}
