package com.lyceum.actions.login;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.lyceum.model.Account;
import com.lyceum.services.AccountService;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action, SessionAware{

	private Map<String, Object> sessionMap;
	private Account account;
	private AccountService accountService;
	
	public void setAccountService(AccountService accountService){
		this.accountService = accountService;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		setAccountService((AccountService)ServletActionContext.getServletContext()
				.getAttribute("accountService"));
		System.out.println("HERE");
		String strStatus = accountService.loginAccount(getAccount());
		System.out.println(strStatus);
		if (strStatus.equals("Student") || strStatus.equals("Professor")){
			
			sessionMap.put("strUsername", getAccount().getStrUsername());
			sessionMap.put("strAccountType", strStatus);
			
		}
		
		return strStatus;
	}

}
