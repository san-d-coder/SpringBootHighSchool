package com.highschool.mitrabhum.service;

import java.util.List;

import com.highschool.mitrabhum.entity.Teacher;

public interface TeacherService {

	Teacher getTeacher(int teacherId);

	List<Teacher> getTeachers();

	Teacher createTeacher(Teacher teacher);

	void deleteTeacher(int teacherId);

}