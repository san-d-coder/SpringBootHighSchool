package com.highschool.mitrabhum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highschool.mitrabhum.advice.InvalidTeacherException;
import com.highschool.mitrabhum.advice.NotFoundException;
import com.highschool.mitrabhum.entity.Teacher;
import com.highschool.mitrabhum.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepository = null;

	@Override
	public Teacher getTeacher(int teacherId) throws NotFoundException {
		return this.teacherRepository.findById(teacherId)
				.orElseThrow(() -> new NotFoundException("Teacher with Id: " + teacherId + " not found!"));
	}

	@Override
	public List<Teacher> getTeachers() {
		return this.teacherRepository.findAll();
	}

	@Override
	public Teacher createTeacher(Teacher teacher) throws InvalidTeacherException {
		if (teacher.getTeacherFirstName() == null)
			throw new InvalidTeacherException("FirstName cannot be empty");
		else if (teacher.getTeacherLastName() == null)
			throw new InvalidTeacherException("Lastname cannot be empty");
		else if (teacher.getTeacherEmail() == null)
			throw new InvalidTeacherException("Email cannot be empty");
		else if (teacher.getTeacherContactNumber() == 0)
			throw new InvalidTeacherException("Contact number cannot be empty");
		else
			return this.teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacher(int teacherId) {
		this.teacherRepository.deleteById(teacherId);
	}

}
