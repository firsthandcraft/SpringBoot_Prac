<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>main</title>
</head>
<body>
<h3>main</h3>
<p>
${sessionScope.id}님 로그인 상태 </p>
<a href="${pageContext.request.contextPath}/member/editForm">내정보수정</a>
<a href="${pageContext.request.contextPath}/member/logout">로그아웃</a>
<a href="${pageContext.request.contextPath}/member/out">탈퇴</a>

<c:if test="${sessionScope.type==3}">
	<c:set var="path" value="/member/adminPage"/>
</c:if>
<c:import url="${path}"></c:import>
</body>
</html>



