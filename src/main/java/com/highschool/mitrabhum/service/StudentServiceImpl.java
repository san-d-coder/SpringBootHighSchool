package com.highschool.mitrabhum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highschool.mitrabhum.entity.Student;
import com.highschool.mitrabhum.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student getStudent(int studentId) {
		return this.studentRepository.getById(studentId);
	}
	
	@Override
	public List<Student> getStudents(){
		return this.studentRepository.findAll();
	}
	
	@Override
	public Student createStudent(Student student) {
		return this.studentRepository.save(student);
	}
	
	@Override
	public void deleteStudent(int studentId) {
		this.studentRepository.deleteById(studentId);
	}

}
