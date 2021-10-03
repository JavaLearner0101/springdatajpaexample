package com.example.demo.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student_enroll")
@Access(AccessType.PROPERTY)
public class StudentEnroll {

	private StudentCourses studentCourses;
	private int sno;
	private int courseid;
	private int srollno;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = StudentCourses.class)
	@JoinColumn(name = "course_id",insertable = false,updatable = false)
		public void setStudentCourses(StudentCourses studentCourses) {
		this.studentCourses = studentCourses;
	}

	@Id
	@Column(name="sno")
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	@Column(name="course_id")
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	@Column(name="srollno")
	public int getsrollno() {
		return srollno;
	}
	public void setsrollno(int srollno) {
		this.srollno = srollno;
	}
	public StudentEnroll(StudentCourses studentCourses, int sno, int courseid, int srollno) {
		super();
		this.studentCourses = studentCourses;
		this.sno = sno;
		this.courseid = courseid;
		this.srollno = srollno;
	}
	public StudentEnroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
