<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>editForm</title>
</head>
<body>
<h3>내 정보 수정</h3>
<form action="${pageCotext.request.contextPath}mmeber/edit" method="post">
	<table>
		<tr>
			<th>id </th>
			<td><input type="text" name="id" value="${m.id}" readonly></td>
		</tr>
		<tr>
			<th>pwd</th>
			<td><input type="text" name="pwd" value="${m.pwd}"></td>
		</tr>
		<tr>
			<th>name</th>
			<td><input type="text" name="name" value="${m.name}"></td>
		</tr>
		<tr>
			<th>tel</th>
			<td><input type="text" name="tel" value="${m.tel}"></td>
		</tr>
		<tr>
			<th>address</th>
			<td><input type="text" name="address" value="${m.address}"></td>
		</tr>
		<tr>
			<th>type</th>
			<td>
				<c:choose>
				<c:when test="${m.type==1}">구매자</c:when>
				<c:when test="${m.type==2}">판매자</c:when>
				<c:when test="${m.type==3}">관리자</c:when>
				<c:otherwise>잘못된 type</c:otherwise>
				</c:choose>
		</tr>
		<tr>
			<td><input type="reset" value="reset"></td>
			<td><input type="submit" value="edit"></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/mwember/main">main</a>
</form>
</body>
</html>