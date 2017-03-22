<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>
	<h1>Detail View</h1>
	<form action="empfix.do" method="post">
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>성</td>
			<td>급여</td>
		</tr>
		<tr>
			<td><input type="text" name="employee_id" value="${emp.employee_id }" readonly></td>
			<td><input type="text" name="first_name" value="${emp.first_name }"></td>
			<td><input type="text" name="last_name" value="${emp.last_name }"></td>
			<td><input type="text" name="salary"  value="${emp.salary }"></td>
		</tr>
	</table>
	<input type="submit" value="수정">
	</form>
</body>
</html>