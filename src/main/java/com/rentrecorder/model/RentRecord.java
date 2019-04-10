package com.rentrecorder.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RentRecord {
	
	@Id
	private int phoneNumber;
	
	private String name;
	
	private String floor;
	
	private int month;
	
	private int year;
	
	private int rent;
	
	private float electricityPerUnit;
	
	private int electricityCharge;
	
	private float total;
	
	private User user;

	public RentRecord(int phoneNumber, String name, String floor, int rent, float electricityPerUnit,
			int electricityCharge, float total) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.floor = floor;
		this.rent = rent;
		this.electricityPerUnit = electricityPerUnit;
		this.electricityCharge = electricityCharge;
		this.total = total;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
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
	
	@Override
	public String toString() {
		return "RentRecord [phoneNumber=" + phoneNumber + ", name=" + name + "]";
	}
}
