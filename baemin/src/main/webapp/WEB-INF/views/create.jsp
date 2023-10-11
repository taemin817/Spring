<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function create(){
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
		url:"/baemin/menuCreate",
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
<h2>등록화면</h2>
메뉴코드:<input type="text" id="Num"><br/>
메뉴명 : <input type="text" id="Name"><br/>
가     격 : <input type="text" id="Price"><br/>
설     명 : <textarea id="Intro"></textarea>
<button onclick=create()>등록</button>
</body>
</html>