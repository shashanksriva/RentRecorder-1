package com.rentrecorder.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rentrecorder.model.RentRecord;

public interface RentRecordRepository extends CrudRepository<RentRecord, String> {
	
	List<RentRecord> findByName(String name);
	
	List<RentRecord> findByUserPhoneNumber(String id);

}
