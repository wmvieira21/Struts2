<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<sx:head/>
</head>
<body>
	<%@ include file="header.jsp"%>
	<!-- 
	<div>
		<button onclick="window.location.href='addProduct.jsp'">Add
			Product</button>
	</div>
	<hr>
 	-->
	<s:form action="welcomeAction" class="formSearch">
		<s:textfield name="prodName" label="Name"></s:textfield>
		<s:textfield name="prodCategory" label="Category"></s:textfield>
		<sx:datetimepicker name="createDate" label="Date"
			displayFormat="dd/MM/yyyy" ></sx:datetimepicker>
		<s:submit value="Search"></s:submit>
	</s:form>


	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Prod Name</th>
				<th>Prod Category</th>
				<th>Prod Price</th>
				<th>Dt created</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>

		<s:iterator value="products" var="tempProduct">
			<s:url action="updateDataAction" var="url">
				<s:param name="prodId" value="#tempProduct.prodId"></s:param>
				<s:param name="prodName" value="#tempProduct.prodName"></s:param>
				<s:param name="prodCategory" value="#tempProduct.prodCategory"></s:param>
				<s:param name="prodPrice" value="#tempProduct.prodPrice"></s:param>
				<s:param name="createDate" value="#tempProduct.createdDate"></s:param>
			</s:url>
			<s:set var="id" value="#tempProduct.prodId"></s:set>

			<tr>
				<th><s:property value="#tempProduct.prodId" /></th>
				<th><s:property value="#tempProduct.prodName" /></th>
				<th><s:property value="#tempProduct.prodCategory" /></th>
				<th><s:property value="#tempProduct.prodPrice" /></th>
				<th><s:property value="#tempProduct.createDate" /></th>
				<th>
					<button onclick="window.location.href='${url}'">Update</button>
				</th>
				<th><button
						onclick="window.location.href='deleteAction?prodId=${id}'">Delete</button></th>
			</tr>

		</s:iterator>
	</table>
</body>
</html>