package com.highschool.mitrabhum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public List<Student> getStudentsSorted(String sortingField){
		return this.studentRepository.findAll(Sort.by(Direction.ASC,sortingField));
	}
	
	@Override
	public Page<Student> getStudentsWithPagination(int offset, int pageSize){
		return this.studentRepository.findAll(PageRequest.of(offset, pageSize));
	}
	
	@Override
	public Page<Student> getStudentsWithPaginationAndSorting(
			int offset, 
			int pageSize, 
			String sortingField){
		return this
				.studentRepository
				.findAll(
						PageRequest
						.of(offset, pageSize, Direction.ASC, sortingField));
	}
	
	@Override
	public long countStudentsById() {
		return this.studentRepository.count();
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
