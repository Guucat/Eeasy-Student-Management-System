<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function toNewPage(){
		window.location="test3.jsp";
	}
</script>
</head>
<body>
	<%
		session.setAttribute("name","小摩尔");
	%>
	<input type="button" value="跳转页面" onclick="toNewPage()">
</body>
</html>