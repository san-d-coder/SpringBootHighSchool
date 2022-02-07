package com.highschool.mitrabhum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highschool.mitrabhum.entity.Department;
import com.highschool.mitrabhum.service.DepartmentService;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService = null;
	
	@PostMapping(value = "/create")
	public Department createDepartment(@RequestBody Department department) {
		return this.departmentService.createDepartment(department);
	}
	
	@GetMapping(value = "/getAll")
	public List<Department> getDepartments(){
		return this.departmentService.getDepartments();
	}
	
	

}
