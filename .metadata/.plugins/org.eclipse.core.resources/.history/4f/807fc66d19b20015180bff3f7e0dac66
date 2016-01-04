package com.lyceum.actions;

import org.apache.struts2.ServletActionContext;

import com.lyceum.services.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class SignUpInitializeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String strStudentCode;
	
	public void setStrStudentCode(String strStudentCode){
		this.strStudentCode = strStudentCode;
	}
	
	public String getStrStudentCode(){
		return this.strStudentCode;
	}
	
	public String execute(){
		
		StudentService studentService = (StudentService)ServletActionContext.getServletContext()
				.getAttribute("studentService");
		setStrStudentCode(studentService.getStudentCode());
		return "success";
		
	}
	
}
