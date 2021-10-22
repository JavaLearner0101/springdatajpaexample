package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@Component
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public void addStudent(Student student) {
		studentRepo.save(student);
	}

	public void deleteStudent(int srollnoid) {
		try {
			studentRepo.deleteById(srollnoid);

		} catch (Exception e) {
			System.out.println("Provide correct ID, ID: " + srollnoid + "does not exist");
		}

	}

	public Optional<Student> SelectByRollNo(int srollno) {
		return studentRepo.findById(srollno);
	}

	public List<Student> findAllpagination(int offset, int pageSize) {
		List<Student> studentList= new ArrayList<>();
		Pageable paging = PageRequest.of(offset-1, pageSize);
		Page<Student> studentPage = studentRepo.findAll(paging);

		// list of meta data on the recordset
		System.out.println("getContent " + studentPage.getContent());
		System.out.println("getNumber " + studentPage.getNumber()); 
		System.out.println("getNumberOfElements " + studentPage.getNumberOfElements());
		System.out.println("getPageable " + studentPage.getPageable());
		System.out.println("getSize " + studentPage.getSize());
		System.out.println("getSort " + studentPage.getSort());
		System.out.println("hasContent " + studentPage.hasContent());
		System.out.println("hasNext " + studentPage.hasNext());
		System.out.println("hasPrevious " + studentPage.hasPrevious());
		System.out.println("isFirst " + studentPage.isFirst());
		System.out.println("isLast " + studentPage.isLast());
		System.out.println("nextOrLastPageable " + studentPage.nextOrLastPageable());
		System.out.println("nextPageable " + studentPage.nextPageable());
		System.out.println("previousOrFirstPageable " + studentPage.previousOrFirstPageable());
		System.out.println("previousPageable " + studentPage.previousPageable());
		
		if(studentPage.hasContent())
		{
			studentList = studentPage.getContent();
			return studentList ;
		}else
		{
			return studentList;
		}
	}
	
	public List<Student> findAllpaginationSort()
	{
		Sort StudentSort = Sort.by("Srollno").descending();
		return studentRepo.findAll(StudentSort);
	}
}
