<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>


</head>
<body>
	<div id="top">
		<img src="img/1.jpg" width="100%" height="500px" /> <img
			src="img/2.jpg" width="100%" height="500px" /> <img src="img/5.jpg"
			width="100%" height="500px" /><img src="img/4.jpg" width="100%"
			height="500px" /> <img src="img/6.jpg" width="100%" height="500px" />
	</div>
	<div id="banner">
		<div id="xinxi">
			<div id="xinxi_left">
				<ul>
					<li class="lis">个人信息
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-1" class="lis-li">查看</li>

								<li id="lis-li-2" class="lis-li">修改</li>
							</ul>
						</div>
					</li>
					<li class="lis">预约查询
						<div class="xinxi_div">
							<ul>
								<li id="lis-li-3" class="lis-li">查看</li>

								<li id="lis-li-4" class="lis-li">修改</li>

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
					<p>查看医生个人信息</p>
					<form action="gerenxinxiaction" method="post">
						<label>工号:</label><input type="text" name="yisheng_id"><br />
						<label>名字:</label><input type="text" name="yisheng_name"><br />
						<label>年龄 :</label><input type="text" name="yisheng_age"><br />
						<label>性别:</label><input type="text" name="yisheng_sex"><br />
						<label> 职称:</label><input type="text" name="yisheng_zhicheng"><br />
						<label>科室编号:</label><input type="text" name="keshi_id"><br />
					</form>


				</div>
				<div class="xinxi_right_1">
					<p>修改医生个人信息</p>
					<form action="xiugaiaction">
						<label>工号:</label><input type="text" name="yisheng_id"><br />
						<label>名字:</label><input type="text" name="yisheng_name"><br />
						<label>年龄 :</label><input type="text" name="yisheng_age"><br />
						<label>性别:</label><input type="text" name="yisheng_sex"><br />
						<label> 职称:</label><input type="text" name="yisheng_zhicheng"><br />
						<label>科室编号:</label><input type="text" name="keshi_id"><br />
					</form>


				</div>



				<div class="xinxi_right_1">
					<p>查看预约时间</p>
					<p>预约时间</p>
					<br /> <select>
						<option><input type="text" name="预约时间" /> <br />
						</option>
					</select>
					<p>专家建议</p>
					<br /> <select>
						<option><input type="text" name="专家建议" /><br />
						</option>
					</select>
					<form action=""></form>
				</div>
				<div class="xinxi_right_1">
					<p>修改预约时间</p>
					<p>预约时间</p>
					<br /> <select>
						<option><input type="text" name="预约时间" /> <br />
						</option>
					</select>
					<p>专家建议</p>
					<br /> <select>
						<option><input type="text" name="专家建议" /><br />
						</option>
					</select>


					<div class="xinxi_right_1">
						<p>最新消息</p>
						<form action=""></form>
					</div>
				</div>
			</div>
			<div id="gonggao">
				<p>最新公告--></p>
			</div>
		</div>
		<script src="js/admin.js" type="text/javascript" type="stylesheet"></script>
</body>
</html>