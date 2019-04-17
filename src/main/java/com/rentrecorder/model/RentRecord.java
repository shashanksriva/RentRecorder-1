package com.rentrecorder.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RentRecord {
	
	@Id
	private int id;
	
	private String name;
	
	private int month;
	
	private int year;
	
	private int rent;
	
	private float electricityPerUnit;
	
	private int electricityUnits;
	
	private float total;
	
	private int waterCharge;
	
	private float electricityAndWater;
	
	@ManyToOne
	private User user;
	
	public RentRecord() {
		
	}

	public RentRecord(int id, String name, int rent, float electricityPerUnit,
			int electricityUnits, float total, int phoneNumber, int waterCharge) {
		super();
		this.id = id;
		this.name = name;
		this.rent = rent;
		this.electricityPerUnit = electricityPerUnit;
		this.electricityUnits = electricityUnits;
		this.total = rent + electricityUnits * electricityPerUnit; //water charges are 200
		this.waterCharge = waterCharge;
	}

	public int getId() {
		return id;
	}

	public void setPhoneNumber(int id) {
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

	public int getElectricityUnits() {
		return electricityUnits;
	}

	public void setElectricityUnit(int electricityCharge) {
		this.electricityUnits = electricityCharge;
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

	public int getWaterCharge() {
		return waterCharge;
	}

	public void setWaterCharge(int waterCharge) {
		this.waterCharge = waterCharge;
	}

	public float getElectricityAndWater() {
		return electricityAndWater;
	}

	public void setElectricityAndWater(float electricityAndWater) {
		this.electricityAndWater = electricityAndWater;
	}

	@Override
	public String toString() {
		return "RentRecord [phoneNumber=" + id + ", name=" + name + "]";
	}
}
