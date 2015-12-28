<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
</head>
<body>

	Hello! Please fill up the following:
	
	<s:form name="signUpForm" method="post">
	
		<s:textfield key="signup.studentcode" />
		<s:submit key="signup.submit" method="execute" align="center"/>
	
	</s:form>

</body>
</html>