package com.lyceum.dao;

public interface ConnectionManager {

	public void establishConnection() throws Exception;
	public void stopConnection() throws Exception;
	
}