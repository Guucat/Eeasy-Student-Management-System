<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=path %>/AddStudentInfoServlet">
学号<input type="text" name="student_id" >
姓名<input type="text" name="name" >
性别<select name="sex">
	<option value="男">男</option>
	<option value="女">女</option>
</select>
<br/>
<br/>
语文<input type="text" name="chinese" value="${student.chinese}">
数学<input type="text" name="math" value="${student.math}">
英语<input type="text" name="english" value="${student.english}">
<br/>
<br/>
<input type="submit" value="确认增加">
</form>
</body>
</html>