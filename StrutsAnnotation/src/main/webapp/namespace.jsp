<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Namespace</title>
</head>
<body>
	<h1>Namespace</h1>

	<s:form action="/product/getDetails">
		<s:submit value="Get Product details"></s:submit>
	</s:form>
	
	<s:form action="/user/getDetails">
		<s:submit value="Get user details"></s:submit>
	</s:form>


</body>
</html>