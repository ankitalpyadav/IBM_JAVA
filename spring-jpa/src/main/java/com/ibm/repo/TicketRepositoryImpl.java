package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;

@Repository
public class TicketRepositoryImpl implements TicketRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int saveTicket(Ticket t) {
//		Passenger p1 = new Passenger("Polo", 21, "Male");
//		p1.setTicket(t);
//		t.getPassengers().add(p1);
		em.persist(t);
		return t.getPnr();
	}

	@Override
	@Transactional
	public int addPassenger(int pnr, Passenger p) {
		Ticket t = em.find(Ticket.class, pnr);
		p.setTicket(t);
		em.persist(p);
		return p.getId();
	}

	@Override
	public List<Ticket> fetchAllTickets() {
		return em.createQuery("from Ticket").getResultList();
	}

	@Override
	public Ticket findTicket(int pnr) {
		return em.find(Ticket.class, pnr);
	}
}
