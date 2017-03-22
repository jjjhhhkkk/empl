<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br>

<br>

<h1>직원정보입력	</h1>
<form action="empinsert.do" method="post">
		<table border="1" >
			<tr>
				<td>직원번호</td>
				<td>이름</td>
				<td>성</td>
				<td>이메일</td>
				<td>부서</td>
				<td>급여</td>
				<td>직업코드</td>
				<td>입사일</td>
			</tr>

			<tr>
				<td><input type="number" name="employee_id"}"></td>
				<td><input type="text" name="first_name"></td>
				<td><input type="text" name="last_name"></td>
				<td><input type="text" name="email" ></td>
				<td>
					<select name="department_id">
						<c:forEach var="dd" items="${deptlist }">
							<option value="${dd.department_id }">${dd.department_name}</option>
						</c:forEach>
				</td>
				<td><input type="number" name="salary"> </td>
				<td>
					<select name="job_id">
						<c:forEach var="jj" items="${jobs }">
							<option value="${jj }">${jj }</option>
						</c:forEach>
					</select>
				</td>
				<td><input type="date" name="hire_date"></td>
			</tr>
			<tr>
			<td colspan="8"><input type="submit" value="입력하기"></td>
			</tr>
		</table>
	</form>
</body>
</html>