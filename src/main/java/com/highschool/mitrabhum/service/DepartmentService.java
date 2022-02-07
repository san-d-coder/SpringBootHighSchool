package com.highschool.mitrabhum.service;

import java.util.List;

import com.highschool.mitrabhum.entity.Department;

public interface DepartmentService {

	Department createDepartment(Department department);

	List<Department> getDepartments();

}