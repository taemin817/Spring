<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
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
<script>
	function toCreatePage(){
		let registerUrl = "/baemin/menuCreate";
		window.location.href=registerUrl;
	}
</script>
<script>
	function toUpdatePage(code){
		let updateUrl = "/baemin/menuUpdate?menuNum="+ code;
		window.location.href=updateUrl;
	}
</script>
<script>
        function deleteMenu(menuNum) {
        	alert("delete");
            $.ajax({
                type: "get",
                url: "/baemin/menuDelete?menuNum="+menuNum ,
                data: menuNum, // 삭제할 항목의 식별자를 전달               
                success: function(menuNum) {
       			 window.location.href="/baemin/menuRead";
                },
                error: function(error) {
                    alert("실패");
                }
            });
        }
    </script>
</head>
<body>
	<table>
		<tr>
			<th>메뉴코드</th>
			<th>메뉴명</th>
			<th>가격</th>
			<th>메뉴설명</th>
			<th colspan=2>메뉴관리</th>
		</tr>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.menuNum}</td>
				<td>${item.menuName}</td>
				<td>${item.menuPrice}</td>
				<td>${item.menuIntro}</td>
				<td><button onclick="toUpdatePage('${item.menuNum}')">수정</button></td>
				<td><button onclick="deleteMenu('${item.menuNum}')">삭제</button></td>
			</tr>
		</c:forEach>
	</table>
	<button onclick="toCreatePage()">메뉴 등록</button>
</body>
</html>