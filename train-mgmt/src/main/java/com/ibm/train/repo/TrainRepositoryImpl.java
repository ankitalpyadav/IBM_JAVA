package com.ibm.train.repo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ibm.train.pojo.Train;

@Repository
public class TrainRepositoryImpl implements TrainRepository {
	private Map<Integer, Train> trains;
	
	@Override
	public int saveTrain(Train t) {
		trains = new LinkedHashMap<Integer, Train>();
		trains.put(1201, new Train("Nagpur", "Raat Rani", "Chennai", 1201));
		trains.put(t.getTcode(), t);
		return t.getTcode();
	}

	@Override
	public Train fetchTrain(int tcode) {
		return trains.get(tcode);
	}

	@Override
	public Collection<Train> fetchAll() {
		return trains.values();
	}

	@Override
	public Train delTrain(int tcode) {
		return trains.remove(tcode);
	}
	
}
