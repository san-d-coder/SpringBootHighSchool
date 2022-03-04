package com.highschool.mitrabhum.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.highschool.mitrabhum.entity.Student;

public interface StudentService {

	Student getStudent(int studentId);

	List<Student> getStudents();
	
	List<Student> getStudentsSorted(String sortingField);
	
	Page<Student> getStudentsWithPagination(int offset, int pageSize);
	
	Page<Student> getStudentsWithPaginationAndSorting(int offset, int pageSize, String sortingField);
	
	long countStudentsById();

	Student createStudent(Student student);

	void deleteStudent(int studentId);

}