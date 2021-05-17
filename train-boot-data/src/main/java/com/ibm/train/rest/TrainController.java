package com.ibm.train.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ibm.train.exception.TrainNotFoundException;
import com.ibm.train.entity.Train;
import com.ibm.train.service.TrainService;

@CrossOrigin()
@RestController
public class TrainController {

	@Autowired
	private TrainService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addTrain(@RequestBody Train train) {
		service.addTrain(train);
		return "Train Added Successfully";
	}
	
	@GetMapping(value = "/trains", produces = "application/json")
	public Collection<Train> getTrains(){
		try {
			return service.fetchAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return service.fetchAll();
	}
	
	@GetMapping(value = "/train/{code}", produces = "application/json")
	public Train getTrain(@PathVariable("code") int code) {
		Train t = null;
		try {
			t = service.getTrain(code);
		} catch (TrainNotFoundException e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format(e.getMessage()));
		}
		return t;
	}
	
	@DeleteMapping(value="/train/{code}")
	public void removeTrain(@PathVariable("code") int code) {
		service.deleteTrain(code);
	}
	
	@PutMapping(value = "/train", consumes = "application/json")
	public void modifyTrain(@RequestBody Train train) {
		service.updateTrain(train);
	}
	
}
