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
		<li><a href="/home">메인으로 가기</a></li>
		<li><a href="/notice/list">공지사항</a></li>
		<li><a href="/board/list">자유게시판</a></li>
		<li><a href="/QnA/list">질문과 답변</a></li>
		<li><a href="/jsp/temp.jsp">임시</a></li>
	</ul>
</body>
</html>