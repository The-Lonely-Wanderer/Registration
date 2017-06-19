<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.km.pojo.t_user"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/admin.css">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<!-- <script type="text/javascript" src="js/Admin_Ajax.js"></script> -->
</head>
<body>
	<div id="top">
		<img src="img/1.jpg" width="100%" height="500px" /> 
		<img src="img/2.jpg" width="100%" height="500px" /> 
		<img src="img/4.jpg" width="100%" height="500px" /> 
		<img src="img/5.jpg" width="100%" height="500px" />
	</div>
	
	<div id="banner">
	<p id="gongneng">管理员功能</p>
		<div id="xinxi">
			<div id="xinxi_left">
				<ul>
					<li class="lis">个人信息
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-1" class="lis-li">查看修改</li>
							</ul>
						</div>
					</li>
					<li class="lis">人员管理
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-2" class="lis-li">患者</li>
								<li id="lis-li-3" class="lis-li">医生</li>
								<li id="lis-li-4" class="lis-li">管理员</li>
							</ul>
						</div>
					</li>
					<li class="lis">医院动态
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-5" class="lis-li">最新消息</li>

							</ul>
						</div>
					</li>
				</ul>
			</div>
			<div id="xinxi_right">
				<div class="xinxi_right_1">
					<p>查看修改</p><br/>
					姓名:【${param.username}】<br /> 密码:【${param.password}】<br/>
					<input id="changebut" type="button" value="修改信息">
	
					<form id="changeform" action="" method="post">
					<p> <span>新用户名:</span><input id="newusername" type="text" ></p>
					<p><span>新&nbsp密&nbsp码:</span><input id="newpassword" type="text" ></p>
					<p> <input id="ok" type="button" value="确定" ><input id="no" type="button" value="取消"></p>
					 </form>
				</div>
				<div class="xinxi_right_1">
					<p>患者信息:</p><br/>
					<div id="huanzhe_div"></div>
				</div>
				<div class="xinxi_right_1">
					<p>医生</p><br/>
					<div id="doctor_div"></div>
					<div id="doctor_add">
						<form action="" method="post"></form>
					</div>
				</div>
				<div class="xinxi_right_1">
					<p>管理员</p><br/>
					<div id="admin_div"></div>
					<div id="admin_add">
						<form action="" method="post"></form>
					</div>
				</div>
				<div class="xinxi_right_1">
					<p>最新消息</p><br/>
					<div id="message_div"></div>
					<div id="message_add">
						<form action="" method="post"></form>
					</div>
				</div>
			</div>
		</div>
		<p id="newgonggao">最新公告--></p>
		<div id="gonggao">
		</div>
	</div>
	<div id="sbottom">医院挂号系统-2017-6-19<br/><br/>项目成员:柯蒙蒙，孟恒，杨圣林</div>
	<script src="js/admin.js" type="text/javascript" type="stylesheet"></script>
</body>
</html>