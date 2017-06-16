<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
	border-collapse: collapse;
	}
	tr{
	border: 1px black solid;
	}
	td{
	border: 1px black solid;
	}
</style>
</head>
<body>
<h2>NOTICE VIEW</h2>

	<table>
		<tr>
			<td>${view.title}</td><td>${view.writer}</td><td>${view.reg_date}</td><td>${view.hit }</td>
		</tr>
		<tr>
			<td colspan="4">${view.contents}</td>
		</tr>
	</table>

<a href="noticeUpdate?num=${view.num}">Update</a>
<a href="noticeDelete?num=${view.num}">Delete</a>
<a href="noticeList">List</a>

</body>
</html>