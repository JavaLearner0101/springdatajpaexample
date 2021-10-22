package com.example.demo.printdetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;

@Component
public class StudentPrintDetails {

	Student s;

	public StudentPrintDetails(Student s) {
		super();
		this.s = s;
	}

	public StudentPrintDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void studentDetails(int i, Student s) {
		if (s.getStudentdetails() == null)
			System.out.println( i +" ->" + s.getSrollno() + "  " + s.getSfname() + "  " + s.getSlname() + "  " + s.getSbranch());
		else
			System.out.println(i +" ->" + s.getSrollno() + "  " + s.getSfname() + "  " + s.getSlname() + "  " + s.getSbranch()
					+ "  " + s.getStudentdetails().getSaddress() + "  " + s.getStudentdetails().getScity() + "  "
					+ s.getStudentdetails().getSstate());

	}
}
