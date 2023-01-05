<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>login</title>
</head>
<body>
<h3>login</h3>
	<form action="${pageContext.request.contextPath}/member/login" method="post">
	<table border="1">
		<tr>
			<td><input type="text" name="id" placeholder="id"></td>
		</tr>
		<tr>
			<td><input type="text" name="pwd" placeholder="pwd"></td>
		</tr>
		<tr>
			<td><input type="submit" value="login"></td>
		</tr>
	</table>
	</form>
	<a href="${pageContext.request.contextPath}/member/join">회원가입</a>
</body>
</html>