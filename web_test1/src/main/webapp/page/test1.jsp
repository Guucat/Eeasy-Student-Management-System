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
//所有的getAttribute都是object类型的
Object obj = application.getAttribute("count");
if(obj==null){
	application.setAttribute("count", 1);
}else{
	int newCount = Integer.parseInt(obj.toString());
	application.setAttribute("count", newCount + 1);
}
out.print("当前系统在线人数为:" + application.getAttribute("count"));
%>
</body>
</html>