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
<form action="<%=path %>/Login" method="post">
用户名：<input type=text name=user>
密码：<input type=password	 name=pwd>
<br/>
<input type=submit value="登录">
</form>
<form action="<%=path%>/web/AddOneUser.jsp" method="post">
<input type=submit value="注册" >
</form>
</body>
</html>