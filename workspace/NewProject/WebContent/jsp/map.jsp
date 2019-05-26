<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	ul, li {
		display: inline-block;
		list-style: none;
		text-decoration: none;
		margin: 0;
		padding: 0;
	}
	a {
		text-decoration: none;
		color: inherit;
	}
	
	ul > li{
		margin: 0 10px;
	}
	
</style>
</head>
<body>
	<ul>
		<li><a href="/NewProject/jsp/home.jsp">메인으로 가기</a></li>
		<li><a href="http://localhost:8090/NewProject?to=notice.jsp">공지사항</a></li>
		<li><a href="http://localhost:8090/NewProject?to=board.jsp">자유게시판</a></li>
		<li><a href="http://localhost:8090/NewProject?to=QnA.jsp">질문과 답변</a></li>
	</ul>
</body>
</html>