<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
$(document).ready({
	function(){
		$.post("/admin/getsub",{
			type :1,//대분류 번호 
			p_id :0 //
			
		}).done(function(data){
			var c= eval("("+data+")");
			for (i=0; i<c.length;i++){
				$("#s1").append(
					"<option value='"+c[i],id+"'>"
					+c[i].name+"</option>");//대분류 값을 받아와서 추가하고
			}
		})
	}


});
</script>
</head>
<body>
	<h3>상품 등록 페이지</h3>
	<form action="${pageContext.request.contextPath}/seller/add" method="post"
		enctype="multipart/form-data">
	대분류<select id="s1" name="category1_id"></select>
	중분류<select id="s2" name="category2_id"></select>
	소분류<select id="s3" name="category3_id"></select><br>
	name :<input type="text"name="name">
	info :<input type="text"name="info">
	quantity :<input type="text"name="quantity">
	price :<input type="text"name="price">
	seller_id :<input type="text"name="seller_id" value="${sessionScope.id}" readonly>
	img1 :<input type="text"name="img1">
	img2 :<input type="text"name="img2">
	img3 :<input type="text"name="img3">
	<input type="reset" value="reset"/>
	<input type="submit" value="submit">
	</form>
</body>
</html>