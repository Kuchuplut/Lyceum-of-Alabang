package com.lyceum.actions.home.student;

import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.lyceum.model.Account;
import com.lyceum.model.Student;
import com.lyceum.services.StudentService;
import com.opensymphony.xwork2.Action;

public class StudentInitialization implements Action,SessionAware,ServletRequestAware{

	private Map<String, Object> sessionMap;
	private Student student;
	private StudentService studentService;
	private ServletRequest servletRequest;
	
	public void setStudent(Student student){
		this.student = student;
	}
	
	public Student getStudent(){
		return student;
	}
	
	public String execute(){
		
		studentService = (StudentService)ServletActionContext.getServletContext()
				.getAttribute("studentService");
		Account account = new Account();
		account.setStrUsername((String)sessionMap.get("strUsername"));
		Student studentInput = new Student();
		studentInput.setAccount(account);
		Student student = studentService.getStudent(studentInput);
		if (student == null){
			return "errorInDatabase";
		}
		setStudent(student);
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		this.servletRequest = servletRequest;
	}
	
	public ServletRequest getServletRequest(){
		return servletRequest;
	}
	
}
