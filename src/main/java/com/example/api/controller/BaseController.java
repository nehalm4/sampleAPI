package com.example.api.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("/")
	public ResponseEntity<String> indexMethod() {
		return ResponseEntity.ok("Application Working Fine...");
	}

	@GetMapping("/hello")
	public String hello() {
		String message = "Hello AWS Continuous Delivery!";
		try {
			InetAddress ip = InetAddress.getLocalHost();
			message += " From host: " + ip;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return message;
	}

}
