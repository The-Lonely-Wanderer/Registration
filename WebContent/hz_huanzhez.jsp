<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>患者子页面</title>
<script>
	function gerenxinxi() {
		window.location = "hz_gerenxinxixi.jsp";
	}
	function yuyueguahao() {
		window.location = "hz_yuyueguahao.jsp";
	}
	function yuyuechaxun() {
		window.location = "hz_yuyuechaxun.jsp";
	}
</script>
</head>
<body>
	<form action="GerenxinxiServlet" method="post">
		<input type="submit" value="个人信息" onclick="gerenxinxi()"/>
	</form>
	<form action="" method="post">
		<input type="subm it" value="预约挂号" onclick="yuyueguahao()"/>
	</form>
	<form action="" method="post">
		<input type="submit" value="预约查询" onclick="yuyuechaxun()"/>
	</form>
</body>
</html>