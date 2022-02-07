package com.highschool.mitrabhum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highschool.mitrabhum.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
