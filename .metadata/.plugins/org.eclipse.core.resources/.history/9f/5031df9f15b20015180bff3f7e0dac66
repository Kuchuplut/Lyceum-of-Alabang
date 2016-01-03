package com.lyceum.business.impl;

import com.lyceum.business.StudentBusiness;
import com.lyceum.conversion.SmartCounter;
import com.lyceum.dao.StudentRepository;

public class StudentBusinessImpl implements StudentBusiness{

	private StudentRepository studentRepository;
	
	public void setStudentRepository(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}
	
	@Override
	public String getStudentCode() {
		// TODO Auto-generated method stub
		String strStudentCode = studentRepository.getLastStudentCode();
		if (strStudentCode == null){
			return "00001";
		}
		return SmartCounter.newCode(strStudentCode);
	}

}
