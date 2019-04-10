package com.rentrecorder.repository;

import org.springframework.data.repository.CrudRepository;

import com.rentrecorder.model.RentRecord;

public interface RentRecordRepository extends CrudRepository<RentRecord, String> {

}
