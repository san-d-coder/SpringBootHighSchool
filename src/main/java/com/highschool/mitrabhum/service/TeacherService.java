package com.highschool.mitrabhum.service;

import java.util.List;

import com.highschool.mitrabhum.advice.InvalidTeacherException;
import com.highschool.mitrabhum.advice.NotFoundException;
import com.highschool.mitrabhum.entity.Teacher;

public interface TeacherService {

	Teacher getTeacher(int teacherId) throws NotFoundException;

	List<Teacher> getTeachers();

	Teacher createTeacher(Teacher teacher) throws InvalidTeacherException;

	void deleteTeacher(int teacherId);

}