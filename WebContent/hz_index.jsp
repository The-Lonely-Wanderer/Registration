<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.km.pojo.t_keshi"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>患者主页面</title>
<link rel="stylesheet" type="text/css" href="css/hz_index.css">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
</head>
<body>
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
								<li id="lis-li-1" class="lis-li">查看</li>
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
			<div id="xinxi_right" align="center">

				<%--个人信息查询 --%>
				<div class="xinxi_right_1">
					<p>
						<b>查看个人基本信息 </b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：<b>【${param.username}】</b>
					</p>

					<form action="hz_GerenxinxiServlet" method="post">
						<table width="75%" border="0" align="center">
							<tr>
								<td bgcolor="#9CCFFF">
									<div align="center">
										<font size="4"><b>个人信息</b></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者账户：<input type="text"
											disabled="disabled" value="${user_name}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者密码：<input type="text"
											disabled="disabled" value="${user_password}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者类型：<input type="text"
											disabled="disabled" value="${user_type}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者姓名：<input type="text"
											disabled="disabled" value="${user_realname}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">收货地址：<input type="text"
											disabled="disabled" value="${user_address}" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">手机号码：<input type="text"
											disabled="disabled" value="${user_tel}" /></font>
									</div>
								</td>
							</tr>
						</table>
						<p align="center">
							<b><font size="4">点击<a href="#">这里</a>返回主页
							</font></b>
						</p>
					</form>
				</div>

				<%--个人信息修改 --%>
				<div class="xinxi_right_1">
					<p>
						<b>修改个人基本信息</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：【<b>${param.username}】</b>
					</p>
					<form action="gerenxinxixiugai" method="post">
						<table width="75%" border="0" align="center">
							<tr>
								<td bgcolor="#9CCFFF">
									<div align="center">
										<font size="4"><b>修改</b></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者密码：<input type="text"
											value="${user_password}" name="user_password" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者类型：<input type="text"
											value="${user_type}" name="user_type" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">患者姓名：<input type="text"
											value="${user_realname}" name="user_realname" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">收货地址：<input type="text"
											value="${user_address}" name="user_address" /></font>
									</div>
								</td>
							</tr>
							<tr>
								<td bgcolor="#9CCFFF" height="35px">
									<div align="center">
										<font size="2">手机号码：<input type="text"
											value="${user_tel}" name="user_tel" /></font>
									</div>
								</td>
							</tr>
						</table>
						<p align="center">
							<input type="submit" value="修改">
						</p>
						<img alt="" src="" height="250px">
						<p align="center">
							<b><font size="4">点击<a href="#">这里</a>返回主页
							</font></b>
						</p>
						<span>${massage}</span>
					</form>
				</div>

				<%--科室查看 --%>
				<div class="xinxi_right_1">
					<p>
						<b>科室预约</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：【<b>${param.username}】</b>
					</p>
					<table width="75%" border="0" align="center">
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="4">
								<div align="center">
									<font size="4"><b>科室</b></font>
								</div>
							</td>
						</tr>
						<tr>
							<th bgcolor="#9CCFFF" height="35px" colspan="2">
								<div align="center">
									<font size="4"><b>科室名称</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>科室简介</b></font>
								</div>
							</th>
							<th bgcolor="#9CCFFF" height="35px">
								<div align="center">
									<font size="4"><b>操作</b></font>
								</div>
							</th>
						</tr>
						<%--拿的科室的值 --%>
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="4">
								<div align="center" class="zhi1">
									
								</div>
							</td>							
						</tr>
						<tr>
							<td bgcolor="#9CCFFF" height="35px" colspan="4">
								<div align="center">
									<table width="100%" border="0" align="center">
										<tr>
											<td bgcolor="#9CCFFF" height="35px" colspan="5">
												<div align="center">
													<font size="4"><b>该科室医生</b></font>
												</div>
											</td>
										</tr>
										<tr>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>医生姓名</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>性别</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>年龄</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>医生简介</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>操作</b></font>
												</div>
											</th>
										</tr>
										<tr>
											<td bgcolor="#9CCFFF" height="35px" colspan="5">
												<div align="center">
													<font size="4" class="keshiyisheng"><b>
													
													</b>
													</font>
												</div>
											</td>
										</tr>
									</table>
								</div>
							</td>
						</tr>
						
						
					</table>
					<p align="center">
						<b><font size="4">点击<a href="#">这里</a>返回主页
						</font></b>
					</p>
				</div>
				<%-- 医生预约--%>
				<div class="xinxi_right_1">
					<p>
					<b>医生预约</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎：【<b>${param.username}】</b>
					</p>
					<table width="75%" border="0" align="center">
										<tr>
											<td bgcolor="#9CCFFF" height="35px" colspan="5">
												<div align="center">
													<font size="4"><b>该科室医生</b></font>
												</div>
											</td>
										</tr>
										<tr>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>医生姓名</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>性别</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>年龄</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>医生简介</b></font>
												</div>
											</th>
											<th bgcolor="#9CCFFF" height="35px">
												<div align="center">
													<font size="4"><b>操作</b></font>
												</div>
											</th>
										</tr>
										<tr>
											<td bgcolor="#9CCFFF" height="35px" colspan="5">
												<div align="center">
													<font size="4" class="keshiyisheng"><b>
													
													</b>
													</font>
												</div>
											</td>
										</tr>
									</table>
				</div>
				
				<%--患者填写预约患者医生备注 --%>
					<div class="xinxi_right_1">
					<p>////////</p>
					<form action="" id="hz_yisheng">
						${param.username}
					
					</form>
					</div>	

				<div class="xinxi_right_1">
					<p>已经预约</p>
					<form action=""></form>
				</div>


				<div class="xinxi_right_1">
					<p>取消预约。。。。。。。</p>
					<form action="" method="post"></form>
				</div>
			

			</div>
		</div>
		<div id="gonggao">
			<p>最新公告--></p>
		</div>
	</div>
	<script src="js/hz_index.js" type="text/javascript" type="stylesheet"></script>
	<script src="js/hz_Ajax.js" type="text/javascript" type="stylesheet"></script>
</body>
</html>