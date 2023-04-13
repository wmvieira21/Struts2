<%@page import="com.opensymphony.xwork2.ActionSupport"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<%
ActionSupport helper = new ActionSupport();
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<s:head />
</head>

<body>
	<s:form action="registerAction">
		<s:textfield name="firstName" label="firstName"></s:textfield>
		<s:textfield name="lastName" label="lastName"></s:textfield>
		<s:textfield name="age" label="age"></s:textfield>
		<s:textfield name="email" label="email"></s:textfield>
		<s:radio name="gender" label="gender" list="{'male', 'female'}"></s:radio>
		<s:submit value="register"></s:submit>
	</s:form>

</body>
</html>