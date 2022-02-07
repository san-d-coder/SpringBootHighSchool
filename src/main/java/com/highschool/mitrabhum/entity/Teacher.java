package com.highschool.mitrabhum.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId = 0;
	private String teacherFirstName = "";
	private String teacherLastName = "";
	private long teacherContactNumber = 0;
	private String teacherEmail = "";
	
	@ManyToOne
	private Department teacherDepartment;
	
	public Teacher() {}

	public Teacher(int teacherId, String teacherFirstName, String teacherLastName, long teacherContactNumber,
			String teacherEmail) {
		super();
		this.teacherId = teacherId;
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.teacherContactNumber = teacherContactNumber;
		this.teacherEmail = teacherEmail;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherFirstName() {
		return teacherFirstName;
	}

	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}

	public String getTeacherLastName() {
		return teacherLastName;
	}

	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}

	public long getTeacherContactNumber() {
		return teacherContactNumber;
	}

	public void setTeacherContactNumber(long teacherContactNumber) {
		this.teacherContactNumber = teacherContactNumber;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public Department getTeacherDepartment() {
		return teacherDepartment;
	}

	public void setTeacherDepartment(Department teacherDepartment) {
		this.teacherDepartment = teacherDepartment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(teacherContactNumber, teacherEmail, teacherFirstName, teacherId, teacherLastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return teacherContactNumber == other.teacherContactNumber && Objects.equals(teacherEmail, other.teacherEmail)
				&& Objects.equals(teacherFirstName, other.teacherFirstName) && teacherId == other.teacherId
				&& Objects.equals(teacherLastName, other.teacherLastName);
	}

}
