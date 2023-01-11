<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>판매자</h3>
<h4>내가등록한 상품</h4>
<c:if test="${empty list}">
등록된 상품이 없다.
</c:if>
<a href="${pageContext.request.contextPath}/seller/form">
상품 등록 페이지로 이동</a>
<c:if test="${not empty list }">
	<table border="1" >
		<tr>
			<th>num</th>
			<th>name</th>
			<th>description</th>
			<th>quantity</th>
			<th>price</th>
			<th>대분류</th>
			<th>중분류</th>
			<th>소분류</th>
		</tr>
		<c:forEach var="p" items="${list}">
			<tr>
				<td>num</td>
				<td><a href="${pageContext.request.contextPath}/seller/itemView?num={p.num}&type=1">${p.name}</a></td>
				<td>${p.info}</td>
				<td>${p.quantity}</td>
				<td>${p.price}</td>
				<td>${p.category1_id}</td>
				<td>${p.category2_id}</td>
				<td>${p.category3_id}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>