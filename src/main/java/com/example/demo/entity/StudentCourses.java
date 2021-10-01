package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_courses")
public class StudentCourses {
	@Id
	@Column(name = "course_id")
	private int courseid;
	@Column(name = "course_name")
	private String coursename;
	@Column(name = "course_duration")
	private int courseduration;
	private int fee;
	

	private List <StudentEnroll> StudentEnroll = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "studentCourses",targetEntity =StudentEnroll.class )
	@JoinColumn(table = "student_enroll",name = "course_id",insertable = false)
	public List<StudentEnroll> getStudentEnroll() {
		return StudentEnroll;
	}

	public void setStudentEnroll(List<StudentEnroll> studentEnroll) {
		StudentEnroll = studentEnroll;
	}

	public int getCourseid() {
		return courseid;
	
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getCourseduration() {
		return courseduration;
	}

	public void setCourseduration(int courseduration) {
		this.courseduration = courseduration;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public StudentCourses(int courseid, String coursename, int courseduration, int fee) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.courseduration = courseduration;
		this.fee = fee;
	}

	public StudentCourses() {
		super();
		// TODO Auto-generated constructor stub
	}

}
