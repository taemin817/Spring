<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border-collapse: collapse; /* 테두리가 겹치지 않도록 설정 */
	width: 70%; /* 테이블의 폭을 100%로 설정 */
}

th, td {
	border: 1px solid black; /* 테두리 스타일 및 두께 설정 */
	padding: 8px; /* 셀 내부 여백 설정 (원하는 크기로 조정 가능) */
	text-align: left; /* 셀 내용을 왼쪽 정렬로 설정 (선택 사항) */
}

th {
	text-align: center;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>드라마코드</th>
			<th>드라마이름</th>
			<th>주연배우</th>
		</tr>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.code}</td>
				<td>${item.title}</td>
				<td>${item.actors}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>