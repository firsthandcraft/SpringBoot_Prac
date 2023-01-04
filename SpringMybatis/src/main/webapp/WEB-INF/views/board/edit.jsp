<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script>
function del(num){
	location.href = "${pageContext.request.contextPath }/board/del?num="+num;
}
</script>
</head>
<body>
	<c:set var="str">
 		<c:if test="${sessionScope.id != b.writer }"> <%--//���� �ۼ��� ���� �ƴҰ�� readonly�� �о  --%>
			readonly
		</c:if>
	</c:set>
	<h3>�� �б�</h3>
	<form action="${pageContext.request.contextPath }/board/edit"
		method="post">
		<table border="1" cellspacing="0">
			<tr>
				<th>�� ��ȣ</th>
				<td><input type="text" value="${b.num }" name="num" size="45"
					readonly></td>
			</tr>
			<tr>
				<th>�ۼ���</th>
				<td><input type="text" value="${b.writer }" name="writer"
					size="45" readonly></td>
			</tr>
			<tr>
				<th>�ۼ���¥</th>
				<td><input type="text" value="${b.w_date }" size="45" readonly></td>
			</tr>
			<tr>
				<th>�� ����</th>
				<td><input type="text" name="title" value="${b.title }"
					size="45" ${str }></td>
			</tr>
			<tr>
				<th>�� ����</th>
				<td><textarea name="content" rows="15" cols="45" ${str }>${b.content }</textarea></td>
<!-- 			     readonly�� �����ؼ� ������ ���´�.  -->
			</tr>
			<c:if test="${sessionScope.id == b.writer }">
				<tr>
					<td colspan="2">
					<input type="submit" value="����">
					<input type="button" value="����" onclick="del(${b.num})">
					</td>
				</tr>
			</c:if>
		</table>
	</form>
</body>
</html>