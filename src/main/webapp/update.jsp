<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 페이지</title>
</head>
<body>
	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>
	<form action="update-check.post" method="post">
		<input name="id" type="hidden" value="<%=post.getId() %>"/>
			<div>
				<span>게시물 제목</span><input name="postTitle" type="text" value="<%=post.getPostTitle() %>"/>
			</div>
			<div>
				<span>게시물 내용</span><input name="postContent" type="text" value="<%=post.getPostContent() %>"/>
			</div>
			<button>수정 완료</button>
	</form>
</body>
</html>