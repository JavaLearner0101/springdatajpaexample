package com.example.demo.entity;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
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
@Access(AccessType.PROPERTY)
public class StudentCourses {
	private int courseid;
	private String coursename;
	private int courseduration;
	private int fee;
	private List<StudentEnroll> studentEnroll;

	@OneToMany(mappedBy = "courseid", 
								cascade = CascadeType.ALL, 
								fetch = FetchType.EAGER,
								targetEntity = StudentEnroll.class)
	public List<StudentEnroll> getStudentEnroll() {
		return studentEnroll;
	}

	public void setStudentEnroll(List<StudentEnroll> studentEnroll) {
		this.studentEnroll = studentEnroll;
	}

	@Id
	@Column(name = "course_id")
	public int getCourseid() {
		return courseid;

	}

	@Column(name = "course_name")
	public String getCoursename() {
		return coursename;
	}

	@Column(name = "course_duration")
	public int getCourseduration() {
		return courseduration;
	}

	@Column(name = "fee")
	public int getFee() {
		return fee;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public void setCourseduration(int courseduration) {
		this.courseduration = courseduration;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public StudentCourses(int courseid, String coursename, int courseduration, int fee,
			List<StudentEnroll> studentEnroll) {
		this.courseid = courseid;
		this.coursename = coursename;
		this.courseduration = courseduration;
		this.fee = fee;
		this.studentEnroll = studentEnroll;
	}

	public StudentCourses() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String toString() {
//		return "StudentCourses [courseid=" + courseid + ", coursename=" + coursename + ", courseduration="
//				+ courseduration + ", fee=" + fee + ", studentEnroll=" + studentEnroll + "]";
//	}

}