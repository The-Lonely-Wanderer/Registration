<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginSuccess</title>
</head>
<body>
	<!-- <%
		String username = (String) session.getAttribute("username");
		int count = (int) application.getAttribute("count");
	%> 
	欢迎光临：<%=username%><br />你是第<%=count%>位访问-->
	欢迎光临：${sessionScope.username}<br />你是第${applicationScope.count}位访问
	<br />
	<a href="AllUserServlet">查询所用用户信息</a>&nbsp&nbsp
	<a href="LoginOutServlet">退出登录</a>
</body>
</html>