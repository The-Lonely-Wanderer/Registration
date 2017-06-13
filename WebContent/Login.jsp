<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<!-- <link rel="stylesheet" type="text/css" -->
<!-- 	href="/registerandlogin3.0/css/login.css"> -->
<script rel="stylesheet" type="text/javascript"
	src="/registerandlogin3.0/js/login.js">
	
</script>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		String username = null;
		String password = null;
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if ("username".equals(cookies[i].getName())) {
					username = cookies[i].getValue();
				} else if ("passsword".equals(cookies[i].getName())) {
					password = cookies[i].getValue();
				}
			}
			if (username != null && password != null) {
				session.setAttribute("username", username);
				request.getRequestDispatcher("loginsuccess.jsp?username=" + username + "&password=" + password)
						.forward(request, response);
			}
		}
	%>
	<form id="loginfrom" action="loginfrom" method="post">
		<div id="login-a">
			<p>
				<span>用户名：</span> <input id="username" type="text" name="username"
					style="outline: none;" onblur="usernamef()" /> <span id="sp1">用户名不能为空</span>
			</p>
			<p>
				<span>密&nbsp&nbsp&nbsp码：</span> <input id="password" type="password"
					name="password" style="outline: none;" onblur="passwordf()" /> <span
					id="sp">密码不能为空</span>
			</p>
			<p>
				7天免验证<input type="radio" name="nocheck" value="ok">是<input
					type="radio" name="nocheck" value="no" checked="checked">否
			</p>
			<p>
				<input id="login" type="button" value="登录" onclick="buttonsub()" />
				<input id="no" type="button" value="返回" onclick="isbaa()" /> <a
					href="AllUserServlet">查询所用用户信息</a>
			</p>
			<%
				String message = (String) request.getAttribute("message");
				if (null != message || "".equals(message)) {
			%>
			<p style="color: red;"><%=message%></p>
			<%
				}
			%>
		</div>
	</form>
</body>
</html>