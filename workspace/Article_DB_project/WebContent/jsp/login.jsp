<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>
<form action="./doLogin.jsp" method="get">
	ID : <input type="text" name="loginId" placeholder="아이디 입력">
	<br>
	Password : <input type="password" name="loginPw" placeholder="비밀번호 입력">
	<br>
	<input type="submit" value="로그인">
</form>
</body>
</html>