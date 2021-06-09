<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
登录成功
你好
<%
//String s = request.getAttribute("userName").toString();
//out.print(s);
%>
<%
out.println("name:");
Object obj = session.getAttribute("userName");
if(obj!=null){
	out.print(obj.toString());
}

%>
</body>
</html>