package com.lyceum.actions.signup;

import java.io.IOException;
import java.util.Map;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.lyceum.model.Student;
import com.lyceum.services.StudentService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class SignUpAction extends ActionSupport implements SessionAware, Action{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private StudentService studentService;
	private Map<String, Object> sessionMap;

	public void setStudentService(StudentService studentService){
		this.studentService = studentService;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String execute() throws IOException{
		
		setStudentService((StudentService)ServletActionContext.getServletContext()
				.getAttribute("studentService"));
		
		String strStatus = studentService.registerStudent(getStudent());
		
		if (strStatus.equals("success")){
			sessionMap.put("strUsername", student.getAccount().getStrUsername());
			sessionMap.put("strAccountType", "Student");
		}
		sessionMap = null;
		
		return strStatus;
//		return "success";
		
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}
	
	public Map<String, Object> getSession(){
		return sessionMap;
	}

}
