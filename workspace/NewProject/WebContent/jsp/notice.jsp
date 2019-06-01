<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="board.NoticeContent" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항입니다.</title>
</head>
<body>
	<%@ include file="./map.jsp"%>
	<h1>공지사항입니다.</h1>
	<%
		List<NoticeContent> notices = (List<NoticeContent>)request.getAttribute("datas");
		for(NoticeContent notice : notices){
			%>
			<%= notice.getNoticeNo() %>
			&nbsp;
			<%= notice.getTitle() %>
			&nbsp;
			<%= notice.getBody() %>
			&nbsp;
			<%= notice.getWriter() %>
			<hr>
	<%
		}
	%>
	<span style="border: black solid 1px;"><a href="/notice/make">notice 작성</a></span>
</body>
</html>