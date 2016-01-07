package com.lyceum.dao.mybatis.mappers;

import com.lyceum.model.Account;

public interface AccountMapper {

	public int accountExisting(Account account);
	public int checkPassword(Account account);
	public String getAccountType(Account account);
	
}
