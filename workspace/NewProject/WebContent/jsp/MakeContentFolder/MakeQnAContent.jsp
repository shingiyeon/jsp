<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>QnA 작성</h1>
<form action="/QnA/MakeComplete" method="get">
	제목 : <input type="text" name="title" placeholder="제목 입력">
	<br>
	내용 : <input type="text" name="body" placeholder="내용 입력">
	<br>
	작성자 : <input type="text" name="writer" placeholder="작성자 입력">
	<br>
	<input type="submit" value="작성">
</form>

</body>
</html>