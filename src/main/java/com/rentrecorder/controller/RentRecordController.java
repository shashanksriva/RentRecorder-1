package com.rentrecorder.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RentRecordController {

	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("Calling hello()");
		return "Hi";
	}
}
