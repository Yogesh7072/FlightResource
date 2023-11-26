package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TicketDetails;
import com.example.demo.model.passangerData;
import com.example.demo.services.BookTicket;

@RestController
public class TicketBookController {

//	@Autowired
//	private BookTicket bookticket;
	
	
	@PostMapping(value = "/passangerdata", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity<TicketDetails> responeData(@RequestBody passangerData passangerdata) {
		BookTicket bookticket=new BookTicket();
		TicketDetails ticketDetails = bookticket.ticketDetails(passangerdata);
		
		System.out.println("controller");
		return new ResponseEntity<TicketDetails>(ticketDetails, HttpStatus.ACCEPTED);

	}

}
