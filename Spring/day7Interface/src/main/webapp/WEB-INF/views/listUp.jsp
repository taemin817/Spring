<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>뭐야</th>
			<th>몰라</th>
		</tr>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.latitude}</td>
				<td>${item.longitude}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>