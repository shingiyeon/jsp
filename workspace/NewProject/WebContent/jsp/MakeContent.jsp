<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String where = request.getParameter("where");
%>

<form action="http://localhost:8090/NewProject?to=notice.jsp" method="post">
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