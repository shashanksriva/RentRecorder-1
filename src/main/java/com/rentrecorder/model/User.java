package com.rentrecorder.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int phoneNumber;
	
	private String userName;
	
	private String name;
	
	public User() {
		super();
	}

	public User(int phoneNumber, String userName, String name) {
		super();
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [phoneNumber=" + phoneNumber + ", userName=" + userName + "]";
	}
	
}
