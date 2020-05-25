<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${sessionScope.login }님 로그인 성공
<hr/>

${member.id }님 로그인 성공 
${vo.id }님 로그인 성공<%-- ModelAtrribute("vo")로 인해서 사용가능 --%>
</body>
</html>