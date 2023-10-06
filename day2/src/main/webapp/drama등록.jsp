<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function register(){
	let code = $("#code").val();
	let title = $("#title").val();
	let actors = $("#actors").val();
		alert(code);
		alert(title);
		alert(actors);
	let drama = {code:code, title:title, actors:actors };		// => json 문자열 구조로 바꿔줘야함
	let dramas = JSON.stringify(drama);
	console.log(drama);
	console.log(dramas);
	$.ajax({
		type:"post",
		url:"/day2/drama",
		data: dramas,
		contentType: "application/json",
		success: function(data){
			alert(data);
		},
		error: function(){
			alert("no");	
		}
	})
}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" id="code" placeholder="d0003">
	<input type="text" id="title">
	<input type="text" id="actors">
	<button onclick=register()>등록</button>
</body>
</html>