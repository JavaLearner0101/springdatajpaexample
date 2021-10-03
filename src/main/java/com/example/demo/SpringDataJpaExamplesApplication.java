package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.StudentEnroll;
import com.example.demo.service.StudentCoursesService;
import com.example.demo.service.StudentDetailsService;
import com.example.demo.service.StudentService;
import com.example.demo.service.SudentEnrollService;

@SpringBootApplication
public class SpringDataJpaExamplesApplication {
	public static void main(String[] args) {
//		String option = null;
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaExamplesApplication.class, args);

		System.out.println("the IOC container is up and running");

		StudentService studentService = context.getBean(StudentService.class);
		StudentDetailsService studentDetailsService = context.getBean(StudentDetailsService.class);
		StudentCoursesService studentCoursesService = context.getBean(StudentCoursesService.class);
		SudentEnrollService studentEnrollSerivce  = context.getBean(SudentEnrollService.class);
		System.out.println("this has started");
		
		// **************************************************
		// add a record to student table
		// **************************************************
//		Student student = new Student(1234, "rajesh", "vemuri", "MCA");
//		studentService.addStudent(student);
//		StudentDetails studentDetails = new StudentDetails(1234, "madhuranagar", "hyderbad", "TG");
//		studentDetailsService.addStudentDetails(studentDetails);
//		context.close();
		// **************************************************
		// Delete record from student table based on srollno
		// **************************************************

//		studentService.deleteStudent(4567);
//		context.close();

		// **************************************************
		// insert record into student courses table
		// **************************************************
//		StudentCourses studentCourses = new StudentCourses(11,"core java",3,10000,null);
//		studentCoursesService.studentCoursesadd(studentCourses);
//
		StudentEnroll studentEnroll = new StudentEnroll( null,1,11,2345);
		studentEnrollSerivce.studentEnrollAdd(studentEnroll);  
		StudentEnroll studentEnroll1 = new StudentEnroll(null,2,11,1234);
		studentEnrollSerivce.studentEnrollAdd(studentEnroll1);  
		StudentEnroll studentEnroll2 = new StudentEnroll( null,3,12,1234);
		studentEnrollSerivce.studentEnrollAdd(studentEnroll2);
		
		context.close();
//**************************************** END of the file ************************

//		Student student = new Student();
//		StudentDetails sd = new StudentDetails();
//		Scanner sc = new Scanner(System.in);
//	
//		Menu menu = context.getBean(Menu.class);
//	
//		menu.menuoption();
//		option = sc.nextLine();
//		switch (option)
//		{
//		case "1":
//			System.out.println("enter roll number");
//			sd.set
//		case 2:
//		case 3:
//		case 4:
//		
//		}
//		boolean comeout = false;
//	
//		
//		
//		
//		System.out.println("enter a number");
//		
//		
//		
//		
//		
//		;
//		collegedbcrud.addStudentDetails(sd);
//		sc.close();
//		context.close();
//		

//		StudentDetailsRepo stusentdtailsrepo = context.getBean(StudentDetailsRepo.class);
//		System.out.println("++++++++++ " +  stusentdtailsrepo.getClass().getName());

//		
//		System.out.println("Total number of records are " + stusentdtailsrepo.count());

//	}
	}

}
