<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ImgForm</title>
</head>
<body>
<h3>사진올리기</h3>
<form action="${pageContext.request.contextPath}/img/write" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td><input type="text" name="title"/></td>
		</tr>
		<tr>
			<td><input type="text" name="file"/></td>
		</tr>
		<tr>
			<td><input type="hidden" name="writer_id" value="${sessionScope.id}"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="올리기"/></td>
		</tr>
	</table>
</form>
</body>
</html>