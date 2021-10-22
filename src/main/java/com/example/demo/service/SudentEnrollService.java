package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StudentEnroll;
import com.example.demo.repository.StudentEnrollRepo;

@Component
public class SudentEnrollService {

	@Autowired
	StudentEnrollRepo StudentEnrollRepo;
	
	public void studentEnrollAdd (StudentEnroll studentEnroll) {
		StudentEnrollRepo.save(studentEnroll);
		}
	
	
}
