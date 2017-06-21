<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="/Registration/css/register.css">
<script rel="stylesheet" type="text/javascript" src="/Registration/js/register.js"> </script>
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
					<span id="registersp2">重复密码不能为空</span>
				</p>
				<p>
					<span>类&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp型：</span>
					<input id="registerusertype" type="text" name="user_type" style="outline: none;" onblur="registerusertypef()" />
					<span id="registersp3">类型不能为空</span>
				</p>
				<p>
					<span>姓&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp名：</span>
					<input id="registeruserrealname" type="text" name="user_realname" style="outline: none;" onblur="registeruserrealnamef()" />
					<span id="registersp4">姓名不能为空</span>
				</p>
				<p>
					<span>收货地址：</span>
					<input id="registeruseraddress" type="text" name="user_address" style="outline: none;" onblur="registeruseraddressf()" />
					<span id="registersp5">地址不能为空</span>
				</p>
				<p>
					<span>手机号码：</span>
					<input id="registerusertel" type="text" name="user_tel" style="outline: none;" onblur="registerusertelf()" />
					<span id="registersp6">手机号码不能为空</span>
				</p>
					<input id="register" type="button" value="注册" onclick="registerbuttonsub()" />
					<input id="no" type="reset" value="重置"/>
					<input id="no1" type="button" value="返回" onclick="backa()"/>
				
			</div>
		</form>
</body>
</html>