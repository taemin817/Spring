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
toString이 User객체에 있어서 자동으로 toString을 불러옴
	<ul>
		<c:forEach items="${list}" var="item">
			<li>${item}</li>
		</c:forEach>
	</ul>
User 객체에 있는 id와 pw를 불러옴
	<ul>
		<c:forEach items="${list}" var="item">
			<li>${item.id}, ${item.pw}</li>
		</c:forEach>
	</ul>
</body>
</html>