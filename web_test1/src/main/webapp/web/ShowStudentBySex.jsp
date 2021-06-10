<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%String path = request.getContextPath();%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>学号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>语文</td>
		<td>数学</td>
		<td>英语</td>
	</tr>
	<c:forEach items="${StudentBySexList}" var="student">
	<tr>
		<td>${student.student_id}</td>
		<td>${student.name}</td>
		<td>${student.sex}</td>
		<td>${student.chinese}</td>
		<td>${student.math}</td>
		<td>${student.english}</td>
	</tr>	
	</c:forEach>
</table>
<input type="button" name="Submit" value="返回" onclick="javascript:history.back()" />
</body>
</html>