<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Context initContext = new InitialContext();
	Context envContext  = (Context)initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource)envContext.lookup("jdbc/ArticleDB");
	Connection conn = ds.getConnection();
	
	Statement st = conn.createStatement();
	ResultSet rs = st.executeQuery("select * from test_tb");
	
	while(rs.next()){
		int articleNo = rs.getInt("articleNo");
		String title = rs.getString("title");
		String body = rs.getString("body");
		String writer = rs.getString("writer");
%>
		<%= articleNo %>
		<%= title %>
		<%= body %>
		<%= writer %>
		<hr>
<%
	}
%>
</body>
</html>