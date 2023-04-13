<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<s:head/>
<body>

	<s:form action="loginAction">
		<s:label name="error"></s:label>
		<s:textfield name="userName" label="Username"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit value="Login"></s:submit>
	</s:form>

</body>
</html>