package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StudentCourses;
import com.example.demo.repository.StudentCoursesRepo;

@Component
public class StudentCoursesService {

	StudentCoursesRepo studentCoursesRepo;

	@Autowired
	public StudentCoursesService(StudentCoursesRepo studentCoursesRepo) {
		super();
		this.studentCoursesRepo = studentCoursesRepo;
	}

	public void studentCoursesadd(StudentCourses studentCourses) {
		studentCoursesRepo.save(studentCourses);
	}

	public void studentCoursesdeleteByID(int courseid) {
		studentCoursesRepo.deleteById(courseid);
	}

	public Optional<StudentCourses> studentCoursesFindByID(int courseid) {
		return studentCoursesRepo.findById(courseid);
	}

	public List<StudentCourses> fByCourseduration(int courseDuration) {
		return studentCoursesRepo.findByCourseduration(courseDuration);
	}

	public List<StudentCourses> selectByDurationAndID(int courseDuration, int Courseid) {
		return studentCoursesRepo.findByCourseidAndCoursedurationOrderByCourseid(courseDuration, Courseid);
	}

	public Boolean existsbysrollno(int courseId) {
		return studentCoursesRepo.existsById(courseId);
	}

}
