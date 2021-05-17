package com.ibm.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;
import com.ibm.repo.TicketRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestTicketRepo {

	@Autowired
	private TicketRepository repo;
	
	@Test
	public void testSaveTicket() {
		Ticket t = new Ticket();
		t.setPnr(19302);
		t.setDate(LocalDate.now().minus(1, ChronoUnit.WEEKS));
		t.setAmount(2002);
		
		Passenger p1 = new Passenger("Raj", 18, "Male");
		Passenger p2 = new Passenger("Rani", 15, "Female");
		p1.setTicket(t);
		p2.setTicket(t);
		
		t.getPassengers().add(p1);
		t.getPassengers().add(p2);
		repo.saveTicket(t);
	}
	
	@Test
	public void testAddPassenger() {
		Passenger p1 = new Passenger("Riya", 12, "Female");
		repo.addPassenger(67394, p1);
	}
}
