package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
@Component
public class TicketDetails {

	@Id
	private double prn;
	private String ticketStatus;
	private double ticketPrice;
	private String seatNumber;
	private String busName;
	@OneToOne
	private passangerData passangerData;

	public TicketDetails() {
		super();
	}

	public TicketDetails(int prn, String ticketStatus, double ticketPrice, String seatNumber, String busName,
			com.example.demo.model.passangerData passangerData) {
		super();
		this.prn = prn;
		this.ticketStatus = ticketStatus;
		this.ticketPrice = ticketPrice;
		this.seatNumber = seatNumber;
		this.busName = busName;
		this.passangerData = passangerData;
	}

	public double getPrn() {
		return prn;
	}

	public void setPrn(double d) {
		this.prn = d;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public passangerData getPassangerData() {
		return passangerData;
	}

	public void setPassangerData(passangerData passangerData) {
		this.passangerData = passangerData;
	}

	@Override
	public String toString() {
		return "TicketDetails [prn=" + prn + ", ticketStatus=" + ticketStatus + ", ticketPrice=" + ticketPrice
				+ ", seatNumber=" + seatNumber + ", busName=" + busName + ", passangerData=" + passangerData + "]";
	}

}
