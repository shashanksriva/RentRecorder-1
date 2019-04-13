package com.rentrecorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RentRecorderMainApp extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RentRecorderMainApp.class);
	}

	public static void main(String...strings) {
		System.out.println("Starting springboot application");
		SpringApplication.run(RentRecorderMainApp.class, strings);
	}
}
