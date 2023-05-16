package com.example.api.model;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private PhoneNumber phoneNumber;
	
	public Employee(int employeeId, String employeeName, PhoneNumber phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.phoneNumber = phoneNumber;
	}

	public Employee(){
		
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
