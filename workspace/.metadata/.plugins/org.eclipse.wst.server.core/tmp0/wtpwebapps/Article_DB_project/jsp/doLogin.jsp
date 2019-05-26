<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("loginId");
	String pw = request.getParameter("loginPw");
	
	Context initContext = new InitialContext();
	Context envContext  = (Context)initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource)envContext.lookup("jdbc/userDB");
	Connection conn = ds.getConnection();
	
	PreparedStatement st = conn.prepareStatement("select * from user_tb where loginId = ?");
	st.setString(1, id);
	
	ResultSet rs = st.executeQuery();
	
	if(rs.next()){
		if(rs.getString("loginPw").equals(pw)){
			String name = rs.getString("userName");
			%>
			<%= name %>님 안녕하세요!
			<br>
			ID : <%= id %>
			<br>
			PW : <%= pw %>
		<%	
		}
		else{
		%>
			비밀번호가 틀렸습니다!
		<%
		}
	}
	else{
	%>
		아이디가 존재하지 않습니다!
	<%
	}
%>
</body>
</html>