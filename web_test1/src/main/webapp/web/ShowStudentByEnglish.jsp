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
		<td>英语</td>
	</tr>
	<c:forEach items="${StudentBySubjectList}" var="student">
	<tr>
		<td>${student.student_id}</td>
		<td>${student.name}</td>
		<td>${student.sex}</td>
		<td>${student.english}</td>
	</tr>	
	</c:forEach>
</table>
</body>
</html>