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
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
String city = request.getParameter("city");
String[] hobbies = request.getParameterValues("hobby");
out.println(name +"  " + pwd +"  " + city );
for(String hobby:hobbies)
	out.println(hobby);
%>
</body>
</html>