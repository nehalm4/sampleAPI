package com.example.api.model;

public class PhoneNumber {
	
	private int id;
	private String phoneNo;
	
	public PhoneNumber(int id, String phoneNo) {
		super();
		this.id = id;
		this.phoneNo = phoneNo;
	}
	
	
	public PhoneNumber() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "PhoneNumber [id=" + id + ", phoneNo=" + phoneNo + "]";
	}
}
