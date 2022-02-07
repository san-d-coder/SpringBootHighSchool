package com.highschool.mitrabhum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highschool.mitrabhum.entity.Department;
import com.highschool.mitrabhum.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository = null;
	
	@Override
	public Department createDepartment(Department department) {
		return this.departmentRepository.save(department);
	}
	
	@Override
	public List<Department> getDepartments(){
		return this.departmentRepository.findAll();
	}
	

}
