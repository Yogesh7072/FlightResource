package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Bus {
	@Id
	private int id;
	private String busName;
	private int setAvl;
	private int totalBook;

	public Bus() {
		super();
	}

	public Bus(int id, String busName, int setAvl, int totalBook) {
		super();
		this.id = id;
		this.busName = busName;
		this.setAvl = setAvl;
		this.totalBook = totalBook;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getSetAvl() {
		return setAvl;
	}

	public void setSetAvl(int setAvl) {
		this.setAvl = setAvl;
	}

	public int getTotalBook() {
		return totalBook;
	}

	public void setTotalBook(int totalBook) {
		this.totalBook = totalBook;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", busName=" + busName + ", setAvl=" + setAvl + ", totalBook=" + totalBook + "]";
	}

}
