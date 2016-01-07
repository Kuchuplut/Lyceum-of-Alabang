package com.lyceum.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class StudentAccountTypeInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> sessionMap = actionInvocation.getInvocationContext().getSession();
		
		String strAccountType = (String) sessionMap.get("strAccountType");
		
		if (strAccountType.equals("Student")){
			
			return actionInvocation.invoke();
			
		}
		
		return "access.denied";
		
	}

}