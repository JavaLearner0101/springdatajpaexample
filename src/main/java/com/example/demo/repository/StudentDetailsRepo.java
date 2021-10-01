package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentDetails;
@Repository
@Component
public interface StudentDetailsRepo 
				extends CrudRepository<StudentDetails, Serializable>{
	
}
