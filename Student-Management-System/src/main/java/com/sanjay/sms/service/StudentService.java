package com.sanjay.sms.service;

import java.util.List;

import com.sanjay.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long Id);
	Student updateStudent(Student student);
	void deleteStudent(long id);
}
