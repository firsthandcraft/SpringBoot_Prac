<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>멤버 목록</h3>
<c:forEach var="m" items="${list}">
${m.id } / ${m.pwd } / ${m.name } / ${m.email } <br/>
</c:forEach>
</body>
</html>