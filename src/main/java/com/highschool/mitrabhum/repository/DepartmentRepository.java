package com.highschool.mitrabhum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.highschool.mitrabhum.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
