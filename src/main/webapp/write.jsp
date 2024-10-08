<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 페이지</title>
</head>
<style>
   input {
      display: flex;
      flex-direction: column;
      justify-content: center;
      width: 200px;
      height: 15px;
   }
   
   button {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-content: center;
      width: 70px;
      height: 23px;
   }
</style>
<body>
	<form action="write-check.post" method="post">
		<input name="postTitle" placeholder="제목을 입력하세요" />
		<input name="postContent" placeholder="내용을 입력하세요"/>
		<button>업로드</button>
	</form>
</body>
</html>