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
<%
%>
<form action="<%=path %>/UpdateStudentInfoServlet">
学号<input type="text" name="student_id"  readonly="readonly"  value="${student.student_id}(不可修改)">
姓名<input type="text" name="name" value="${student.name}">
性别<input type="text" name="sex" value="${student.sex}">
<br/>
<br/>
语文<input type="text" name="chinese" value="${student.chinese}">
数学<input type="text" name="math" value="${student.math}">
英语<input type="text" name="english" value="${student.english}">
<br/>
<input type="submit" value="确认修改">
</form>
</body>
</html>