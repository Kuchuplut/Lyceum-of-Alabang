package com.lyceum.dao;

import java.util.List;

import com.lyceum.model.Account;
import com.lyceum.model.Student;

public interface StudentRepository {

	public String addStudent(Student student);
	public List<Student>getAllStudent();
	public String getLastStudentCode();
	public Student getStudentInfo(Account account);
	public int getLastDisplayCode();
	
}
