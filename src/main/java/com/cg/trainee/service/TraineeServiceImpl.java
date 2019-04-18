package com.cg.trainee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee.dao.TraineeDao;
import com.cg.trainee.model.Trainee;

@Service("traineeService")
public class TraineeServiceImpl implements ITraineeService {

	@Autowired
	private TraineeDao traineeDao;

	@Override
	public List<Trainee> findAll() {
		List<Trainee> traineeslist = traineeDao.findAll();
		return traineeslist;

	}

	@Override
	public void save(Trainee trainee) {
		traineeDao.save(trainee);

	}

	@Override
	public void delete(Integer id) {
		traineeDao.deleteById(id);

	}

	@Override
	public Trainee findById(Integer id) {
		Trainee trainee = traineeDao.findById(id).get();
		return trainee;
	}

}
