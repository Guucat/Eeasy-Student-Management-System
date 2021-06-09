<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="getRegisterInfo.jsp" method="get">
用户名：<input type="text" name="name">
密码：<input type="password" name="pwd">
性别：<input type="radio" name="sex" value="male">男
	<input type="radio" name="sex" value="female">女
请选择城市：
<select name="city">
<option value="长安">长安</option>
<option value="白帝城">白帝城</option>
<option value="洛阳">洛阳</option>
</select>
<input type="checkbox" name="hobby" value="唱">唱
<input type="checkbox" name="hobby" value="跳">跳
<input type="checkbox" name="hobby" value="rap">rap
<input type="checkbox" name="hobby" value="篮球">篮球
<input type="submit" value="注册">


</form>
</body>
</html>