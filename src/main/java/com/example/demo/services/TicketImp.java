package com.example.demo.services;

import com.example.demo.model.TicketDetails;
import com.example.demo.model.passangerData;

public interface TicketImp {
	
	public TicketDetails ticketDetails(passangerData passangerdata );
	
	public int avlSet(String busName);
	


}
