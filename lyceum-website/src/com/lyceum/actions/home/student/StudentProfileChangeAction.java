package com.lyceum.actions.home.student;

import java.io.File;
import java.util.Calendar;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.lyceum.model.Account;
import com.lyceum.model.Student;
import com.lyceum.services.StudentService;
import com.opensymphony.xwork2.Action;

public class StudentProfileChangeAction implements ServletRequestAware, Action, SessionAware{

	private ServletRequest servletRequest;
	private Student student;
	private StudentService studentService;
	private Map<String, Object> sessionMap;
	private File userImage;
	private String userImageFileName;
    private String userImageContentType;
	
	public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}

	public void setStudent(Student student){
		this.student = student;
	}
	
	public Student getStudent(){
		return student;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		this.servletRequest = servletRequest;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HERE...");
		studentService = (StudentService)ServletActionContext.getServletContext()
				.getAttribute("studentService");
		String strUsername = (String)sessionMap.get("strUsername");
		System.out.println(strUsername);
		Student student = new Student();
		Account account = new Account();
		account.setStrUsername(strUsername);
		student.setAccount(account);
		setStudent(studentService.getStudent(student));
		
		String strFileName = getUserImageFileName(); 
		String strExtension = strFileName.substring(strFileName.lastIndexOf("."), strFileName.length()); 
		 
		long longName=Calendar.getInstance().getTimeInMillis(); 
		getStudent().setStrDisplayPhoto(longName+strExtension); 
		String strFilePath = servletRequest.getServletContext().getRealPath(File.separator)+"display_photos"; 
		
		File uploadFile = new File(strFilePath,getStudent().getStrDisplayPhoto()); 
		FileUtils.copyFile(getUserImage(), uploadFile);
		
		return studentService.setDisplayPhoto(getStudent());
		
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}

	public String getUserImageContentType() {
		return userImageContentType;
	}

	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}

}
