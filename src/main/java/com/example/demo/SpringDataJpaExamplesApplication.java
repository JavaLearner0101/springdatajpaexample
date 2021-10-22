package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.printdetails.StudentPrintDetails;
import com.example.demo.service.StudentCoursesService;
import com.example.demo.service.StudentDetailsService;
import com.example.demo.service.StudentService;
import com.example.demo.service.SudentEnrollService;

@SpringBootApplication
public class SpringDataJpaExamplesApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaExamplesApplication.class, args);

		System.out.println("the IOC container is up and running");

		StudentService studentService = context.getBean(StudentService.class);
		StudentDetailsService studentDetailsService = context.getBean(StudentDetailsService.class);
		StudentCoursesService studentCoursesService = context.getBean(StudentCoursesService.class);
		SudentEnrollService studentEnrollSerivce  = context.getBean(SudentEnrollService.class);
		StudentPrintDetails studentPrintDetails = context.getBean(StudentPrintDetails.class);
		System.out.println("this has started");
		
// **********************************************************************************************************
//													Add a record to student table
//		
//		Student student = new Student(1234, "rajesh", "vemuri", "MCA");
//		studentService.addStudent(student);
//		StudentDetails studentDetails = new StudentDetails(1234, "madhuranagar", "hyderbad", "TG");
//		studentDetailsService.addStudentDetails(studentDetails);
//		context.close();

// **********************************************************************************************************
//													Find record from Student table based on srollno
//
//		int srollno = 1234;
//		int i =1;
//		Optional <Student> optionalStudent;;
//		optionalStudent = studentService.SelectByRollNo(srollno);
//		if (optionalStudent.isEmpty())
//		{
//			System.out.println("No Student exists with roll no: " + srollno);
//		}else
//		{
//			Student s1 = optionalStudent.get();
//			studentPrintDetails.studentDetails(i,s);					
//		}
// **********************************************************************************************************
//							check if a course record exist in student_courses table (by courseId)
//
//		int courseId = 14;
//		Boolean ifExists = false;
//		ifExists = studentCoursesService.existsbysrollno(courseId);
//		if (ifExists) 	System.out.println("Student enrolled with course ID " + courseId );
//		else System.out.println("No student enrolled for the  " + courseId);
//		
// **********************************************************************************************************
//										pagination on student table
//		
		
//		List<Student> studentPage = studentService.findAllpagination(2,10);
//		int size = studentPage.size();
//		if (size >0)
//		{
//			for (int i=0; i<size;i++)
//			{
//				Student s = studentPage.get(i);
//				studentPrintDetails.studentDetails(i,s);
//			}
//		}else
//		{
//			System.out.println("No students have joined the college");
//		}
//
// **********************************************************************************************************
//											pagination on student table with sorting
//
		List<Student> studentDataSorted  = studentService.findAllpaginationSort();
		int size = studentDataSorted.size();
		if (size >0)
			{
				for (int i=0; i<size;i++)
				{
					Student s = studentDataSorted.get(i);
					studentPrintDetails.studentDetails(i,s);
				}
			}else
			{
				System.out.println("No students have joined the college");
			}
// **********************************************************************************************************
//												Delete record to student table (by srollno)
//
//		studentService.deleteStudent(4567);
//		context.close();

// **********************************************************************************************************
//											Insert record into student courses table 
//								format -> course Id(pk): course name, Months, fee, OneToMany  object 
		
//		StudentCourses studentCourses = new StudentCourses(11,"core java",3,10000,null);
//		studentCoursesService.studentCoursesadd(studentCourses);
//		context.close();

// **********************************************************************************************************
//										Insert record into student Enroll table
//						format -> ManyToOne  object, Sno(pk), course ID (fk), srollno 
		
//		StudentEnroll studentEnroll = new StudentEnroll( null,1,11,2345);
//		studentEnrollSerivce.studentEnrollAdd(studentEnroll);  
//		StudentEnroll studentEnroll1 = new StudentEnroll(null,2,11,1234);
//		studentEnrollSerivce.studentEnrollAdd(studentEnroll1);  
//		StudentEnroll studentEnroll2 = new StudentEnroll( null,3,12,1234);
//		studentEnrollSerivce.studentEnrollAdd(studentEnroll2);
//		context.close();

// **********************************************************************************************************
//											Find course by course ID 
//
//		int id = 12;
//		Optional <StudentCourses> optional  = studentCoursesService.studentCoursesFindByID(id);
//		if (optional.isEmpty()) {
//			System.out.println("the course_ID  is not present");
//		}else {
//			StudentCourses sc1 = optional.get();
//			System.out.println(sc1.getCourseid());
//			System.out.println(sc1.getCoursename());
//			System.out.println(sc1.getCourseduration());
//			System.out.println(sc1.getFee());
//			for (int i = 0; i<sc1.getStudentEnroll().size();i++)
//			{
//				StudentEnroll se = sc1.getStudentEnroll().get(i);
//				System.out.println(se.getCourseid());
//				System.out.println(se.getsrollno());
//			}
//		}

	
		
// code ends here		
	}

}