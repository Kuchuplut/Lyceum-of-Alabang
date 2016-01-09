package com.lyceum.business;

import com.lyceum.model.Student;

public interface StudentBusiness {

	public String getStudentCode();
	public String registerStudent(Student student);
	public Student getStudent(Student student);
	public String setDisplayPhoto(Student student);
	
}
