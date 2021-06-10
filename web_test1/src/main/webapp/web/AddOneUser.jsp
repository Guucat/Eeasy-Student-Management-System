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
<form action="<%=path %>/AddUserServlet" method="post">
教师姓名<input type="text" name="user_name" >
密码<input type="text" name="pwd" >
<input type="submit" value="注册">
</form>
</body>
</html>