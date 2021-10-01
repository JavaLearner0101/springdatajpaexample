package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_enroll")
public class StudentEnroll {
	@Column(name="course_id")
	private int courseid;
	private int srollno;
	private StudentCourses studentCourses ;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id",insertable = false,table = "student_courses")
	public StudentCourses getStudentCourses() {
		return studentCourses;
	}
	public void setStudentCourses(StudentCourses studentCourses) {
		this.studentCourses = studentCourses;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getSrollno() {
		return srollno;
	}
	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}
	public StudentEnroll(int courseid, int srollno) {
		super();
		this.courseid = courseid;
		this.srollno = srollno;
	}
	public StudentEnroll() {
		super();
		// TODO Auto-generated constructor stub
	}


}
