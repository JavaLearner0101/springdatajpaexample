package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentCourses;
@Component
public interface StudentCoursesRepo 
extends JpaRepository<StudentCourses, Serializable>
{
	public List<StudentCourses> findByCourseduration(int courseduration);		
	public  List<StudentCourses> findByCourseidAndFee(int courseid, int fee);
	public  List<StudentCourses> findByCourseidAndCoursedurationOrderByCourseid(int courseid, int courseDuration);
}
