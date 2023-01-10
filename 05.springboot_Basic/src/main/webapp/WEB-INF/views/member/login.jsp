<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>로그인</h3>
<form action="/member/login" method="post">
id:<input type="text" name="id"><br/>
pwd:<input type="password" name="pwd"><br/>
<input type="submit" value="로그인">
<a href="/member/join">회원가입</a>
</form>
</body>
</html>