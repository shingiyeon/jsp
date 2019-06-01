<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="board.QnAContent" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>질문과 답변입니다.</title>
</head>
<body>
	<%@ include file="./map.jsp"%>
	<h1>질문과 답변입니다.</h1>
	<%
		List<QnAContent> qnas = (List<QnAContent>)request.getAttribute("datas");
		for(QnAContent qna : qnas){
			%>
			<%= qna.getQnANo() %>
			&nbsp;
			<%= qna.getTitle() %>
			&nbsp;
			<%= qna.getBody() %>
			&nbsp;
			<%= qna.getWriter() %>
			<hr>
	<%
		}
	%>
	<span style="border: black solid 1px;"><a href="/QnA/make">QnA 작성</a></span>
</body>
</html>