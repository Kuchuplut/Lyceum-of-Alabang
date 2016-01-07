package com.lyceum.services.impl;

import com.lyceum.business.AccountBusiness;
import com.lyceum.model.Account;
import com.lyceum.services.AccountService;

public class AccountServiceImpl implements AccountService{

	private AccountBusiness accountBusiness;
	
	public void setAccountBusiness(AccountBusiness accountBusiness){
		this.accountBusiness = accountBusiness;
	}
	
	@Override
	public String loginAccount(Account account) {
		// TODO Auto-generated method stub
		return accountBusiness.loginAccount(account);
	}

}
