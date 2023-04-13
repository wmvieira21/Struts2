<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WLECOME</title>
</head>
<body>
	<s:label value="Name:"></s:label>
	<s:property value="firstName" />
	<br>
	<s:label value="Family name:"></s:label>
	<s:property value="lastName" />
	<br>
	<s:label value="Email:"></s:label>
	<s:property value="email" />
	<br>
	<s:label value="Age:"></s:label>
	<s:property value="age" />
	<br>
	<s:label value="Gender:"></s:label>
	<s:property value="gender" />
	<br>
	<s:label value="Address:"></s:label>
	<s:property value="address" />
	<br>
	<s:label value="Color:"></s:label>
	<s:property value="selectedColor" />
	<br>
	<s:label value="Colors:"></s:label>
	<s:property value="selectedColorMult" />
	<br>
	<s:label value="Subscription:"></s:label>
	<s:property value="subscribe" />
	<br>
	<s:label value="Hobbies:"></s:label>
	<s:property value="selectedHobbies" />


	<s:if test="%{subscribe}">
		<div>You are a subscriber</div>
	</s:if>
	<s:else>
		<div>You are not a subscriber</div>
	</s:else>



</body>
</html>