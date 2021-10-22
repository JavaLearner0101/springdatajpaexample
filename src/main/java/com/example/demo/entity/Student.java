package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private int srollno;
	private String sfname;
	private String slname;
	private String sbranch;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(table = "student_details", name = "srollno",insertable = false,updatable = false)
	StudentDetails studentdetails;
	
	public int getSrollno() {
		return srollno;
	}
	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getSlname() {
		return slname;
	}
	public void setSlname(String slname) {
		this.slname = slname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}

	

	public StudentDetails getStudentdetails() {
		return studentdetails;
	}
	public void setStudentdetails(StudentDetails studentdetails) {
		this.studentdetails = studentdetails;
	}
	public Student(int srollno, String sfname, String slname, String sbranch) {
		super();
		this.srollno = srollno;
		this.sfname = sfname;
		this.slname = slname;
		this.sbranch = sbranch;
//		this.studentdetails = studentdetails;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
