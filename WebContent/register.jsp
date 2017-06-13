<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="/registerandlogin3.0/css/register.css">
<script rel="stylesheet" type="text/javascript" src="/registerandlogin3.0/js/register.js"> </script>
</head>
<body>
		<form id="registerfrom" action="registerfrom" method="post">
			<div id="register-a">
				<p>
					<span>用&nbsp&nbsp户&nbsp&nbsp名：</span>
					<input id="registerusername" type="text" name="username" style="outline: none;" onblur="registerusernamef()" />
					<span id="registersp1">用户名不能为空</span>
				</p>
				<p>
					<span>密&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp码：</span>
					<input id="registerpassword" type="password" name="password" style="outline: none;" onblur="registerpasswordf()" />
					<span id="registersp">密码不能为空</span>
				</p>
				<p>
					<span>重复密码：</span>
					<input id="registerrepassword" type="password" name="repassword" style="outline: none;" onblur="registerrepasswordf()" />
					<span id="registersp2">密码不能为空</span>
				</p>
				<p>
					<input id="register" type="button" value="注册" onclick="registerbuttonsub()" />
					<input id="no" type="reset" value="重置"/>
				</p>
			</div>
		</form>
</body>
</html>