package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@Component
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public void addStudent(Student student)
	{
	studentRepo.save(student);	
	}
	public void deleteStudent(int srollnoid)
	{
try {
	studentRepo.deleteById(srollnoid);
	
}catch(Exception e) {
	System.out.println("Provide correct ID, ID: " + srollnoid +"does not exist");
}


	
	}
	
}
