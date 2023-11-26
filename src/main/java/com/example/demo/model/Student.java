package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Student {
	
	@Id
	private int id;
	private String sname;
	private String number;
	private String accountNumber;
	private String College;
	private String address;

	public Student() {
		super();
	}

	public Student(int id, String sname, String number, String accountNumber, String college, String address) {
		super();
		this.id = id;
		this.sname = sname;
		this.number = number;
		this.accountNumber = accountNumber;
		College = college;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", number=" + number + ", accountNumber=" + accountNumber
				+ ", College=" + College + ", address=" + address + "]";
	}

}
