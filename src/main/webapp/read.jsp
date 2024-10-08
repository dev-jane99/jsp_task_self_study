<%@page import="com.app.vo.PostVO"%>
<%@page import="com.app.dao.PostDAO"%>
<%@page import="java.util.Optional"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선택된 게시물 페이지</title>
</head>
<body>
	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>
<table border="1">
	<tr>
		<th>게시물 번호</th>
		<th>게시물 제목</th>
		<th>내용</th>
	</tr>
	<tr>
		<td><%=post.getId() %></td>
		<td><%=post.getPostTitle() %></td>
		<td><%=post.getPostContent() %></td>
	</tr>
</table>
<a href="update.post?id=<%=request.getParameter("id") %>"><button>게시물 수정</button></a>
<a href="delete-check.post?id=<%=post.getId()%>"><button>게시물 삭제</button></a>
</body>
</html>