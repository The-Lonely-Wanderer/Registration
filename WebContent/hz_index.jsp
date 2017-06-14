<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>患者主页面</title>
<link rel="stylesheet" type="text/css" href="css/hz_index.css">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript">

function autoSubmit(){
	 document.getElementById("myForm").submit();
	}

</script>


</head>
<body  >
	<div id="top">
		<img src="img/1.jpg" width="100%" height="500px" /> <img
			src="img/2.jpg" width="100%" height="500px" /> <img src="img/4.jpg"
			width="100%" height="500px" /> <img src="img/5.jpg" width="100%"
			height="500px" />
	</div>
	<div id="banner">
		<div id="xinxi">
			<div id="xinxi_left">
				<ul>
					<li class="lis">个人信息
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-1" class="lis-li"  onclick="chakan()">查看</li>
								<li id="lis-li-2" class="lis-li">修改</li>
							</ul>
						</div>
					</li>
					<li class="lis">预约挂号
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-3" class="lis-li">科室预约</li>
								<li id="lis-li-4" class="lis-li">医生预约</li>	
							</ul>
						</div>
					</li>
					<li class="lis">预约查询
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-5" class="lis-li">已经预约</li>
								<li id="lis-li-6" class="lis-li">取消预约</li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
			<div id="xinxi_right">
			
			
				<div class="xinxi_right_1" onload="autoSubmit();">
				<p>查看个人基本信息</p>
				<form id="myForm" action="hz_GerenxinxiServlet" method="post">
				患者账户：<input type="text" disabled="disabled" value="${user_name}" /></br>
				患者密码：<input type="text" disabled="disabled" value="${user_password}" /></br>
				患者类型：<input type="text" disabled="disabled" value="${user_type}" /></br>
				患者姓名：<input type="text" disabled="disabled" value="${user_realname}" /></br>
				收货地址：<input type="text" disabled="disabled" value="${user_address}" /></br>
				手机号码：<input type="text" disabled="disabled" value="${user_tel}" /></br>
				</form>
				</div>
				
				
				<div class="xinxi_right_1">
				<p>修改个人基本信息</p>
				<form action="gerenxinxixiugai" method="post">
				患者密码：<input type="text"  value="${user_password}" name="user_password"/></br>
				患者类型：<input type="text"  value="${user_type}" name="user_type"/></br>
				患者姓名：<input type="text"  value="${user_realname}" name="user_realname"/></br>
				收货地址：<input type="text"  value="${user_address}" name="user_address"/></br>
				手机号码：<input type="text"  value="${user_tel}" name="user_address"/></br>
						<input type="submit" value="修改"/>
						<span>${massage}</span>
				</form>
				</div>
				
				
				<div class="xinxi_right_1">
				<p>科室预约</p>
				<form action="">
					
				</form>
				</div>
				
				
				
				<div class="xinxi_right_1">
				<p>医生预约</p>
				<form action="">
					
				</form>
				</div>
				
				
				<div class="xinxi_right_1">
				<p>已经预约</p>
				<form action="">
				
				</form>
				</div>
				
				
				<div class="xinxi_right_1">
				<p>取消预约。。。。。。。</p>
				<form action="">
				
				</form>
				</div>
				
				
			</div>
		</div>
		<div id="gonggao">
			<p>最新公告--></p>
		</div>
	</div>
	<script src="js/hz_index.js" type="text/javascript" type="stylesheet"></script>
</body>
</html>