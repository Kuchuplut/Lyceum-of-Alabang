package com.lyceum.actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.lyceum.model.Student;
import com.lyceum.services.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class SignUpAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private String strHouseNo;
	private String strStreet;
	private String strBarangay;
	private String strSubdivision;
	private String strCity;
	private String strProvince;
	private long birthday;
	private StudentService studentService;

	public void setStudentService(StudentService studentService){
		this.studentService = studentService;
	}
	
	public void setBirthday(String birthday){
		try {
			this.birthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthday).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Date getBirthday(){
		return new Date(this.birthday);
	}
	
	public String getStrHouseNo() {
		return strHouseNo;
	}

	public void setStrHouseNo(String strHouseNo) {
		this.strHouseNo = strHouseNo;
	}

	public String getStrStreet() {
		return strStreet;
	}

	public void setStrStreet(String strStreet) {
		this.strStreet = strStreet;
	}

	public String getStrBarangay() {
		return strBarangay;
	}

	public void setStrBarangay(String strBarangay) {
		this.strBarangay = strBarangay;
	}

	public String getStrSubdivision() {
		return strSubdivision;
	}

	public void setStrSubdivision(String strSubdivision) {
		this.strSubdivision = strSubdivision;
	}

	public String getStrCity() {
		return strCity;
	}

	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}

	public String getStrProvince() {
		return strProvince;
	}

	public void setStrProvince(String strProvince) {
		this.strProvince = strProvince;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String execute(){
		
		getStudent().setBirthday(getBirthday());
		String strAddress = getStrHouseNo()+" "+getStrStreet()+" "+getStrSubdivision()+" "+getStrBarangay()+", "+getStrCity()+", "+getStrProvince();
		getStudent().setStrAddress(strAddress.trim());
		setStudentService((StudentService)ServletActionContext.getServletContext()
				.getAttribute("studentService"));
		return studentService.registerStudent(student);
		
	}

}
