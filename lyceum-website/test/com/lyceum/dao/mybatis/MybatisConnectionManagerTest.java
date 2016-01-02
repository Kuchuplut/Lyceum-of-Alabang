package com.lyceum.dao.mybatis;

import com.lyceum.dao.ConnectionManager;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MybatisConnectionManagerTest extends TestCase{

	public MybatisConnectionManagerTest(String testName){
		super(testName);
	}
	
	public void testEstablishConnection() throws Exception {
		ConnectionManager connManager = new MybatisConnectionManager();
		
		connManager.establishConnection();
		MybatisConnectionManager mybatisConnManager = (MybatisConnectionManager) connManager;
		
		assertNotNull(mybatisConnManager.getSqlSessionFactory());
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite();
		
		suite.addTest(new MybatisConnectionManagerTest("testEstablishConnection"));
		
		return suite;
	}
	
}
