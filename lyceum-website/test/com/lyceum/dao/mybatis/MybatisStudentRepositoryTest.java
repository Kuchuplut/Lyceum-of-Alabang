package com.lyceum.dao.mybatis;

import com.lyceum.dao.ConnectionManager;
import com.lyceum.dao.StudentRepository;
import com.lyceum.model.Account;
import com.lyceum.model.Name;
import com.lyceum.model.Student;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MybatisStudentRepositoryTest extends TestCase{

	private StudentRepository studentRepository;
	Student student;
	ConnectionManager connManager;
	
	public MybatisStudentRepositoryTest(String testName){
		super(testName);
	}
	
	@Override
	public void setUp() throws Exception{
		
		connManager = new MybatisConnectionManager();
		connManager.establishConnection();
		studentRepository = new MybatisStudentRepository((MybatisConnectionManager)connManager);
		
	}
	
	public void tearDown() throws Exception{
		connManager = null;
	}
	
	public void testAddStudent() throws Exception{
		
		student = new Student();
		
		Name name = new Name();
		name.setStrFirstName("Ken");
		name.setStrMiddleName("Malit");
		name.setStrLastName("Layug");
		student.setName(name);
		
		student.setBirthday("1996-11-08");
		student.setStrAddress("Dinalupihan, Bataan");
		student.setStrContactNo("+639176167102");
		student.setStrEmail("ken_layug@yahoo.com");
		student.setStrGender("Male");
		student.setStrStudentCode("2013-01216-MN");
		
		Account account = new Account();
		account.setStrUsername("ken_layug");
		account.setStrPassword("kenpogi");
		student.setAccount(account);
		
		assertEquals("successInSaving", studentRepository.addStudent(student));
		
	}
	
	public void testGetAllStudent(){

		assertNotNull(studentRepository.getAllStudent());
		
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite();
		
		//suite.addTest(new MybatisStudentRepositoryTest("testAddStudent"));
		suite.addTest(new MybatisStudentRepositoryTest("testGetAllStudent"));
		
		return suite;
	}
	
}
