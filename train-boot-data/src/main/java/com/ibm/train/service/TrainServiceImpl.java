package com.ibm.train.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.train.exception.TrainNotFoundException;
import com.ibm.train.entity.Train;
import com.ibm.train.repo.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository repo;
	
	@Override
	public int addTrain(Train t) {
		repo.save(t);
		return t.getTcode();
	}

	@Override
	public Train getTrain(int tcode) throws TrainNotFoundException {
		Train t = repo.findById(tcode).orElseThrow(()->new TrainNotFoundException("Invalid Train code:" + tcode));
		return t;
	}

	@Override
	public Collection<Train> fetchAll() {
		return repo.findAll();
	}

	@Override
	public void deleteTrain(int tcode) {
		repo.deleteById(tcode);
	}

	@Override
	public void updateTrain(Train t) {
		repo.save(t);
	}

		
}
