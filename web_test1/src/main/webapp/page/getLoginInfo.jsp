<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("userName");
String passWord = request.getParameter("passWord");
out.println("name:" + name +"\n" +  "passWord:" + passWord);
%>
</body>
</html>