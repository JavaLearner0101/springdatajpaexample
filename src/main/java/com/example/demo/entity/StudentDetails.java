package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")

public class StudentDetails {
	@Id
	private int srollno;
	private String saddress;
	private String scity;
	private String sstate;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(table = "student", name = "srollno", insertable = false,updatable = false)
	Student student;

	public StudentDetails(int srollno, String saddress, String scity, String sstate) {
		super();
		this.srollno = srollno;
		this.saddress = saddress;
		this.scity = scity;
		this.sstate = sstate;

	}

	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSrollno() {
		return srollno;
	}

	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public String getSstate() {
		return sstate;
	}

	public void setSstate(String sstate) {
		this.sstate = sstate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
