<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function update(){
	let menuNum = $("#Num").val();
	let menuName = $("#Name").val();
	let menuPrice = $("#Price").val();
	let menuIntro = $("#Intro").val();
	let menu = {menuNum:menuNum, menuName:menuName, menuPrice:menuPrice, menuIntro:menuIntro };		// => json 문자열 구조로 바꿔줘야함
	let menues = JSON.stringify(menu);
	console.log(menu);
	console.log(menues);
	$.ajax({
		type:"post",
		url:"/baemin/menuUpdate",
		data: menues,
		contentType: "application/json",
		success: function(data){	
			 window.location.href="/baemin/menuRead";
		},
		error: function(){
			alert("no");	
		}
	})
}
</script>
</head>
<body>
<h2>수정화면</h2>
메뉴코드:<input type="text" id="Num"  value="${one.menuNum }" readonly="readonly" ><br/>
메뉴명 : <input type="text" id="Name"   value="${one.menuName }"><br/>
가     격 : <input type="text" id="Price"  value="${one.menuPrice }"><br/>
설     명 : <textarea id="Intro"> ${one.menuIntro }</textarea>
<button onclick=update()>수정</button>
</body>
</html>