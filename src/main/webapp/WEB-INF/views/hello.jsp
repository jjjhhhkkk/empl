<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<p>${name }입니다 안녕~</p>
<p>${empsize }의 크기</p>
<table border="1">
<c:forEach var = "emp" items="${emplist }">
<tr><td>${emp.employeeId }</td><td>${emp.firstName }</td><td>${emp.lastName }</td><td>${emp.salary }</td>
</tr>
</c:forEach>
</table>
</body>
</html>