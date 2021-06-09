<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
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

当前用户：   <%out.print(session.getAttribute("user").toString()); %>
<br/>
<br/>
<!-- 
request.getAttribute("StudentLis");
 -->
<table>
	<tr>
		<td>学号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>语文</td>
		<td>数学</td>
		<td>英语</td>
	</tr>
	<c:forEach items="${StudentList}" var="student">
	<tr>
		<td>${student.student_id}</td>
		<td>${student.name}</td>
		<td>${student.sex}</td>
		<td>${student.chinese}</td>
		<td>${student.math}</td>
		<td>${student.english}</td>
		<td><a href="<%=path%>/getOneStudent?student_id=${student.student_id}">修改</a></td>
		<td><a href="<%=path%>/DelStudentByStudentIdServlet?student_id=${student.student_id}" onclick="if(confirm('是否删除'+'学生  '+'${student.name}')==false) return false">删除</a></td>
	</tr>	
	</c:forEach>
<tr>
	<td><a href="<%=path%>/web/AddOneStudent.jsp">新增学生</a></td>
</tr>
<tr>
	<td><a href="<%=path%>/GetRankBySexServlet?sex=male">男生排名</a></td>
	<td><a href="<%=path%>/GetRankBySexServlet?sex=famale">女生排名</a></td>
	<td><a href="<%=path%>/GetRankBySubjectServlet?subject=chinese">语文排名</a></td>
	<td><a href="<%=path%>/GetRankBySubjectServlet?subject=math">数学排名</a></td>
	<td><a href="<%=path%>/GetRankBySubjectServlet?subject=english">英语排名</a></td>
</tr>
</table>
</body>
</html>