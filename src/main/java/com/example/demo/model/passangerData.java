package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
@Component
public class passangerData {
	@Id
	@Column(name = "passanger_ID")
	private int id;
	@Column(name = "passanger_firstName")
	private String pName;
	@Column(name = "passanger_lastName")
	private String lName;
	@Column(name = "passanger_from")
	private String from;
	@Column(name = "passanger_to")
	private String to;
	private String busname;
	@Column(name = "passanger_date")
	private String date;
	@Column(name = "passanger_email")
	private String email;
	@OneToOne
	private TicketDetails ticketDetails;

	public passangerData(int id, String pName, String lName, String from, String to, String busname, String date,
			String email, TicketDetails ticketDetails) {
		super();
		this.id = id;
		this.pName = pName;
		this.lName = lName;
		this.from = from;
		this.to = to;
		this.busname = busname;
		this.date = date;
		this.email = email;
		this.ticketDetails = ticketDetails;
	}

	public passangerData() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getBusname() {
		return busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TicketDetails getTicketDetails() {
		return ticketDetails;
	}

	public void setTicketDetails(TicketDetails ticketDetails) {
		this.ticketDetails = ticketDetails;
	}

	@Override
	public String toString() {
		return "passangerData [id=" + id + ", pName=" + pName + ", lName=" + lName + ", from=" + from + ", to=" + to
				+ ", busname=" + busname + ", date=" + date + ", email=" + email + ", ticketDetails=" + ticketDetails
				+ "]";
	}

}
