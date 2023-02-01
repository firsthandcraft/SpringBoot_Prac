<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입</h3>
<form action="/member/join" method="post">
id:<input type="text" name="id" id="id"><br/>
pwd:<input type="password" name="pwd"><br/>
name:<input type="text" name="name"><br/>
email:<input type="email" name="email"><br/>
<input type="submit" value="가입">
</form>
</body>
</html>