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
	Object obj=session.getAttribute("name");
	if(obj!=null){
		out.print(obj.toString());
	}else{
		out.print("null");
	}
%>
</body>
</html>