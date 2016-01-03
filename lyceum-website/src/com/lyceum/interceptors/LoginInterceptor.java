package com.lyceum.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

public class LoginInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		
		String strUsername = (String) session.get("strUsername");
		
		if (strUsername != null){
			return actionInvocation.invoke();
		}
		
		return "login";
	}

}
