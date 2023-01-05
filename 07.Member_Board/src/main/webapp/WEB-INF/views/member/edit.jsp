<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>edit</title>
<script>
	function edit(){
		pwd=prompt("비밀번호 확인")
		if(pwd='${m.pwd}'){
			f.submit();
		}else{
			alert('패스워드 불일치 \n 정보수정 취소');
		}
	}
</script>
</head>
<body>
	<h3>editForm</h3>
	<form name="f" action="${pageContext.request.contextPath}/member/edit" method="post">
		<table border="1">
		<tr>
			<td><input type="text" name="id" value="${m.id}" readonly></td>
		</tr>
		<tr>
			<td><input type="text" name="pwd" value="${m.pwd}"></td>
		</tr>
		<tr>
			<td><input type="text" name="name" value="${m.name}"></td>
		</tr>
		<tr>
			<td><input type="text" name="email" value="${m.email}"></td>
		</tr>
		<tr>
			<td><input type="button" value="edit" onclick="edit()"></td>
		</tr>
	</table>
	</form>
</body>
</html>