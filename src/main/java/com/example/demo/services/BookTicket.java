package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TicketBookingDao;
import com.example.demo.model.TicketDetails;
import com.example.demo.model.passangerData;

@Service
public class BookTicket implements TicketImp {
	@Autowired
	private TicketBookingDao tc;



	@Override
	public TicketDetails ticketDetails(passangerData passangerdata) {
		// TODO Auto-generated method stub
		String busname = passangerdata.getBusname();
		System.out.println(busname);
		BookTicket bookTicket = new BookTicket();
		if (bookTicket.avlSet(busname) > 0) {

			try {
				TicketDetails ticketBook = bookTicket.ticketBook(passangerdata);

				passangerdata.setTicketDetails(ticketBook);
				passangerData pd = tc.savePassangerDetails(passangerdata);

				return ticketBook;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		} else {
			return null;
		}

	}

	private TicketDetails ticketBook(passangerData passangerdata) throws Exception {

		TicketDetails ticket = new TicketDetails();

		ticket.setBusName(passangerdata.getBusname());
		ticket.setPrn(Math.random() * 9000000);
		ticket.setPassangerData(passangerdata);

		ticket.setTicketPrice(800);
		ticket.setTicketStatus("confirmed");
		BookTicket bookTicket = new BookTicket();
		int avlSet = bookTicket.avlSet(passangerdata.getBusname());

		int setnum = 39 - avlSet;

		ticket.setSeatNumber(setnum + "A");

		boolean isSaveTicket = tc.saveTicketDetails(ticket);
		if (isSaveTicket) {
			return ticket;

		} else {
			throw new Exception("plse check ticket booking mdethods ");
		}

		// TODO Auto-generated method stub

	}

	@Override
	public int avlSet(String busName) {
		// TODO Auto-generated method stub
		try {
		 TicketBookingDao lc=new TicketBookingDao();
			System.out.println("i am not"+busName);
			int checkSeat = lc.checkSeat(busName);
			System.out.println(checkSeat + "123");
			return checkSeat;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;

		}

	}

}
