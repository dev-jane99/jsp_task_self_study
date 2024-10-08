<%@page import="com.app.vo.PostVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모든 게시글 페이지</title>
</head>
<style>
   input {
      display: flex;
      flex-direction: column;
      width: 200px;
      height: 15px;
      margin-top: 5px;
   }
   
   button {
      display: flex;
      flex-direction: column;
      width: 70px;
      height: 23px;
      margin-top: 10px;
   }
</style>

<body>
	<table border="1">
		<tr>
			<th>게시물 번호</th>
			<th>게시물 제목</th>
			<th>내용</th>
		</tr>
		
		<%
			List<PostVO> posts = (List<PostVO>)request.getAttribute("posts");
		    for(PostVO post : posts){
		%>
		<tr>
			<td><%=post.getId() %></td>
			<td><a href="read.post?id=<%=post.getId() %>"><%=post.getPostTitle() %></a></td>
			<td><%=post.getPostContent() %></td>
		</tr>
		<%
		    }
		%>
	</table>
</body>
</html>