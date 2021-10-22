package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentEnroll;

@Component
@Repository
public interface StudentEnrollRepo extends 
						CrudRepository<StudentEnroll, Serializable>
{

	
	
	
}
