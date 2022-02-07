package com.highschool.mitrabhum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.highschool.mitrabhum.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
