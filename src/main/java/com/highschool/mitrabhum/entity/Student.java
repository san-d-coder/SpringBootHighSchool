package com.highschool.mitrabhum.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId = 0;
	private String studentFirstName = "";
	private String studentLastName = "";
	private long studentContactNumber = 0;
	private String studentEmailAddress = "";
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Department studentDepartment;
	
	public Student() {
		
	}

	public Student(int studentId, String studentFirstName, String studentLastName, long studentContactNumber,
			String studentEmailAddress, Department studentDepartment) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentContactNumber = studentContactNumber;
		this.studentEmailAddress = studentEmailAddress;
		this.studentDepartment = studentDepartment;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public long getStudentContactNumber() {
		return studentContactNumber;
	}

	public void setStudentContactNumber(long studentContactNumber) {
		this.studentContactNumber = studentContactNumber;
	}

	public String getStudentEmailAddress() {
		return studentEmailAddress;
	}

	public void setStudentEmailAddress(String studentEmailAddress) {
		this.studentEmailAddress = studentEmailAddress;
	}

	public Department getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(Department studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentContactNumber, studentEmailAddress, studentFirstName, studentId, studentLastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentContactNumber == other.studentContactNumber
				&& Objects.equals(studentEmailAddress, other.studentEmailAddress)
				&& Objects.equals(studentFirstName, other.studentFirstName) && studentId == other.studentId
				&& Objects.equals(studentLastName, other.studentLastName);
	}

}
