package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bus;
import com.example.demo.model.TicketDetails;
import com.example.demo.model.passangerData;
import com.example.demo.repositry.BusRepo;
import com.example.demo.repositry.PassangerRepo;
import com.example.demo.repositry.TicketDetailsRepo;

@Repository
public class TicketBookingDao {
	@Autowired
	BusRepo busrepo;

	@Autowired
	TicketDetailsRepo ticketDetailsRepo;

	@Autowired
	PassangerRepo passangerRepo;

	public int checkSeat(String busName)  {
		System.out.println("i am run");
		System.out.println("i am run");
		System.out.println("i am run");
		System.out.println("i am run");

		System.out.println("i am run");
		Bus bus = busrepo.findById(1).get();
		int setAvl = bus.getSetAvl();
		if (setAvl > 0) {

			bus.setSetAvl(setAvl - 1);
			bus.setTotalBook(bus.getTotalBook() + 1);
			Bus save = busrepo.save(bus);
			System.out.println("updated bus seat object   :  " + save);

			return setAvl;
		} else {

		return 0;
	

		}

		// TODO Auto-generated method stub

	}

	public boolean saveTicketDetails(TicketDetails ticket) {
		// TODO Auto-generated method stub

		TicketDetails save = ticketDetailsRepo.save(ticket);

		if (save != null) {
			return true;
		} else {

			return false;
		}
	}

	public passangerData savePassangerDetails(passangerData passangerdata) {
		// TODO Auto-generated method stub
		passangerData save = passangerRepo.save(passangerdata);

		return save;
	}

}
