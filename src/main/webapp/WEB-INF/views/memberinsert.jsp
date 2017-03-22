<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form acton="/add.do" method="post">
<table border="1">
<tr>
<td>email</td><td>pwd</td><td>mname</td>
<td>cre_date</td><td>mod_date</td>
</tr>
<tr>
<td><input type="text" name="email"></td><td><input type="text" name="pwd"></td>
<td><input type="text" name="mname"></td><td><input type="date" name="cre_date"></td>
<td><input type="date" name="mod_date"></td>
</tr>
<tr><td colspan="5"><input type="submit" value="입력"></td>
</table>
</form>
</body>
</html>