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
	<h1><%=helper.getText("global.title")%></h1>
	<s:form action="registerAction">
		<s:textfield name="firstName" key="global.firstName"></s:textfield>
		<s:textfield name="lastName" key="global.lastName"></s:textfield>
		<s:textfield name="age" key="global.age"></s:textfield>
		<s:textfield name="email" key="global.email"></s:textfield>
		<s:radio name="gender" key="global.gender" list="{'male', 'female'}"></s:radio>
		<s:submit key="global.register"></s:submit>
	</s:form>

	<s:url action="changeLocaleAction" var="urlEn">
		<s:param name="request_locale">en</s:param>
	</s:url>
	<a href="${urlEn}">English</a>

	<s:url action="changeLocaleAction" var="urlFr">
		<s:param name="request_locale">fr</s:param>
	</s:url>
	<a href="${urlFr}">French</a>

	<s:url action="changeLocaleAction" var="urlDe">
		<s:param name="request_locale">de</s:param>
	</s:url>
	<a href="${urlDe}">German</a>


</body>
</html>