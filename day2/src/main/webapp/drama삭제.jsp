<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function delete1(){
	alert("delete");
	let code = $("#code").val();
		alert(code);
	
	// ajax
	$.ajax({
		type:"delete",
		url:"/day2/drama/"+code,		//  +code  => path Variable
		success: function(data){
			alert(data);
		},
		error: function(){
			alert("error");	
		}
	})
}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" id="code" placeholder="d0003">
	<button onclick="delete1()">삭제</button>
</body>
</html>