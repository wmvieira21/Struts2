<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<s:head />
<body>
<%@ include file="header.jsp"%>
	<s:form action="updateAction">
		<s:hidden name="prodId"></s:hidden>
		<s:textfield name="prodName" label="Product name"></s:textfield>
		<s:textfield name="prodCategory" label="Category"></s:textfield>
		<s:textfield name="prodPrice" label="Price"></s:textfield>
		<s:submit value="Update"></s:submit>
	</s:form>
	<br>
	<a href="welcomeAction">BACK</a>
</body>
</html>