package com.lyceum.service.impl;

import com.lyceum.business.StudentBusiness;
import com.lyceum.business.impl.StudentBusinessImpl;
import com.lyceum.dao.ConnectionManager;
import com.lyceum.dao.StudentRepository;
import com.lyceum.dao.mybatis.MybatisConnectionManager;
import com.lyceum.dao.mybatis.MybatisStudentRepository;
import com.lyceum.model.Account;
import com.lyceum.model.Address;
import com.lyceum.model.Name;
import com.lyceum.model.Student;
import com.lyceum.services.StudentService;
import com.lyceum.services.impl.StudentServiceImpl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StudentServiceImplTest extends TestCase{

	private ConnectionManager connectionManager;
	private StudentRepository studentRepository;
	private StudentBusiness studentBusiness;
	private StudentService studentService;
	
	public StudentServiceImplTest(String testName){
		super(testName);
	}
	
	@Override
	public void setUp() throws Exception{
		
		connectionManager = new MybatisConnectionManager();
		connectionManager.establishConnection();
		studentRepository = new MybatisStudentRepository((MybatisConnectionManager)connectionManager);
		studentBusiness = new StudentBusinessImpl();
		((StudentBusinessImpl)studentBusiness).setStudentRepository(studentRepository);
		studentService = new StudentServiceImpl();
		((StudentServiceImpl)studentService).setStudentBusiness(studentBusiness);
		
	}
	
	@Override
	public void tearDown(){
		connectionManager = null;
	}
	
	public void getStudentCodeTest(){
		
		System.out.println(studentService.getStudentCode());
		assertNotNull(studentService.getStudentCode());
		
	}
	
	public void registerStudentTest() throws Exception{
		
		Student student = new Student();
		Name name = new Name();
		name.setStrFirstName("Kez");
		name.setStrMiddleName("Malit");
		name.setStrLastName("Layug");
		student.setName(name);
		student.setBirthday("1997-12-20");
		Account account = new Account();
		account.setStrAccountType("Student");
		account.setStrUsername("kez_layug");
		account.setStrPassword("lolskie");
		student.setAccount(account);
		student.setStrContactNo("1241");
		student.setStrEmail("kez_layug@yahoo.com");
		student.setStrGender("Male");
		student.setStrStudentCode(studentService.getStudentCode());
		Address address = new Address();
		address.setStrBarangay("Pagalanggang");
		address.setStrCity("Dinalupihan");
		address.setStrProvince("Bataan");
		student.setAddress(address);
		
		assertEquals("success", studentService.registerStudent(student));
		
	}
	
	public static Test suite(){
		
		TestSuite suite = new TestSuite();
		suite.addTest(new StudentServiceImplTest("getStudentCodeTest"));
		suite.addTest(new StudentServiceImplTest("registerStudentTest"));
		
		return suite;
		
	}
	
}
