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
			<td>제목</td>
			<td>링크</td>
			<td>이미지</td>
			<td>가격</td>
		
		</tr>
		
	
		<c:forEach var="naver" items="${nListPrac}">
		
		<tr>
			<td>${naver.title}</td>
			<td><a href="${naver.link}">${naver.link}</a></td>
			<td><img width:150px height="150px" src = "${naver.image}"></td>
			<td>${naver.lprice}</td>
		
		</tr>

	
	</c:forEach>
	</table>

</body>
</html>