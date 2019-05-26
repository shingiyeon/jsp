<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<%
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i=1; i<=10; i++)
		list.add(i);
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=0; i<=9; i++)
		out.println(list.get(i));
%>

</body>
</html>