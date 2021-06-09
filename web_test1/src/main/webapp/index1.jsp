<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--JSP 一个java类 可以写 HTML CSS JavaScript Java (java代码须放在标签内)-->
<p>请输入用户名name:</p>
<input type="text" name="userName">
<%
int num = 520;
String name = "yuyu";
%>
<%
out.print("Hello World");
%>
<%=num %>
</body>
</html>