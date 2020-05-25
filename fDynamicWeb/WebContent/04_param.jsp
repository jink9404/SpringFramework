<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>파라미터 실습</h1>
<a href="param.do?id=kim&age=22">요청 파라미터 2개</a>
<a href="param.do">요청 파라미터 0개</a>

<h2>로그인</h2>
<form action="paramForm.do">
	ID : <input type="text" name="id"/> <br>
	PASS : <input type="password" name="pass"/><br>
	<input type="submit" value="전송"/>
</form>
</body>
</html>