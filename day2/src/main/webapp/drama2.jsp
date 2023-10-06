<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
<!DOCTYPE html>
<html>
	<script>
		function search() {
			$.ajax({
				type : "GET",
				url : "/day2/drama",
				success : function(data) {
					console.log(data);
					let result = toHtml(data);
					$("#result").html(result);
				},
				error : function() {
					alert("error");
				}
			});
		}
		
		function toHtml(d){	 
			console.log( d);	
			let str="<ul>";
			for( let i=0 ; i< d.length; i++){
				let item = d[i];
				str+= "<li>"+ item.code +" "+ item.title +" "+ item.actors + "<li>";  
			}  
			str+= "</ul>"
			alert(str)
			return str;
		}
	</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<button onclick = "search()">드라마 조회</button>
<div id="result" ></div>
</body>
</html>