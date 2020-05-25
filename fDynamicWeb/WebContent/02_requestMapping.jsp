<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_requestMapping.jsp</title>
</head>
<body>

<h1>Request Mapping 실습</h1>
<a href="board/a.do">요청1</a>
<a href="board/b.do">요청2</a>
<a href="board/c.do?id=kim">요청3</a>
<a href="board/c.do">요청4</a>

<h2>데이터 입력받기</h2>
<form action="board/request.do" method="post">
<!-- 	#################### MemberVO의 setter -->
	아이디 : <input type="text" name='id'/>
	이름 : <input type="text" name='name'/>
	나이 : <input type="text" name='age'/>
	<input type="submit" value="전송"/>
</form>
</body>
</html>