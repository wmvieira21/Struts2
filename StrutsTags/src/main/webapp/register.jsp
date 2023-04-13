<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<s:head />
</head>

<body>
	<h1>Registration form</h1>
	<s:form action="registerAction">
		<s:textfield name="firstName" label="First name"></s:textfield>
		<s:textfield name="lastName" label="Last name"></s:textfield>
		<s:textfield name="age" label="Age"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textarea name="address" cols="30" rows="7" label="Address"></s:textarea>

		<!--<s:select list="{'blue','red','yellow'}" name="selectedColor"
			headerKey="None" headerValue="Select a color" label="Color"></s:select>-->

		<s:select multiple="true" list="{'blue','red','yellow'}"
			name="selectedColorMult" headerValue="Select the colors"
			label="Colors"></s:select>

		<!-- Initialize fields from Action -->
		<s:select list="listColors" name="selectedColor" headerKey="None"
			headerValue="Select a color" label="Color"></s:select>

		<s:radio name="gender" list="{'male', 'female'}" label="Gender"></s:radio>

		<!-- Initialize fields from Action -->
		<s:checkbox name="subscribe" label="Subscribe"></s:checkbox>

		<!-- 
		<s:checkbox name="subscribe" value="true" label="Subscribe"></s:checkbox>
		 -->

		<s:checkboxlist list="hobbies" name="selectedHobbies" label="Hobbies"></s:checkboxlist>

		<s:reset value="Reset"></s:reset>
		<s:submit value="Register"></s:submit>

	</s:form>

	<table border="1" width="600">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<s:iterator var="product" value="products">
			<tr>
				<th><s:property value="#product.productID" /></th>
				<th><s:property value="#product.productName" /></th>
				<th><s:property value="#product.productPrice" /></th>
			</tr>
		</s:iterator>

	</table>
</body>
</html>