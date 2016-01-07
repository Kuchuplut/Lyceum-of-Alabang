package com.lyceum.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.lyceum.business.AccountBusiness;
import com.lyceum.business.StudentBusiness;
import com.lyceum.business.impl.AccountBusinessImpl;
import com.lyceum.business.impl.StudentBusinessImpl;
import com.lyceum.dao.AccountRepository;
import com.lyceum.dao.ConnectionManager;
import com.lyceum.dao.StudentRepository;
import com.lyceum.dao.mybatis.MybatisAccountRepository;
import com.lyceum.dao.mybatis.MybatisConnectionManager;
import com.lyceum.dao.mybatis.MybatisStudentRepository;
import com.lyceum.services.AccountService;
import com.lyceum.services.StudentService;
import com.lyceum.services.impl.AccountServiceImpl;
import com.lyceum.services.impl.StudentServiceImpl;

public class MainContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Context listener destroyed...");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		ServletContext servletContext = event.getServletContext();
		try {
			
			ConnectionManager connectionManager = new MybatisConnectionManager();
			connectionManager.establishConnection();
			
			//Student
			StudentRepository studentRepository = new MybatisStudentRepository((MybatisConnectionManager)connectionManager);
			StudentBusiness studentBusiness = new StudentBusinessImpl();
			((StudentBusinessImpl)studentBusiness).setStudentRepository(studentRepository);
			StudentService studentService = new StudentServiceImpl();
			((StudentServiceImpl)studentService).setStudentBusiness(studentBusiness);
			servletContext.setAttribute("studentService", studentService);
			
			//Account
			AccountRepository accountRepository = new MybatisAccountRepository((MybatisConnectionManager)connectionManager);
			AccountBusiness accountBusiness = new AccountBusinessImpl();
			((AccountBusinessImpl)accountBusiness).setAccountRepository(accountRepository);
			AccountService accountService = new AccountServiceImpl();
			((AccountServiceImpl)accountService).setAccountBusiness(accountBusiness);
			servletContext.setAttribute("accountService", accountService);
			
			System.out.println("ContextListener initialized...");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
