package com.ibm.repo;

import java.util.List;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;

public interface TicketRepository {
	
	int saveTicket(Ticket t);
	int addPassenger(int pnr, Passenger p);
	
	List<Ticket> fetchAllTickets();
	Ticket findTicket(int pnr);
}
