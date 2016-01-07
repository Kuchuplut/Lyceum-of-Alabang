package com.lyceum.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserLoginInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		
		String strUsername = (String) session.get("strUsername");
		System.out.println("KENPOGI");
		if (strUsername == null){
			System.out.println("No session found.");
			return actionInvocation.invoke();
		}
		
		return "exist";
	}

}
