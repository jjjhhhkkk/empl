<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Testing EMPLIST</h1>
<a href="empinsert.do">신규등록</a>
<hr>
<table border="1">
<tr><td>아이디</td><td>이름</td><td>성</td><td>급여</td></tr>
<c:forEach var = "emp" items="${emplist }">
<tr><td><a href="/javab/detail.do?empid=${emp.employee_id }">${emp.employee_id }</a></td><td>${emp.first_name }</td><td>${emp.last_name }</td><td>${emp.salary }</td>
<td><input type="button" value="삭제" onclick="location.href='memdelete2.do?employee_id=${emp.employee_id}'"></td>
</tr>
</c:forEach>
</table>
</body>
</html>