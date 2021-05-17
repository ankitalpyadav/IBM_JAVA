package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.repo.FlightRepository;
import com.cg.entity.Flight;
import com.cg.util.InvalidFlightException;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository repo;

	@Override
	public List<Flight> flightByCarrier(String carrier) {
		return repo.fetchByCarrier(carrier);
	}

	@Override
	public Flight flightByNo(int no) throws InvalidFlightException {
		Flight f = repo.findByNo(no);
		if(f == null)
			throw new InvalidFlightException();
		return f;
	}

	@Override
	public List<Flight> flightByRoute(String src, String dest) {
		return repo.fetchByRoute(src, dest);
	}

	@Override
	public void addFlight(Flight f) {
		repo.save(f);
	}
}
