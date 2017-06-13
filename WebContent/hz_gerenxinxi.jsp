<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息</title>
<script>
	function xiugai() {
		window.location = "hz_gerenxinxixiugai.jsp";
	}
</script>
</head>
<body>
	<form action="gerenxinxixiugai" method="post">
		患者账户：<input type="text" disabled="disabled" value="${user_name}" /></br>
		患者密码：<input type="text" disabled="disabled" value="${user_password}" /></br>
		患者类型：<input type="text" disabled="disabled" value="${user_type}" /></br>
		患者姓名：<input type="text" disabled="disabled" value="${user_realname}" /></br>
		收货地址：<input type="text" disabled="disabled" value="${user_address}" /></br>
		<input type="submit" value="修改信息" onclick="xiugai()"/>
		<span>${massage}</span>
	</form>
</body>
</html>