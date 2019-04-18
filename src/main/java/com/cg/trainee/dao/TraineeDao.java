package com.cg.trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.trainee.model.Trainee;

public interface TraineeDao extends JpaRepository<Trainee, Integer> {

}