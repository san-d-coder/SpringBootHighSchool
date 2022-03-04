package com.highschool.mitrabhum.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentID = 0;
	private String departmentName = "";
	
	@OneToMany(mappedBy = "studentDepartment", cascade = CascadeType.ALL)
	private List<Student> students = null;
	
	@OneToMany(mappedBy = "teacherDepartment", cascade = CascadeType.ALL)
	private List<Teacher> teachers = null;
	
	public Department() {}
	
	public Department(int departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(departmentID, departmentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return departmentID == other.departmentID && departmentName == other.departmentName;
	}
	
	
}
