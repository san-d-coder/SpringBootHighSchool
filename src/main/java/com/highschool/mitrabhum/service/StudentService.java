package com.highschool.mitrabhum.service;

import java.util.List;

import com.highschool.mitrabhum.entity.Student;

public interface StudentService {

	Student getStudent(int studentId);

	List<Student> getStudents();

	Student createStudent(Student student);

	void deleteStudent(int studentId);

}