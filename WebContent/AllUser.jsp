<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.km.registeandlogin.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AllUser</title>
</head>
<body>
	<!-- 
	<%
		String username = (String)session.getAttribute("username");
	%>
	
	用户：getAttribute<%=username%>
	 -->
	 用户 ：${sessionScope.username}
	<br />
	<table>
		<tr>
			<th>用户名</th>
			<th>密码</th>
			<th>状态</th>
		</tr>
		<%
			List<User> list = (ArrayList<User>) request.getAttribute("alList");
			for (User user : list) {
		%>
		<tr>
			<td><%=user.getUsername()%></td>
			<td><%=user.getPassword()%></td>
			<td><%=user.getStatus()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>