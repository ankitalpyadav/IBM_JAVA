package com.ibm.train.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.train.exception.TrainNotFoundException;
import com.ibm.train.pojo.Train;
import com.ibm.train.repo.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository repo;
	
	@Override
	public int addTrain(Train t) {
		return repo.saveTrain(t);
	}

	@Override
	public Train getTrain(int tcode) throws TrainNotFoundException {
		Train t = repo.fetchTrain(tcode);
		if(t !=null)
			return t;
		throw new TrainNotFoundException("Invalid Train code:" + tcode);
	}

	@Override
	public Collection<Train> fetchAll() {
		return repo.fetchAll();
	}

	@Override
	public Train delTrain(int tcode) throws TrainNotFoundException {
		Train t = repo.delTrain(tcode);
		if (t != null)
			return t;
		throw new TrainNotFoundException("Invalid Train code:" + tcode);
	}
		
}
