<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
$(document).ready(function(){
	$("#idCeck").click(function(){
		$.post("/member/idCheck",{id:$("#id").val()})
		.done(function(data){
			$("#idResult").text(data);	
		});
	});
	$("#join").click(function(){
		if($("idResult").text().trim()=="��밡��"){
			$("#joinForm").submit();
		} else{
			alert("id �ߺ�üũ ����");
		}
	});
});
	
</script>
</head>
<body>
	<h3>ȸ������</h3>
	<form id="joinForm" action="${pageCotext.request.contextPath}mmeber/join" method="post">
	<table>
		<tr>
			<th>id </th>
			<td><input type="text" name="id">
				<input type="button" name="idCheck" value="���̵� �ߺ�üũ">
				<br/><span id="idResult"></span>
			</td>
		</tr>
		<tr>
			<th>pwd</th>
			<td><input type="text" name="pwd"></td>
		</tr>
		<tr>
			<th>name</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>tel</th>
			<td><input type="text" name="tel"></td>
		</tr>
		<tr>
			<th>address</th>
			<td><input type="text" name="address"></td>
		</tr>
		<tr>
			<th>type</th>
			<td>
				<label>������<input type="radio" name="type" value="1"></label>
				<label>�Ǹ���<input type="radio" name="type" value="2"></label>
				<label>������<input type="radio" name="type" value="3"></label>	
			</td>
		</tr>
		<tr>
			<td><input type="button" id="join"value="ȸ������"></td>
			<td><input type="reset" value="���"></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/mwember/loginForm">�α���</a>
</form>
</body>
</html>



