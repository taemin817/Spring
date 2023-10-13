<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	table {
		text-align: center;
		border: 1px solid black;
	}
	td{
		border: 1px solid black;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<tr>
			<td>그레이드</td>
			<td>원인</td>
			<td>오버롤</td>
		
		</tr>
		<c:forEach var="apitest" items="${inform}">
		
		<tr>
			<td>${apitest.informGrade}</td>
			<td>${apitest.informCause}</td>
			<td>${apitest.informOverall}</td>
		
		</tr>

	
	</c:forEach>
	</table>

</body>
</html>