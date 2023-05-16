package com.example.api.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Employee;
import com.example.api.model.PhoneNumber;

@RestController
public class BaseController {

	@GetMapping("/")
	public ResponseEntity<String> indexMethod() {
		return ResponseEntity.ok("Application Working Fine...");
	}

	@GetMapping("/getEmployeeList")
	public ResponseEntity<List<Employee>> getEmployee() {
		List<Employee> list = new LinkedList<>();
		list.add(new Employee(1, "Nehal", new PhoneNumber(1, "8862021787")));
		list.add(new Employee(2, "Manisha", new PhoneNumber(2, "9162021787")));
		list.add(new Employee(3, "Pranali", new PhoneNumber(1, "9872021787")));
		return ResponseEntity.ok(list);
	}

}
