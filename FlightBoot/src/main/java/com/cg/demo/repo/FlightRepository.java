package com.cg.demo.repo;

import java.util.List;

import com.cg.entity.Flight;

public interface FlightRepository {
	
	void save(Flight f);
	
	List<Flight> fetchByRoute(String src, String dest);
	
	List<Flight> fetchByCarrier(String career);
	
	Flight findByNo(int no);
	
}
