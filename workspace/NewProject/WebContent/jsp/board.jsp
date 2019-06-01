<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="board.BoardContent" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판입니다.</title>
</head>
<body>
	<%@ include file="./map.jsp"%>
	<h1>자유게시판입니다.</h1>
	<%
		List<BoardContent> boards = (List<BoardContent>)request.getAttribute("datas");
		for(BoardContent board : boards){
			%>
			<%= board.getBoardNo() %>
			&nbsp;
			<%= board.getTitle() %>
			&nbsp;
			<%= board.getBody() %>
			&nbsp;
			<%= board.getWriter() %>
			<hr>
		<%
		}
	%>
	<span style="border: black solid 1px;">	<a href="/board/make">Board 작성</a> </span>
</body>
</html>