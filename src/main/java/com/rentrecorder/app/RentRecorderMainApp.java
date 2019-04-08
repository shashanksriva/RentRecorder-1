package com.rentrecorder.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentRecorderMainApp {

	public static void main(String...strings) {
		System.out.println("Starting springboot application");
		SpringApplication.run(RentRecorderMainApp.class, strings);
	}
	
	
}
