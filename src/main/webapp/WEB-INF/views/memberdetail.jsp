<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="fix.do" method="post">
		<table border="1">
			<tr>
				<td>email</td>
				<td>pwd</td>
				<td>mname</td>
				<td>cre_date</td>
				<td>mod_date</td>
				<td>mno</td>
			</tr>
			<tr>
				<td><input type="text" name="email"
					value="${mem.email}"></td>
				<td><input type="text" name="pwd"
					value="${mem.pwd }"></td>
				<td><input type="text" name="mname"
					value="${mem.mname }"></td>
				<td><input type="date" name="cre_date"
					value="${mem.cre_date }"></td>
				<td><input type="date" name="mod_date"
					value="${mem.mod_date }"></td>
				<td><input type="number" name="mno"
					value="${mem.mno }" readonly></td>
			</tr>
			<tr>
				<td colspan="6"><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>
</body>
</html>