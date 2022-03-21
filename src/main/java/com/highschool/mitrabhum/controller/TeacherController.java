package com.highschool.mitrabhum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highschool.mitrabhum.advice.InvalidTeacherException;
import com.highschool.mitrabhum.advice.NotFoundException;
import com.highschool.mitrabhum.entity.Teacher;
import com.highschool.mitrabhum.service.TeacherService;

@RestController
@CrossOrigin(origins = "localhost:4200")
@RequestMapping(value = "/teacher/")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping(value = "get/{teacherService}", produces = "application/json")
	public Teacher getTeacher(@PathVariable int teacherService) throws NotFoundException {
		return this.teacherService.getTeacher(teacherService);
	}
	
	@GetMapping(value = "getAll", produces = "application/json")
	public List<Teacher> getTeachers(){
		return this.teacherService.getTeachers();
	}
	
	@PostMapping(value = "create")
	public Teacher createTeacher(@RequestBody Teacher Teacher) throws InvalidTeacherException {
		return this.teacherService.createTeacher(Teacher);
	}
	
	@DeleteMapping(value = "delete/{teacherService}")
	public void deleteTeacher(@PathVariable int teacherService) {
		this.teacherService.deleteTeacher(teacherService);
	}

}
