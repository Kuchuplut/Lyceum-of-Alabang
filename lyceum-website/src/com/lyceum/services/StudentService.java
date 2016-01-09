package com.lyceum.services;

import com.lyceum.model.Student;

public interface StudentService {

	public String getStudentCode();
	public String registerStudent(Student student);
	public Student getStudent(Student student);
	public String setDisplayPhoto(Student student);
	
}
