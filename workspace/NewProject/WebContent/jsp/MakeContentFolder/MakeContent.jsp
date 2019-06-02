<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<%
	String where = (String)request.getAttribute("where");
	if(where.equals("Notice")){
		%>
		<%@ include file="./MakeNoticeContent.jsp" %>
		<% 
	}
	else if(where.equals("Board")){
		%>
		<%@ include file="./MakeBoardContent.jsp" %>
		<%
	}
	else if(where.equals("QnA")){
		%>
		<%@ include file="./MakeQnAContent.jsp" %>
		<%
	}
	%>
</body>
</html>