<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap Core CSS -->
<link
	href="resources/bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="resources/bower_components/metisMenu/dist/metisMenu.min.css"
	rel="stylesheet">

<!-- DataTables CSS -->
<link
	href="resources/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet">

<!-- DataTables Responsive CSS -->
<link
	href="resources/bower_components/datatables-responsive/css/dataTables.responsive.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="resources/bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    
</head>
<body>
	<h1>memlist 입니다.</h1>
	<a href="add.do">멤버 추가하기</a>
	<table class="table table-striped table-bordered table-hover">
		<tr>
			<td>email</td>
			<td>pwd</td>
			<td>mname</td>
			<td>cre_date</td>
			<td>mod_date</td>
			<td>mno</td>
			<!-- <td>-</td> -->
		</tr>
		<c:forEach var="mem" items="${memlist }">
			<tr>
				<td>${mem. email}</td>
				<td>${mem.pwd }</td>
				<td>${mem.mname }</td>
				<td>${mem.cre_date }</td>
				<td>${mem.mod_date }</td>
				<td><a href="memdetail.do?mno=${mem.mno }">${mem.mno }</a></td>
				<%-- <td><input type="button"  value="삭제" onclick="location.href='delete.do?mno=${mem.mno}'"></td> --%>
				<td><input type="button" value="삭제" onclick="location.href='memdelete.do?mno=${mem.mno}'">
			</tr>
		</c:forEach>

	</table>
</body>
</html>