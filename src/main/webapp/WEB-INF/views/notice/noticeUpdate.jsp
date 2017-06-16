<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="noticeUpdate" method="post">
		<input type="hidden" name="num" value="${dto.num}">
		<p>writer:<input type="text" name="writer" value="${dto.writer}" readonly="readonly"></p>
		<p>title:<input type="text" name="title" value="${dto.title }"></p>
	<p><textarea rows="25" cols="40" name="contents" value="${dto.contents}"></textarea></p>
	<input type="submit" name="UPDATE">
		
	</form>

</body>
</html>