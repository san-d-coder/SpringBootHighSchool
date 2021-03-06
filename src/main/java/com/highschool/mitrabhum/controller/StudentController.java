package com.highschool.mitrabhum.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highschool.mitrabhum.entity.Student;
import com.highschool.mitrabhum.service.StudentService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	private Logger studentControllerLogger = LoggerFactory.getLogger(StudentController.class);
	
	@GetMapping(value = "/get/{studentId}", produces = "application/json")
	public Student getStudent(@PathVariable int studentId) {
		this.studentControllerLogger.trace("getStudent called");
		return this.studentService.getStudent(studentId);
	}
	
	@GetMapping(value = "/getAll", produces = "application/json")
	public List<Student> getStudents(){
		this.studentControllerLogger.trace("getStudents called");
		return this.studentService.getStudents();
	}
	
	@GetMapping(value = "/getAll/sorted/{sortingField}")
	public List<Student> getStudentsSorted(@PathVariable String sortingField){
		return this.studentService.getStudentsSorted(sortingField);
	}
	
	@GetMapping(value = "/getAll/page/{offset}/{pageSize}")
	public Page<Student> getStudentsWithPagination(@PathVariable int offset, @PathVariable int pageSize){
		return this.studentService.getStudentsWithPagination(offset, pageSize);
	}
	
	@GetMapping(value = "/getAll/page/{offset}/{pageSize}/{sortingField}")
	public Page<Student> getStudentsWithPaginationAndSorting(@PathVariable int offset, @PathVariable int pageSize, @PathVariable String sortingField){
		return this.studentService.getStudentsWithPaginationAndSorting(offset, pageSize, sortingField);
	}
	
	@GetMapping(value = "/count",produces = "application/json")
	public long countStudentsById() {
		return this.studentService.countStudentsById();
	}
	
	@PostMapping(value = "/create")
	public Student createStudent(@RequestBody Student student) {
		this.studentControllerLogger.trace("createStudent called");
		return this.studentService.createStudent(student);
	}
	
	@DeleteMapping(value = "/delete/{studentId}")
	public void deleteStudent(@PathVariable int studentId) {
		this.studentControllerLogger.trace("deleteStudent called");
		this.studentService.deleteStudent(studentId);
	}

}
