package com.ibm.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestFlightRepo {
	
	@Autowired
	private FlightRepository repo;
	
	@Test
	public void testSave() {
		Flight f = new Flight("9W492", "Kolkata", "Hyderabad", "Jet Airways");
		assertNotNull(repo.save(f));
	}
	
	@Test
	public void testUpdate() {
		Flight f = new Flight("6E323", "Pune", "Cochin", "Indigo");
		assertTrue(repo.update(f));
	}
	
	@Test
	public void testAllFlights() {
		List<Flight> flights = repo.fetchAll();
		assertNotNull(flights);
		flights.forEach(System.out::println);
	}
	
	@Test
	public void testByCarrier() {
		List<Flight> flights = repo.findByCarrier("Indigo");
		assertNotNull(flights);
		flights.forEach(System.out::println);
	}
}
