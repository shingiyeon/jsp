<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mypackage.Article"%>
<%@ page import="mypackage.ArticleManagement"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArticleManagement AM = ArticleManagement.GenerateArticleManagement();
	AM.initialArticle();
	List<Article> Articles = new ArrayList<Article>();
	Articles = AM.getArticles();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=0; i<Articles.size(); i++){
%>
	<div>게시물 번호: <%=Articles.get(i).getArticleNo()  %></div>
	<div>게시물 제목: <%=Articles.get(i).getArticleTitle() %></div>
	<div>게시물 내용: <%=Articles.get(i).getArticleBody() %></div>
	<div>게시물 작성자: <%=Articles.get(i).getArticleWriter() %></div>
	<hr>
		
<%
	}
%>

</body>
</html>