package com.ibm.train.service;

import java.util.Collection;

import com.ibm.train.exception.TrainNotFoundException;
import com.ibm.train.entity.Train;

public interface TrainService {
	
	int addTrain(Train t);
	
	Train getTrain(int tcode) throws TrainNotFoundException;
	
	Collection<Train> fetchAll();
	
	void deleteTrain(int tcode);
	
	void updateTrain(Train t);
}
