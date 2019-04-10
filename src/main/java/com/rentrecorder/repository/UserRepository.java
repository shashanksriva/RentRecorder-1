package com.rentrecorder.repository;

import org.springframework.data.repository.CrudRepository;

import com.rentrecorder.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
