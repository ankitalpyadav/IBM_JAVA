package com.cg.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.service.FlightService;
import com.cg.entity.Flight;
import com.cg.util.InvalidFlightException;

@CrossOrigin()
@RestController
@RequestMapping({ "/flight" })
public class FlightController {
	@Autowired
	private FlightService service;

	@GetMapping(value="/byno/{no}", produces="application/json")
	public Flight getFlight(@PathVariable("no") int no) throws InvalidFlightException {
		Flight f = service.flightByNo(no);
		return f;
	}
	
	@GetMapping(value="/bycarrier/{car}", produces="application/json")
	public List<Flight> byCarrier(@PathVariable String car) {
		return service.flightByCarrier(car);
	}
	
	@GetMapping(value="/byroute", produces="application/json")
	public List<Flight> byRoute(@RequestParam("src") String source,
			@RequestParam("dest") String destiny) {
		return service.flightByRoute(source, destiny);
	}
	
	@PostMapping(value="/add", consumes = "application/json")
	public void add(@RequestBody Flight f) {
		System.out.println("Adding flight: " + f);
		service.addFlight(f);
	}
}
