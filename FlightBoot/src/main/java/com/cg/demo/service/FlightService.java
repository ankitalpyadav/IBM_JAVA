package com.cg.demo.service;

import java.util.List;

import com.cg.entity.Flight;
import com.cg.util.InvalidFlightException;

public interface FlightService {
	
	void addFlight(Flight f);
	
	List<Flight> flightByCarrier(String carrier);
	
	Flight flightByNo(int no) throws InvalidFlightException;
	
	List<Flight> flightByRoute(String src, String dest);
}
