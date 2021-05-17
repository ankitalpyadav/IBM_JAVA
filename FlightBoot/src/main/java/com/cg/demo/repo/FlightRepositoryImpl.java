package com.cg.demo.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.cg.entity.Flight;

@Repository
public class FlightRepositoryImpl implements FlightRepository {
	private List<Flight> flights;
	
	public FlightRepositoryImpl() {
		flights = new ArrayList<Flight>();
		flights.add(new Flight(121, "Jet Airways", "Mumbai", "Kolkata"));
		flights.add(new Flight(614, "Indigo", "Chennai", "Hyderabad"));
		flights.add(new Flight(139, "Jet Airways", "Delhi", "Ahmedabad"));
		flights.add(new Flight(147, "Jet Airways", "Pune", "Kochi"));
		flights.add(new Flight(652, "Indigo", "Mumbai", "Goa"));
	}
	
	@Override
	public List<Flight> fetchByRoute(String src, String dest) {
		return flights.stream().filter(f -> src.equals(f.getSource()) && dest.equals(f.getDestiny())).collect(Collectors.toList());
	}

	@Override
	public List<Flight> fetchByCarrier(String career) {
		return flights.stream().filter(f -> career.equals(f.getCarrier())).collect(Collectors.toList());
	}

	@Override
	public Flight findByNo(int no) {
		return flights.stream().filter(f -> no == f.getFlightNo()).findFirst().get();
	}

	@Override
	public void save(Flight f) {
		flights.add(f);
	}

}
