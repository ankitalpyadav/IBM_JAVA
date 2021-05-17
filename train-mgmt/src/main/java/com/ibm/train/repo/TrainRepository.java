package com.ibm.train.repo;

import java.util.Collection;

import com.ibm.train.pojo.Train;

public interface TrainRepository {
	
	int saveTrain(Train t);
	
	Train fetchTrain(int tcode);
	
	Collection<Train> fetchAll();
	
	Train delTrain(int tcode);
}
