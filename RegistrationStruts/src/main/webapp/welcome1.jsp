<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME1</title>
</head>
<body>
	<h3>Welcome1</h3>
	<h1>
		<s:property value="firstName" />
	</h1>
	<h1>
		<s:property value="lastName" />
	</h1>
	<h1>
		<s:property value="email" />
	</h1>
	<h1>
		<s:property value="age" />
	</h1>
	<h1>
		<s:property value="gender" />
	</h1>
</body>
</html>