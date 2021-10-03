package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StudentDetails;
import com.example.demo.repository.StudentDetailsRepo;
@Component
public class StudentDetailsService {

@Autowired	
StudentDetailsRepo studentDetailsRepo;

public void addStudentDetails(StudentDetails studentDetails) {
	studentDetailsRepo.save(studentDetails);
	

	
}
	
}
