package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StudentCourses;
import com.example.demo.repository.StudentCoursesRepo;
@Component
public class StudentCoursesService {

	@Autowired
	StudentCoursesRepo studentCoursesRepo;
	
	public void studentCoursesadd (StudentCourses studentCourses)
	{
		studentCoursesRepo.save(studentCourses)	;
	}
	
	public void studentCoursesdeleteByID(int courseid)
	{
		studentCoursesRepo.deleteById(courseid);
	}
	
}
