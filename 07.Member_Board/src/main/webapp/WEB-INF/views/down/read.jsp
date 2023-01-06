<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>read</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	${document}.ready(function(){
		$("#btn").click(function(){
			$("#mybtn").css('display','');
		});
		$('#del').click(function(){
			location.href="${pageContext.request.contextPath}/down/del?num=${f.num}";
		});
		$('#dw1').click(function(){
			location.href="${pageContext.request.contextPath}/down/download?num=${f.num}";
		});
		$('#dw2').click(function(){
			location.href="${pageContext.request.contextPath}/down/preview?num=${f.num}";
		});
	});
</script>
</head>
<body>
	<c:set var="read">
		<c:if test="${sessionScope.id!=f.writer_id}">readonly</c:if>
	</c:set>
	<h3>자료읽기</h3>
	<table border="1" cellspacing="0">
		<tr>
			<th>num</th>
			<td><input type="text" name="num" value="${f.num}" readonly/></td>
		</tr>
		<tr>
			<th>writer_id</th>
			<td><input type="text" name="writer_id" value="${f.writer_id}" /></td>
		</tr>
	
		<tr>
			<th>title</th>
			<td><input type="text" name="title" value="${f.title}" ${read}/></td>
		</tr>
		<tr>
			<th>file</th>
			<td>${fileName}
				<input type="button" id="btn" value="파일바꾸기"/>
				<div id="mydiv" style="display:none"><input type="file"name="file"></div>	
			</td>
		</tr>
		<tr>
			<th>date</th>
			<td><input type="text" name="title" value="${f.up_date}"readonly/></td>
		</tr>
		<tr>
			<th>down/preview</th>
			<td><input type="button"  id="bw1" value="다운로드" />
				<input type="button"  id="bw2" value="미리보기" />
			</td>
		</tr>
		<tr>
			<th>다운수</th>
			<td><input type="text" name="hit" value="${f.hit}" readonly/></td>
		</tr>

		<tr>
			<th>content</th>
			<td>
				<textarea rows="5"cols="35"name="content" ${read}>${f.content}</textarea>
			</td>
		</tr>	
		<c:if test="${sessionScope.id==f.writer_id}">
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
					<input type="button" value="삭제" id="del">
				</td>
			</tr>
		</c:if>
	</table>
</body>
</html>