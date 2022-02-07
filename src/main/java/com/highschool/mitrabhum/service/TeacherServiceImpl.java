package com.highschool.mitrabhum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highschool.mitrabhum.entity.Teacher;
import com.highschool.mitrabhum.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository = null;
	
	@Override
	public Teacher getTeacher(int teacherId) {
		return this.teacherRepository.getById(teacherId);
	}
	
	@Override
	public List<Teacher> getTeachers(){
		return this.teacherRepository.findAll();
	}
	
	@Override
	public Teacher createTeacher(Teacher teacher) {
		return this.teacherRepository.save(teacher);
	}
	
	@Override
	public void deleteTeacher(int teacherId) {
		this.teacherRepository.deleteById(teacherId);
	}

}
