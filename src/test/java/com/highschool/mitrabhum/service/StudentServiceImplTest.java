package com.highschool.mitrabhum.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.highschool.mitrabhum.entity.Department;
import com.highschool.mitrabhum.entity.Student;
import com.highschool.mitrabhum.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
@TestMethodOrder(OrderAnnotation.class)
class StudentServiceImplTest {
	
	@Mock
	private StudentRepository studentRepository;
	
	@InjectMocks
	private StudentServiceImpl studentServiceImpl;
	
	
	@Captor
	private ArgumentCaptor<Student> studentArgumentCaptor;

	@Test
	@Order(1)
	@DisplayName(value = "Testing Get Student")
	void testGetStudent() {
		Student sampleStudent = 
				new Student(1,"Sandeep","Ghosh",8350083028L,"sandeep.ghosh@mitrabhum.com",new Department(1,"Arts"));
		Mockito.when(studentRepository.getById(1)).thenReturn(sampleStudent);
		Student actualStudent = studentServiceImpl.getStudent(1);
		Assertions.assertThat(sampleStudent.equals(actualStudent));
	}

	@Test
	@Order(2)
	@DisplayName(value = "Testing Get Students")

	void testGetStudents() {
		List<Student> studentList = 
				new ArrayList<>(
						Arrays.asList(
								new Student(1,"Sandeep","Ghosh",8350083028L,"sandeep.ghosh@mitrabhum.com",new Department(1,"Arts")),
								new Student(2,"Rahul","Ghosh",7350084028L,"rahul.ghosh@mitrabhum.com",new Department(2,"Science")),
								new Student(3,"Pomi","Ghosh",6350085028L,"pomi.ghosh@mitrabhum.com",new Department(3,"Commerce"))));
		
		Mockito.when(studentRepository.findAll()).thenReturn(studentList);
		Assertions.assertThat(studentServiceImpl.getStudents().equals(studentList));
	}


	@Test
	@Order(3)
	@DisplayName(value = "Testing Create Student")
	
	void testCreateStudent() {
		Student sampleStudent = 
				new Student(1,"Sandeep","Ghosh",8350083028L,"sandeep.ghosh@mitrabhum.com",new Department(1,"Arts"));
		studentServiceImpl.createStudent(sampleStudent);
		Mockito.verify(studentRepository, Mockito.times(1)).save(studentArgumentCaptor.capture());
		Assertions.assertThat(studentArgumentCaptor.getValue().getStudentId()).isEqualTo(1);
		Assertions.assertThat(studentArgumentCaptor.getValue().getStudentFirstName()).isEqualTo("Sandeep");		
	}

}
