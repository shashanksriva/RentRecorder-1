package com.rentrecorder.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RentRecord {
	
	@Id
	private String id;
	
	private String name;
	
	private int month;
	
	private int year;
	
	private int rent;
	
	private float electricityPerUnit;
	
	private int electricityCharge;
	
	private float total;
	
	@ManyToOne
	private User user;

	public RentRecord(String id, String name, int rent, float electricityPerUnit,
			int electricityCharge, float total, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.rent = rent;
		this.electricityPerUnit = electricityPerUnit;
		this.electricityCharge = electricityCharge;
		this.total = total;
		this.user = new User(phoneNumber, "shashanksri", "Shashank Srivastava");
	}

	public String getId() {
		return id;
	}

	public void setPhoneNumber(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public float getElectricityPerUnit() {
		return electricityPerUnit;
	}

	public void setElectricityPerUnit(float electricityPerUnit) {
		this.electricityPerUnit = electricityPerUnit;
	}

	public int getElectricityCharge() {
		return electricityCharge;
	}

	public void setElectricityCharge(int electricityCharge) {
		this.electricityCharge = electricityCharge;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "RentRecord [phoneNumber=" + id + ", name=" + name + "]";
	}
}
