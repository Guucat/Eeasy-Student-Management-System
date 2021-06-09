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
if(name.equals("tsy") && pwd.equals("123")){
	//转发  相对路径
	//特点1.一次请求 2.地址栏不会发生改变 3.这个操作是服务端进行的
	//RequestDispatcher 这个类是一个分发器，用于跳转页面，属于服务器操作
	//RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
	//dispatcher.forward(request, response);
	//request.getRequestDispatcher("success.jsp").forward(request, response);
	//request 作用域
	//request.setAttribute("userName", name);
	//重定向 绝对路径
	//1.地址栏会发生改变 2.两次请求(无法获取放在第一次请求中发对象，包括request)3.属于客户端操作
	session.setAttribute("userName", name);
	response.sendRedirect("success.jsp");
}
else{
	//request.getRequestDispatcher("error.jsp").forward(request, response);
	//response.sendRedirect("error.jsp");
	response.sendRedirect("http://www.baidu.com");
}
%>
</body>
</html>