package com.highschool.mitrabhum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.highschool.mitrabhum.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer>{

}
