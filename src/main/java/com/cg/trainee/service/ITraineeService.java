package com.cg.trainee.service;

import java.util.List;

import com.cg.trainee.model.Trainee;

public interface ITraineeService {
	
	public List<Trainee> findAll();
	public void save(Trainee trainee);
	public void delete(Integer id);
	public Trainee findById(Integer id);
}
