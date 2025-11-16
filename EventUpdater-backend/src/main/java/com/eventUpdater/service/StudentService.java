package com.eventUpdater.service;

import java.util.List;

import com.eventUpdater.sEntity.Student;

public interface StudentService {
	public Student addStudent(Student student);
	public List<Student> getAllStudent();
}
